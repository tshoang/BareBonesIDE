package ac.soton.java.barebones2.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import ac.soton.java.barebones2.services.BareBonesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBareBonesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'&&'", "'||'", "'+'", "'-'", "'*'", "'/'", "'clear'", "'incr'", "'decr'", "'while'", "'do'", "'end'", "'out'", "'in'", "'('", "')'", "'='"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalBareBonesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBareBonesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBareBonesParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBareBones.g"; }


    	private BareBonesGrammarAccess grammarAccess;

    	public void setGrammarAccess(BareBonesGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleProgram"
    // InternalBareBones.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalBareBones.g:54:1: ( ruleProgram EOF )
            // InternalBareBones.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalBareBones.g:62:1: ruleProgram : ( ( ( rule__Program__StatementsAssignment ) ) ( ( rule__Program__StatementsAssignment )* ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:66:2: ( ( ( ( rule__Program__StatementsAssignment ) ) ( ( rule__Program__StatementsAssignment )* ) ) )
            // InternalBareBones.g:67:2: ( ( ( rule__Program__StatementsAssignment ) ) ( ( rule__Program__StatementsAssignment )* ) )
            {
            // InternalBareBones.g:67:2: ( ( ( rule__Program__StatementsAssignment ) ) ( ( rule__Program__StatementsAssignment )* ) )
            // InternalBareBones.g:68:3: ( ( rule__Program__StatementsAssignment ) ) ( ( rule__Program__StatementsAssignment )* )
            {
            // InternalBareBones.g:68:3: ( ( rule__Program__StatementsAssignment ) )
            // InternalBareBones.g:69:4: ( rule__Program__StatementsAssignment )
            {
             before(grammarAccess.getProgramAccess().getStatementsAssignment()); 
            // InternalBareBones.g:70:4: ( rule__Program__StatementsAssignment )
            // InternalBareBones.g:70:5: rule__Program__StatementsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Program__StatementsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getStatementsAssignment()); 

            }

            // InternalBareBones.g:73:3: ( ( rule__Program__StatementsAssignment )* )
            // InternalBareBones.g:74:4: ( rule__Program__StatementsAssignment )*
            {
             before(grammarAccess.getProgramAccess().getStatementsAssignment()); 
            // InternalBareBones.g:75:4: ( rule__Program__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=17 && LA1_0<=20)||(LA1_0>=23 && LA1_0<=24)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBareBones.g:75:5: rule__Program__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Program__StatementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getStatementsAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalBareBones.g:85:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalBareBones.g:86:1: ( ruleStatement EOF )
            // InternalBareBones.g:87:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalBareBones.g:94:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:98:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalBareBones.g:99:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalBareBones.g:99:2: ( ( rule__Statement__Alternatives ) )
            // InternalBareBones.g:100:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalBareBones.g:101:3: ( rule__Statement__Alternatives )
            // InternalBareBones.g:101:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleClear"
    // InternalBareBones.g:110:1: entryRuleClear : ruleClear EOF ;
    public final void entryRuleClear() throws RecognitionException {
        try {
            // InternalBareBones.g:111:1: ( ruleClear EOF )
            // InternalBareBones.g:112:1: ruleClear EOF
            {
             before(grammarAccess.getClearRule()); 
            pushFollow(FOLLOW_1);
            ruleClear();

            state._fsp--;

             after(grammarAccess.getClearRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClear"


    // $ANTLR start "ruleClear"
    // InternalBareBones.g:119:1: ruleClear : ( ( rule__Clear__Group__0 ) ) ;
    public final void ruleClear() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:123:2: ( ( ( rule__Clear__Group__0 ) ) )
            // InternalBareBones.g:124:2: ( ( rule__Clear__Group__0 ) )
            {
            // InternalBareBones.g:124:2: ( ( rule__Clear__Group__0 ) )
            // InternalBareBones.g:125:3: ( rule__Clear__Group__0 )
            {
             before(grammarAccess.getClearAccess().getGroup()); 
            // InternalBareBones.g:126:3: ( rule__Clear__Group__0 )
            // InternalBareBones.g:126:4: rule__Clear__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Clear__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClearAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClear"


    // $ANTLR start "entryRuleIncrement"
    // InternalBareBones.g:135:1: entryRuleIncrement : ruleIncrement EOF ;
    public final void entryRuleIncrement() throws RecognitionException {
        try {
            // InternalBareBones.g:136:1: ( ruleIncrement EOF )
            // InternalBareBones.g:137:1: ruleIncrement EOF
            {
             before(grammarAccess.getIncrementRule()); 
            pushFollow(FOLLOW_1);
            ruleIncrement();

            state._fsp--;

             after(grammarAccess.getIncrementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIncrement"


    // $ANTLR start "ruleIncrement"
    // InternalBareBones.g:144:1: ruleIncrement : ( ( rule__Increment__Group__0 ) ) ;
    public final void ruleIncrement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:148:2: ( ( ( rule__Increment__Group__0 ) ) )
            // InternalBareBones.g:149:2: ( ( rule__Increment__Group__0 ) )
            {
            // InternalBareBones.g:149:2: ( ( rule__Increment__Group__0 ) )
            // InternalBareBones.g:150:3: ( rule__Increment__Group__0 )
            {
             before(grammarAccess.getIncrementAccess().getGroup()); 
            // InternalBareBones.g:151:3: ( rule__Increment__Group__0 )
            // InternalBareBones.g:151:4: rule__Increment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Increment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIncrementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIncrement"


    // $ANTLR start "entryRuleDecrement"
    // InternalBareBones.g:160:1: entryRuleDecrement : ruleDecrement EOF ;
    public final void entryRuleDecrement() throws RecognitionException {
        try {
            // InternalBareBones.g:161:1: ( ruleDecrement EOF )
            // InternalBareBones.g:162:1: ruleDecrement EOF
            {
             before(grammarAccess.getDecrementRule()); 
            pushFollow(FOLLOW_1);
            ruleDecrement();

            state._fsp--;

             after(grammarAccess.getDecrementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDecrement"


    // $ANTLR start "ruleDecrement"
    // InternalBareBones.g:169:1: ruleDecrement : ( ( rule__Decrement__Group__0 ) ) ;
    public final void ruleDecrement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:173:2: ( ( ( rule__Decrement__Group__0 ) ) )
            // InternalBareBones.g:174:2: ( ( rule__Decrement__Group__0 ) )
            {
            // InternalBareBones.g:174:2: ( ( rule__Decrement__Group__0 ) )
            // InternalBareBones.g:175:3: ( rule__Decrement__Group__0 )
            {
             before(grammarAccess.getDecrementAccess().getGroup()); 
            // InternalBareBones.g:176:3: ( rule__Decrement__Group__0 )
            // InternalBareBones.g:176:4: rule__Decrement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Decrement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDecrementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDecrement"


    // $ANTLR start "entryRuleWhile"
    // InternalBareBones.g:185:1: entryRuleWhile : ruleWhile EOF ;
    public final void entryRuleWhile() throws RecognitionException {
        try {
            // InternalBareBones.g:186:1: ( ruleWhile EOF )
            // InternalBareBones.g:187:1: ruleWhile EOF
            {
             before(grammarAccess.getWhileRule()); 
            pushFollow(FOLLOW_1);
            ruleWhile();

            state._fsp--;

             after(grammarAccess.getWhileRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // InternalBareBones.g:194:1: ruleWhile : ( ( rule__While__Group__0 ) ) ;
    public final void ruleWhile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:198:2: ( ( ( rule__While__Group__0 ) ) )
            // InternalBareBones.g:199:2: ( ( rule__While__Group__0 ) )
            {
            // InternalBareBones.g:199:2: ( ( rule__While__Group__0 ) )
            // InternalBareBones.g:200:3: ( rule__While__Group__0 )
            {
             before(grammarAccess.getWhileAccess().getGroup()); 
            // InternalBareBones.g:201:3: ( rule__While__Group__0 )
            // InternalBareBones.g:201:4: rule__While__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__While__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleOutVariable"
    // InternalBareBones.g:210:1: entryRuleOutVariable : ruleOutVariable EOF ;
    public final void entryRuleOutVariable() throws RecognitionException {
        try {
            // InternalBareBones.g:211:1: ( ruleOutVariable EOF )
            // InternalBareBones.g:212:1: ruleOutVariable EOF
            {
             before(grammarAccess.getOutVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleOutVariable();

            state._fsp--;

             after(grammarAccess.getOutVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOutVariable"


    // $ANTLR start "ruleOutVariable"
    // InternalBareBones.g:219:1: ruleOutVariable : ( ( rule__OutVariable__Group__0 ) ) ;
    public final void ruleOutVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:223:2: ( ( ( rule__OutVariable__Group__0 ) ) )
            // InternalBareBones.g:224:2: ( ( rule__OutVariable__Group__0 ) )
            {
            // InternalBareBones.g:224:2: ( ( rule__OutVariable__Group__0 ) )
            // InternalBareBones.g:225:3: ( rule__OutVariable__Group__0 )
            {
             before(grammarAccess.getOutVariableAccess().getGroup()); 
            // InternalBareBones.g:226:3: ( rule__OutVariable__Group__0 )
            // InternalBareBones.g:226:4: rule__OutVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OutVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutVariable"


    // $ANTLR start "entryRuleOutString"
    // InternalBareBones.g:235:1: entryRuleOutString : ruleOutString EOF ;
    public final void entryRuleOutString() throws RecognitionException {
        try {
            // InternalBareBones.g:236:1: ( ruleOutString EOF )
            // InternalBareBones.g:237:1: ruleOutString EOF
            {
             before(grammarAccess.getOutStringRule()); 
            pushFollow(FOLLOW_1);
            ruleOutString();

            state._fsp--;

             after(grammarAccess.getOutStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOutString"


    // $ANTLR start "ruleOutString"
    // InternalBareBones.g:244:1: ruleOutString : ( ( rule__OutString__Group__0 ) ) ;
    public final void ruleOutString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:248:2: ( ( ( rule__OutString__Group__0 ) ) )
            // InternalBareBones.g:249:2: ( ( rule__OutString__Group__0 ) )
            {
            // InternalBareBones.g:249:2: ( ( rule__OutString__Group__0 ) )
            // InternalBareBones.g:250:3: ( rule__OutString__Group__0 )
            {
             before(grammarAccess.getOutStringAccess().getGroup()); 
            // InternalBareBones.g:251:3: ( rule__OutString__Group__0 )
            // InternalBareBones.g:251:4: rule__OutString__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OutString__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutStringAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutString"


    // $ANTLR start "entryRuleIn"
    // InternalBareBones.g:260:1: entryRuleIn : ruleIn EOF ;
    public final void entryRuleIn() throws RecognitionException {
        try {
            // InternalBareBones.g:261:1: ( ruleIn EOF )
            // InternalBareBones.g:262:1: ruleIn EOF
            {
             before(grammarAccess.getInRule()); 
            pushFollow(FOLLOW_1);
            ruleIn();

            state._fsp--;

             after(grammarAccess.getInRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIn"


    // $ANTLR start "ruleIn"
    // InternalBareBones.g:269:1: ruleIn : ( ( rule__In__Group__0 ) ) ;
    public final void ruleIn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:273:2: ( ( ( rule__In__Group__0 ) ) )
            // InternalBareBones.g:274:2: ( ( rule__In__Group__0 ) )
            {
            // InternalBareBones.g:274:2: ( ( rule__In__Group__0 ) )
            // InternalBareBones.g:275:3: ( rule__In__Group__0 )
            {
             before(grammarAccess.getInAccess().getGroup()); 
            // InternalBareBones.g:276:3: ( rule__In__Group__0 )
            // InternalBareBones.g:276:4: rule__In__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__In__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIn"


    // $ANTLR start "entryRuleFormula"
    // InternalBareBones.g:285:1: entryRuleFormula : ruleFormula EOF ;
    public final void entryRuleFormula() throws RecognitionException {
        try {
            // InternalBareBones.g:286:1: ( ruleFormula EOF )
            // InternalBareBones.g:287:1: ruleFormula EOF
            {
             before(grammarAccess.getFormulaRule()); 
            pushFollow(FOLLOW_1);
            ruleFormula();

            state._fsp--;

             after(grammarAccess.getFormulaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFormula"


    // $ANTLR start "ruleFormula"
    // InternalBareBones.g:294:1: ruleFormula : ( rulePredicate ) ;
    public final void ruleFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:298:2: ( ( rulePredicate ) )
            // InternalBareBones.g:299:2: ( rulePredicate )
            {
            // InternalBareBones.g:299:2: ( rulePredicate )
            // InternalBareBones.g:300:3: rulePredicate
            {
             before(grammarAccess.getFormulaAccess().getPredicateParserRuleCall()); 
            pushFollow(FOLLOW_2);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getFormulaAccess().getPredicateParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormula"


    // $ANTLR start "entryRulePredicate"
    // InternalBareBones.g:310:1: entryRulePredicate : rulePredicate EOF ;
    public final void entryRulePredicate() throws RecognitionException {
        try {
            // InternalBareBones.g:311:1: ( rulePredicate EOF )
            // InternalBareBones.g:312:1: rulePredicate EOF
            {
             before(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_1);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getPredicateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // InternalBareBones.g:319:1: rulePredicate : ( ruleAssociativePredicate ) ;
    public final void rulePredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:323:2: ( ( ruleAssociativePredicate ) )
            // InternalBareBones.g:324:2: ( ruleAssociativePredicate )
            {
            // InternalBareBones.g:324:2: ( ruleAssociativePredicate )
            // InternalBareBones.g:325:3: ruleAssociativePredicate
            {
             before(grammarAccess.getPredicateAccess().getAssociativePredicateParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleAssociativePredicate();

            state._fsp--;

             after(grammarAccess.getPredicateAccess().getAssociativePredicateParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleAssociativePredicate"
    // InternalBareBones.g:335:1: entryRuleAssociativePredicate : ruleAssociativePredicate EOF ;
    public final void entryRuleAssociativePredicate() throws RecognitionException {
        try {
            // InternalBareBones.g:336:1: ( ruleAssociativePredicate EOF )
            // InternalBareBones.g:337:1: ruleAssociativePredicate EOF
            {
             before(grammarAccess.getAssociativePredicateRule()); 
            pushFollow(FOLLOW_1);
            ruleAssociativePredicate();

            state._fsp--;

             after(grammarAccess.getAssociativePredicateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssociativePredicate"


    // $ANTLR start "ruleAssociativePredicate"
    // InternalBareBones.g:344:1: ruleAssociativePredicate : ( ( rule__AssociativePredicate__Group__0 ) ) ;
    public final void ruleAssociativePredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:348:2: ( ( ( rule__AssociativePredicate__Group__0 ) ) )
            // InternalBareBones.g:349:2: ( ( rule__AssociativePredicate__Group__0 ) )
            {
            // InternalBareBones.g:349:2: ( ( rule__AssociativePredicate__Group__0 ) )
            // InternalBareBones.g:350:3: ( rule__AssociativePredicate__Group__0 )
            {
             before(grammarAccess.getAssociativePredicateAccess().getGroup()); 
            // InternalBareBones.g:351:3: ( rule__AssociativePredicate__Group__0 )
            // InternalBareBones.g:351:4: rule__AssociativePredicate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssociativePredicate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociativePredicateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssociativePredicate"


    // $ANTLR start "entryRulePrimaryPredicate"
    // InternalBareBones.g:360:1: entryRulePrimaryPredicate : rulePrimaryPredicate EOF ;
    public final void entryRulePrimaryPredicate() throws RecognitionException {
        try {
            // InternalBareBones.g:361:1: ( rulePrimaryPredicate EOF )
            // InternalBareBones.g:362:1: rulePrimaryPredicate EOF
            {
             before(grammarAccess.getPrimaryPredicateRule()); 
            pushFollow(FOLLOW_1);
            rulePrimaryPredicate();

            state._fsp--;

             after(grammarAccess.getPrimaryPredicateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimaryPredicate"


    // $ANTLR start "rulePrimaryPredicate"
    // InternalBareBones.g:369:1: rulePrimaryPredicate : ( ruleRelationalPredicate ) ;
    public final void rulePrimaryPredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:373:2: ( ( ruleRelationalPredicate ) )
            // InternalBareBones.g:374:2: ( ruleRelationalPredicate )
            {
            // InternalBareBones.g:374:2: ( ruleRelationalPredicate )
            // InternalBareBones.g:375:3: ruleRelationalPredicate
            {
             before(grammarAccess.getPrimaryPredicateAccess().getRelationalPredicateParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleRelationalPredicate();

            state._fsp--;

             after(grammarAccess.getPrimaryPredicateAccess().getRelationalPredicateParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryPredicate"


    // $ANTLR start "entryRuleRelationalPredicate"
    // InternalBareBones.g:385:1: entryRuleRelationalPredicate : ruleRelationalPredicate EOF ;
    public final void entryRuleRelationalPredicate() throws RecognitionException {
        try {
            // InternalBareBones.g:386:1: ( ruleRelationalPredicate EOF )
            // InternalBareBones.g:387:1: ruleRelationalPredicate EOF
            {
             before(grammarAccess.getRelationalPredicateRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationalPredicate();

            state._fsp--;

             after(grammarAccess.getRelationalPredicateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelationalPredicate"


    // $ANTLR start "ruleRelationalPredicate"
    // InternalBareBones.g:394:1: ruleRelationalPredicate : ( ( rule__RelationalPredicate__Group__0 ) ) ;
    public final void ruleRelationalPredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:398:2: ( ( ( rule__RelationalPredicate__Group__0 ) ) )
            // InternalBareBones.g:399:2: ( ( rule__RelationalPredicate__Group__0 ) )
            {
            // InternalBareBones.g:399:2: ( ( rule__RelationalPredicate__Group__0 ) )
            // InternalBareBones.g:400:3: ( rule__RelationalPredicate__Group__0 )
            {
             before(grammarAccess.getRelationalPredicateAccess().getGroup()); 
            // InternalBareBones.g:401:3: ( rule__RelationalPredicate__Group__0 )
            // InternalBareBones.g:401:4: rule__RelationalPredicate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelationalPredicate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationalPredicateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationalPredicate"


    // $ANTLR start "entryRuleExpression"
    // InternalBareBones.g:410:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalBareBones.g:411:1: ( ruleExpression EOF )
            // InternalBareBones.g:412:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalBareBones.g:419:1: ruleExpression : ( ruleAdditionSubtraction ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:423:2: ( ( ruleAdditionSubtraction ) )
            // InternalBareBones.g:424:2: ( ruleAdditionSubtraction )
            {
            // InternalBareBones.g:424:2: ( ruleAdditionSubtraction )
            // InternalBareBones.g:425:3: ruleAdditionSubtraction
            {
             before(grammarAccess.getExpressionAccess().getAdditionSubtractionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleAdditionSubtraction();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getAdditionSubtractionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAdditionSubtraction"
    // InternalBareBones.g:435:1: entryRuleAdditionSubtraction : ruleAdditionSubtraction EOF ;
    public final void entryRuleAdditionSubtraction() throws RecognitionException {
        try {
            // InternalBareBones.g:436:1: ( ruleAdditionSubtraction EOF )
            // InternalBareBones.g:437:1: ruleAdditionSubtraction EOF
            {
             before(grammarAccess.getAdditionSubtractionRule()); 
            pushFollow(FOLLOW_1);
            ruleAdditionSubtraction();

            state._fsp--;

             after(grammarAccess.getAdditionSubtractionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdditionSubtraction"


    // $ANTLR start "ruleAdditionSubtraction"
    // InternalBareBones.g:444:1: ruleAdditionSubtraction : ( ( rule__AdditionSubtraction__Group__0 ) ) ;
    public final void ruleAdditionSubtraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:448:2: ( ( ( rule__AdditionSubtraction__Group__0 ) ) )
            // InternalBareBones.g:449:2: ( ( rule__AdditionSubtraction__Group__0 ) )
            {
            // InternalBareBones.g:449:2: ( ( rule__AdditionSubtraction__Group__0 ) )
            // InternalBareBones.g:450:3: ( rule__AdditionSubtraction__Group__0 )
            {
             before(grammarAccess.getAdditionSubtractionAccess().getGroup()); 
            // InternalBareBones.g:451:3: ( rule__AdditionSubtraction__Group__0 )
            // InternalBareBones.g:451:4: rule__AdditionSubtraction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AdditionSubtraction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionSubtractionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditionSubtraction"


    // $ANTLR start "entryRuleMultiplicationDivision"
    // InternalBareBones.g:460:1: entryRuleMultiplicationDivision : ruleMultiplicationDivision EOF ;
    public final void entryRuleMultiplicationDivision() throws RecognitionException {
        try {
            // InternalBareBones.g:461:1: ( ruleMultiplicationDivision EOF )
            // InternalBareBones.g:462:1: ruleMultiplicationDivision EOF
            {
             before(grammarAccess.getMultiplicationDivisionRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplicationDivision();

            state._fsp--;

             after(grammarAccess.getMultiplicationDivisionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplicationDivision"


    // $ANTLR start "ruleMultiplicationDivision"
    // InternalBareBones.g:469:1: ruleMultiplicationDivision : ( ( rule__MultiplicationDivision__Group__0 ) ) ;
    public final void ruleMultiplicationDivision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:473:2: ( ( ( rule__MultiplicationDivision__Group__0 ) ) )
            // InternalBareBones.g:474:2: ( ( rule__MultiplicationDivision__Group__0 ) )
            {
            // InternalBareBones.g:474:2: ( ( rule__MultiplicationDivision__Group__0 ) )
            // InternalBareBones.g:475:3: ( rule__MultiplicationDivision__Group__0 )
            {
             before(grammarAccess.getMultiplicationDivisionAccess().getGroup()); 
            // InternalBareBones.g:476:3: ( rule__MultiplicationDivision__Group__0 )
            // InternalBareBones.g:476:4: rule__MultiplicationDivision__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationDivision__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationDivisionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicationDivision"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalBareBones.g:485:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalBareBones.g:486:1: ( rulePrimaryExpression EOF )
            // InternalBareBones.g:487:1: rulePrimaryExpression EOF
            {
             before(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalBareBones.g:494:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:498:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalBareBones.g:499:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalBareBones.g:499:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalBareBones.g:500:3: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // InternalBareBones.g:501:3: ( rule__PrimaryExpression__Alternatives )
            // InternalBareBones.g:501:4: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalBareBones.g:510:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // InternalBareBones.g:511:1: ( ruleNumberLiteral EOF )
            // InternalBareBones.g:512:1: ruleNumberLiteral EOF
            {
             before(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberLiteral();

            state._fsp--;

             after(grammarAccess.getNumberLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalBareBones.g:519:1: ruleNumberLiteral : ( ( rule__NumberLiteral__ValueAssignment ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:523:2: ( ( ( rule__NumberLiteral__ValueAssignment ) ) )
            // InternalBareBones.g:524:2: ( ( rule__NumberLiteral__ValueAssignment ) )
            {
            // InternalBareBones.g:524:2: ( ( rule__NumberLiteral__ValueAssignment ) )
            // InternalBareBones.g:525:3: ( rule__NumberLiteral__ValueAssignment )
            {
             before(grammarAccess.getNumberLiteralAccess().getValueAssignment()); 
            // InternalBareBones.g:526:3: ( rule__NumberLiteral__ValueAssignment )
            // InternalBareBones.g:526:4: rule__NumberLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleIdentifier"
    // InternalBareBones.g:535:1: entryRuleIdentifier : ruleIdentifier EOF ;
    public final void entryRuleIdentifier() throws RecognitionException {
        try {
            // InternalBareBones.g:536:1: ( ruleIdentifier EOF )
            // InternalBareBones.g:537:1: ruleIdentifier EOF
            {
             before(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_1);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getIdentifierRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // InternalBareBones.g:544:1: ruleIdentifier : ( ( rule__Identifier__NameAssignment ) ) ;
    public final void ruleIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:548:2: ( ( ( rule__Identifier__NameAssignment ) ) )
            // InternalBareBones.g:549:2: ( ( rule__Identifier__NameAssignment ) )
            {
            // InternalBareBones.g:549:2: ( ( rule__Identifier__NameAssignment ) )
            // InternalBareBones.g:550:3: ( rule__Identifier__NameAssignment )
            {
             before(grammarAccess.getIdentifierAccess().getNameAssignment()); 
            // InternalBareBones.g:551:3: ( rule__Identifier__NameAssignment )
            // InternalBareBones.g:551:4: rule__Identifier__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Identifier__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIdentifierAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalBareBones.g:559:1: rule__Statement__Alternatives : ( ( ruleClear ) | ( ruleIncrement ) | ( ruleDecrement ) | ( ruleWhile ) | ( ruleOutVariable ) | ( ruleOutString ) | ( ruleIn ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:563:1: ( ( ruleClear ) | ( ruleIncrement ) | ( ruleDecrement ) | ( ruleWhile ) | ( ruleOutVariable ) | ( ruleOutString ) | ( ruleIn ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 19:
                {
                alt2=3;
                }
                break;
            case 20:
                {
                alt2=4;
                }
                break;
            case 23:
                {
                int LA2_5 = input.LA(2);

                if ( (LA2_5==RULE_ID||LA2_5==RULE_INT||LA2_5==25) ) {
                    alt2=5;
                }
                else if ( (LA2_5==RULE_STRING) ) {
                    alt2=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 5, input);

                    throw nvae;
                }
                }
                break;
            case 24:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalBareBones.g:564:2: ( ruleClear )
                    {
                    // InternalBareBones.g:564:2: ( ruleClear )
                    // InternalBareBones.g:565:3: ruleClear
                    {
                     before(grammarAccess.getStatementAccess().getClearParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClear();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getClearParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBareBones.g:570:2: ( ruleIncrement )
                    {
                    // InternalBareBones.g:570:2: ( ruleIncrement )
                    // InternalBareBones.g:571:3: ruleIncrement
                    {
                     before(grammarAccess.getStatementAccess().getIncrementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIncrement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getIncrementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBareBones.g:576:2: ( ruleDecrement )
                    {
                    // InternalBareBones.g:576:2: ( ruleDecrement )
                    // InternalBareBones.g:577:3: ruleDecrement
                    {
                     before(grammarAccess.getStatementAccess().getDecrementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDecrement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getDecrementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBareBones.g:582:2: ( ruleWhile )
                    {
                    // InternalBareBones.g:582:2: ( ruleWhile )
                    // InternalBareBones.g:583:3: ruleWhile
                    {
                     before(grammarAccess.getStatementAccess().getWhileParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleWhile();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getWhileParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBareBones.g:588:2: ( ruleOutVariable )
                    {
                    // InternalBareBones.g:588:2: ( ruleOutVariable )
                    // InternalBareBones.g:589:3: ruleOutVariable
                    {
                     before(grammarAccess.getStatementAccess().getOutVariableParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleOutVariable();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getOutVariableParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBareBones.g:594:2: ( ruleOutString )
                    {
                    // InternalBareBones.g:594:2: ( ruleOutString )
                    // InternalBareBones.g:595:3: ruleOutString
                    {
                     before(grammarAccess.getStatementAccess().getOutStringParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleOutString();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getOutStringParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBareBones.g:600:2: ( ruleIn )
                    {
                    // InternalBareBones.g:600:2: ( ruleIn )
                    // InternalBareBones.g:601:3: ruleIn
                    {
                     before(grammarAccess.getStatementAccess().getInParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleIn();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getInParserRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__AssociativePredicate__TagAlternatives_1_1_0"
    // InternalBareBones.g:610:1: rule__AssociativePredicate__TagAlternatives_1_1_0 : ( ( '&&' ) | ( '||' ) );
    public final void rule__AssociativePredicate__TagAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:614:1: ( ( '&&' ) | ( '||' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBareBones.g:615:2: ( '&&' )
                    {
                    // InternalBareBones.g:615:2: ( '&&' )
                    // InternalBareBones.g:616:3: '&&'
                    {
                     before(grammarAccess.getAssociativePredicateAccess().getTagAmpersandAmpersandKeyword_1_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getAssociativePredicateAccess().getTagAmpersandAmpersandKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBareBones.g:621:2: ( '||' )
                    {
                    // InternalBareBones.g:621:2: ( '||' )
                    // InternalBareBones.g:622:3: '||'
                    {
                     before(grammarAccess.getAssociativePredicateAccess().getTagVerticalLineVerticalLineKeyword_1_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getAssociativePredicateAccess().getTagVerticalLineVerticalLineKeyword_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociativePredicate__TagAlternatives_1_1_0"


    // $ANTLR start "rule__AdditionSubtraction__TagAlternatives_1_1_0"
    // InternalBareBones.g:631:1: rule__AdditionSubtraction__TagAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__AdditionSubtraction__TagAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:635:1: ( ( '+' ) | ( '-' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBareBones.g:636:2: ( '+' )
                    {
                    // InternalBareBones.g:636:2: ( '+' )
                    // InternalBareBones.g:637:3: '+'
                    {
                     before(grammarAccess.getAdditionSubtractionAccess().getTagPlusSignKeyword_1_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getAdditionSubtractionAccess().getTagPlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBareBones.g:642:2: ( '-' )
                    {
                    // InternalBareBones.g:642:2: ( '-' )
                    // InternalBareBones.g:643:3: '-'
                    {
                     before(grammarAccess.getAdditionSubtractionAccess().getTagHyphenMinusKeyword_1_1_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getAdditionSubtractionAccess().getTagHyphenMinusKeyword_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionSubtraction__TagAlternatives_1_1_0"


    // $ANTLR start "rule__MultiplicationDivision__TagAlternatives_1_1_0"
    // InternalBareBones.g:652:1: rule__MultiplicationDivision__TagAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__MultiplicationDivision__TagAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:656:1: ( ( '*' ) | ( '/' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalBareBones.g:657:2: ( '*' )
                    {
                    // InternalBareBones.g:657:2: ( '*' )
                    // InternalBareBones.g:658:3: '*'
                    {
                     before(grammarAccess.getMultiplicationDivisionAccess().getTagAsteriskKeyword_1_1_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationDivisionAccess().getTagAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBareBones.g:663:2: ( '/' )
                    {
                    // InternalBareBones.g:663:2: ( '/' )
                    // InternalBareBones.g:664:3: '/'
                    {
                     before(grammarAccess.getMultiplicationDivisionAccess().getTagSolidusKeyword_1_1_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationDivisionAccess().getTagSolidusKeyword_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationDivision__TagAlternatives_1_1_0"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // InternalBareBones.g:673:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ruleNumberLiteral ) | ( ruleIdentifier ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:677:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ruleNumberLiteral ) | ( ruleIdentifier ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt6=1;
                }
                break;
            case RULE_INT:
                {
                alt6=2;
                }
                break;
            case RULE_ID:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalBareBones.g:678:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // InternalBareBones.g:678:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // InternalBareBones.g:679:3: ( rule__PrimaryExpression__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    // InternalBareBones.g:680:3: ( rule__PrimaryExpression__Group_0__0 )
                    // InternalBareBones.g:680:4: rule__PrimaryExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBareBones.g:684:2: ( ruleNumberLiteral )
                    {
                    // InternalBareBones.g:684:2: ( ruleNumberLiteral )
                    // InternalBareBones.g:685:3: ruleNumberLiteral
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getNumberLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNumberLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getNumberLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBareBones.g:690:2: ( ruleIdentifier )
                    {
                    // InternalBareBones.g:690:2: ( ruleIdentifier )
                    // InternalBareBones.g:691:3: ruleIdentifier
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getIdentifierParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleIdentifier();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getIdentifierParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__Clear__Group__0"
    // InternalBareBones.g:700:1: rule__Clear__Group__0 : rule__Clear__Group__0__Impl rule__Clear__Group__1 ;
    public final void rule__Clear__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:704:1: ( rule__Clear__Group__0__Impl rule__Clear__Group__1 )
            // InternalBareBones.g:705:2: rule__Clear__Group__0__Impl rule__Clear__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Clear__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clear__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clear__Group__0"


    // $ANTLR start "rule__Clear__Group__0__Impl"
    // InternalBareBones.g:712:1: rule__Clear__Group__0__Impl : ( () ) ;
    public final void rule__Clear__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:716:1: ( ( () ) )
            // InternalBareBones.g:717:1: ( () )
            {
            // InternalBareBones.g:717:1: ( () )
            // InternalBareBones.g:718:2: ()
            {
             before(grammarAccess.getClearAccess().getClearAction_0()); 
            // InternalBareBones.g:719:2: ()
            // InternalBareBones.g:719:3: 
            {
            }

             after(grammarAccess.getClearAccess().getClearAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clear__Group__0__Impl"


    // $ANTLR start "rule__Clear__Group__1"
    // InternalBareBones.g:727:1: rule__Clear__Group__1 : rule__Clear__Group__1__Impl rule__Clear__Group__2 ;
    public final void rule__Clear__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:731:1: ( rule__Clear__Group__1__Impl rule__Clear__Group__2 )
            // InternalBareBones.g:732:2: rule__Clear__Group__1__Impl rule__Clear__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Clear__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clear__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clear__Group__1"


    // $ANTLR start "rule__Clear__Group__1__Impl"
    // InternalBareBones.g:739:1: rule__Clear__Group__1__Impl : ( 'clear' ) ;
    public final void rule__Clear__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:743:1: ( ( 'clear' ) )
            // InternalBareBones.g:744:1: ( 'clear' )
            {
            // InternalBareBones.g:744:1: ( 'clear' )
            // InternalBareBones.g:745:2: 'clear'
            {
             before(grammarAccess.getClearAccess().getClearKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getClearAccess().getClearKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clear__Group__1__Impl"


    // $ANTLR start "rule__Clear__Group__2"
    // InternalBareBones.g:754:1: rule__Clear__Group__2 : rule__Clear__Group__2__Impl ;
    public final void rule__Clear__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:758:1: ( rule__Clear__Group__2__Impl )
            // InternalBareBones.g:759:2: rule__Clear__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Clear__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clear__Group__2"


    // $ANTLR start "rule__Clear__Group__2__Impl"
    // InternalBareBones.g:765:1: rule__Clear__Group__2__Impl : ( ( rule__Clear__NameAssignment_2 ) ) ;
    public final void rule__Clear__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:769:1: ( ( ( rule__Clear__NameAssignment_2 ) ) )
            // InternalBareBones.g:770:1: ( ( rule__Clear__NameAssignment_2 ) )
            {
            // InternalBareBones.g:770:1: ( ( rule__Clear__NameAssignment_2 ) )
            // InternalBareBones.g:771:2: ( rule__Clear__NameAssignment_2 )
            {
             before(grammarAccess.getClearAccess().getNameAssignment_2()); 
            // InternalBareBones.g:772:2: ( rule__Clear__NameAssignment_2 )
            // InternalBareBones.g:772:3: rule__Clear__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Clear__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClearAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clear__Group__2__Impl"


    // $ANTLR start "rule__Increment__Group__0"
    // InternalBareBones.g:781:1: rule__Increment__Group__0 : rule__Increment__Group__0__Impl rule__Increment__Group__1 ;
    public final void rule__Increment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:785:1: ( rule__Increment__Group__0__Impl rule__Increment__Group__1 )
            // InternalBareBones.g:786:2: rule__Increment__Group__0__Impl rule__Increment__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Increment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Increment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Increment__Group__0"


    // $ANTLR start "rule__Increment__Group__0__Impl"
    // InternalBareBones.g:793:1: rule__Increment__Group__0__Impl : ( () ) ;
    public final void rule__Increment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:797:1: ( ( () ) )
            // InternalBareBones.g:798:1: ( () )
            {
            // InternalBareBones.g:798:1: ( () )
            // InternalBareBones.g:799:2: ()
            {
             before(grammarAccess.getIncrementAccess().getIncrementAction_0()); 
            // InternalBareBones.g:800:2: ()
            // InternalBareBones.g:800:3: 
            {
            }

             after(grammarAccess.getIncrementAccess().getIncrementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Increment__Group__0__Impl"


    // $ANTLR start "rule__Increment__Group__1"
    // InternalBareBones.g:808:1: rule__Increment__Group__1 : rule__Increment__Group__1__Impl rule__Increment__Group__2 ;
    public final void rule__Increment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:812:1: ( rule__Increment__Group__1__Impl rule__Increment__Group__2 )
            // InternalBareBones.g:813:2: rule__Increment__Group__1__Impl rule__Increment__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Increment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Increment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Increment__Group__1"


    // $ANTLR start "rule__Increment__Group__1__Impl"
    // InternalBareBones.g:820:1: rule__Increment__Group__1__Impl : ( 'incr' ) ;
    public final void rule__Increment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:824:1: ( ( 'incr' ) )
            // InternalBareBones.g:825:1: ( 'incr' )
            {
            // InternalBareBones.g:825:1: ( 'incr' )
            // InternalBareBones.g:826:2: 'incr'
            {
             before(grammarAccess.getIncrementAccess().getIncrKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getIncrementAccess().getIncrKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Increment__Group__1__Impl"


    // $ANTLR start "rule__Increment__Group__2"
    // InternalBareBones.g:835:1: rule__Increment__Group__2 : rule__Increment__Group__2__Impl ;
    public final void rule__Increment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:839:1: ( rule__Increment__Group__2__Impl )
            // InternalBareBones.g:840:2: rule__Increment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Increment__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Increment__Group__2"


    // $ANTLR start "rule__Increment__Group__2__Impl"
    // InternalBareBones.g:846:1: rule__Increment__Group__2__Impl : ( ( rule__Increment__NameAssignment_2 ) ) ;
    public final void rule__Increment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:850:1: ( ( ( rule__Increment__NameAssignment_2 ) ) )
            // InternalBareBones.g:851:1: ( ( rule__Increment__NameAssignment_2 ) )
            {
            // InternalBareBones.g:851:1: ( ( rule__Increment__NameAssignment_2 ) )
            // InternalBareBones.g:852:2: ( rule__Increment__NameAssignment_2 )
            {
             before(grammarAccess.getIncrementAccess().getNameAssignment_2()); 
            // InternalBareBones.g:853:2: ( rule__Increment__NameAssignment_2 )
            // InternalBareBones.g:853:3: rule__Increment__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Increment__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIncrementAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Increment__Group__2__Impl"


    // $ANTLR start "rule__Decrement__Group__0"
    // InternalBareBones.g:862:1: rule__Decrement__Group__0 : rule__Decrement__Group__0__Impl rule__Decrement__Group__1 ;
    public final void rule__Decrement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:866:1: ( rule__Decrement__Group__0__Impl rule__Decrement__Group__1 )
            // InternalBareBones.g:867:2: rule__Decrement__Group__0__Impl rule__Decrement__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Decrement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Decrement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decrement__Group__0"


    // $ANTLR start "rule__Decrement__Group__0__Impl"
    // InternalBareBones.g:874:1: rule__Decrement__Group__0__Impl : ( () ) ;
    public final void rule__Decrement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:878:1: ( ( () ) )
            // InternalBareBones.g:879:1: ( () )
            {
            // InternalBareBones.g:879:1: ( () )
            // InternalBareBones.g:880:2: ()
            {
             before(grammarAccess.getDecrementAccess().getDecrementAction_0()); 
            // InternalBareBones.g:881:2: ()
            // InternalBareBones.g:881:3: 
            {
            }

             after(grammarAccess.getDecrementAccess().getDecrementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decrement__Group__0__Impl"


    // $ANTLR start "rule__Decrement__Group__1"
    // InternalBareBones.g:889:1: rule__Decrement__Group__1 : rule__Decrement__Group__1__Impl rule__Decrement__Group__2 ;
    public final void rule__Decrement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:893:1: ( rule__Decrement__Group__1__Impl rule__Decrement__Group__2 )
            // InternalBareBones.g:894:2: rule__Decrement__Group__1__Impl rule__Decrement__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Decrement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Decrement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decrement__Group__1"


    // $ANTLR start "rule__Decrement__Group__1__Impl"
    // InternalBareBones.g:901:1: rule__Decrement__Group__1__Impl : ( 'decr' ) ;
    public final void rule__Decrement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:905:1: ( ( 'decr' ) )
            // InternalBareBones.g:906:1: ( 'decr' )
            {
            // InternalBareBones.g:906:1: ( 'decr' )
            // InternalBareBones.g:907:2: 'decr'
            {
             before(grammarAccess.getDecrementAccess().getDecrKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDecrementAccess().getDecrKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decrement__Group__1__Impl"


    // $ANTLR start "rule__Decrement__Group__2"
    // InternalBareBones.g:916:1: rule__Decrement__Group__2 : rule__Decrement__Group__2__Impl ;
    public final void rule__Decrement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:920:1: ( rule__Decrement__Group__2__Impl )
            // InternalBareBones.g:921:2: rule__Decrement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Decrement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decrement__Group__2"


    // $ANTLR start "rule__Decrement__Group__2__Impl"
    // InternalBareBones.g:927:1: rule__Decrement__Group__2__Impl : ( ( rule__Decrement__NameAssignment_2 ) ) ;
    public final void rule__Decrement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:931:1: ( ( ( rule__Decrement__NameAssignment_2 ) ) )
            // InternalBareBones.g:932:1: ( ( rule__Decrement__NameAssignment_2 ) )
            {
            // InternalBareBones.g:932:1: ( ( rule__Decrement__NameAssignment_2 ) )
            // InternalBareBones.g:933:2: ( rule__Decrement__NameAssignment_2 )
            {
             before(grammarAccess.getDecrementAccess().getNameAssignment_2()); 
            // InternalBareBones.g:934:2: ( rule__Decrement__NameAssignment_2 )
            // InternalBareBones.g:934:3: rule__Decrement__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Decrement__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDecrementAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decrement__Group__2__Impl"


    // $ANTLR start "rule__While__Group__0"
    // InternalBareBones.g:943:1: rule__While__Group__0 : rule__While__Group__0__Impl rule__While__Group__1 ;
    public final void rule__While__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:947:1: ( rule__While__Group__0__Impl rule__While__Group__1 )
            // InternalBareBones.g:948:2: rule__While__Group__0__Impl rule__While__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__While__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__While__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__0"


    // $ANTLR start "rule__While__Group__0__Impl"
    // InternalBareBones.g:955:1: rule__While__Group__0__Impl : ( () ) ;
    public final void rule__While__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:959:1: ( ( () ) )
            // InternalBareBones.g:960:1: ( () )
            {
            // InternalBareBones.g:960:1: ( () )
            // InternalBareBones.g:961:2: ()
            {
             before(grammarAccess.getWhileAccess().getWhileAction_0()); 
            // InternalBareBones.g:962:2: ()
            // InternalBareBones.g:962:3: 
            {
            }

             after(grammarAccess.getWhileAccess().getWhileAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__0__Impl"


    // $ANTLR start "rule__While__Group__1"
    // InternalBareBones.g:970:1: rule__While__Group__1 : rule__While__Group__1__Impl rule__While__Group__2 ;
    public final void rule__While__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:974:1: ( rule__While__Group__1__Impl rule__While__Group__2 )
            // InternalBareBones.g:975:2: rule__While__Group__1__Impl rule__While__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__While__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__While__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__1"


    // $ANTLR start "rule__While__Group__1__Impl"
    // InternalBareBones.g:982:1: rule__While__Group__1__Impl : ( 'while' ) ;
    public final void rule__While__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:986:1: ( ( 'while' ) )
            // InternalBareBones.g:987:1: ( 'while' )
            {
            // InternalBareBones.g:987:1: ( 'while' )
            // InternalBareBones.g:988:2: 'while'
            {
             before(grammarAccess.getWhileAccess().getWhileKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getWhileAccess().getWhileKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__1__Impl"


    // $ANTLR start "rule__While__Group__2"
    // InternalBareBones.g:997:1: rule__While__Group__2 : rule__While__Group__2__Impl rule__While__Group__3 ;
    public final void rule__While__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1001:1: ( rule__While__Group__2__Impl rule__While__Group__3 )
            // InternalBareBones.g:1002:2: rule__While__Group__2__Impl rule__While__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__While__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__While__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__2"


    // $ANTLR start "rule__While__Group__2__Impl"
    // InternalBareBones.g:1009:1: rule__While__Group__2__Impl : ( ( rule__While__ConditionAssignment_2 ) ) ;
    public final void rule__While__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1013:1: ( ( ( rule__While__ConditionAssignment_2 ) ) )
            // InternalBareBones.g:1014:1: ( ( rule__While__ConditionAssignment_2 ) )
            {
            // InternalBareBones.g:1014:1: ( ( rule__While__ConditionAssignment_2 ) )
            // InternalBareBones.g:1015:2: ( rule__While__ConditionAssignment_2 )
            {
             before(grammarAccess.getWhileAccess().getConditionAssignment_2()); 
            // InternalBareBones.g:1016:2: ( rule__While__ConditionAssignment_2 )
            // InternalBareBones.g:1016:3: rule__While__ConditionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__While__ConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWhileAccess().getConditionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__2__Impl"


    // $ANTLR start "rule__While__Group__3"
    // InternalBareBones.g:1024:1: rule__While__Group__3 : rule__While__Group__3__Impl rule__While__Group__4 ;
    public final void rule__While__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1028:1: ( rule__While__Group__3__Impl rule__While__Group__4 )
            // InternalBareBones.g:1029:2: rule__While__Group__3__Impl rule__While__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__While__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__While__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__3"


    // $ANTLR start "rule__While__Group__3__Impl"
    // InternalBareBones.g:1036:1: rule__While__Group__3__Impl : ( 'do' ) ;
    public final void rule__While__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1040:1: ( ( 'do' ) )
            // InternalBareBones.g:1041:1: ( 'do' )
            {
            // InternalBareBones.g:1041:1: ( 'do' )
            // InternalBareBones.g:1042:2: 'do'
            {
             before(grammarAccess.getWhileAccess().getDoKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getWhileAccess().getDoKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__3__Impl"


    // $ANTLR start "rule__While__Group__4"
    // InternalBareBones.g:1051:1: rule__While__Group__4 : rule__While__Group__4__Impl rule__While__Group__5 ;
    public final void rule__While__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1055:1: ( rule__While__Group__4__Impl rule__While__Group__5 )
            // InternalBareBones.g:1056:2: rule__While__Group__4__Impl rule__While__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__While__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__While__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__4"


    // $ANTLR start "rule__While__Group__4__Impl"
    // InternalBareBones.g:1063:1: rule__While__Group__4__Impl : ( ( ( rule__While__StatementsAssignment_4 ) ) ( ( rule__While__StatementsAssignment_4 )* ) ) ;
    public final void rule__While__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1067:1: ( ( ( ( rule__While__StatementsAssignment_4 ) ) ( ( rule__While__StatementsAssignment_4 )* ) ) )
            // InternalBareBones.g:1068:1: ( ( ( rule__While__StatementsAssignment_4 ) ) ( ( rule__While__StatementsAssignment_4 )* ) )
            {
            // InternalBareBones.g:1068:1: ( ( ( rule__While__StatementsAssignment_4 ) ) ( ( rule__While__StatementsAssignment_4 )* ) )
            // InternalBareBones.g:1069:2: ( ( rule__While__StatementsAssignment_4 ) ) ( ( rule__While__StatementsAssignment_4 )* )
            {
            // InternalBareBones.g:1069:2: ( ( rule__While__StatementsAssignment_4 ) )
            // InternalBareBones.g:1070:3: ( rule__While__StatementsAssignment_4 )
            {
             before(grammarAccess.getWhileAccess().getStatementsAssignment_4()); 
            // InternalBareBones.g:1071:3: ( rule__While__StatementsAssignment_4 )
            // InternalBareBones.g:1071:4: rule__While__StatementsAssignment_4
            {
            pushFollow(FOLLOW_3);
            rule__While__StatementsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getWhileAccess().getStatementsAssignment_4()); 

            }

            // InternalBareBones.g:1074:2: ( ( rule__While__StatementsAssignment_4 )* )
            // InternalBareBones.g:1075:3: ( rule__While__StatementsAssignment_4 )*
            {
             before(grammarAccess.getWhileAccess().getStatementsAssignment_4()); 
            // InternalBareBones.g:1076:3: ( rule__While__StatementsAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=17 && LA7_0<=20)||(LA7_0>=23 && LA7_0<=24)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBareBones.g:1076:4: rule__While__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__While__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getWhileAccess().getStatementsAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__4__Impl"


    // $ANTLR start "rule__While__Group__5"
    // InternalBareBones.g:1085:1: rule__While__Group__5 : rule__While__Group__5__Impl ;
    public final void rule__While__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1089:1: ( rule__While__Group__5__Impl )
            // InternalBareBones.g:1090:2: rule__While__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__While__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__5"


    // $ANTLR start "rule__While__Group__5__Impl"
    // InternalBareBones.g:1096:1: rule__While__Group__5__Impl : ( 'end' ) ;
    public final void rule__While__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1100:1: ( ( 'end' ) )
            // InternalBareBones.g:1101:1: ( 'end' )
            {
            // InternalBareBones.g:1101:1: ( 'end' )
            // InternalBareBones.g:1102:2: 'end'
            {
             before(grammarAccess.getWhileAccess().getEndKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getWhileAccess().getEndKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__5__Impl"


    // $ANTLR start "rule__OutVariable__Group__0"
    // InternalBareBones.g:1112:1: rule__OutVariable__Group__0 : rule__OutVariable__Group__0__Impl rule__OutVariable__Group__1 ;
    public final void rule__OutVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1116:1: ( rule__OutVariable__Group__0__Impl rule__OutVariable__Group__1 )
            // InternalBareBones.g:1117:2: rule__OutVariable__Group__0__Impl rule__OutVariable__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__OutVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutVariable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutVariable__Group__0"


    // $ANTLR start "rule__OutVariable__Group__0__Impl"
    // InternalBareBones.g:1124:1: rule__OutVariable__Group__0__Impl : ( () ) ;
    public final void rule__OutVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1128:1: ( ( () ) )
            // InternalBareBones.g:1129:1: ( () )
            {
            // InternalBareBones.g:1129:1: ( () )
            // InternalBareBones.g:1130:2: ()
            {
             before(grammarAccess.getOutVariableAccess().getOutVariableAction_0()); 
            // InternalBareBones.g:1131:2: ()
            // InternalBareBones.g:1131:3: 
            {
            }

             after(grammarAccess.getOutVariableAccess().getOutVariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutVariable__Group__0__Impl"


    // $ANTLR start "rule__OutVariable__Group__1"
    // InternalBareBones.g:1139:1: rule__OutVariable__Group__1 : rule__OutVariable__Group__1__Impl rule__OutVariable__Group__2 ;
    public final void rule__OutVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1143:1: ( rule__OutVariable__Group__1__Impl rule__OutVariable__Group__2 )
            // InternalBareBones.g:1144:2: rule__OutVariable__Group__1__Impl rule__OutVariable__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__OutVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutVariable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutVariable__Group__1"


    // $ANTLR start "rule__OutVariable__Group__1__Impl"
    // InternalBareBones.g:1151:1: rule__OutVariable__Group__1__Impl : ( 'out' ) ;
    public final void rule__OutVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1155:1: ( ( 'out' ) )
            // InternalBareBones.g:1156:1: ( 'out' )
            {
            // InternalBareBones.g:1156:1: ( 'out' )
            // InternalBareBones.g:1157:2: 'out'
            {
             before(grammarAccess.getOutVariableAccess().getOutKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getOutVariableAccess().getOutKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutVariable__Group__1__Impl"


    // $ANTLR start "rule__OutVariable__Group__2"
    // InternalBareBones.g:1166:1: rule__OutVariable__Group__2 : rule__OutVariable__Group__2__Impl ;
    public final void rule__OutVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1170:1: ( rule__OutVariable__Group__2__Impl )
            // InternalBareBones.g:1171:2: rule__OutVariable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OutVariable__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutVariable__Group__2"


    // $ANTLR start "rule__OutVariable__Group__2__Impl"
    // InternalBareBones.g:1177:1: rule__OutVariable__Group__2__Impl : ( ( rule__OutVariable__FormulaAssignment_2 ) ) ;
    public final void rule__OutVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1181:1: ( ( ( rule__OutVariable__FormulaAssignment_2 ) ) )
            // InternalBareBones.g:1182:1: ( ( rule__OutVariable__FormulaAssignment_2 ) )
            {
            // InternalBareBones.g:1182:1: ( ( rule__OutVariable__FormulaAssignment_2 ) )
            // InternalBareBones.g:1183:2: ( rule__OutVariable__FormulaAssignment_2 )
            {
             before(grammarAccess.getOutVariableAccess().getFormulaAssignment_2()); 
            // InternalBareBones.g:1184:2: ( rule__OutVariable__FormulaAssignment_2 )
            // InternalBareBones.g:1184:3: rule__OutVariable__FormulaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OutVariable__FormulaAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOutVariableAccess().getFormulaAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutVariable__Group__2__Impl"


    // $ANTLR start "rule__OutString__Group__0"
    // InternalBareBones.g:1193:1: rule__OutString__Group__0 : rule__OutString__Group__0__Impl rule__OutString__Group__1 ;
    public final void rule__OutString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1197:1: ( rule__OutString__Group__0__Impl rule__OutString__Group__1 )
            // InternalBareBones.g:1198:2: rule__OutString__Group__0__Impl rule__OutString__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__OutString__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutString__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutString__Group__0"


    // $ANTLR start "rule__OutString__Group__0__Impl"
    // InternalBareBones.g:1205:1: rule__OutString__Group__0__Impl : ( () ) ;
    public final void rule__OutString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1209:1: ( ( () ) )
            // InternalBareBones.g:1210:1: ( () )
            {
            // InternalBareBones.g:1210:1: ( () )
            // InternalBareBones.g:1211:2: ()
            {
             before(grammarAccess.getOutStringAccess().getOutStringAction_0()); 
            // InternalBareBones.g:1212:2: ()
            // InternalBareBones.g:1212:3: 
            {
            }

             after(grammarAccess.getOutStringAccess().getOutStringAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutString__Group__0__Impl"


    // $ANTLR start "rule__OutString__Group__1"
    // InternalBareBones.g:1220:1: rule__OutString__Group__1 : rule__OutString__Group__1__Impl rule__OutString__Group__2 ;
    public final void rule__OutString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1224:1: ( rule__OutString__Group__1__Impl rule__OutString__Group__2 )
            // InternalBareBones.g:1225:2: rule__OutString__Group__1__Impl rule__OutString__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__OutString__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutString__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutString__Group__1"


    // $ANTLR start "rule__OutString__Group__1__Impl"
    // InternalBareBones.g:1232:1: rule__OutString__Group__1__Impl : ( 'out' ) ;
    public final void rule__OutString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1236:1: ( ( 'out' ) )
            // InternalBareBones.g:1237:1: ( 'out' )
            {
            // InternalBareBones.g:1237:1: ( 'out' )
            // InternalBareBones.g:1238:2: 'out'
            {
             before(grammarAccess.getOutStringAccess().getOutKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getOutStringAccess().getOutKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutString__Group__1__Impl"


    // $ANTLR start "rule__OutString__Group__2"
    // InternalBareBones.g:1247:1: rule__OutString__Group__2 : rule__OutString__Group__2__Impl ;
    public final void rule__OutString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1251:1: ( rule__OutString__Group__2__Impl )
            // InternalBareBones.g:1252:2: rule__OutString__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OutString__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutString__Group__2"


    // $ANTLR start "rule__OutString__Group__2__Impl"
    // InternalBareBones.g:1258:1: rule__OutString__Group__2__Impl : ( ( rule__OutString__NameAssignment_2 ) ) ;
    public final void rule__OutString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1262:1: ( ( ( rule__OutString__NameAssignment_2 ) ) )
            // InternalBareBones.g:1263:1: ( ( rule__OutString__NameAssignment_2 ) )
            {
            // InternalBareBones.g:1263:1: ( ( rule__OutString__NameAssignment_2 ) )
            // InternalBareBones.g:1264:2: ( rule__OutString__NameAssignment_2 )
            {
             before(grammarAccess.getOutStringAccess().getNameAssignment_2()); 
            // InternalBareBones.g:1265:2: ( rule__OutString__NameAssignment_2 )
            // InternalBareBones.g:1265:3: rule__OutString__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OutString__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOutStringAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutString__Group__2__Impl"


    // $ANTLR start "rule__In__Group__0"
    // InternalBareBones.g:1274:1: rule__In__Group__0 : rule__In__Group__0__Impl rule__In__Group__1 ;
    public final void rule__In__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1278:1: ( rule__In__Group__0__Impl rule__In__Group__1 )
            // InternalBareBones.g:1279:2: rule__In__Group__0__Impl rule__In__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__In__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__In__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__In__Group__0"


    // $ANTLR start "rule__In__Group__0__Impl"
    // InternalBareBones.g:1286:1: rule__In__Group__0__Impl : ( () ) ;
    public final void rule__In__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1290:1: ( ( () ) )
            // InternalBareBones.g:1291:1: ( () )
            {
            // InternalBareBones.g:1291:1: ( () )
            // InternalBareBones.g:1292:2: ()
            {
             before(grammarAccess.getInAccess().getInAction_0()); 
            // InternalBareBones.g:1293:2: ()
            // InternalBareBones.g:1293:3: 
            {
            }

             after(grammarAccess.getInAccess().getInAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__In__Group__0__Impl"


    // $ANTLR start "rule__In__Group__1"
    // InternalBareBones.g:1301:1: rule__In__Group__1 : rule__In__Group__1__Impl rule__In__Group__2 ;
    public final void rule__In__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1305:1: ( rule__In__Group__1__Impl rule__In__Group__2 )
            // InternalBareBones.g:1306:2: rule__In__Group__1__Impl rule__In__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__In__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__In__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__In__Group__1"


    // $ANTLR start "rule__In__Group__1__Impl"
    // InternalBareBones.g:1313:1: rule__In__Group__1__Impl : ( 'in' ) ;
    public final void rule__In__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1317:1: ( ( 'in' ) )
            // InternalBareBones.g:1318:1: ( 'in' )
            {
            // InternalBareBones.g:1318:1: ( 'in' )
            // InternalBareBones.g:1319:2: 'in'
            {
             before(grammarAccess.getInAccess().getInKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getInAccess().getInKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__In__Group__1__Impl"


    // $ANTLR start "rule__In__Group__2"
    // InternalBareBones.g:1328:1: rule__In__Group__2 : rule__In__Group__2__Impl ;
    public final void rule__In__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1332:1: ( rule__In__Group__2__Impl )
            // InternalBareBones.g:1333:2: rule__In__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__In__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__In__Group__2"


    // $ANTLR start "rule__In__Group__2__Impl"
    // InternalBareBones.g:1339:1: rule__In__Group__2__Impl : ( ( rule__In__NameAssignment_2 ) ) ;
    public final void rule__In__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1343:1: ( ( ( rule__In__NameAssignment_2 ) ) )
            // InternalBareBones.g:1344:1: ( ( rule__In__NameAssignment_2 ) )
            {
            // InternalBareBones.g:1344:1: ( ( rule__In__NameAssignment_2 ) )
            // InternalBareBones.g:1345:2: ( rule__In__NameAssignment_2 )
            {
             before(grammarAccess.getInAccess().getNameAssignment_2()); 
            // InternalBareBones.g:1346:2: ( rule__In__NameAssignment_2 )
            // InternalBareBones.g:1346:3: rule__In__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__In__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__In__Group__2__Impl"


    // $ANTLR start "rule__AssociativePredicate__Group__0"
    // InternalBareBones.g:1355:1: rule__AssociativePredicate__Group__0 : rule__AssociativePredicate__Group__0__Impl rule__AssociativePredicate__Group__1 ;
    public final void rule__AssociativePredicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1359:1: ( rule__AssociativePredicate__Group__0__Impl rule__AssociativePredicate__Group__1 )
            // InternalBareBones.g:1360:2: rule__AssociativePredicate__Group__0__Impl rule__AssociativePredicate__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__AssociativePredicate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociativePredicate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociativePredicate__Group__0"


    // $ANTLR start "rule__AssociativePredicate__Group__0__Impl"
    // InternalBareBones.g:1367:1: rule__AssociativePredicate__Group__0__Impl : ( rulePrimaryPredicate ) ;
    public final void rule__AssociativePredicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1371:1: ( ( rulePrimaryPredicate ) )
            // InternalBareBones.g:1372:1: ( rulePrimaryPredicate )
            {
            // InternalBareBones.g:1372:1: ( rulePrimaryPredicate )
            // InternalBareBones.g:1373:2: rulePrimaryPredicate
            {
             before(grammarAccess.getAssociativePredicateAccess().getPrimaryPredicateParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryPredicate();

            state._fsp--;

             after(grammarAccess.getAssociativePredicateAccess().getPrimaryPredicateParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociativePredicate__Group__0__Impl"


    // $ANTLR start "rule__AssociativePredicate__Group__1"
    // InternalBareBones.g:1382:1: rule__AssociativePredicate__Group__1 : rule__AssociativePredicate__Group__1__Impl ;
    public final void rule__AssociativePredicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1386:1: ( rule__AssociativePredicate__Group__1__Impl )
            // InternalBareBones.g:1387:2: rule__AssociativePredicate__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociativePredicate__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociativePredicate__Group__1"


    // $ANTLR start "rule__AssociativePredicate__Group__1__Impl"
    // InternalBareBones.g:1393:1: rule__AssociativePredicate__Group__1__Impl : ( ( rule__AssociativePredicate__Group_1__0 )* ) ;
    public final void rule__AssociativePredicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1397:1: ( ( ( rule__AssociativePredicate__Group_1__0 )* ) )
            // InternalBareBones.g:1398:1: ( ( rule__AssociativePredicate__Group_1__0 )* )
            {
            // InternalBareBones.g:1398:1: ( ( rule__AssociativePredicate__Group_1__0 )* )
            // InternalBareBones.g:1399:2: ( rule__AssociativePredicate__Group_1__0 )*
            {
             before(grammarAccess.getAssociativePredicateAccess().getGroup_1()); 
            // InternalBareBones.g:1400:2: ( rule__AssociativePredicate__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=11 && LA8_0<=12)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBareBones.g:1400:3: rule__AssociativePredicate__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__AssociativePredicate__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getAssociativePredicateAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociativePredicate__Group__1__Impl"


    // $ANTLR start "rule__AssociativePredicate__Group_1__0"
    // InternalBareBones.g:1409:1: rule__AssociativePredicate__Group_1__0 : rule__AssociativePredicate__Group_1__0__Impl rule__AssociativePredicate__Group_1__1 ;
    public final void rule__AssociativePredicate__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1413:1: ( rule__AssociativePredicate__Group_1__0__Impl rule__AssociativePredicate__Group_1__1 )
            // InternalBareBones.g:1414:2: rule__AssociativePredicate__Group_1__0__Impl rule__AssociativePredicate__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__AssociativePredicate__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociativePredicate__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociativePredicate__Group_1__0"


    // $ANTLR start "rule__AssociativePredicate__Group_1__0__Impl"
    // InternalBareBones.g:1421:1: rule__AssociativePredicate__Group_1__0__Impl : ( () ) ;
    public final void rule__AssociativePredicate__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1425:1: ( ( () ) )
            // InternalBareBones.g:1426:1: ( () )
            {
            // InternalBareBones.g:1426:1: ( () )
            // InternalBareBones.g:1427:2: ()
            {
             before(grammarAccess.getAssociativePredicateAccess().getAssociativePredicateLeftAction_1_0()); 
            // InternalBareBones.g:1428:2: ()
            // InternalBareBones.g:1428:3: 
            {
            }

             after(grammarAccess.getAssociativePredicateAccess().getAssociativePredicateLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociativePredicate__Group_1__0__Impl"


    // $ANTLR start "rule__AssociativePredicate__Group_1__1"
    // InternalBareBones.g:1436:1: rule__AssociativePredicate__Group_1__1 : rule__AssociativePredicate__Group_1__1__Impl rule__AssociativePredicate__Group_1__2 ;
    public final void rule__AssociativePredicate__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1440:1: ( rule__AssociativePredicate__Group_1__1__Impl rule__AssociativePredicate__Group_1__2 )
            // InternalBareBones.g:1441:2: rule__AssociativePredicate__Group_1__1__Impl rule__AssociativePredicate__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__AssociativePredicate__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociativePredicate__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociativePredicate__Group_1__1"


    // $ANTLR start "rule__AssociativePredicate__Group_1__1__Impl"
    // InternalBareBones.g:1448:1: rule__AssociativePredicate__Group_1__1__Impl : ( ( rule__AssociativePredicate__TagAssignment_1_1 ) ) ;
    public final void rule__AssociativePredicate__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1452:1: ( ( ( rule__AssociativePredicate__TagAssignment_1_1 ) ) )
            // InternalBareBones.g:1453:1: ( ( rule__AssociativePredicate__TagAssignment_1_1 ) )
            {
            // InternalBareBones.g:1453:1: ( ( rule__AssociativePredicate__TagAssignment_1_1 ) )
            // InternalBareBones.g:1454:2: ( rule__AssociativePredicate__TagAssignment_1_1 )
            {
             before(grammarAccess.getAssociativePredicateAccess().getTagAssignment_1_1()); 
            // InternalBareBones.g:1455:2: ( rule__AssociativePredicate__TagAssignment_1_1 )
            // InternalBareBones.g:1455:3: rule__AssociativePredicate__TagAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AssociativePredicate__TagAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociativePredicateAccess().getTagAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociativePredicate__Group_1__1__Impl"


    // $ANTLR start "rule__AssociativePredicate__Group_1__2"
    // InternalBareBones.g:1463:1: rule__AssociativePredicate__Group_1__2 : rule__AssociativePredicate__Group_1__2__Impl ;
    public final void rule__AssociativePredicate__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1467:1: ( rule__AssociativePredicate__Group_1__2__Impl )
            // InternalBareBones.g:1468:2: rule__AssociativePredicate__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociativePredicate__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociativePredicate__Group_1__2"


    // $ANTLR start "rule__AssociativePredicate__Group_1__2__Impl"
    // InternalBareBones.g:1474:1: rule__AssociativePredicate__Group_1__2__Impl : ( ( rule__AssociativePredicate__RightAssignment_1_2 ) ) ;
    public final void rule__AssociativePredicate__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1478:1: ( ( ( rule__AssociativePredicate__RightAssignment_1_2 ) ) )
            // InternalBareBones.g:1479:1: ( ( rule__AssociativePredicate__RightAssignment_1_2 ) )
            {
            // InternalBareBones.g:1479:1: ( ( rule__AssociativePredicate__RightAssignment_1_2 ) )
            // InternalBareBones.g:1480:2: ( rule__AssociativePredicate__RightAssignment_1_2 )
            {
             before(grammarAccess.getAssociativePredicateAccess().getRightAssignment_1_2()); 
            // InternalBareBones.g:1481:2: ( rule__AssociativePredicate__RightAssignment_1_2 )
            // InternalBareBones.g:1481:3: rule__AssociativePredicate__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AssociativePredicate__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAssociativePredicateAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociativePredicate__Group_1__2__Impl"


    // $ANTLR start "rule__RelationalPredicate__Group__0"
    // InternalBareBones.g:1490:1: rule__RelationalPredicate__Group__0 : rule__RelationalPredicate__Group__0__Impl rule__RelationalPredicate__Group__1 ;
    public final void rule__RelationalPredicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1494:1: ( rule__RelationalPredicate__Group__0__Impl rule__RelationalPredicate__Group__1 )
            // InternalBareBones.g:1495:2: rule__RelationalPredicate__Group__0__Impl rule__RelationalPredicate__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__RelationalPredicate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationalPredicate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalPredicate__Group__0"


    // $ANTLR start "rule__RelationalPredicate__Group__0__Impl"
    // InternalBareBones.g:1502:1: rule__RelationalPredicate__Group__0__Impl : ( ruleExpression ) ;
    public final void rule__RelationalPredicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1506:1: ( ( ruleExpression ) )
            // InternalBareBones.g:1507:1: ( ruleExpression )
            {
            // InternalBareBones.g:1507:1: ( ruleExpression )
            // InternalBareBones.g:1508:2: ruleExpression
            {
             before(grammarAccess.getRelationalPredicateAccess().getExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getRelationalPredicateAccess().getExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalPredicate__Group__0__Impl"


    // $ANTLR start "rule__RelationalPredicate__Group__1"
    // InternalBareBones.g:1517:1: rule__RelationalPredicate__Group__1 : rule__RelationalPredicate__Group__1__Impl ;
    public final void rule__RelationalPredicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1521:1: ( rule__RelationalPredicate__Group__1__Impl )
            // InternalBareBones.g:1522:2: rule__RelationalPredicate__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationalPredicate__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalPredicate__Group__1"


    // $ANTLR start "rule__RelationalPredicate__Group__1__Impl"
    // InternalBareBones.g:1528:1: rule__RelationalPredicate__Group__1__Impl : ( ( rule__RelationalPredicate__Group_1__0 )? ) ;
    public final void rule__RelationalPredicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1532:1: ( ( ( rule__RelationalPredicate__Group_1__0 )? ) )
            // InternalBareBones.g:1533:1: ( ( rule__RelationalPredicate__Group_1__0 )? )
            {
            // InternalBareBones.g:1533:1: ( ( rule__RelationalPredicate__Group_1__0 )? )
            // InternalBareBones.g:1534:2: ( rule__RelationalPredicate__Group_1__0 )?
            {
             before(grammarAccess.getRelationalPredicateAccess().getGroup_1()); 
            // InternalBareBones.g:1535:2: ( rule__RelationalPredicate__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBareBones.g:1535:3: rule__RelationalPredicate__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelationalPredicate__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationalPredicateAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalPredicate__Group__1__Impl"


    // $ANTLR start "rule__RelationalPredicate__Group_1__0"
    // InternalBareBones.g:1544:1: rule__RelationalPredicate__Group_1__0 : rule__RelationalPredicate__Group_1__0__Impl rule__RelationalPredicate__Group_1__1 ;
    public final void rule__RelationalPredicate__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1548:1: ( rule__RelationalPredicate__Group_1__0__Impl rule__RelationalPredicate__Group_1__1 )
            // InternalBareBones.g:1549:2: rule__RelationalPredicate__Group_1__0__Impl rule__RelationalPredicate__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__RelationalPredicate__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationalPredicate__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalPredicate__Group_1__0"


    // $ANTLR start "rule__RelationalPredicate__Group_1__0__Impl"
    // InternalBareBones.g:1556:1: rule__RelationalPredicate__Group_1__0__Impl : ( () ) ;
    public final void rule__RelationalPredicate__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1560:1: ( ( () ) )
            // InternalBareBones.g:1561:1: ( () )
            {
            // InternalBareBones.g:1561:1: ( () )
            // InternalBareBones.g:1562:2: ()
            {
             before(grammarAccess.getRelationalPredicateAccess().getRelationalPredicateLeftAction_1_0()); 
            // InternalBareBones.g:1563:2: ()
            // InternalBareBones.g:1563:3: 
            {
            }

             after(grammarAccess.getRelationalPredicateAccess().getRelationalPredicateLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalPredicate__Group_1__0__Impl"


    // $ANTLR start "rule__RelationalPredicate__Group_1__1"
    // InternalBareBones.g:1571:1: rule__RelationalPredicate__Group_1__1 : rule__RelationalPredicate__Group_1__1__Impl rule__RelationalPredicate__Group_1__2 ;
    public final void rule__RelationalPredicate__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1575:1: ( rule__RelationalPredicate__Group_1__1__Impl rule__RelationalPredicate__Group_1__2 )
            // InternalBareBones.g:1576:2: rule__RelationalPredicate__Group_1__1__Impl rule__RelationalPredicate__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__RelationalPredicate__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationalPredicate__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalPredicate__Group_1__1"


    // $ANTLR start "rule__RelationalPredicate__Group_1__1__Impl"
    // InternalBareBones.g:1583:1: rule__RelationalPredicate__Group_1__1__Impl : ( ( rule__RelationalPredicate__TagAssignment_1_1 ) ) ;
    public final void rule__RelationalPredicate__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1587:1: ( ( ( rule__RelationalPredicate__TagAssignment_1_1 ) ) )
            // InternalBareBones.g:1588:1: ( ( rule__RelationalPredicate__TagAssignment_1_1 ) )
            {
            // InternalBareBones.g:1588:1: ( ( rule__RelationalPredicate__TagAssignment_1_1 ) )
            // InternalBareBones.g:1589:2: ( rule__RelationalPredicate__TagAssignment_1_1 )
            {
             before(grammarAccess.getRelationalPredicateAccess().getTagAssignment_1_1()); 
            // InternalBareBones.g:1590:2: ( rule__RelationalPredicate__TagAssignment_1_1 )
            // InternalBareBones.g:1590:3: rule__RelationalPredicate__TagAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RelationalPredicate__TagAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationalPredicateAccess().getTagAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalPredicate__Group_1__1__Impl"


    // $ANTLR start "rule__RelationalPredicate__Group_1__2"
    // InternalBareBones.g:1598:1: rule__RelationalPredicate__Group_1__2 : rule__RelationalPredicate__Group_1__2__Impl ;
    public final void rule__RelationalPredicate__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1602:1: ( rule__RelationalPredicate__Group_1__2__Impl )
            // InternalBareBones.g:1603:2: rule__RelationalPredicate__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationalPredicate__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalPredicate__Group_1__2"


    // $ANTLR start "rule__RelationalPredicate__Group_1__2__Impl"
    // InternalBareBones.g:1609:1: rule__RelationalPredicate__Group_1__2__Impl : ( ( rule__RelationalPredicate__RightAssignment_1_2 ) ) ;
    public final void rule__RelationalPredicate__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1613:1: ( ( ( rule__RelationalPredicate__RightAssignment_1_2 ) ) )
            // InternalBareBones.g:1614:1: ( ( rule__RelationalPredicate__RightAssignment_1_2 ) )
            {
            // InternalBareBones.g:1614:1: ( ( rule__RelationalPredicate__RightAssignment_1_2 ) )
            // InternalBareBones.g:1615:2: ( rule__RelationalPredicate__RightAssignment_1_2 )
            {
             before(grammarAccess.getRelationalPredicateAccess().getRightAssignment_1_2()); 
            // InternalBareBones.g:1616:2: ( rule__RelationalPredicate__RightAssignment_1_2 )
            // InternalBareBones.g:1616:3: rule__RelationalPredicate__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__RelationalPredicate__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationalPredicateAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalPredicate__Group_1__2__Impl"


    // $ANTLR start "rule__AdditionSubtraction__Group__0"
    // InternalBareBones.g:1625:1: rule__AdditionSubtraction__Group__0 : rule__AdditionSubtraction__Group__0__Impl rule__AdditionSubtraction__Group__1 ;
    public final void rule__AdditionSubtraction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1629:1: ( rule__AdditionSubtraction__Group__0__Impl rule__AdditionSubtraction__Group__1 )
            // InternalBareBones.g:1630:2: rule__AdditionSubtraction__Group__0__Impl rule__AdditionSubtraction__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__AdditionSubtraction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditionSubtraction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionSubtraction__Group__0"


    // $ANTLR start "rule__AdditionSubtraction__Group__0__Impl"
    // InternalBareBones.g:1637:1: rule__AdditionSubtraction__Group__0__Impl : ( ruleMultiplicationDivision ) ;
    public final void rule__AdditionSubtraction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1641:1: ( ( ruleMultiplicationDivision ) )
            // InternalBareBones.g:1642:1: ( ruleMultiplicationDivision )
            {
            // InternalBareBones.g:1642:1: ( ruleMultiplicationDivision )
            // InternalBareBones.g:1643:2: ruleMultiplicationDivision
            {
             before(grammarAccess.getAdditionSubtractionAccess().getMultiplicationDivisionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicationDivision();

            state._fsp--;

             after(grammarAccess.getAdditionSubtractionAccess().getMultiplicationDivisionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionSubtraction__Group__0__Impl"


    // $ANTLR start "rule__AdditionSubtraction__Group__1"
    // InternalBareBones.g:1652:1: rule__AdditionSubtraction__Group__1 : rule__AdditionSubtraction__Group__1__Impl ;
    public final void rule__AdditionSubtraction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1656:1: ( rule__AdditionSubtraction__Group__1__Impl )
            // InternalBareBones.g:1657:2: rule__AdditionSubtraction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditionSubtraction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionSubtraction__Group__1"


    // $ANTLR start "rule__AdditionSubtraction__Group__1__Impl"
    // InternalBareBones.g:1663:1: rule__AdditionSubtraction__Group__1__Impl : ( ( rule__AdditionSubtraction__Group_1__0 )* ) ;
    public final void rule__AdditionSubtraction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1667:1: ( ( ( rule__AdditionSubtraction__Group_1__0 )* ) )
            // InternalBareBones.g:1668:1: ( ( rule__AdditionSubtraction__Group_1__0 )* )
            {
            // InternalBareBones.g:1668:1: ( ( rule__AdditionSubtraction__Group_1__0 )* )
            // InternalBareBones.g:1669:2: ( rule__AdditionSubtraction__Group_1__0 )*
            {
             before(grammarAccess.getAdditionSubtractionAccess().getGroup_1()); 
            // InternalBareBones.g:1670:2: ( rule__AdditionSubtraction__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=13 && LA10_0<=14)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBareBones.g:1670:3: rule__AdditionSubtraction__Group_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__AdditionSubtraction__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getAdditionSubtractionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionSubtraction__Group__1__Impl"


    // $ANTLR start "rule__AdditionSubtraction__Group_1__0"
    // InternalBareBones.g:1679:1: rule__AdditionSubtraction__Group_1__0 : rule__AdditionSubtraction__Group_1__0__Impl rule__AdditionSubtraction__Group_1__1 ;
    public final void rule__AdditionSubtraction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1683:1: ( rule__AdditionSubtraction__Group_1__0__Impl rule__AdditionSubtraction__Group_1__1 )
            // InternalBareBones.g:1684:2: rule__AdditionSubtraction__Group_1__0__Impl rule__AdditionSubtraction__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__AdditionSubtraction__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditionSubtraction__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionSubtraction__Group_1__0"


    // $ANTLR start "rule__AdditionSubtraction__Group_1__0__Impl"
    // InternalBareBones.g:1691:1: rule__AdditionSubtraction__Group_1__0__Impl : ( () ) ;
    public final void rule__AdditionSubtraction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1695:1: ( ( () ) )
            // InternalBareBones.g:1696:1: ( () )
            {
            // InternalBareBones.g:1696:1: ( () )
            // InternalBareBones.g:1697:2: ()
            {
             before(grammarAccess.getAdditionSubtractionAccess().getAdditionSubtractionLeftAction_1_0()); 
            // InternalBareBones.g:1698:2: ()
            // InternalBareBones.g:1698:3: 
            {
            }

             after(grammarAccess.getAdditionSubtractionAccess().getAdditionSubtractionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionSubtraction__Group_1__0__Impl"


    // $ANTLR start "rule__AdditionSubtraction__Group_1__1"
    // InternalBareBones.g:1706:1: rule__AdditionSubtraction__Group_1__1 : rule__AdditionSubtraction__Group_1__1__Impl rule__AdditionSubtraction__Group_1__2 ;
    public final void rule__AdditionSubtraction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1710:1: ( rule__AdditionSubtraction__Group_1__1__Impl rule__AdditionSubtraction__Group_1__2 )
            // InternalBareBones.g:1711:2: rule__AdditionSubtraction__Group_1__1__Impl rule__AdditionSubtraction__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__AdditionSubtraction__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditionSubtraction__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionSubtraction__Group_1__1"


    // $ANTLR start "rule__AdditionSubtraction__Group_1__1__Impl"
    // InternalBareBones.g:1718:1: rule__AdditionSubtraction__Group_1__1__Impl : ( ( rule__AdditionSubtraction__TagAssignment_1_1 ) ) ;
    public final void rule__AdditionSubtraction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1722:1: ( ( ( rule__AdditionSubtraction__TagAssignment_1_1 ) ) )
            // InternalBareBones.g:1723:1: ( ( rule__AdditionSubtraction__TagAssignment_1_1 ) )
            {
            // InternalBareBones.g:1723:1: ( ( rule__AdditionSubtraction__TagAssignment_1_1 ) )
            // InternalBareBones.g:1724:2: ( rule__AdditionSubtraction__TagAssignment_1_1 )
            {
             before(grammarAccess.getAdditionSubtractionAccess().getTagAssignment_1_1()); 
            // InternalBareBones.g:1725:2: ( rule__AdditionSubtraction__TagAssignment_1_1 )
            // InternalBareBones.g:1725:3: rule__AdditionSubtraction__TagAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AdditionSubtraction__TagAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditionSubtractionAccess().getTagAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionSubtraction__Group_1__1__Impl"


    // $ANTLR start "rule__AdditionSubtraction__Group_1__2"
    // InternalBareBones.g:1733:1: rule__AdditionSubtraction__Group_1__2 : rule__AdditionSubtraction__Group_1__2__Impl ;
    public final void rule__AdditionSubtraction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1737:1: ( rule__AdditionSubtraction__Group_1__2__Impl )
            // InternalBareBones.g:1738:2: rule__AdditionSubtraction__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditionSubtraction__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionSubtraction__Group_1__2"


    // $ANTLR start "rule__AdditionSubtraction__Group_1__2__Impl"
    // InternalBareBones.g:1744:1: rule__AdditionSubtraction__Group_1__2__Impl : ( ( rule__AdditionSubtraction__RightAssignment_1_2 ) ) ;
    public final void rule__AdditionSubtraction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1748:1: ( ( ( rule__AdditionSubtraction__RightAssignment_1_2 ) ) )
            // InternalBareBones.g:1749:1: ( ( rule__AdditionSubtraction__RightAssignment_1_2 ) )
            {
            // InternalBareBones.g:1749:1: ( ( rule__AdditionSubtraction__RightAssignment_1_2 ) )
            // InternalBareBones.g:1750:2: ( rule__AdditionSubtraction__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionSubtractionAccess().getRightAssignment_1_2()); 
            // InternalBareBones.g:1751:2: ( rule__AdditionSubtraction__RightAssignment_1_2 )
            // InternalBareBones.g:1751:3: rule__AdditionSubtraction__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AdditionSubtraction__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditionSubtractionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionSubtraction__Group_1__2__Impl"


    // $ANTLR start "rule__MultiplicationDivision__Group__0"
    // InternalBareBones.g:1760:1: rule__MultiplicationDivision__Group__0 : rule__MultiplicationDivision__Group__0__Impl rule__MultiplicationDivision__Group__1 ;
    public final void rule__MultiplicationDivision__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1764:1: ( rule__MultiplicationDivision__Group__0__Impl rule__MultiplicationDivision__Group__1 )
            // InternalBareBones.g:1765:2: rule__MultiplicationDivision__Group__0__Impl rule__MultiplicationDivision__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__MultiplicationDivision__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicationDivision__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationDivision__Group__0"


    // $ANTLR start "rule__MultiplicationDivision__Group__0__Impl"
    // InternalBareBones.g:1772:1: rule__MultiplicationDivision__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__MultiplicationDivision__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1776:1: ( ( rulePrimaryExpression ) )
            // InternalBareBones.g:1777:1: ( rulePrimaryExpression )
            {
            // InternalBareBones.g:1777:1: ( rulePrimaryExpression )
            // InternalBareBones.g:1778:2: rulePrimaryExpression
            {
             before(grammarAccess.getMultiplicationDivisionAccess().getPrimaryExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationDivisionAccess().getPrimaryExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationDivision__Group__0__Impl"


    // $ANTLR start "rule__MultiplicationDivision__Group__1"
    // InternalBareBones.g:1787:1: rule__MultiplicationDivision__Group__1 : rule__MultiplicationDivision__Group__1__Impl ;
    public final void rule__MultiplicationDivision__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1791:1: ( rule__MultiplicationDivision__Group__1__Impl )
            // InternalBareBones.g:1792:2: rule__MultiplicationDivision__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationDivision__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationDivision__Group__1"


    // $ANTLR start "rule__MultiplicationDivision__Group__1__Impl"
    // InternalBareBones.g:1798:1: rule__MultiplicationDivision__Group__1__Impl : ( ( rule__MultiplicationDivision__Group_1__0 )* ) ;
    public final void rule__MultiplicationDivision__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1802:1: ( ( ( rule__MultiplicationDivision__Group_1__0 )* ) )
            // InternalBareBones.g:1803:1: ( ( rule__MultiplicationDivision__Group_1__0 )* )
            {
            // InternalBareBones.g:1803:1: ( ( rule__MultiplicationDivision__Group_1__0 )* )
            // InternalBareBones.g:1804:2: ( rule__MultiplicationDivision__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationDivisionAccess().getGroup_1()); 
            // InternalBareBones.g:1805:2: ( rule__MultiplicationDivision__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=15 && LA11_0<=16)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBareBones.g:1805:3: rule__MultiplicationDivision__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__MultiplicationDivision__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getMultiplicationDivisionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationDivision__Group__1__Impl"


    // $ANTLR start "rule__MultiplicationDivision__Group_1__0"
    // InternalBareBones.g:1814:1: rule__MultiplicationDivision__Group_1__0 : rule__MultiplicationDivision__Group_1__0__Impl rule__MultiplicationDivision__Group_1__1 ;
    public final void rule__MultiplicationDivision__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1818:1: ( rule__MultiplicationDivision__Group_1__0__Impl rule__MultiplicationDivision__Group_1__1 )
            // InternalBareBones.g:1819:2: rule__MultiplicationDivision__Group_1__0__Impl rule__MultiplicationDivision__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__MultiplicationDivision__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicationDivision__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationDivision__Group_1__0"


    // $ANTLR start "rule__MultiplicationDivision__Group_1__0__Impl"
    // InternalBareBones.g:1826:1: rule__MultiplicationDivision__Group_1__0__Impl : ( () ) ;
    public final void rule__MultiplicationDivision__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1830:1: ( ( () ) )
            // InternalBareBones.g:1831:1: ( () )
            {
            // InternalBareBones.g:1831:1: ( () )
            // InternalBareBones.g:1832:2: ()
            {
             before(grammarAccess.getMultiplicationDivisionAccess().getMultiplicationDivisionLeftAction_1_0()); 
            // InternalBareBones.g:1833:2: ()
            // InternalBareBones.g:1833:3: 
            {
            }

             after(grammarAccess.getMultiplicationDivisionAccess().getMultiplicationDivisionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationDivision__Group_1__0__Impl"


    // $ANTLR start "rule__MultiplicationDivision__Group_1__1"
    // InternalBareBones.g:1841:1: rule__MultiplicationDivision__Group_1__1 : rule__MultiplicationDivision__Group_1__1__Impl rule__MultiplicationDivision__Group_1__2 ;
    public final void rule__MultiplicationDivision__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1845:1: ( rule__MultiplicationDivision__Group_1__1__Impl rule__MultiplicationDivision__Group_1__2 )
            // InternalBareBones.g:1846:2: rule__MultiplicationDivision__Group_1__1__Impl rule__MultiplicationDivision__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__MultiplicationDivision__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicationDivision__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationDivision__Group_1__1"


    // $ANTLR start "rule__MultiplicationDivision__Group_1__1__Impl"
    // InternalBareBones.g:1853:1: rule__MultiplicationDivision__Group_1__1__Impl : ( ( rule__MultiplicationDivision__TagAssignment_1_1 ) ) ;
    public final void rule__MultiplicationDivision__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1857:1: ( ( ( rule__MultiplicationDivision__TagAssignment_1_1 ) ) )
            // InternalBareBones.g:1858:1: ( ( rule__MultiplicationDivision__TagAssignment_1_1 ) )
            {
            // InternalBareBones.g:1858:1: ( ( rule__MultiplicationDivision__TagAssignment_1_1 ) )
            // InternalBareBones.g:1859:2: ( rule__MultiplicationDivision__TagAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationDivisionAccess().getTagAssignment_1_1()); 
            // InternalBareBones.g:1860:2: ( rule__MultiplicationDivision__TagAssignment_1_1 )
            // InternalBareBones.g:1860:3: rule__MultiplicationDivision__TagAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationDivision__TagAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationDivisionAccess().getTagAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationDivision__Group_1__1__Impl"


    // $ANTLR start "rule__MultiplicationDivision__Group_1__2"
    // InternalBareBones.g:1868:1: rule__MultiplicationDivision__Group_1__2 : rule__MultiplicationDivision__Group_1__2__Impl ;
    public final void rule__MultiplicationDivision__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1872:1: ( rule__MultiplicationDivision__Group_1__2__Impl )
            // InternalBareBones.g:1873:2: rule__MultiplicationDivision__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationDivision__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationDivision__Group_1__2"


    // $ANTLR start "rule__MultiplicationDivision__Group_1__2__Impl"
    // InternalBareBones.g:1879:1: rule__MultiplicationDivision__Group_1__2__Impl : ( ( rule__MultiplicationDivision__RightAssignment_1_2 ) ) ;
    public final void rule__MultiplicationDivision__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1883:1: ( ( ( rule__MultiplicationDivision__RightAssignment_1_2 ) ) )
            // InternalBareBones.g:1884:1: ( ( rule__MultiplicationDivision__RightAssignment_1_2 ) )
            {
            // InternalBareBones.g:1884:1: ( ( rule__MultiplicationDivision__RightAssignment_1_2 ) )
            // InternalBareBones.g:1885:2: ( rule__MultiplicationDivision__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationDivisionAccess().getRightAssignment_1_2()); 
            // InternalBareBones.g:1886:2: ( rule__MultiplicationDivision__RightAssignment_1_2 )
            // InternalBareBones.g:1886:3: rule__MultiplicationDivision__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationDivision__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationDivisionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationDivision__Group_1__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0"
    // InternalBareBones.g:1895:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1899:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // InternalBareBones.g:1900:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_9);
            rule__PrimaryExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__0"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0__Impl"
    // InternalBareBones.g:1907:1: rule__PrimaryExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1911:1: ( ( '(' ) )
            // InternalBareBones.g:1912:1: ( '(' )
            {
            // InternalBareBones.g:1912:1: ( '(' )
            // InternalBareBones.g:1913:2: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1"
    // InternalBareBones.g:1922:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1926:1: ( rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 )
            // InternalBareBones.g:1927:2: rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_22);
            rule__PrimaryExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__1"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1__Impl"
    // InternalBareBones.g:1934:1: rule__PrimaryExpression__Group_0__1__Impl : ( ruleFormula ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1938:1: ( ( ruleFormula ) )
            // InternalBareBones.g:1939:1: ( ruleFormula )
            {
            // InternalBareBones.g:1939:1: ( ruleFormula )
            // InternalBareBones.g:1940:2: ruleFormula
            {
             before(grammarAccess.getPrimaryExpressionAccess().getFormulaParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFormula();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getFormulaParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__2"
    // InternalBareBones.g:1949:1: rule__PrimaryExpression__Group_0__2 : rule__PrimaryExpression__Group_0__2__Impl ;
    public final void rule__PrimaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1953:1: ( rule__PrimaryExpression__Group_0__2__Impl )
            // InternalBareBones.g:1954:2: rule__PrimaryExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__2"


    // $ANTLR start "rule__PrimaryExpression__Group_0__2__Impl"
    // InternalBareBones.g:1960:1: rule__PrimaryExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1964:1: ( ( ')' ) )
            // InternalBareBones.g:1965:1: ( ')' )
            {
            // InternalBareBones.g:1965:1: ( ')' )
            // InternalBareBones.g:1966:2: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__2__Impl"


    // $ANTLR start "rule__Program__StatementsAssignment"
    // InternalBareBones.g:1976:1: rule__Program__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Program__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1980:1: ( ( ruleStatement ) )
            // InternalBareBones.g:1981:2: ( ruleStatement )
            {
            // InternalBareBones.g:1981:2: ( ruleStatement )
            // InternalBareBones.g:1982:3: ruleStatement
            {
             before(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__StatementsAssignment"


    // $ANTLR start "rule__Clear__NameAssignment_2"
    // InternalBareBones.g:1991:1: rule__Clear__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Clear__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:1995:1: ( ( RULE_ID ) )
            // InternalBareBones.g:1996:2: ( RULE_ID )
            {
            // InternalBareBones.g:1996:2: ( RULE_ID )
            // InternalBareBones.g:1997:3: RULE_ID
            {
             before(grammarAccess.getClearAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClearAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clear__NameAssignment_2"


    // $ANTLR start "rule__Increment__NameAssignment_2"
    // InternalBareBones.g:2006:1: rule__Increment__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Increment__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:2010:1: ( ( RULE_ID ) )
            // InternalBareBones.g:2011:2: ( RULE_ID )
            {
            // InternalBareBones.g:2011:2: ( RULE_ID )
            // InternalBareBones.g:2012:3: RULE_ID
            {
             before(grammarAccess.getIncrementAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIncrementAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Increment__NameAssignment_2"


    // $ANTLR start "rule__Decrement__NameAssignment_2"
    // InternalBareBones.g:2021:1: rule__Decrement__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Decrement__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:2025:1: ( ( RULE_ID ) )
            // InternalBareBones.g:2026:2: ( RULE_ID )
            {
            // InternalBareBones.g:2026:2: ( RULE_ID )
            // InternalBareBones.g:2027:3: RULE_ID
            {
             before(grammarAccess.getDecrementAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDecrementAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decrement__NameAssignment_2"


    // $ANTLR start "rule__While__ConditionAssignment_2"
    // InternalBareBones.g:2036:1: rule__While__ConditionAssignment_2 : ( ruleFormula ) ;
    public final void rule__While__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:2040:1: ( ( ruleFormula ) )
            // InternalBareBones.g:2041:2: ( ruleFormula )
            {
            // InternalBareBones.g:2041:2: ( ruleFormula )
            // InternalBareBones.g:2042:3: ruleFormula
            {
             before(grammarAccess.getWhileAccess().getConditionFormulaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFormula();

            state._fsp--;

             after(grammarAccess.getWhileAccess().getConditionFormulaParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__ConditionAssignment_2"


    // $ANTLR start "rule__While__StatementsAssignment_4"
    // InternalBareBones.g:2051:1: rule__While__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__While__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:2055:1: ( ( ruleStatement ) )
            // InternalBareBones.g:2056:2: ( ruleStatement )
            {
            // InternalBareBones.g:2056:2: ( ruleStatement )
            // InternalBareBones.g:2057:3: ruleStatement
            {
             before(grammarAccess.getWhileAccess().getStatementsStatementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getWhileAccess().getStatementsStatementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__StatementsAssignment_4"


    // $ANTLR start "rule__OutVariable__FormulaAssignment_2"
    // InternalBareBones.g:2066:1: rule__OutVariable__FormulaAssignment_2 : ( ruleFormula ) ;
    public final void rule__OutVariable__FormulaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:2070:1: ( ( ruleFormula ) )
            // InternalBareBones.g:2071:2: ( ruleFormula )
            {
            // InternalBareBones.g:2071:2: ( ruleFormula )
            // InternalBareBones.g:2072:3: ruleFormula
            {
             before(grammarAccess.getOutVariableAccess().getFormulaFormulaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFormula();

            state._fsp--;

             after(grammarAccess.getOutVariableAccess().getFormulaFormulaParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutVariable__FormulaAssignment_2"


    // $ANTLR start "rule__OutString__NameAssignment_2"
    // InternalBareBones.g:2081:1: rule__OutString__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__OutString__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:2085:1: ( ( RULE_STRING ) )
            // InternalBareBones.g:2086:2: ( RULE_STRING )
            {
            // InternalBareBones.g:2086:2: ( RULE_STRING )
            // InternalBareBones.g:2087:3: RULE_STRING
            {
             before(grammarAccess.getOutStringAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOutStringAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutString__NameAssignment_2"


    // $ANTLR start "rule__In__NameAssignment_2"
    // InternalBareBones.g:2096:1: rule__In__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__In__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:2100:1: ( ( RULE_ID ) )
            // InternalBareBones.g:2101:2: ( RULE_ID )
            {
            // InternalBareBones.g:2101:2: ( RULE_ID )
            // InternalBareBones.g:2102:3: RULE_ID
            {
             before(grammarAccess.getInAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__In__NameAssignment_2"


    // $ANTLR start "rule__AssociativePredicate__TagAssignment_1_1"
    // InternalBareBones.g:2111:1: rule__AssociativePredicate__TagAssignment_1_1 : ( ( rule__AssociativePredicate__TagAlternatives_1_1_0 ) ) ;
    public final void rule__AssociativePredicate__TagAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:2115:1: ( ( ( rule__AssociativePredicate__TagAlternatives_1_1_0 ) ) )
            // InternalBareBones.g:2116:2: ( ( rule__AssociativePredicate__TagAlternatives_1_1_0 ) )
            {
            // InternalBareBones.g:2116:2: ( ( rule__AssociativePredicate__TagAlternatives_1_1_0 ) )
            // InternalBareBones.g:2117:3: ( rule__AssociativePredicate__TagAlternatives_1_1_0 )
            {
             before(grammarAccess.getAssociativePredicateAccess().getTagAlternatives_1_1_0()); 
            // InternalBareBones.g:2118:3: ( rule__AssociativePredicate__TagAlternatives_1_1_0 )
            // InternalBareBones.g:2118:4: rule__AssociativePredicate__TagAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__AssociativePredicate__TagAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAssociativePredicateAccess().getTagAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociativePredicate__TagAssignment_1_1"


    // $ANTLR start "rule__AssociativePredicate__RightAssignment_1_2"
    // InternalBareBones.g:2126:1: rule__AssociativePredicate__RightAssignment_1_2 : ( rulePrimaryPredicate ) ;
    public final void rule__AssociativePredicate__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:2130:1: ( ( rulePrimaryPredicate ) )
            // InternalBareBones.g:2131:2: ( rulePrimaryPredicate )
            {
            // InternalBareBones.g:2131:2: ( rulePrimaryPredicate )
            // InternalBareBones.g:2132:3: rulePrimaryPredicate
            {
             before(grammarAccess.getAssociativePredicateAccess().getRightPrimaryPredicateParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryPredicate();

            state._fsp--;

             after(grammarAccess.getAssociativePredicateAccess().getRightPrimaryPredicateParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociativePredicate__RightAssignment_1_2"


    // $ANTLR start "rule__RelationalPredicate__TagAssignment_1_1"
    // InternalBareBones.g:2141:1: rule__RelationalPredicate__TagAssignment_1_1 : ( ( '=' ) ) ;
    public final void rule__RelationalPredicate__TagAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:2145:1: ( ( ( '=' ) ) )
            // InternalBareBones.g:2146:2: ( ( '=' ) )
            {
            // InternalBareBones.g:2146:2: ( ( '=' ) )
            // InternalBareBones.g:2147:3: ( '=' )
            {
             before(grammarAccess.getRelationalPredicateAccess().getTagEqualsSignKeyword_1_1_0()); 
            // InternalBareBones.g:2148:3: ( '=' )
            // InternalBareBones.g:2149:4: '='
            {
             before(grammarAccess.getRelationalPredicateAccess().getTagEqualsSignKeyword_1_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRelationalPredicateAccess().getTagEqualsSignKeyword_1_1_0()); 

            }

             after(grammarAccess.getRelationalPredicateAccess().getTagEqualsSignKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalPredicate__TagAssignment_1_1"


    // $ANTLR start "rule__RelationalPredicate__RightAssignment_1_2"
    // InternalBareBones.g:2160:1: rule__RelationalPredicate__RightAssignment_1_2 : ( ruleExpression ) ;
    public final void rule__RelationalPredicate__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:2164:1: ( ( ruleExpression ) )
            // InternalBareBones.g:2165:2: ( ruleExpression )
            {
            // InternalBareBones.g:2165:2: ( ruleExpression )
            // InternalBareBones.g:2166:3: ruleExpression
            {
             before(grammarAccess.getRelationalPredicateAccess().getRightExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getRelationalPredicateAccess().getRightExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalPredicate__RightAssignment_1_2"


    // $ANTLR start "rule__AdditionSubtraction__TagAssignment_1_1"
    // InternalBareBones.g:2175:1: rule__AdditionSubtraction__TagAssignment_1_1 : ( ( rule__AdditionSubtraction__TagAlternatives_1_1_0 ) ) ;
    public final void rule__AdditionSubtraction__TagAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:2179:1: ( ( ( rule__AdditionSubtraction__TagAlternatives_1_1_0 ) ) )
            // InternalBareBones.g:2180:2: ( ( rule__AdditionSubtraction__TagAlternatives_1_1_0 ) )
            {
            // InternalBareBones.g:2180:2: ( ( rule__AdditionSubtraction__TagAlternatives_1_1_0 ) )
            // InternalBareBones.g:2181:3: ( rule__AdditionSubtraction__TagAlternatives_1_1_0 )
            {
             before(grammarAccess.getAdditionSubtractionAccess().getTagAlternatives_1_1_0()); 
            // InternalBareBones.g:2182:3: ( rule__AdditionSubtraction__TagAlternatives_1_1_0 )
            // InternalBareBones.g:2182:4: rule__AdditionSubtraction__TagAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__AdditionSubtraction__TagAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionSubtractionAccess().getTagAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionSubtraction__TagAssignment_1_1"


    // $ANTLR start "rule__AdditionSubtraction__RightAssignment_1_2"
    // InternalBareBones.g:2190:1: rule__AdditionSubtraction__RightAssignment_1_2 : ( ruleMultiplicationDivision ) ;
    public final void rule__AdditionSubtraction__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:2194:1: ( ( ruleMultiplicationDivision ) )
            // InternalBareBones.g:2195:2: ( ruleMultiplicationDivision )
            {
            // InternalBareBones.g:2195:2: ( ruleMultiplicationDivision )
            // InternalBareBones.g:2196:3: ruleMultiplicationDivision
            {
             before(grammarAccess.getAdditionSubtractionAccess().getRightMultiplicationDivisionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicationDivision();

            state._fsp--;

             after(grammarAccess.getAdditionSubtractionAccess().getRightMultiplicationDivisionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionSubtraction__RightAssignment_1_2"


    // $ANTLR start "rule__MultiplicationDivision__TagAssignment_1_1"
    // InternalBareBones.g:2205:1: rule__MultiplicationDivision__TagAssignment_1_1 : ( ( rule__MultiplicationDivision__TagAlternatives_1_1_0 ) ) ;
    public final void rule__MultiplicationDivision__TagAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:2209:1: ( ( ( rule__MultiplicationDivision__TagAlternatives_1_1_0 ) ) )
            // InternalBareBones.g:2210:2: ( ( rule__MultiplicationDivision__TagAlternatives_1_1_0 ) )
            {
            // InternalBareBones.g:2210:2: ( ( rule__MultiplicationDivision__TagAlternatives_1_1_0 ) )
            // InternalBareBones.g:2211:3: ( rule__MultiplicationDivision__TagAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultiplicationDivisionAccess().getTagAlternatives_1_1_0()); 
            // InternalBareBones.g:2212:3: ( rule__MultiplicationDivision__TagAlternatives_1_1_0 )
            // InternalBareBones.g:2212:4: rule__MultiplicationDivision__TagAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationDivision__TagAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationDivisionAccess().getTagAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationDivision__TagAssignment_1_1"


    // $ANTLR start "rule__MultiplicationDivision__RightAssignment_1_2"
    // InternalBareBones.g:2220:1: rule__MultiplicationDivision__RightAssignment_1_2 : ( rulePrimaryExpression ) ;
    public final void rule__MultiplicationDivision__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:2224:1: ( ( rulePrimaryExpression ) )
            // InternalBareBones.g:2225:2: ( rulePrimaryExpression )
            {
            // InternalBareBones.g:2225:2: ( rulePrimaryExpression )
            // InternalBareBones.g:2226:3: rulePrimaryExpression
            {
             before(grammarAccess.getMultiplicationDivisionAccess().getRightPrimaryExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationDivisionAccess().getRightPrimaryExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationDivision__RightAssignment_1_2"


    // $ANTLR start "rule__NumberLiteral__ValueAssignment"
    // InternalBareBones.g:2235:1: rule__NumberLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__NumberLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:2239:1: ( ( RULE_INT ) )
            // InternalBareBones.g:2240:2: ( RULE_INT )
            {
            // InternalBareBones.g:2240:2: ( RULE_INT )
            // InternalBareBones.g:2241:3: RULE_INT
            {
             before(grammarAccess.getNumberLiteralAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberLiteralAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__ValueAssignment"


    // $ANTLR start "rule__Identifier__NameAssignment"
    // InternalBareBones.g:2250:1: rule__Identifier__NameAssignment : ( RULE_ID ) ;
    public final void rule__Identifier__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBareBones.g:2254:1: ( ( RULE_ID ) )
            // InternalBareBones.g:2255:2: ( RULE_ID )
            {
            // InternalBareBones.g:2255:2: ( RULE_ID )
            // InternalBareBones.g:2256:3: RULE_ID
            {
             before(grammarAccess.getIdentifierAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIdentifierAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000019E0002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000050L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000019E0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});

}