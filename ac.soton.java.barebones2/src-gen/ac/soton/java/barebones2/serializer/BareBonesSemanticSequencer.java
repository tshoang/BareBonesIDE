/*
 * generated by Xtext 2.27.0
 */
package ac.soton.java.barebones2.serializer;

import ac.soton.java.barebones2.bareBones.AdditionSubtraction;
import ac.soton.java.barebones2.bareBones.AssociativePredicate;
import ac.soton.java.barebones2.bareBones.BareBonesPackage;
import ac.soton.java.barebones2.bareBones.Clear;
import ac.soton.java.barebones2.bareBones.Decrement;
import ac.soton.java.barebones2.bareBones.Identifier;
import ac.soton.java.barebones2.bareBones.In;
import ac.soton.java.barebones2.bareBones.Increment;
import ac.soton.java.barebones2.bareBones.MultiplicationDivision;
import ac.soton.java.barebones2.bareBones.NumberLiteral;
import ac.soton.java.barebones2.bareBones.OutString;
import ac.soton.java.barebones2.bareBones.OutVariable;
import ac.soton.java.barebones2.bareBones.Program;
import ac.soton.java.barebones2.bareBones.RelationalPredicate;
import ac.soton.java.barebones2.bareBones.While;
import ac.soton.java.barebones2.services.BareBonesGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class BareBonesSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BareBonesGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == BareBonesPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BareBonesPackage.ADDITION_SUBTRACTION:
				sequence_AdditionSubtraction(context, (AdditionSubtraction) semanticObject); 
				return; 
			case BareBonesPackage.ASSOCIATIVE_PREDICATE:
				sequence_AssociativePredicate(context, (AssociativePredicate) semanticObject); 
				return; 
			case BareBonesPackage.CLEAR:
				sequence_Clear(context, (Clear) semanticObject); 
				return; 
			case BareBonesPackage.DECREMENT:
				sequence_Decrement(context, (Decrement) semanticObject); 
				return; 
			case BareBonesPackage.IDENTIFIER:
				sequence_Identifier(context, (Identifier) semanticObject); 
				return; 
			case BareBonesPackage.IN:
				sequence_In(context, (In) semanticObject); 
				return; 
			case BareBonesPackage.INCREMENT:
				sequence_Increment(context, (Increment) semanticObject); 
				return; 
			case BareBonesPackage.MULTIPLICATION_DIVISION:
				sequence_MultiplicationDivision(context, (MultiplicationDivision) semanticObject); 
				return; 
			case BareBonesPackage.NUMBER_LITERAL:
				sequence_NumberLiteral(context, (NumberLiteral) semanticObject); 
				return; 
			case BareBonesPackage.OUT_STRING:
				sequence_OutString(context, (OutString) semanticObject); 
				return; 
			case BareBonesPackage.OUT_VARIABLE:
				sequence_OutVariable(context, (OutVariable) semanticObject); 
				return; 
			case BareBonesPackage.PROGRAM:
				sequence_Program(context, (Program) semanticObject); 
				return; 
			case BareBonesPackage.RELATIONAL_PREDICATE:
				sequence_RelationalPredicate(context, (RelationalPredicate) semanticObject); 
				return; 
			case BareBonesPackage.WHILE:
				sequence_While(context, (While) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Formula returns AdditionSubtraction
	 *     Predicate returns AdditionSubtraction
	 *     AssociativePredicate returns AdditionSubtraction
	 *     AssociativePredicate.AssociativePredicate_1_0 returns AdditionSubtraction
	 *     PrimaryPredicate returns AdditionSubtraction
	 *     RelationalPredicate returns AdditionSubtraction
	 *     RelationalPredicate.RelationalPredicate_1_0 returns AdditionSubtraction
	 *     Expression returns AdditionSubtraction
	 *     AdditionSubtraction returns AdditionSubtraction
	 *     AdditionSubtraction.AdditionSubtraction_1_0 returns AdditionSubtraction
	 *     MultiplicationDivision returns AdditionSubtraction
	 *     MultiplicationDivision.MultiplicationDivision_1_0 returns AdditionSubtraction
	 *     PrimaryExpression returns AdditionSubtraction
	 *
	 * Constraint:
	 *     (left=AdditionSubtraction_AdditionSubtraction_1_0 (tag='+' | tag='-') right=MultiplicationDivision)
	 * </pre>
	 */
	protected void sequence_AdditionSubtraction(ISerializationContext context, AdditionSubtraction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Formula returns AssociativePredicate
	 *     Predicate returns AssociativePredicate
	 *     AssociativePredicate returns AssociativePredicate
	 *     AssociativePredicate.AssociativePredicate_1_0 returns AssociativePredicate
	 *     PrimaryPredicate returns AssociativePredicate
	 *     RelationalPredicate returns AssociativePredicate
	 *     RelationalPredicate.RelationalPredicate_1_0 returns AssociativePredicate
	 *     Expression returns AssociativePredicate
	 *     AdditionSubtraction returns AssociativePredicate
	 *     AdditionSubtraction.AdditionSubtraction_1_0 returns AssociativePredicate
	 *     MultiplicationDivision returns AssociativePredicate
	 *     MultiplicationDivision.MultiplicationDivision_1_0 returns AssociativePredicate
	 *     PrimaryExpression returns AssociativePredicate
	 *
	 * Constraint:
	 *     (left=AssociativePredicate_AssociativePredicate_1_0 (tag='&&' | tag='||') right=PrimaryPredicate)
	 * </pre>
	 */
	protected void sequence_AssociativePredicate(ISerializationContext context, AssociativePredicate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns Clear
	 *     Clear returns Clear
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_Clear(ISerializationContext context, Clear semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BareBonesPackage.Literals.CLEAR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BareBonesPackage.Literals.CLEAR__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getClearAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns Decrement
	 *     Decrement returns Decrement
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_Decrement(ISerializationContext context, Decrement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BareBonesPackage.Literals.DECREMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BareBonesPackage.Literals.DECREMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDecrementAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Formula returns Identifier
	 *     Predicate returns Identifier
	 *     AssociativePredicate returns Identifier
	 *     AssociativePredicate.AssociativePredicate_1_0 returns Identifier
	 *     PrimaryPredicate returns Identifier
	 *     RelationalPredicate returns Identifier
	 *     RelationalPredicate.RelationalPredicate_1_0 returns Identifier
	 *     Expression returns Identifier
	 *     AdditionSubtraction returns Identifier
	 *     AdditionSubtraction.AdditionSubtraction_1_0 returns Identifier
	 *     MultiplicationDivision returns Identifier
	 *     MultiplicationDivision.MultiplicationDivision_1_0 returns Identifier
	 *     PrimaryExpression returns Identifier
	 *     Identifier returns Identifier
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_Identifier(ISerializationContext context, Identifier semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BareBonesPackage.Literals.IDENTIFIER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BareBonesPackage.Literals.IDENTIFIER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIdentifierAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns In
	 *     In returns In
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_In(ISerializationContext context, In semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BareBonesPackage.Literals.IN__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BareBonesPackage.Literals.IN__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns Increment
	 *     Increment returns Increment
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_Increment(ISerializationContext context, Increment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BareBonesPackage.Literals.INCREMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BareBonesPackage.Literals.INCREMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIncrementAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Formula returns MultiplicationDivision
	 *     Predicate returns MultiplicationDivision
	 *     AssociativePredicate returns MultiplicationDivision
	 *     AssociativePredicate.AssociativePredicate_1_0 returns MultiplicationDivision
	 *     PrimaryPredicate returns MultiplicationDivision
	 *     RelationalPredicate returns MultiplicationDivision
	 *     RelationalPredicate.RelationalPredicate_1_0 returns MultiplicationDivision
	 *     Expression returns MultiplicationDivision
	 *     AdditionSubtraction returns MultiplicationDivision
	 *     AdditionSubtraction.AdditionSubtraction_1_0 returns MultiplicationDivision
	 *     MultiplicationDivision returns MultiplicationDivision
	 *     MultiplicationDivision.MultiplicationDivision_1_0 returns MultiplicationDivision
	 *     PrimaryExpression returns MultiplicationDivision
	 *
	 * Constraint:
	 *     (left=MultiplicationDivision_MultiplicationDivision_1_0 (tag='*' | tag='/') right=PrimaryExpression)
	 * </pre>
	 */
	protected void sequence_MultiplicationDivision(ISerializationContext context, MultiplicationDivision semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Formula returns NumberLiteral
	 *     Predicate returns NumberLiteral
	 *     AssociativePredicate returns NumberLiteral
	 *     AssociativePredicate.AssociativePredicate_1_0 returns NumberLiteral
	 *     PrimaryPredicate returns NumberLiteral
	 *     RelationalPredicate returns NumberLiteral
	 *     RelationalPredicate.RelationalPredicate_1_0 returns NumberLiteral
	 *     Expression returns NumberLiteral
	 *     AdditionSubtraction returns NumberLiteral
	 *     AdditionSubtraction.AdditionSubtraction_1_0 returns NumberLiteral
	 *     MultiplicationDivision returns NumberLiteral
	 *     MultiplicationDivision.MultiplicationDivision_1_0 returns NumberLiteral
	 *     PrimaryExpression returns NumberLiteral
	 *     NumberLiteral returns NumberLiteral
	 *
	 * Constraint:
	 *     value=INT
	 * </pre>
	 */
	protected void sequence_NumberLiteral(ISerializationContext context, NumberLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BareBonesPackage.Literals.NUMBER_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BareBonesPackage.Literals.NUMBER_LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumberLiteralAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns OutString
	 *     OutString returns OutString
	 *
	 * Constraint:
	 *     name=STRING
	 * </pre>
	 */
	protected void sequence_OutString(ISerializationContext context, OutString semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BareBonesPackage.Literals.OUT_STRING__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BareBonesPackage.Literals.OUT_STRING__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOutStringAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns OutVariable
	 *     OutVariable returns OutVariable
	 *
	 * Constraint:
	 *     formula=Formula
	 * </pre>
	 */
	protected void sequence_OutVariable(ISerializationContext context, OutVariable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BareBonesPackage.Literals.OUT_VARIABLE__FORMULA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BareBonesPackage.Literals.OUT_VARIABLE__FORMULA));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOutVariableAccess().getFormulaFormulaParserRuleCall_2_0(), semanticObject.getFormula());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Program returns Program
	 *
	 * Constraint:
	 *     statements+=Statement+
	 * </pre>
	 */
	protected void sequence_Program(ISerializationContext context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Formula returns RelationalPredicate
	 *     Predicate returns RelationalPredicate
	 *     AssociativePredicate returns RelationalPredicate
	 *     AssociativePredicate.AssociativePredicate_1_0 returns RelationalPredicate
	 *     PrimaryPredicate returns RelationalPredicate
	 *     RelationalPredicate returns RelationalPredicate
	 *     RelationalPredicate.RelationalPredicate_1_0 returns RelationalPredicate
	 *     Expression returns RelationalPredicate
	 *     AdditionSubtraction returns RelationalPredicate
	 *     AdditionSubtraction.AdditionSubtraction_1_0 returns RelationalPredicate
	 *     MultiplicationDivision returns RelationalPredicate
	 *     MultiplicationDivision.MultiplicationDivision_1_0 returns RelationalPredicate
	 *     PrimaryExpression returns RelationalPredicate
	 *
	 * Constraint:
	 *     (left=RelationalPredicate_RelationalPredicate_1_0 tag='=' right=Expression)
	 * </pre>
	 */
	protected void sequence_RelationalPredicate(ISerializationContext context, RelationalPredicate semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BareBonesPackage.Literals.RELATIONAL_PREDICATE__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BareBonesPackage.Literals.RELATIONAL_PREDICATE__LEFT));
			if (transientValues.isValueTransient(semanticObject, BareBonesPackage.Literals.RELATIONAL_PREDICATE__TAG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BareBonesPackage.Literals.RELATIONAL_PREDICATE__TAG));
			if (transientValues.isValueTransient(semanticObject, BareBonesPackage.Literals.RELATIONAL_PREDICATE__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BareBonesPackage.Literals.RELATIONAL_PREDICATE__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRelationalPredicateAccess().getRelationalPredicateLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getRelationalPredicateAccess().getTagEqualsSignKeyword_1_1_0(), semanticObject.getTag());
		feeder.accept(grammarAccess.getRelationalPredicateAccess().getRightExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns While
	 *     While returns While
	 *
	 * Constraint:
	 *     (condition=Formula statements+=Statement+)
	 * </pre>
	 */
	protected void sequence_While(ISerializationContext context, While semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
