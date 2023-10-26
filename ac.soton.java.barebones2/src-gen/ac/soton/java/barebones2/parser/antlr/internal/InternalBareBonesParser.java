package ac.soton.java.barebones2.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ac.soton.java.barebones2.services.BareBonesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBareBonesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'clear'", "'incr'", "'decr'", "'while'", "'do'", "'end'", "'out'", "'in'", "'&&'", "'||'", "'='", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
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

        public InternalBareBonesParser(TokenStream input, BareBonesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected BareBonesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalBareBones.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalBareBones.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalBareBones.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalBareBones.g:71:1: ruleProgram returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )+ ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalBareBones.g:77:2: ( ( (lv_statements_0_0= ruleStatement ) )+ )
            // InternalBareBones.g:78:2: ( (lv_statements_0_0= ruleStatement ) )+
            {
            // InternalBareBones.g:78:2: ( (lv_statements_0_0= ruleStatement ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=14)||(LA1_0>=17 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBareBones.g:79:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalBareBones.g:79:3: (lv_statements_0_0= ruleStatement )
            	    // InternalBareBones.g:80:4: lv_statements_0_0= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"statements",
            	    					lv_statements_0_0,
            	    					"ac.soton.java.barebones2.BareBones.Statement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalBareBones.g:100:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalBareBones.g:100:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalBareBones.g:101:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalBareBones.g:107:1: ruleStatement returns [EObject current=null] : (this_Clear_0= ruleClear | this_Increment_1= ruleIncrement | this_Decrement_2= ruleDecrement | this_While_3= ruleWhile | this_OutVariable_4= ruleOutVariable | this_OutString_5= ruleOutString | this_In_6= ruleIn ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Clear_0 = null;

        EObject this_Increment_1 = null;

        EObject this_Decrement_2 = null;

        EObject this_While_3 = null;

        EObject this_OutVariable_4 = null;

        EObject this_OutString_5 = null;

        EObject this_In_6 = null;



        	enterRule();

        try {
            // InternalBareBones.g:113:2: ( (this_Clear_0= ruleClear | this_Increment_1= ruleIncrement | this_Decrement_2= ruleDecrement | this_While_3= ruleWhile | this_OutVariable_4= ruleOutVariable | this_OutString_5= ruleOutString | this_In_6= ruleIn ) )
            // InternalBareBones.g:114:2: (this_Clear_0= ruleClear | this_Increment_1= ruleIncrement | this_Decrement_2= ruleDecrement | this_While_3= ruleWhile | this_OutVariable_4= ruleOutVariable | this_OutString_5= ruleOutString | this_In_6= ruleIn )
            {
            // InternalBareBones.g:114:2: (this_Clear_0= ruleClear | this_Increment_1= ruleIncrement | this_Decrement_2= ruleDecrement | this_While_3= ruleWhile | this_OutVariable_4= ruleOutVariable | this_OutString_5= ruleOutString | this_In_6= ruleIn )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 17:
                {
                int LA2_5 = input.LA(2);

                if ( (LA2_5==RULE_ID||LA2_5==RULE_INT||LA2_5==26) ) {
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
            case 18:
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
                    // InternalBareBones.g:115:3: this_Clear_0= ruleClear
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getClearParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Clear_0=ruleClear();

                    state._fsp--;


                    			current = this_Clear_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBareBones.g:124:3: this_Increment_1= ruleIncrement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getIncrementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Increment_1=ruleIncrement();

                    state._fsp--;


                    			current = this_Increment_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBareBones.g:133:3: this_Decrement_2= ruleDecrement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getDecrementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Decrement_2=ruleDecrement();

                    state._fsp--;


                    			current = this_Decrement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBareBones.g:142:3: this_While_3= ruleWhile
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getWhileParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_While_3=ruleWhile();

                    state._fsp--;


                    			current = this_While_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalBareBones.g:151:3: this_OutVariable_4= ruleOutVariable
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getOutVariableParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_OutVariable_4=ruleOutVariable();

                    state._fsp--;


                    			current = this_OutVariable_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalBareBones.g:160:3: this_OutString_5= ruleOutString
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getOutStringParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_OutString_5=ruleOutString();

                    state._fsp--;


                    			current = this_OutString_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalBareBones.g:169:3: this_In_6= ruleIn
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getInParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_In_6=ruleIn();

                    state._fsp--;


                    			current = this_In_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleClear"
    // InternalBareBones.g:181:1: entryRuleClear returns [EObject current=null] : iv_ruleClear= ruleClear EOF ;
    public final EObject entryRuleClear() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClear = null;


        try {
            // InternalBareBones.g:181:46: (iv_ruleClear= ruleClear EOF )
            // InternalBareBones.g:182:2: iv_ruleClear= ruleClear EOF
            {
             newCompositeNode(grammarAccess.getClearRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClear=ruleClear();

            state._fsp--;

             current =iv_ruleClear; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClear"


    // $ANTLR start "ruleClear"
    // InternalBareBones.g:188:1: ruleClear returns [EObject current=null] : ( () otherlv_1= 'clear' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleClear() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalBareBones.g:194:2: ( ( () otherlv_1= 'clear' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalBareBones.g:195:2: ( () otherlv_1= 'clear' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalBareBones.g:195:2: ( () otherlv_1= 'clear' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalBareBones.g:196:3: () otherlv_1= 'clear' ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalBareBones.g:196:3: ()
            // InternalBareBones.g:197:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClearAccess().getClearAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getClearAccess().getClearKeyword_1());
            		
            // InternalBareBones.g:207:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBareBones.g:208:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBareBones.g:208:4: (lv_name_2_0= RULE_ID )
            // InternalBareBones.g:209:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getClearAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClearRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClear"


    // $ANTLR start "entryRuleIncrement"
    // InternalBareBones.g:229:1: entryRuleIncrement returns [EObject current=null] : iv_ruleIncrement= ruleIncrement EOF ;
    public final EObject entryRuleIncrement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncrement = null;


        try {
            // InternalBareBones.g:229:50: (iv_ruleIncrement= ruleIncrement EOF )
            // InternalBareBones.g:230:2: iv_ruleIncrement= ruleIncrement EOF
            {
             newCompositeNode(grammarAccess.getIncrementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIncrement=ruleIncrement();

            state._fsp--;

             current =iv_ruleIncrement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIncrement"


    // $ANTLR start "ruleIncrement"
    // InternalBareBones.g:236:1: ruleIncrement returns [EObject current=null] : ( () otherlv_1= 'incr' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleIncrement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalBareBones.g:242:2: ( ( () otherlv_1= 'incr' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalBareBones.g:243:2: ( () otherlv_1= 'incr' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalBareBones.g:243:2: ( () otherlv_1= 'incr' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalBareBones.g:244:3: () otherlv_1= 'incr' ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalBareBones.g:244:3: ()
            // InternalBareBones.g:245:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIncrementAccess().getIncrementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getIncrementAccess().getIncrKeyword_1());
            		
            // InternalBareBones.g:255:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBareBones.g:256:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBareBones.g:256:4: (lv_name_2_0= RULE_ID )
            // InternalBareBones.g:257:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getIncrementAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIncrementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIncrement"


    // $ANTLR start "entryRuleDecrement"
    // InternalBareBones.g:277:1: entryRuleDecrement returns [EObject current=null] : iv_ruleDecrement= ruleDecrement EOF ;
    public final EObject entryRuleDecrement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecrement = null;


        try {
            // InternalBareBones.g:277:50: (iv_ruleDecrement= ruleDecrement EOF )
            // InternalBareBones.g:278:2: iv_ruleDecrement= ruleDecrement EOF
            {
             newCompositeNode(grammarAccess.getDecrementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecrement=ruleDecrement();

            state._fsp--;

             current =iv_ruleDecrement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecrement"


    // $ANTLR start "ruleDecrement"
    // InternalBareBones.g:284:1: ruleDecrement returns [EObject current=null] : ( () otherlv_1= 'decr' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDecrement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalBareBones.g:290:2: ( ( () otherlv_1= 'decr' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalBareBones.g:291:2: ( () otherlv_1= 'decr' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalBareBones.g:291:2: ( () otherlv_1= 'decr' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalBareBones.g:292:3: () otherlv_1= 'decr' ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalBareBones.g:292:3: ()
            // InternalBareBones.g:293:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDecrementAccess().getDecrementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDecrementAccess().getDecrKeyword_1());
            		
            // InternalBareBones.g:303:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBareBones.g:304:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBareBones.g:304:4: (lv_name_2_0= RULE_ID )
            // InternalBareBones.g:305:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDecrementAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDecrementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecrement"


    // $ANTLR start "entryRuleWhile"
    // InternalBareBones.g:325:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // InternalBareBones.g:325:46: (iv_ruleWhile= ruleWhile EOF )
            // InternalBareBones.g:326:2: iv_ruleWhile= ruleWhile EOF
            {
             newCompositeNode(grammarAccess.getWhileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhile=ruleWhile();

            state._fsp--;

             current =iv_ruleWhile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // InternalBareBones.g:332:1: ruleWhile returns [EObject current=null] : ( () otherlv_1= 'while' ( (lv_condition_2_0= ruleFormula ) ) otherlv_3= 'do' ( (lv_statements_4_0= ruleStatement ) )+ otherlv_5= 'end' ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_condition_2_0 = null;

        EObject lv_statements_4_0 = null;



        	enterRule();

        try {
            // InternalBareBones.g:338:2: ( ( () otherlv_1= 'while' ( (lv_condition_2_0= ruleFormula ) ) otherlv_3= 'do' ( (lv_statements_4_0= ruleStatement ) )+ otherlv_5= 'end' ) )
            // InternalBareBones.g:339:2: ( () otherlv_1= 'while' ( (lv_condition_2_0= ruleFormula ) ) otherlv_3= 'do' ( (lv_statements_4_0= ruleStatement ) )+ otherlv_5= 'end' )
            {
            // InternalBareBones.g:339:2: ( () otherlv_1= 'while' ( (lv_condition_2_0= ruleFormula ) ) otherlv_3= 'do' ( (lv_statements_4_0= ruleStatement ) )+ otherlv_5= 'end' )
            // InternalBareBones.g:340:3: () otherlv_1= 'while' ( (lv_condition_2_0= ruleFormula ) ) otherlv_3= 'do' ( (lv_statements_4_0= ruleStatement ) )+ otherlv_5= 'end'
            {
            // InternalBareBones.g:340:3: ()
            // InternalBareBones.g:341:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWhileAccess().getWhileAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getWhileAccess().getWhileKeyword_1());
            		
            // InternalBareBones.g:351:3: ( (lv_condition_2_0= ruleFormula ) )
            // InternalBareBones.g:352:4: (lv_condition_2_0= ruleFormula )
            {
            // InternalBareBones.g:352:4: (lv_condition_2_0= ruleFormula )
            // InternalBareBones.g:353:5: lv_condition_2_0= ruleFormula
            {

            					newCompositeNode(grammarAccess.getWhileAccess().getConditionFormulaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_condition_2_0=ruleFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"ac.soton.java.barebones2.BareBones.Formula");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getWhileAccess().getDoKeyword_3());
            		
            // InternalBareBones.g:374:3: ( (lv_statements_4_0= ruleStatement ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=11 && LA3_0<=14)||(LA3_0>=17 && LA3_0<=18)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBareBones.g:375:4: (lv_statements_4_0= ruleStatement )
            	    {
            	    // InternalBareBones.g:375:4: (lv_statements_4_0= ruleStatement )
            	    // InternalBareBones.g:376:5: lv_statements_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getWhileAccess().getStatementsStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_statements_4_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWhileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_4_0,
            	    						"ac.soton.java.barebones2.BareBones.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getWhileAccess().getEndKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleOutVariable"
    // InternalBareBones.g:401:1: entryRuleOutVariable returns [EObject current=null] : iv_ruleOutVariable= ruleOutVariable EOF ;
    public final EObject entryRuleOutVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutVariable = null;


        try {
            // InternalBareBones.g:401:52: (iv_ruleOutVariable= ruleOutVariable EOF )
            // InternalBareBones.g:402:2: iv_ruleOutVariable= ruleOutVariable EOF
            {
             newCompositeNode(grammarAccess.getOutVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutVariable=ruleOutVariable();

            state._fsp--;

             current =iv_ruleOutVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutVariable"


    // $ANTLR start "ruleOutVariable"
    // InternalBareBones.g:408:1: ruleOutVariable returns [EObject current=null] : ( () otherlv_1= 'out' ( (lv_formula_2_0= ruleFormula ) ) ) ;
    public final EObject ruleOutVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_formula_2_0 = null;



        	enterRule();

        try {
            // InternalBareBones.g:414:2: ( ( () otherlv_1= 'out' ( (lv_formula_2_0= ruleFormula ) ) ) )
            // InternalBareBones.g:415:2: ( () otherlv_1= 'out' ( (lv_formula_2_0= ruleFormula ) ) )
            {
            // InternalBareBones.g:415:2: ( () otherlv_1= 'out' ( (lv_formula_2_0= ruleFormula ) ) )
            // InternalBareBones.g:416:3: () otherlv_1= 'out' ( (lv_formula_2_0= ruleFormula ) )
            {
            // InternalBareBones.g:416:3: ()
            // InternalBareBones.g:417:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOutVariableAccess().getOutVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getOutVariableAccess().getOutKeyword_1());
            		
            // InternalBareBones.g:427:3: ( (lv_formula_2_0= ruleFormula ) )
            // InternalBareBones.g:428:4: (lv_formula_2_0= ruleFormula )
            {
            // InternalBareBones.g:428:4: (lv_formula_2_0= ruleFormula )
            // InternalBareBones.g:429:5: lv_formula_2_0= ruleFormula
            {

            					newCompositeNode(grammarAccess.getOutVariableAccess().getFormulaFormulaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_formula_2_0=ruleFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutVariableRule());
            					}
            					set(
            						current,
            						"formula",
            						lv_formula_2_0,
            						"ac.soton.java.barebones2.BareBones.Formula");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutVariable"


    // $ANTLR start "entryRuleOutString"
    // InternalBareBones.g:450:1: entryRuleOutString returns [EObject current=null] : iv_ruleOutString= ruleOutString EOF ;
    public final EObject entryRuleOutString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutString = null;


        try {
            // InternalBareBones.g:450:50: (iv_ruleOutString= ruleOutString EOF )
            // InternalBareBones.g:451:2: iv_ruleOutString= ruleOutString EOF
            {
             newCompositeNode(grammarAccess.getOutStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutString=ruleOutString();

            state._fsp--;

             current =iv_ruleOutString; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutString"


    // $ANTLR start "ruleOutString"
    // InternalBareBones.g:457:1: ruleOutString returns [EObject current=null] : ( () otherlv_1= 'out' ( (lv_name_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleOutString() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalBareBones.g:463:2: ( ( () otherlv_1= 'out' ( (lv_name_2_0= RULE_STRING ) ) ) )
            // InternalBareBones.g:464:2: ( () otherlv_1= 'out' ( (lv_name_2_0= RULE_STRING ) ) )
            {
            // InternalBareBones.g:464:2: ( () otherlv_1= 'out' ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalBareBones.g:465:3: () otherlv_1= 'out' ( (lv_name_2_0= RULE_STRING ) )
            {
            // InternalBareBones.g:465:3: ()
            // InternalBareBones.g:466:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOutStringAccess().getOutStringAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getOutStringAccess().getOutKeyword_1());
            		
            // InternalBareBones.g:476:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalBareBones.g:477:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalBareBones.g:477:4: (lv_name_2_0= RULE_STRING )
            // InternalBareBones.g:478:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getOutStringAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutStringRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutString"


    // $ANTLR start "entryRuleIn"
    // InternalBareBones.g:498:1: entryRuleIn returns [EObject current=null] : iv_ruleIn= ruleIn EOF ;
    public final EObject entryRuleIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIn = null;


        try {
            // InternalBareBones.g:498:43: (iv_ruleIn= ruleIn EOF )
            // InternalBareBones.g:499:2: iv_ruleIn= ruleIn EOF
            {
             newCompositeNode(grammarAccess.getInRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIn=ruleIn();

            state._fsp--;

             current =iv_ruleIn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIn"


    // $ANTLR start "ruleIn"
    // InternalBareBones.g:505:1: ruleIn returns [EObject current=null] : ( () otherlv_1= 'in' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleIn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalBareBones.g:511:2: ( ( () otherlv_1= 'in' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalBareBones.g:512:2: ( () otherlv_1= 'in' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalBareBones.g:512:2: ( () otherlv_1= 'in' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalBareBones.g:513:3: () otherlv_1= 'in' ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalBareBones.g:513:3: ()
            // InternalBareBones.g:514:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInAccess().getInAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getInAccess().getInKeyword_1());
            		
            // InternalBareBones.g:524:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBareBones.g:525:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBareBones.g:525:4: (lv_name_2_0= RULE_ID )
            // InternalBareBones.g:526:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getInAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIn"


    // $ANTLR start "entryRuleFormula"
    // InternalBareBones.g:546:1: entryRuleFormula returns [EObject current=null] : iv_ruleFormula= ruleFormula EOF ;
    public final EObject entryRuleFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormula = null;


        try {
            // InternalBareBones.g:546:48: (iv_ruleFormula= ruleFormula EOF )
            // InternalBareBones.g:547:2: iv_ruleFormula= ruleFormula EOF
            {
             newCompositeNode(grammarAccess.getFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormula=ruleFormula();

            state._fsp--;

             current =iv_ruleFormula; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormula"


    // $ANTLR start "ruleFormula"
    // InternalBareBones.g:553:1: ruleFormula returns [EObject current=null] : this_Predicate_0= rulePredicate ;
    public final EObject ruleFormula() throws RecognitionException {
        EObject current = null;

        EObject this_Predicate_0 = null;



        	enterRule();

        try {
            // InternalBareBones.g:559:2: (this_Predicate_0= rulePredicate )
            // InternalBareBones.g:560:2: this_Predicate_0= rulePredicate
            {

            		newCompositeNode(grammarAccess.getFormulaAccess().getPredicateParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Predicate_0=rulePredicate();

            state._fsp--;


            		current = this_Predicate_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormula"


    // $ANTLR start "entryRulePredicate"
    // InternalBareBones.g:571:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // InternalBareBones.g:571:50: (iv_rulePredicate= rulePredicate EOF )
            // InternalBareBones.g:572:2: iv_rulePredicate= rulePredicate EOF
            {
             newCompositeNode(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredicate=rulePredicate();

            state._fsp--;

             current =iv_rulePredicate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // InternalBareBones.g:578:1: rulePredicate returns [EObject current=null] : this_AssociativePredicate_0= ruleAssociativePredicate ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        EObject this_AssociativePredicate_0 = null;



        	enterRule();

        try {
            // InternalBareBones.g:584:2: (this_AssociativePredicate_0= ruleAssociativePredicate )
            // InternalBareBones.g:585:2: this_AssociativePredicate_0= ruleAssociativePredicate
            {

            		newCompositeNode(grammarAccess.getPredicateAccess().getAssociativePredicateParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_AssociativePredicate_0=ruleAssociativePredicate();

            state._fsp--;


            		current = this_AssociativePredicate_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleAssociativePredicate"
    // InternalBareBones.g:596:1: entryRuleAssociativePredicate returns [EObject current=null] : iv_ruleAssociativePredicate= ruleAssociativePredicate EOF ;
    public final EObject entryRuleAssociativePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociativePredicate = null;


        try {
            // InternalBareBones.g:596:61: (iv_ruleAssociativePredicate= ruleAssociativePredicate EOF )
            // InternalBareBones.g:597:2: iv_ruleAssociativePredicate= ruleAssociativePredicate EOF
            {
             newCompositeNode(grammarAccess.getAssociativePredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociativePredicate=ruleAssociativePredicate();

            state._fsp--;

             current =iv_ruleAssociativePredicate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssociativePredicate"


    // $ANTLR start "ruleAssociativePredicate"
    // InternalBareBones.g:603:1: ruleAssociativePredicate returns [EObject current=null] : (this_PrimaryPredicate_0= rulePrimaryPredicate ( () ( ( (lv_tag_2_1= '&&' | lv_tag_2_2= '||' ) ) ) ( (lv_right_3_0= rulePrimaryPredicate ) ) )* ) ;
    public final EObject ruleAssociativePredicate() throws RecognitionException {
        EObject current = null;

        Token lv_tag_2_1=null;
        Token lv_tag_2_2=null;
        EObject this_PrimaryPredicate_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalBareBones.g:609:2: ( (this_PrimaryPredicate_0= rulePrimaryPredicate ( () ( ( (lv_tag_2_1= '&&' | lv_tag_2_2= '||' ) ) ) ( (lv_right_3_0= rulePrimaryPredicate ) ) )* ) )
            // InternalBareBones.g:610:2: (this_PrimaryPredicate_0= rulePrimaryPredicate ( () ( ( (lv_tag_2_1= '&&' | lv_tag_2_2= '||' ) ) ) ( (lv_right_3_0= rulePrimaryPredicate ) ) )* )
            {
            // InternalBareBones.g:610:2: (this_PrimaryPredicate_0= rulePrimaryPredicate ( () ( ( (lv_tag_2_1= '&&' | lv_tag_2_2= '||' ) ) ) ( (lv_right_3_0= rulePrimaryPredicate ) ) )* )
            // InternalBareBones.g:611:3: this_PrimaryPredicate_0= rulePrimaryPredicate ( () ( ( (lv_tag_2_1= '&&' | lv_tag_2_2= '||' ) ) ) ( (lv_right_3_0= rulePrimaryPredicate ) ) )*
            {

            			newCompositeNode(grammarAccess.getAssociativePredicateAccess().getPrimaryPredicateParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_PrimaryPredicate_0=rulePrimaryPredicate();

            state._fsp--;


            			current = this_PrimaryPredicate_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalBareBones.g:619:3: ( () ( ( (lv_tag_2_1= '&&' | lv_tag_2_2= '||' ) ) ) ( (lv_right_3_0= rulePrimaryPredicate ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=19 && LA5_0<=20)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBareBones.g:620:4: () ( ( (lv_tag_2_1= '&&' | lv_tag_2_2= '||' ) ) ) ( (lv_right_3_0= rulePrimaryPredicate ) )
            	    {
            	    // InternalBareBones.g:620:4: ()
            	    // InternalBareBones.g:621:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAssociativePredicateAccess().getAssociativePredicateLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalBareBones.g:627:4: ( ( (lv_tag_2_1= '&&' | lv_tag_2_2= '||' ) ) )
            	    // InternalBareBones.g:628:5: ( (lv_tag_2_1= '&&' | lv_tag_2_2= '||' ) )
            	    {
            	    // InternalBareBones.g:628:5: ( (lv_tag_2_1= '&&' | lv_tag_2_2= '||' ) )
            	    // InternalBareBones.g:629:6: (lv_tag_2_1= '&&' | lv_tag_2_2= '||' )
            	    {
            	    // InternalBareBones.g:629:6: (lv_tag_2_1= '&&' | lv_tag_2_2= '||' )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==19) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==20) ) {
            	        alt4=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalBareBones.g:630:7: lv_tag_2_1= '&&'
            	            {
            	            lv_tag_2_1=(Token)match(input,19,FOLLOW_5); 

            	            							newLeafNode(lv_tag_2_1, grammarAccess.getAssociativePredicateAccess().getTagAmpersandAmpersandKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAssociativePredicateRule());
            	            							}
            	            							setWithLastConsumed(current, "tag", lv_tag_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalBareBones.g:641:7: lv_tag_2_2= '||'
            	            {
            	            lv_tag_2_2=(Token)match(input,20,FOLLOW_5); 

            	            							newLeafNode(lv_tag_2_2, grammarAccess.getAssociativePredicateAccess().getTagVerticalLineVerticalLineKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAssociativePredicateRule());
            	            							}
            	            							setWithLastConsumed(current, "tag", lv_tag_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalBareBones.g:654:4: ( (lv_right_3_0= rulePrimaryPredicate ) )
            	    // InternalBareBones.g:655:5: (lv_right_3_0= rulePrimaryPredicate )
            	    {
            	    // InternalBareBones.g:655:5: (lv_right_3_0= rulePrimaryPredicate )
            	    // InternalBareBones.g:656:6: lv_right_3_0= rulePrimaryPredicate
            	    {

            	    						newCompositeNode(grammarAccess.getAssociativePredicateAccess().getRightPrimaryPredicateParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_right_3_0=rulePrimaryPredicate();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAssociativePredicateRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"ac.soton.java.barebones2.BareBones.PrimaryPredicate");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssociativePredicate"


    // $ANTLR start "entryRulePrimaryPredicate"
    // InternalBareBones.g:678:1: entryRulePrimaryPredicate returns [EObject current=null] : iv_rulePrimaryPredicate= rulePrimaryPredicate EOF ;
    public final EObject entryRulePrimaryPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryPredicate = null;


        try {
            // InternalBareBones.g:678:57: (iv_rulePrimaryPredicate= rulePrimaryPredicate EOF )
            // InternalBareBones.g:679:2: iv_rulePrimaryPredicate= rulePrimaryPredicate EOF
            {
             newCompositeNode(grammarAccess.getPrimaryPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryPredicate=rulePrimaryPredicate();

            state._fsp--;

             current =iv_rulePrimaryPredicate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryPredicate"


    // $ANTLR start "rulePrimaryPredicate"
    // InternalBareBones.g:685:1: rulePrimaryPredicate returns [EObject current=null] : this_RelationalPredicate_0= ruleRelationalPredicate ;
    public final EObject rulePrimaryPredicate() throws RecognitionException {
        EObject current = null;

        EObject this_RelationalPredicate_0 = null;



        	enterRule();

        try {
            // InternalBareBones.g:691:2: (this_RelationalPredicate_0= ruleRelationalPredicate )
            // InternalBareBones.g:692:2: this_RelationalPredicate_0= ruleRelationalPredicate
            {

            		newCompositeNode(grammarAccess.getPrimaryPredicateAccess().getRelationalPredicateParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_RelationalPredicate_0=ruleRelationalPredicate();

            state._fsp--;


            		current = this_RelationalPredicate_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryPredicate"


    // $ANTLR start "entryRuleRelationalPredicate"
    // InternalBareBones.g:703:1: entryRuleRelationalPredicate returns [EObject current=null] : iv_ruleRelationalPredicate= ruleRelationalPredicate EOF ;
    public final EObject entryRuleRelationalPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalPredicate = null;


        try {
            // InternalBareBones.g:703:60: (iv_ruleRelationalPredicate= ruleRelationalPredicate EOF )
            // InternalBareBones.g:704:2: iv_ruleRelationalPredicate= ruleRelationalPredicate EOF
            {
             newCompositeNode(grammarAccess.getRelationalPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationalPredicate=ruleRelationalPredicate();

            state._fsp--;

             current =iv_ruleRelationalPredicate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationalPredicate"


    // $ANTLR start "ruleRelationalPredicate"
    // InternalBareBones.g:710:1: ruleRelationalPredicate returns [EObject current=null] : (this_Expression_0= ruleExpression ( () ( (lv_tag_2_0= '=' ) ) ( (lv_right_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleRelationalPredicate() throws RecognitionException {
        EObject current = null;

        Token lv_tag_2_0=null;
        EObject this_Expression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalBareBones.g:716:2: ( (this_Expression_0= ruleExpression ( () ( (lv_tag_2_0= '=' ) ) ( (lv_right_3_0= ruleExpression ) ) )? ) )
            // InternalBareBones.g:717:2: (this_Expression_0= ruleExpression ( () ( (lv_tag_2_0= '=' ) ) ( (lv_right_3_0= ruleExpression ) ) )? )
            {
            // InternalBareBones.g:717:2: (this_Expression_0= ruleExpression ( () ( (lv_tag_2_0= '=' ) ) ( (lv_right_3_0= ruleExpression ) ) )? )
            // InternalBareBones.g:718:3: this_Expression_0= ruleExpression ( () ( (lv_tag_2_0= '=' ) ) ( (lv_right_3_0= ruleExpression ) ) )?
            {

            			newCompositeNode(grammarAccess.getRelationalPredicateAccess().getExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_Expression_0=ruleExpression();

            state._fsp--;


            			current = this_Expression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalBareBones.g:726:3: ( () ( (lv_tag_2_0= '=' ) ) ( (lv_right_3_0= ruleExpression ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBareBones.g:727:4: () ( (lv_tag_2_0= '=' ) ) ( (lv_right_3_0= ruleExpression ) )
                    {
                    // InternalBareBones.g:727:4: ()
                    // InternalBareBones.g:728:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getRelationalPredicateAccess().getRelationalPredicateLeftAction_1_0(),
                    						current);
                    				

                    }

                    // InternalBareBones.g:734:4: ( (lv_tag_2_0= '=' ) )
                    // InternalBareBones.g:735:5: (lv_tag_2_0= '=' )
                    {
                    // InternalBareBones.g:735:5: (lv_tag_2_0= '=' )
                    // InternalBareBones.g:736:6: lv_tag_2_0= '='
                    {
                    lv_tag_2_0=(Token)match(input,21,FOLLOW_5); 

                    						newLeafNode(lv_tag_2_0, grammarAccess.getRelationalPredicateAccess().getTagEqualsSignKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationalPredicateRule());
                    						}
                    						setWithLastConsumed(current, "tag", lv_tag_2_0, "=");
                    					

                    }


                    }

                    // InternalBareBones.g:748:4: ( (lv_right_3_0= ruleExpression ) )
                    // InternalBareBones.g:749:5: (lv_right_3_0= ruleExpression )
                    {
                    // InternalBareBones.g:749:5: (lv_right_3_0= ruleExpression )
                    // InternalBareBones.g:750:6: lv_right_3_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getRelationalPredicateAccess().getRightExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelationalPredicateRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_3_0,
                    							"ac.soton.java.barebones2.BareBones.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationalPredicate"


    // $ANTLR start "entryRuleExpression"
    // InternalBareBones.g:772:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalBareBones.g:772:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalBareBones.g:773:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalBareBones.g:779:1: ruleExpression returns [EObject current=null] : this_AdditionSubtraction_0= ruleAdditionSubtraction ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditionSubtraction_0 = null;



        	enterRule();

        try {
            // InternalBareBones.g:785:2: (this_AdditionSubtraction_0= ruleAdditionSubtraction )
            // InternalBareBones.g:786:2: this_AdditionSubtraction_0= ruleAdditionSubtraction
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getAdditionSubtractionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_AdditionSubtraction_0=ruleAdditionSubtraction();

            state._fsp--;


            		current = this_AdditionSubtraction_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAdditionSubtraction"
    // InternalBareBones.g:797:1: entryRuleAdditionSubtraction returns [EObject current=null] : iv_ruleAdditionSubtraction= ruleAdditionSubtraction EOF ;
    public final EObject entryRuleAdditionSubtraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionSubtraction = null;


        try {
            // InternalBareBones.g:797:60: (iv_ruleAdditionSubtraction= ruleAdditionSubtraction EOF )
            // InternalBareBones.g:798:2: iv_ruleAdditionSubtraction= ruleAdditionSubtraction EOF
            {
             newCompositeNode(grammarAccess.getAdditionSubtractionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdditionSubtraction=ruleAdditionSubtraction();

            state._fsp--;

             current =iv_ruleAdditionSubtraction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditionSubtraction"


    // $ANTLR start "ruleAdditionSubtraction"
    // InternalBareBones.g:804:1: ruleAdditionSubtraction returns [EObject current=null] : (this_MultiplicationDivision_0= ruleMultiplicationDivision ( () ( ( (lv_tag_2_1= '+' | lv_tag_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplicationDivision ) ) )* ) ;
    public final EObject ruleAdditionSubtraction() throws RecognitionException {
        EObject current = null;

        Token lv_tag_2_1=null;
        Token lv_tag_2_2=null;
        EObject this_MultiplicationDivision_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalBareBones.g:810:2: ( (this_MultiplicationDivision_0= ruleMultiplicationDivision ( () ( ( (lv_tag_2_1= '+' | lv_tag_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplicationDivision ) ) )* ) )
            // InternalBareBones.g:811:2: (this_MultiplicationDivision_0= ruleMultiplicationDivision ( () ( ( (lv_tag_2_1= '+' | lv_tag_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplicationDivision ) ) )* )
            {
            // InternalBareBones.g:811:2: (this_MultiplicationDivision_0= ruleMultiplicationDivision ( () ( ( (lv_tag_2_1= '+' | lv_tag_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplicationDivision ) ) )* )
            // InternalBareBones.g:812:3: this_MultiplicationDivision_0= ruleMultiplicationDivision ( () ( ( (lv_tag_2_1= '+' | lv_tag_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplicationDivision ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionSubtractionAccess().getMultiplicationDivisionParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_MultiplicationDivision_0=ruleMultiplicationDivision();

            state._fsp--;


            			current = this_MultiplicationDivision_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalBareBones.g:820:3: ( () ( ( (lv_tag_2_1= '+' | lv_tag_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplicationDivision ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=22 && LA8_0<=23)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBareBones.g:821:4: () ( ( (lv_tag_2_1= '+' | lv_tag_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplicationDivision ) )
            	    {
            	    // InternalBareBones.g:821:4: ()
            	    // InternalBareBones.g:822:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditionSubtractionAccess().getAdditionSubtractionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalBareBones.g:828:4: ( ( (lv_tag_2_1= '+' | lv_tag_2_2= '-' ) ) )
            	    // InternalBareBones.g:829:5: ( (lv_tag_2_1= '+' | lv_tag_2_2= '-' ) )
            	    {
            	    // InternalBareBones.g:829:5: ( (lv_tag_2_1= '+' | lv_tag_2_2= '-' ) )
            	    // InternalBareBones.g:830:6: (lv_tag_2_1= '+' | lv_tag_2_2= '-' )
            	    {
            	    // InternalBareBones.g:830:6: (lv_tag_2_1= '+' | lv_tag_2_2= '-' )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==22) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==23) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalBareBones.g:831:7: lv_tag_2_1= '+'
            	            {
            	            lv_tag_2_1=(Token)match(input,22,FOLLOW_5); 

            	            							newLeafNode(lv_tag_2_1, grammarAccess.getAdditionSubtractionAccess().getTagPlusSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionSubtractionRule());
            	            							}
            	            							setWithLastConsumed(current, "tag", lv_tag_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalBareBones.g:842:7: lv_tag_2_2= '-'
            	            {
            	            lv_tag_2_2=(Token)match(input,23,FOLLOW_5); 

            	            							newLeafNode(lv_tag_2_2, grammarAccess.getAdditionSubtractionAccess().getTagHyphenMinusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionSubtractionRule());
            	            							}
            	            							setWithLastConsumed(current, "tag", lv_tag_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalBareBones.g:855:4: ( (lv_right_3_0= ruleMultiplicationDivision ) )
            	    // InternalBareBones.g:856:5: (lv_right_3_0= ruleMultiplicationDivision )
            	    {
            	    // InternalBareBones.g:856:5: (lv_right_3_0= ruleMultiplicationDivision )
            	    // InternalBareBones.g:857:6: lv_right_3_0= ruleMultiplicationDivision
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionSubtractionAccess().getRightMultiplicationDivisionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_right_3_0=ruleMultiplicationDivision();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditionSubtractionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"ac.soton.java.barebones2.BareBones.MultiplicationDivision");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditionSubtraction"


    // $ANTLR start "entryRuleMultiplicationDivision"
    // InternalBareBones.g:879:1: entryRuleMultiplicationDivision returns [EObject current=null] : iv_ruleMultiplicationDivision= ruleMultiplicationDivision EOF ;
    public final EObject entryRuleMultiplicationDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationDivision = null;


        try {
            // InternalBareBones.g:879:63: (iv_ruleMultiplicationDivision= ruleMultiplicationDivision EOF )
            // InternalBareBones.g:880:2: iv_ruleMultiplicationDivision= ruleMultiplicationDivision EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationDivisionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicationDivision=ruleMultiplicationDivision();

            state._fsp--;

             current =iv_ruleMultiplicationDivision; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicationDivision"


    // $ANTLR start "ruleMultiplicationDivision"
    // InternalBareBones.g:886:1: ruleMultiplicationDivision returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () ( ( (lv_tag_2_1= '*' | lv_tag_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleMultiplicationDivision() throws RecognitionException {
        EObject current = null;

        Token lv_tag_2_1=null;
        Token lv_tag_2_2=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalBareBones.g:892:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () ( ( (lv_tag_2_1= '*' | lv_tag_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) )
            // InternalBareBones.g:893:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( ( (lv_tag_2_1= '*' | lv_tag_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            {
            // InternalBareBones.g:893:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( ( (lv_tag_2_1= '*' | lv_tag_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            // InternalBareBones.g:894:3: this_PrimaryExpression_0= rulePrimaryExpression ( () ( ( (lv_tag_2_1= '*' | lv_tag_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationDivisionAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalBareBones.g:902:3: ( () ( ( (lv_tag_2_1= '*' | lv_tag_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=24 && LA10_0<=25)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBareBones.g:903:4: () ( ( (lv_tag_2_1= '*' | lv_tag_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimaryExpression ) )
            	    {
            	    // InternalBareBones.g:903:4: ()
            	    // InternalBareBones.g:904:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicationDivisionAccess().getMultiplicationDivisionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalBareBones.g:910:4: ( ( (lv_tag_2_1= '*' | lv_tag_2_2= '/' ) ) )
            	    // InternalBareBones.g:911:5: ( (lv_tag_2_1= '*' | lv_tag_2_2= '/' ) )
            	    {
            	    // InternalBareBones.g:911:5: ( (lv_tag_2_1= '*' | lv_tag_2_2= '/' ) )
            	    // InternalBareBones.g:912:6: (lv_tag_2_1= '*' | lv_tag_2_2= '/' )
            	    {
            	    // InternalBareBones.g:912:6: (lv_tag_2_1= '*' | lv_tag_2_2= '/' )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==24) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==25) ) {
            	        alt9=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalBareBones.g:913:7: lv_tag_2_1= '*'
            	            {
            	            lv_tag_2_1=(Token)match(input,24,FOLLOW_5); 

            	            							newLeafNode(lv_tag_2_1, grammarAccess.getMultiplicationDivisionAccess().getTagAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationDivisionRule());
            	            							}
            	            							setWithLastConsumed(current, "tag", lv_tag_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalBareBones.g:924:7: lv_tag_2_2= '/'
            	            {
            	            lv_tag_2_2=(Token)match(input,25,FOLLOW_5); 

            	            							newLeafNode(lv_tag_2_2, grammarAccess.getMultiplicationDivisionAccess().getTagSolidusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationDivisionRule());
            	            							}
            	            							setWithLastConsumed(current, "tag", lv_tag_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalBareBones.g:937:4: ( (lv_right_3_0= rulePrimaryExpression ) )
            	    // InternalBareBones.g:938:5: (lv_right_3_0= rulePrimaryExpression )
            	    {
            	    // InternalBareBones.g:938:5: (lv_right_3_0= rulePrimaryExpression )
            	    // InternalBareBones.g:939:6: lv_right_3_0= rulePrimaryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationDivisionAccess().getRightPrimaryExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_right_3_0=rulePrimaryExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicationDivisionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"ac.soton.java.barebones2.BareBones.PrimaryExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicationDivision"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalBareBones.g:961:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalBareBones.g:961:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalBareBones.g:962:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalBareBones.g:968:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Formula_1= ruleFormula otherlv_2= ')' ) | this_NumberLiteral_3= ruleNumberLiteral | this_Identifier_4= ruleIdentifier ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Formula_1 = null;

        EObject this_NumberLiteral_3 = null;

        EObject this_Identifier_4 = null;



        	enterRule();

        try {
            // InternalBareBones.g:974:2: ( ( (otherlv_0= '(' this_Formula_1= ruleFormula otherlv_2= ')' ) | this_NumberLiteral_3= ruleNumberLiteral | this_Identifier_4= ruleIdentifier ) )
            // InternalBareBones.g:975:2: ( (otherlv_0= '(' this_Formula_1= ruleFormula otherlv_2= ')' ) | this_NumberLiteral_3= ruleNumberLiteral | this_Identifier_4= ruleIdentifier )
            {
            // InternalBareBones.g:975:2: ( (otherlv_0= '(' this_Formula_1= ruleFormula otherlv_2= ')' ) | this_NumberLiteral_3= ruleNumberLiteral | this_Identifier_4= ruleIdentifier )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt11=1;
                }
                break;
            case RULE_INT:
                {
                alt11=2;
                }
                break;
            case RULE_ID:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalBareBones.g:976:3: (otherlv_0= '(' this_Formula_1= ruleFormula otherlv_2= ')' )
                    {
                    // InternalBareBones.g:976:3: (otherlv_0= '(' this_Formula_1= ruleFormula otherlv_2= ')' )
                    // InternalBareBones.g:977:4: otherlv_0= '(' this_Formula_1= ruleFormula otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFormulaParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_13);
                    this_Formula_1=ruleFormula();

                    state._fsp--;


                    				current = this_Formula_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBareBones.g:995:3: this_NumberLiteral_3= ruleNumberLiteral
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getNumberLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberLiteral_3=ruleNumberLiteral();

                    state._fsp--;


                    			current = this_NumberLiteral_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBareBones.g:1004:3: this_Identifier_4= ruleIdentifier
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getIdentifierParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Identifier_4=ruleIdentifier();

                    state._fsp--;


                    			current = this_Identifier_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalBareBones.g:1016:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // InternalBareBones.g:1016:54: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalBareBones.g:1017:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;

             current =iv_ruleNumberLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalBareBones.g:1023:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalBareBones.g:1029:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalBareBones.g:1030:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalBareBones.g:1030:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalBareBones.g:1031:3: (lv_value_0_0= RULE_INT )
            {
            // InternalBareBones.g:1031:3: (lv_value_0_0= RULE_INT )
            // InternalBareBones.g:1032:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getNumberLiteralAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNumberLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleIdentifier"
    // InternalBareBones.g:1051:1: entryRuleIdentifier returns [EObject current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final EObject entryRuleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifier = null;


        try {
            // InternalBareBones.g:1051:51: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalBareBones.g:1052:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
             newCompositeNode(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;

             current =iv_ruleIdentifier; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // InternalBareBones.g:1058:1: ruleIdentifier returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleIdentifier() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBareBones.g:1064:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalBareBones.g:1065:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalBareBones.g:1065:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBareBones.g:1066:3: (lv_name_0_0= RULE_ID )
            {
            // InternalBareBones.g:1066:3: (lv_name_0_0= RULE_ID )
            // InternalBareBones.g:1067:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getIdentifierAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIdentifierRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdentifier"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000067802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004000050L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000077800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});

}