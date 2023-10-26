/*
 * generated by Xtext 2.15.0
 */
package ac.soton.java.barebones2.generator

import ac.soton.java.barebones2.bareBones.AdditionSubtraction
import ac.soton.java.barebones2.bareBones.AssociativePredicate
import ac.soton.java.barebones2.bareBones.Clear
import ac.soton.java.barebones2.bareBones.Decrement
import ac.soton.java.barebones2.bareBones.Formula
import ac.soton.java.barebones2.bareBones.Identifier
import ac.soton.java.barebones2.bareBones.In
import ac.soton.java.barebones2.bareBones.Increment
import ac.soton.java.barebones2.bareBones.MultiplicationDivision
import ac.soton.java.barebones2.bareBones.NumberLiteral
import ac.soton.java.barebones2.bareBones.OutString
import ac.soton.java.barebones2.bareBones.OutVariable
import ac.soton.java.barebones2.bareBones.Program
import ac.soton.java.barebones2.bareBones.RelationalPredicate
import ac.soton.java.barebones2.bareBones.Statement
import ac.soton.java.barebones2.bareBones.While
import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.HashMap
import java.util.Map
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class BareBonesGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		try {
			val program = resource.contents.get(0)
			val heap = new HashMap<String, Integer>(); 
			if (program instanceof Program) {
				val contents = program.eContents
				contents.forEach [ content |
					if (content instanceof Statement) {
						val statement = content as Statement
						execute(statement, heap)
					}
				]
			}
			fsa.generateFile('result.txt', heap.toString())
		}
		catch (UnsupportedOperationException e) {
			System.out.println(e)
		}
		catch (NumberFormatException e) {
			System.out.println(e)
		}
	}	
		
	def execute(Statement statement, Map<String, Integer> heap) {
		if (statement instanceof Clear) {
			executeClear(statement, heap)
		} else if (statement instanceof Increment) {
			executeIncr(statement, heap)
		} else if (statement instanceof Decrement) {
			executeDecr(statement, heap)
		} else if (statement instanceof While) {
			executeWhile(statement, heap)
		} else if (statement instanceof OutVariable) {
			executeOutVariable(statement, heap)
		} else if (statement instanceof OutString) {
			executeOutString(statement, heap)
		} else if (statement instanceof In) {
			executeIn(statement, heap)
		} else {
			throw new UnsupportedOperationException("Unknown statement " + statement)
		}		
	}
		
	def executeIn(In in, Map<String, Integer> heap) throws NumberFormatException {
		// Create a bufferedReader from System.in
        val buffer = new BufferedReader(new InputStreamReader(System.in))
        
        // Read the line
        val str = buffer.readLine()
        
        val number =  Integer.parseInt(str)
        heap.put(in.name, number)
	}
		
	def executeOutString(OutString outString, Map<String, Integer> heap) {
		System.out.print(outString.name)
	}
		
	def executeOutVariable(OutVariable outVariable, Map<String, Integer> heap) {
		val formula = outVariable.formula
		if (formula instanceof AssociativePredicate) {
			System.out.print(evaluatePredicate(formula, heap))
		}
		else if (formula instanceof RelationalPredicate) {
			System.out.print(evaluatePredicate(formula, heap))
		}
		else if (formula instanceof NumberLiteral) {
			System.out.print(evaluateExpression(formula, heap))
		}
		else if (formula instanceof Identifier) {
			System.out.print(evaluateExpression(formula, heap))
		}
		else if (formula instanceof AdditionSubtraction) {
			System.out.print(evaluateExpression(formula, heap))
		}
		else if (formula instanceof MultiplicationDivision) {
			System.out.print(evaluateExpression(formula, heap))
		}
		else {
			throw new UnsupportedOperationException("Unsupported formula " + formula)
		}
	}
		
	def executeWhile(While ^while, Map<String, Integer> heap) {
		val condition = ^while.condition
		val nestedStatements = ^while.statements
		var check = evaluatePredicate(condition, heap)
		while (check) {
			nestedStatements.forEach[nestedStatement |
				val stm = nestedStatement as Statement
				execute(stm, heap)
			]
			check = evaluatePredicate(condition, heap)
		}		
	}
	
	def boolean evaluatePredicate(Formula formula, Map<String, Integer> heap) {
		if (formula instanceof AssociativePredicate) {
			val left = formula.left
			val right = formula.right
			val tag = formula.tag
			if (tag.equals('&&'))
				return (evaluatePredicate(left, heap) && evaluatePredicate(right, heap))
			if (tag.equals('||'))
				return (evaluatePredicate(left, heap) || evaluatePredicate(right, heap))
			throw new UnsupportedOperationException("Unsupported associative predicate with tag " + tag) 
		}
		
		if (formula instanceof RelationalPredicate) {
			val left = formula.left
			val right = formula.right
			val tag = formula.tag
			if (tag.equals('=')) {
				return (evaluateExpression(left, heap) == evaluateExpression(right, heap))
			}
			throw new UnsupportedOperationException("Unsupported relational predicate with tag " + tag)
		}
		throw new UnsupportedOperationException("Unsupported predicate " + formula)
	}
	
	def int evaluateExpression(Formula formula, Map<String, Integer> heap) {
		if (formula instanceof Identifier) {
			val name = formula.name
			if (heap.containsKey(name)) {
				return heap.get(name)
			}
			throw new UnsupportedOperationException("Cannot use undeclared variable " + name)
		}
		
		if (formula instanceof NumberLiteral) {
			return formula.value
		}
		
		if (formula instanceof AdditionSubtraction) {
			val left = formula.left
			val right = formula.right
			val tag = formula.tag
			if (tag.equals('+')) {
				return (evaluateExpression(left, heap) + evaluateExpression(right, heap))
			}
			if (tag.equals('-')) {
				return (evaluateExpression(left, heap) - evaluateExpression(right, heap));
			}
			throw new UnsupportedOperationException("Unsupported addition/subtraction with tag " + tag)
		}
		
		if (formula instanceof MultiplicationDivision) {
			val left = formula.left
			val right = formula.right
			val tag = formula.tag
			if (tag.equals('*')) {
				return evaluateExpression(left, heap) * evaluateExpression(right, heap)
			}	
			if (tag.equals('/')) {
				return evaluateExpression(left, heap) / evaluateExpression(right, heap)
			}	
			throw new UnsupportedOperationException("Unsupported multiplication with tag " + tag)
		}
		throw new UnsupportedOperationException("Unsupported expression " + formula)

	}
	
	
	def executeDecr(Decrement decrement, Map<String, Integer> heap) {
		val name = decrement.name
		if (heap.containsKey(name)) {
			val value = heap.get(name)
			if (value == 0)
				throw new UnsupportedOperationException("Cannot decrease further " + decrement)		
			else {
				heap.put(name, value - 1)
			}
		} else {
			throw new UnsupportedOperationException("Cannot decrease undeclared variable " + name)
		}
	}
		
	def executeIncr(Increment increment, Map<String, Integer> heap) {
		val name = increment.name
		if (heap.containsKey(name)) {
			val value = heap.get(name)
			heap.put(name, value + 1)
		} else {
			throw new UnsupportedOperationException("Cannot increase undeclared variable " + name)
		}
	}
		
	def executeClear(Clear clear, Map<String, Integer> heap) {
		val name = clear.name
		heap.put(name, 0)
	}
}
