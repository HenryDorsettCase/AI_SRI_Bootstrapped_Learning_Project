// $ANTLR 3.1.1 C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g 2011-04-03 01:47:28
package edu.usu.cs.pddl.antlr;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

/**
 * PDDL grammar for ANTLR v3
 * Zeyn Saigol
 * School of Computer Science
 * University of Birmingham
 *
 * $Id: Pddl.g 120 2008-10-02 14:59:50Z zas $
 */
public class PddlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DOMAIN", "DOMAIN_NAME", "REQUIREMENTS", "TYPES", "EITHER_TYPE", "CONSTANTS", "FUNCTIONS", "PREDICATES", "ACTION", "DURATIVE_ACTION", "PROBLEM", "PROBLEM_NAME", "PROBLEM_DOMAIN", "OBJECTS", "INIT", "FUNC_HEAD", "PRECONDITION", "POSSPRECONDITION", "EFFECT", "POSSEFFECT", "AND_GD", "OR_GD", "NOT_GD", "IMPLY_GD", "EXISTS_GD", "FORALL_GD", "COMPARISON_GD", "AND_EFFECT", "FORALL_EFFECT", "WHEN_EFFECT", "ASSIGN_EFFECT", "NOT_EFFECT", "PRED_HEAD", "GOAL", "BINARY_OP", "UNARY_MINUS", "INIT_EQ", "INIT_AT", "NOT_PRED_INIT", "PRED_INST", "PROBLEM_CONSTRAINT", "PROBLEM_METRIC", "NAME", "REQUIRE_KEY", "VARIABLE", "NUMBER", "LETTER", "ANY_CHAR", "DIGIT", "LINE_COMMENT", "WHITESPACE", "'('", "'define'", "')'", "'domain'", "':requirements'", "':types'", "'-'", "'either'", "':functions'", "'number'", "':constants'", "':predicates'", "':constraints'", "':action'", "':parameters'", "':precondition'", "':poss-precondition'", "':effect'", "':poss-effect'", "'and'", "'or'", "'not'", "'imply'", "'exists'", "'forall'", "':durative-action'", "':duration'", "':condition'", "'preference'", "'at'", "'over'", "'start'", "'end'", "'all'", "':derived'", "'when'", "'*'", "'+'", "'/'", "'>'", "'<'", "'='", "'>='", "'<='", "'assign'", "'scale-up'", "'scale-down'", "'increase'", "'decrease'", "'?duration'", "'problem'", "':domain'", "':objects'", "':init'", "':goal'", "':metric'", "'minimize'", "'maximize'", "'total-time'", "'is-violated'", "'always'", "'sometime'", "'within'", "'at-most-once'", "'sometime-after'", "'sometime-before'", "'always-within'", "'hold-during'", "'hold-after'"
    };
    public static final int REQUIRE_KEY=47;
    public static final int FUNCTIONS=10;
    public static final int LETTER=50;
    public static final int PRED_INST=43;
    public static final int TYPES=7;
    public static final int EXISTS_GD=28;
    public static final int EOF=-1;
    public static final int COMPARISON_GD=30;
    public static final int ACTION=12;
    public static final int T__93=93;
    public static final int ANY_CHAR=51;
    public static final int T__94=94;
    public static final int NOT_EFFECT=35;
    public static final int T__91=91;
    public static final int NAME=46;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int PROBLEM_DOMAIN=16;
    public static final int OBJECTS=17;
    public static final int ASSIGN_EFFECT=34;
    public static final int POSSPRECONDITION=21;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int LINE_COMMENT=53;
    public static final int PROBLEM=14;
    public static final int NUMBER=49;
    public static final int WHITESPACE=54;
    public static final int UNARY_MINUS=39;
    public static final int OR_GD=25;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int DOMAIN_NAME=5;
    public static final int PRED_HEAD=36;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int PREDICATES=11;
    public static final int VARIABLE=48;
    public static final int T__70=70;
    public static final int INIT_AT=41;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int INIT=18;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int AND_GD=24;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int FUNC_HEAD=19;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int NOT_GD=26;
    public static final int PROBLEM_NAME=15;
    public static final int T__118=118;
    public static final int DURATIVE_ACTION=13;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int PROBLEM_METRIC=45;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int CONSTANTS=9;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int IMPLY_GD=27;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__59=59;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int INIT_EQ=40;
    public static final int DIGIT=52;
    public static final int NOT_PRED_INIT=42;
    public static final int BINARY_OP=38;
    public static final int GOAL=37;
    public static final int FORALL_GD=29;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int POSSEFFECT=23;
    public static final int DOMAIN=4;
    public static final int WHEN_EFFECT=33;
    public static final int PRECONDITION=20;
    public static final int EFFECT=22;
    public static final int PROBLEM_CONSTRAINT=44;
    public static final int AND_EFFECT=31;
    public static final int EITHER_TYPE=8;
    public static final int FORALL_EFFECT=32;
    public static final int REQUIREMENTS=6;

    // delegates
    // delegators


        public PddlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PddlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return PddlParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g"; }


    private boolean wasError = false;
    public void reportError(RecognitionException e) {
    	wasError = true;
    	super.reportError(e);
    }
    public boolean invalidGrammar() {
    	return wasError;
    }


    public static class pddlDoc_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pddlDoc"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:87:1: pddlDoc : ( domain | problem );
    public final PddlParser.pddlDoc_return pddlDoc() throws RecognitionException {
        PddlParser.pddlDoc_return retval = new PddlParser.pddlDoc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PddlParser.domain_return domain1 = null;

        PddlParser.problem_return problem2 = null;



        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:89:9: ( domain | problem )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==55) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==56) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==55) ) {
                        int LA1_3 = input.LA(4);

                        if ( (LA1_3==105) ) {
                            alt1=2;
                        }
                        else if ( (LA1_3==58) ) {
                            alt1=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:89:11: domain
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_domain_in_pddlDoc319);
                    domain1=domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, domain1.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:89:20: problem
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_problem_in_pddlDoc323);
                    problem2=problem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, problem2.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pddlDoc"

    public static class domain_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "domain"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:91:1: domain : '(' 'define' domainName ( requireDef )? ( typesDef )? ( constantsDef )? ( predicatesDef )? ( functionsDef )? ( constraints )? ( structureDef )* ')' -> ^( DOMAIN domainName ( requireDef )? ( typesDef )? ( constantsDef )? ( predicatesDef )? ( functionsDef )? ( constraints )? ( structureDef )* ) ;
    public final PddlParser.domain_return domain() throws RecognitionException {
        PddlParser.domain_return retval = new PddlParser.domain_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal3=null;
        Token string_literal4=null;
        Token char_literal13=null;
        PddlParser.domainName_return domainName5 = null;

        PddlParser.requireDef_return requireDef6 = null;

        PddlParser.typesDef_return typesDef7 = null;

        PddlParser.constantsDef_return constantsDef8 = null;

        PddlParser.predicatesDef_return predicatesDef9 = null;

        PddlParser.functionsDef_return functionsDef10 = null;

        PddlParser.constraints_return constraints11 = null;

        PddlParser.structureDef_return structureDef12 = null;


        Object char_literal3_tree=null;
        Object string_literal4_tree=null;
        Object char_literal13_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleSubtreeStream stream_constantsDef=new RewriteRuleSubtreeStream(adaptor,"rule constantsDef");
        RewriteRuleSubtreeStream stream_requireDef=new RewriteRuleSubtreeStream(adaptor,"rule requireDef");
        RewriteRuleSubtreeStream stream_predicatesDef=new RewriteRuleSubtreeStream(adaptor,"rule predicatesDef");
        RewriteRuleSubtreeStream stream_constraints=new RewriteRuleSubtreeStream(adaptor,"rule constraints");
        RewriteRuleSubtreeStream stream_structureDef=new RewriteRuleSubtreeStream(adaptor,"rule structureDef");
        RewriteRuleSubtreeStream stream_domainName=new RewriteRuleSubtreeStream(adaptor,"rule domainName");
        RewriteRuleSubtreeStream stream_functionsDef=new RewriteRuleSubtreeStream(adaptor,"rule functionsDef");
        RewriteRuleSubtreeStream stream_typesDef=new RewriteRuleSubtreeStream(adaptor,"rule typesDef");
        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:94:5: ( '(' 'define' domainName ( requireDef )? ( typesDef )? ( constantsDef )? ( predicatesDef )? ( functionsDef )? ( constraints )? ( structureDef )* ')' -> ^( DOMAIN domainName ( requireDef )? ( typesDef )? ( constantsDef )? ( predicatesDef )? ( functionsDef )? ( constraints )? ( structureDef )* ) )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:94:7: '(' 'define' domainName ( requireDef )? ( typesDef )? ( constantsDef )? ( predicatesDef )? ( functionsDef )? ( constraints )? ( structureDef )* ')'
            {
            char_literal3=(Token)match(input,55,FOLLOW_55_in_domain338); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal3);

            string_literal4=(Token)match(input,56,FOLLOW_56_in_domain340); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_56.add(string_literal4);

            pushFollow(FOLLOW_domainName_in_domain342);
            domainName5=domainName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_domainName.add(domainName5.getTree());
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:95:7: ( requireDef )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==55) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==59) ) {
                    alt2=1;
                }
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: requireDef
                    {
                    pushFollow(FOLLOW_requireDef_in_domain350);
                    requireDef6=requireDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_requireDef.add(requireDef6.getTree());

                    }
                    break;

            }

            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:96:7: ( typesDef )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==55) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==60) ) {
                    alt3=1;
                }
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: typesDef
                    {
                    pushFollow(FOLLOW_typesDef_in_domain359);
                    typesDef7=typesDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typesDef.add(typesDef7.getTree());

                    }
                    break;

            }

            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:97:7: ( constantsDef )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==55) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==65) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: constantsDef
                    {
                    pushFollow(FOLLOW_constantsDef_in_domain368);
                    constantsDef8=constantsDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constantsDef.add(constantsDef8.getTree());

                    }
                    break;

            }

            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:98:7: ( predicatesDef )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==55) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==66) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: predicatesDef
                    {
                    pushFollow(FOLLOW_predicatesDef_in_domain377);
                    predicatesDef9=predicatesDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_predicatesDef.add(predicatesDef9.getTree());

                    }
                    break;

            }

            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:99:7: ( functionsDef )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==55) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==63) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: functionsDef
                    {
                    pushFollow(FOLLOW_functionsDef_in_domain386);
                    functionsDef10=functionsDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_functionsDef.add(functionsDef10.getTree());

                    }
                    break;

            }

            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:100:7: ( constraints )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==55) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==67) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: constraints
                    {
                    pushFollow(FOLLOW_constraints_in_domain395);
                    constraints11=constraints();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constraints.add(constraints11.getTree());

                    }
                    break;

            }

            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:101:7: ( structureDef )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==55) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: structureDef
            	    {
            	    pushFollow(FOLLOW_structureDef_in_domain404);
            	    structureDef12=structureDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_structureDef.add(structureDef12.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            char_literal13=(Token)match(input,57,FOLLOW_57_in_domain413); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_57.add(char_literal13);



            // AST REWRITE
            // elements: structureDef, requireDef, typesDef, predicatesDef, functionsDef, constraints, domainName, constantsDef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 103:7: -> ^( DOMAIN domainName ( requireDef )? ( typesDef )? ( constantsDef )? ( predicatesDef )? ( functionsDef )? ( constraints )? ( structureDef )* )
            {
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:103:10: ^( DOMAIN domainName ( requireDef )? ( typesDef )? ( constantsDef )? ( predicatesDef )? ( functionsDef )? ( constraints )? ( structureDef )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOMAIN, "DOMAIN"), root_1);

                adaptor.addChild(root_1, stream_domainName.nextTree());
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:103:30: ( requireDef )?
                if ( stream_requireDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_requireDef.nextTree());

                }
                stream_requireDef.reset();
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:103:42: ( typesDef )?
                if ( stream_typesDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_typesDef.nextTree());

                }
                stream_typesDef.reset();
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:104:17: ( constantsDef )?
                if ( stream_constantsDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_constantsDef.nextTree());

                }
                stream_constantsDef.reset();
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:104:31: ( predicatesDef )?
                if ( stream_predicatesDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_predicatesDef.nextTree());

                }
                stream_predicatesDef.reset();
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:104:46: ( functionsDef )?
                if ( stream_functionsDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_functionsDef.nextTree());

                }
                stream_functionsDef.reset();
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:105:17: ( constraints )?
                if ( stream_constraints.hasNext() ) {
                    adaptor.addChild(root_1, stream_constraints.nextTree());

                }
                stream_constraints.reset();
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:105:30: ( structureDef )*
                while ( stream_structureDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_structureDef.nextTree());

                }
                stream_structureDef.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "domain"

    public static class domainName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "domainName"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:108:1: domainName : '(' 'domain' NAME ')' -> ^( DOMAIN_NAME NAME ) ;
    public final PddlParser.domainName_return domainName() throws RecognitionException {
        PddlParser.domainName_return retval = new PddlParser.domainName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal14=null;
        Token string_literal15=null;
        Token NAME16=null;
        Token char_literal17=null;

        Object char_literal14_tree=null;
        Object string_literal15_tree=null;
        Object NAME16_tree=null;
        Object char_literal17_tree=null;
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:109:5: ( '(' 'domain' NAME ')' -> ^( DOMAIN_NAME NAME ) )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:109:7: '(' 'domain' NAME ')'
            {
            char_literal14=(Token)match(input,55,FOLLOW_55_in_domainName497); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal14);

            string_literal15=(Token)match(input,58,FOLLOW_58_in_domainName499); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_58.add(string_literal15);

            NAME16=(Token)match(input,NAME,FOLLOW_NAME_in_domainName501); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NAME.add(NAME16);

            char_literal17=(Token)match(input,57,FOLLOW_57_in_domainName503); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_57.add(char_literal17);



            // AST REWRITE
            // elements: NAME
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 110:6: -> ^( DOMAIN_NAME NAME )
            {
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:110:9: ^( DOMAIN_NAME NAME )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOMAIN_NAME, "DOMAIN_NAME"), root_1);

                adaptor.addChild(root_1, stream_NAME.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "domainName"

    public static class requireDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "requireDef"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:113:1: requireDef : '(' ':requirements' ( REQUIRE_KEY )+ ')' -> ^( REQUIREMENTS ( REQUIRE_KEY )+ ) ;
    public final PddlParser.requireDef_return requireDef() throws RecognitionException {
        PddlParser.requireDef_return retval = new PddlParser.requireDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal18=null;
        Token string_literal19=null;
        Token REQUIRE_KEY20=null;
        Token char_literal21=null;

        Object char_literal18_tree=null;
        Object string_literal19_tree=null;
        Object REQUIRE_KEY20_tree=null;
        Object char_literal21_tree=null;
        RewriteRuleTokenStream stream_REQUIRE_KEY=new RewriteRuleTokenStream(adaptor,"token REQUIRE_KEY");
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:114:2: ( '(' ':requirements' ( REQUIRE_KEY )+ ')' -> ^( REQUIREMENTS ( REQUIRE_KEY )+ ) )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:114:4: '(' ':requirements' ( REQUIRE_KEY )+ ')'
            {
            char_literal18=(Token)match(input,55,FOLLOW_55_in_requireDef530); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal18);

            string_literal19=(Token)match(input,59,FOLLOW_59_in_requireDef532); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_59.add(string_literal19);

            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:114:24: ( REQUIRE_KEY )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==REQUIRE_KEY) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: REQUIRE_KEY
            	    {
            	    REQUIRE_KEY20=(Token)match(input,REQUIRE_KEY,FOLLOW_REQUIRE_KEY_in_requireDef534); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_REQUIRE_KEY.add(REQUIRE_KEY20);


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            char_literal21=(Token)match(input,57,FOLLOW_57_in_requireDef537); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_57.add(char_literal21);



            // AST REWRITE
            // elements: REQUIRE_KEY
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 115:2: -> ^( REQUIREMENTS ( REQUIRE_KEY )+ )
            {
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:115:5: ^( REQUIREMENTS ( REQUIRE_KEY )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(REQUIREMENTS, "REQUIREMENTS"), root_1);

                if ( !(stream_REQUIRE_KEY.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_REQUIRE_KEY.hasNext() ) {
                    adaptor.addChild(root_1, stream_REQUIRE_KEY.nextNode());

                }
                stream_REQUIRE_KEY.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "requireDef"

    public static class typesDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typesDef"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:118:1: typesDef : '(' ':types' typedNameList ')' -> ^( TYPES typedNameList ) ;
    public final PddlParser.typesDef_return typesDef() throws RecognitionException {
        PddlParser.typesDef_return retval = new PddlParser.typesDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal22=null;
        Token string_literal23=null;
        Token char_literal25=null;
        PddlParser.typedNameList_return typedNameList24 = null;


        Object char_literal22_tree=null;
        Object string_literal23_tree=null;
        Object char_literal25_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleSubtreeStream stream_typedNameList=new RewriteRuleSubtreeStream(adaptor,"rule typedNameList");
        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:119:2: ( '(' ':types' typedNameList ')' -> ^( TYPES typedNameList ) )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:119:4: '(' ':types' typedNameList ')'
            {
            char_literal22=(Token)match(input,55,FOLLOW_55_in_typesDef558); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal22);

            string_literal23=(Token)match(input,60,FOLLOW_60_in_typesDef560); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_60.add(string_literal23);

            pushFollow(FOLLOW_typedNameList_in_typesDef562);
            typedNameList24=typedNameList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typedNameList.add(typedNameList24.getTree());
            char_literal25=(Token)match(input,57,FOLLOW_57_in_typesDef564); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_57.add(char_literal25);



            // AST REWRITE
            // elements: typedNameList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 120:4: -> ^( TYPES typedNameList )
            {
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:120:7: ^( TYPES typedNameList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPES, "TYPES"), root_1);

                adaptor.addChild(root_1, stream_typedNameList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typesDef"

    public static class typedNameList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typedNameList"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:124:1: typedNameList : ( ( NAME )* | ( singleTypeNameList )+ ( NAME )* ) ;
    public final PddlParser.typedNameList_return typedNameList() throws RecognitionException {
        PddlParser.typedNameList_return retval = new PddlParser.typedNameList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NAME26=null;
        Token NAME28=null;
        PddlParser.singleTypeNameList_return singleTypeNameList27 = null;


        Object NAME26_tree=null;
        Object NAME28_tree=null;

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:125:5: ( ( ( NAME )* | ( singleTypeNameList )+ ( NAME )* ) )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:125:7: ( ( NAME )* | ( singleTypeNameList )+ ( NAME )* )
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:125:7: ( ( NAME )* | ( singleTypeNameList )+ ( NAME )* )
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:125:8: ( NAME )*
                    {
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:125:8: ( NAME )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==NAME) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: NAME
                    	    {
                    	    NAME26=(Token)match(input,NAME,FOLLOW_NAME_in_typedNameList591); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    NAME26_tree = (Object)adaptor.create(NAME26);
                    	    adaptor.addChild(root_0, NAME26_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:125:16: ( singleTypeNameList )+ ( NAME )*
                    {
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:125:16: ( singleTypeNameList )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        alt11 = dfa11.predict(input);
                        switch (alt11) {
                    	case 1 :
                    	    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: singleTypeNameList
                    	    {
                    	    pushFollow(FOLLOW_singleTypeNameList_in_typedNameList596);
                    	    singleTypeNameList27=singleTypeNameList();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, singleTypeNameList27.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);

                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:125:36: ( NAME )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==NAME) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: NAME
                    	    {
                    	    NAME28=(Token)match(input,NAME,FOLLOW_NAME_in_typedNameList599); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    NAME28_tree = (Object)adaptor.create(NAME28);
                    	    adaptor.addChild(root_0, NAME28_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typedNameList"

    public static class singleTypeNameList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "singleTypeNameList"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:128:1: singleTypeNameList : ( ( NAME )+ '-' t= type ) -> ( ^( NAME $t) )+ ;
    public final PddlParser.singleTypeNameList_return singleTypeNameList() throws RecognitionException {
        PddlParser.singleTypeNameList_return retval = new PddlParser.singleTypeNameList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NAME29=null;
        Token char_literal30=null;
        PddlParser.type_return t = null;


        Object NAME29_tree=null;
        Object char_literal30_tree=null;
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:129:5: ( ( ( NAME )+ '-' t= type ) -> ( ^( NAME $t) )+ )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:129:7: ( ( NAME )+ '-' t= type )
            {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:129:7: ( ( NAME )+ '-' t= type )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:129:8: ( NAME )+ '-' t= type
            {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:129:8: ( NAME )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==NAME) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: NAME
            	    {
            	    NAME29=(Token)match(input,NAME,FOLLOW_NAME_in_singleTypeNameList619); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NAME.add(NAME29);


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            char_literal30=(Token)match(input,61,FOLLOW_61_in_singleTypeNameList622); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_61.add(char_literal30);

            pushFollow(FOLLOW_type_in_singleTypeNameList626);
            t=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(t.getTree());

            }



            // AST REWRITE
            // elements: t, NAME
            // token labels: 
            // rule labels: retval, t
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"token t",t!=null?t.tree:null);

            root_0 = (Object)adaptor.nil();
            // 130:4: -> ( ^( NAME $t) )+
            {
                if ( !(stream_t.hasNext()||stream_NAME.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_t.hasNext()||stream_NAME.hasNext() ) {
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:130:7: ^( NAME $t)
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot(stream_NAME.nextNode(), root_1);

                    adaptor.addChild(root_1, stream_t.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_t.reset();
                stream_NAME.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "singleTypeNameList"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:133:1: type : ( ( '(' 'either' ( primType )+ ')' ) -> ^( EITHER_TYPE ( primType )+ ) | primType );
    public final PddlParser.type_return type() throws RecognitionException {
        PddlParser.type_return retval = new PddlParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal31=null;
        Token string_literal32=null;
        Token char_literal34=null;
        PddlParser.primType_return primType33 = null;

        PddlParser.primType_return primType35 = null;


        Object char_literal31_tree=null;
        Object string_literal32_tree=null;
        Object char_literal34_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleSubtreeStream stream_primType=new RewriteRuleSubtreeStream(adaptor,"rule primType");
        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:134:2: ( ( '(' 'either' ( primType )+ ')' ) -> ^( EITHER_TYPE ( primType )+ ) | primType )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==55) ) {
                alt16=1;
            }
            else if ( (LA16_0==NAME) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:134:4: ( '(' 'either' ( primType )+ ')' )
                    {
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:134:4: ( '(' 'either' ( primType )+ ')' )
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:134:6: '(' 'either' ( primType )+ ')'
                    {
                    char_literal31=(Token)match(input,55,FOLLOW_55_in_type653); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal31);

                    string_literal32=(Token)match(input,62,FOLLOW_62_in_type655); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_62.add(string_literal32);

                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:134:19: ( primType )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==NAME) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: primType
                    	    {
                    	    pushFollow(FOLLOW_primType_in_type657);
                    	    primType33=primType();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_primType.add(primType33.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);

                    char_literal34=(Token)match(input,57,FOLLOW_57_in_type660); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_57.add(char_literal34);


                    }



                    // AST REWRITE
                    // elements: primType
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 135:4: -> ^( EITHER_TYPE ( primType )+ )
                    {
                        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:135:7: ^( EITHER_TYPE ( primType )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EITHER_TYPE, "EITHER_TYPE"), root_1);

                        if ( !(stream_primType.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_primType.hasNext() ) {
                            adaptor.addChild(root_1, stream_primType.nextTree());

                        }
                        stream_primType.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:136:4: primType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primType_in_type679);
                    primType35=primType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primType35.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class primType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primType"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:139:1: primType : NAME ;
    public final PddlParser.primType_return primType() throws RecognitionException {
        PddlParser.primType_return retval = new PddlParser.primType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NAME36=null;

        Object NAME36_tree=null;

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:139:10: ( NAME )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:139:12: NAME
            {
            root_0 = (Object)adaptor.nil();

            NAME36=(Token)match(input,NAME,FOLLOW_NAME_in_primType689); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME36_tree = (Object)adaptor.create(NAME36);
            adaptor.addChild(root_0, NAME36_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "primType"

    public static class functionsDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionsDef"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:141:1: functionsDef : '(' ':functions' functionList ')' -> ^( FUNCTIONS functionList ) ;
    public final PddlParser.functionsDef_return functionsDef() throws RecognitionException {
        PddlParser.functionsDef_return retval = new PddlParser.functionsDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal37=null;
        Token string_literal38=null;
        Token char_literal40=null;
        PddlParser.functionList_return functionList39 = null;


        Object char_literal37_tree=null;
        Object string_literal38_tree=null;
        Object char_literal40_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_functionList=new RewriteRuleSubtreeStream(adaptor,"rule functionList");
        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:142:2: ( '(' ':functions' functionList ')' -> ^( FUNCTIONS functionList ) )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:142:4: '(' ':functions' functionList ')'
            {
            char_literal37=(Token)match(input,55,FOLLOW_55_in_functionsDef699); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal37);

            string_literal38=(Token)match(input,63,FOLLOW_63_in_functionsDef701); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_63.add(string_literal38);

            pushFollow(FOLLOW_functionList_in_functionsDef703);
            functionList39=functionList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_functionList.add(functionList39.getTree());
            char_literal40=(Token)match(input,57,FOLLOW_57_in_functionsDef705); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_57.add(char_literal40);



            // AST REWRITE
            // elements: functionList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 143:2: -> ^( FUNCTIONS functionList )
            {
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:143:5: ^( FUNCTIONS functionList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTIONS, "FUNCTIONS"), root_1);

                adaptor.addChild(root_1, stream_functionList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionsDef"

    public static class functionList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionList"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:146:1: functionList : ( ( atomicFunctionSkeleton )+ ( '-' functionType )? )* ;
    public final PddlParser.functionList_return functionList() throws RecognitionException {
        PddlParser.functionList_return retval = new PddlParser.functionList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal42=null;
        PddlParser.atomicFunctionSkeleton_return atomicFunctionSkeleton41 = null;

        PddlParser.functionType_return functionType43 = null;


        Object char_literal42_tree=null;

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:147:2: ( ( ( atomicFunctionSkeleton )+ ( '-' functionType )? )* )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:147:4: ( ( atomicFunctionSkeleton )+ ( '-' functionType )? )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:147:4: ( ( atomicFunctionSkeleton )+ ( '-' functionType )? )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==55) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:147:5: ( atomicFunctionSkeleton )+ ( '-' functionType )?
            	    {
            	    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:147:5: ( atomicFunctionSkeleton )+
            	    int cnt17=0;
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==55) ) {
            	            int LA17_2 = input.LA(2);

            	            if ( (synpred17_Pddl()) ) {
            	                alt17=1;
            	            }


            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: atomicFunctionSkeleton
            	    	    {
            	    	    pushFollow(FOLLOW_atomicFunctionSkeleton_in_functionList726);
            	    	    atomicFunctionSkeleton41=atomicFunctionSkeleton();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, atomicFunctionSkeleton41.getTree());

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt17 >= 1 ) break loop17;
            	    	    if (state.backtracking>0) {state.failed=true; return retval;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(17, input);
            	                throw eee;
            	        }
            	        cnt17++;
            	    } while (true);

            	    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:147:29: ( '-' functionType )?
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==61) ) {
            	        alt18=1;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:147:30: '-' functionType
            	            {
            	            char_literal42=(Token)match(input,61,FOLLOW_61_in_functionList730); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal42_tree = (Object)adaptor.create(char_literal42);
            	            adaptor.addChild(root_0, char_literal42_tree);
            	            }
            	            pushFollow(FOLLOW_functionType_in_functionList732);
            	            functionType43=functionType();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, functionType43.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionList"

    public static class atomicFunctionSkeleton_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atomicFunctionSkeleton"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:150:1: atomicFunctionSkeleton : '(' functionSymbol typedVariableList ')' ;
    public final PddlParser.atomicFunctionSkeleton_return atomicFunctionSkeleton() throws RecognitionException {
        PddlParser.atomicFunctionSkeleton_return retval = new PddlParser.atomicFunctionSkeleton_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal44=null;
        Token char_literal47=null;
        PddlParser.functionSymbol_return functionSymbol45 = null;

        PddlParser.typedVariableList_return typedVariableList46 = null;


        Object char_literal44_tree=null;
        Object char_literal47_tree=null;

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:151:2: ( '(' functionSymbol typedVariableList ')' )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:151:4: '(' functionSymbol typedVariableList ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal44=(Token)match(input,55,FOLLOW_55_in_atomicFunctionSkeleton748); if (state.failed) return retval;
            pushFollow(FOLLOW_functionSymbol_in_atomicFunctionSkeleton751);
            functionSymbol45=functionSymbol();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(functionSymbol45.getTree(), root_0);
            pushFollow(FOLLOW_typedVariableList_in_atomicFunctionSkeleton754);
            typedVariableList46=typedVariableList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typedVariableList46.getTree());
            char_literal47=(Token)match(input,57,FOLLOW_57_in_atomicFunctionSkeleton756); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atomicFunctionSkeleton"

    public static class functionSymbol_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionSymbol"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:154:1: functionSymbol : NAME ;
    public final PddlParser.functionSymbol_return functionSymbol() throws RecognitionException {
        PddlParser.functionSymbol_return retval = new PddlParser.functionSymbol_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NAME48=null;

        Object NAME48_tree=null;

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:154:16: ( NAME )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:154:18: NAME
            {
            root_0 = (Object)adaptor.nil();

            NAME48=(Token)match(input,NAME,FOLLOW_NAME_in_functionSymbol767); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME48_tree = (Object)adaptor.create(NAME48);
            adaptor.addChild(root_0, NAME48_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionSymbol"

    public static class functionType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionType"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:156:1: functionType : 'number' ;
    public final PddlParser.functionType_return functionType() throws RecognitionException {
        PddlParser.functionType_return retval = new PddlParser.functionType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal49=null;

        Object string_literal49_tree=null;

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:156:14: ( 'number' )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:156:16: 'number'
            {
            root_0 = (Object)adaptor.nil();

            string_literal49=(Token)match(input,64,FOLLOW_64_in_functionType776); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal49_tree = (Object)adaptor.create(string_literal49);
            adaptor.addChild(root_0, string_literal49_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionType"

    public static class constantsDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constantsDef"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:158:1: constantsDef : '(' ':constants' typedNameList ')' -> ^( CONSTANTS typedNameList ) ;
    public final PddlParser.constantsDef_return constantsDef() throws RecognitionException {
        PddlParser.constantsDef_return retval = new PddlParser.constantsDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal50=null;
        Token string_literal51=null;
        Token char_literal53=null;
        PddlParser.typedNameList_return typedNameList52 = null;


        Object char_literal50_tree=null;
        Object string_literal51_tree=null;
        Object char_literal53_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_typedNameList=new RewriteRuleSubtreeStream(adaptor,"rule typedNameList");
        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:159:2: ( '(' ':constants' typedNameList ')' -> ^( CONSTANTS typedNameList ) )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:159:4: '(' ':constants' typedNameList ')'
            {
            char_literal50=(Token)match(input,55,FOLLOW_55_in_constantsDef787); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal50);

            string_literal51=(Token)match(input,65,FOLLOW_65_in_constantsDef789); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_65.add(string_literal51);

            pushFollow(FOLLOW_typedNameList_in_constantsDef791);
            typedNameList52=typedNameList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typedNameList.add(typedNameList52.getTree());
            char_literal53=(Token)match(input,57,FOLLOW_57_in_constantsDef793); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_57.add(char_literal53);



            // AST REWRITE
            // elements: typedNameList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 160:2: -> ^( CONSTANTS typedNameList )
            {
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:160:5: ^( CONSTANTS typedNameList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTANTS, "CONSTANTS"), root_1);

                adaptor.addChild(root_1, stream_typedNameList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constantsDef"

    public static class predicatesDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "predicatesDef"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:163:1: predicatesDef : '(' ':predicates' ( atomicFormulaSkeleton )+ ')' -> ^( PREDICATES ( atomicFormulaSkeleton )+ ) ;
    public final PddlParser.predicatesDef_return predicatesDef() throws RecognitionException {
        PddlParser.predicatesDef_return retval = new PddlParser.predicatesDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal54=null;
        Token string_literal55=null;
        Token char_literal57=null;
        PddlParser.atomicFormulaSkeleton_return atomicFormulaSkeleton56 = null;


        Object char_literal54_tree=null;
        Object string_literal55_tree=null;
        Object char_literal57_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleSubtreeStream stream_atomicFormulaSkeleton=new RewriteRuleSubtreeStream(adaptor,"rule atomicFormulaSkeleton");
        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:164:2: ( '(' ':predicates' ( atomicFormulaSkeleton )+ ')' -> ^( PREDICATES ( atomicFormulaSkeleton )+ ) )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:164:4: '(' ':predicates' ( atomicFormulaSkeleton )+ ')'
            {
            char_literal54=(Token)match(input,55,FOLLOW_55_in_predicatesDef813); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal54);

            string_literal55=(Token)match(input,66,FOLLOW_66_in_predicatesDef815); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_66.add(string_literal55);

            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:164:22: ( atomicFormulaSkeleton )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==55) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: atomicFormulaSkeleton
            	    {
            	    pushFollow(FOLLOW_atomicFormulaSkeleton_in_predicatesDef817);
            	    atomicFormulaSkeleton56=atomicFormulaSkeleton();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_atomicFormulaSkeleton.add(atomicFormulaSkeleton56.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            char_literal57=(Token)match(input,57,FOLLOW_57_in_predicatesDef820); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_57.add(char_literal57);



            // AST REWRITE
            // elements: atomicFormulaSkeleton
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 165:2: -> ^( PREDICATES ( atomicFormulaSkeleton )+ )
            {
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:165:5: ^( PREDICATES ( atomicFormulaSkeleton )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PREDICATES, "PREDICATES"), root_1);

                if ( !(stream_atomicFormulaSkeleton.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_atomicFormulaSkeleton.hasNext() ) {
                    adaptor.addChild(root_1, stream_atomicFormulaSkeleton.nextTree());

                }
                stream_atomicFormulaSkeleton.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "predicatesDef"

    public static class atomicFormulaSkeleton_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atomicFormulaSkeleton"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:168:1: atomicFormulaSkeleton : '(' predicate typedVariableList ')' ;
    public final PddlParser.atomicFormulaSkeleton_return atomicFormulaSkeleton() throws RecognitionException {
        PddlParser.atomicFormulaSkeleton_return retval = new PddlParser.atomicFormulaSkeleton_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal58=null;
        Token char_literal61=null;
        PddlParser.predicate_return predicate59 = null;

        PddlParser.typedVariableList_return typedVariableList60 = null;


        Object char_literal58_tree=null;
        Object char_literal61_tree=null;

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:169:2: ( '(' predicate typedVariableList ')' )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:169:4: '(' predicate typedVariableList ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal58=(Token)match(input,55,FOLLOW_55_in_atomicFormulaSkeleton841); if (state.failed) return retval;
            pushFollow(FOLLOW_predicate_in_atomicFormulaSkeleton844);
            predicate59=predicate();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(predicate59.getTree(), root_0);
            pushFollow(FOLLOW_typedVariableList_in_atomicFormulaSkeleton847);
            typedVariableList60=typedVariableList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typedVariableList60.getTree());
            char_literal61=(Token)match(input,57,FOLLOW_57_in_atomicFormulaSkeleton849); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atomicFormulaSkeleton"

    public static class predicate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "predicate"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:172:1: predicate : NAME ;
    public final PddlParser.predicate_return predicate() throws RecognitionException {
        PddlParser.predicate_return retval = new PddlParser.predicate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NAME62=null;

        Object NAME62_tree=null;

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:172:11: ( NAME )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:172:13: NAME
            {
            root_0 = (Object)adaptor.nil();

            NAME62=(Token)match(input,NAME,FOLLOW_NAME_in_predicate860); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME62_tree = (Object)adaptor.create(NAME62);
            adaptor.addChild(root_0, NAME62_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "predicate"

    public static class typedVariableList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typedVariableList"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:175:1: typedVariableList : ( ( VARIABLE )* | ( singleTypeVarList )+ ( VARIABLE )* ) ;
    public final PddlParser.typedVariableList_return typedVariableList() throws RecognitionException {
        PddlParser.typedVariableList_return retval = new PddlParser.typedVariableList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VARIABLE63=null;
        Token VARIABLE65=null;
        PddlParser.singleTypeVarList_return singleTypeVarList64 = null;


        Object VARIABLE63_tree=null;
        Object VARIABLE65_tree=null;

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:176:5: ( ( ( VARIABLE )* | ( singleTypeVarList )+ ( VARIABLE )* ) )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:176:8: ( ( VARIABLE )* | ( singleTypeVarList )+ ( VARIABLE )* )
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:176:8: ( ( VARIABLE )* | ( singleTypeVarList )+ ( VARIABLE )* )
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:176:9: ( VARIABLE )*
                    {
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:176:9: ( VARIABLE )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==VARIABLE) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: VARIABLE
                    	    {
                    	    VARIABLE63=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_typedVariableList876); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    VARIABLE63_tree = (Object)adaptor.create(VARIABLE63);
                    	    adaptor.addChild(root_0, VARIABLE63_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:176:21: ( singleTypeVarList )+ ( VARIABLE )*
                    {
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:176:21: ( singleTypeVarList )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        alt22 = dfa22.predict(input);
                        switch (alt22) {
                    	case 1 :
                    	    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: singleTypeVarList
                    	    {
                    	    pushFollow(FOLLOW_singleTypeVarList_in_typedVariableList881);
                    	    singleTypeVarList64=singleTypeVarList();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, singleTypeVarList64.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt22 >= 1 ) break loop22;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(22, input);
                                throw eee;
                        }
                        cnt22++;
                    } while (true);

                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:176:40: ( VARIABLE )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==VARIABLE) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: VARIABLE
                    	    {
                    	    VARIABLE65=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_typedVariableList884); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    VARIABLE65_tree = (Object)adaptor.create(VARIABLE65);
                    	    adaptor.addChild(root_0, VARIABLE65_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typedVariableList"

    public static class singleTypeVarList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "singleTypeVarList"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:179:1: singleTypeVarList : ( ( VARIABLE )+ '-' t= type ) -> ( ^( VARIABLE $t) )+ ;
    public final PddlParser.singleTypeVarList_return singleTypeVarList() throws RecognitionException {
        PddlParser.singleTypeVarList_return retval = new PddlParser.singleTypeVarList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VARIABLE66=null;
        Token char_literal67=null;
        PddlParser.type_return t = null;


        Object VARIABLE66_tree=null;
        Object char_literal67_tree=null;
        RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:180:5: ( ( ( VARIABLE )+ '-' t= type ) -> ( ^( VARIABLE $t) )+ )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:180:7: ( ( VARIABLE )+ '-' t= type )
            {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:180:7: ( ( VARIABLE )+ '-' t= type )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:180:8: ( VARIABLE )+ '-' t= type
            {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:180:8: ( VARIABLE )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==VARIABLE) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: VARIABLE
            	    {
            	    VARIABLE66=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_singleTypeVarList904); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE66);


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            char_literal67=(Token)match(input,61,FOLLOW_61_in_singleTypeVarList907); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_61.add(char_literal67);

            pushFollow(FOLLOW_type_in_singleTypeVarList911);
            t=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(t.getTree());

            }



            // AST REWRITE
            // elements: t, VARIABLE
            // token labels: 
            // rule labels: retval, t
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"token t",t!=null?t.tree:null);

            root_0 = (Object)adaptor.nil();
            // 181:7: -> ( ^( VARIABLE $t) )+
            {
                if ( !(stream_t.hasNext()||stream_VARIABLE.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_t.hasNext()||stream_VARIABLE.hasNext() ) {
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:181:10: ^( VARIABLE $t)
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot(stream_VARIABLE.nextNode(), root_1);

                    adaptor.addChild(root_1, stream_t.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_t.reset();
                stream_VARIABLE.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "singleTypeVarList"

    public static class constraints_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constraints"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:184:1: constraints : '(' ':constraints' conGD ')' ;
    public final PddlParser.constraints_return constraints() throws RecognitionException {
        PddlParser.constraints_return retval = new PddlParser.constraints_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal68=null;
        Token string_literal69=null;
        Token char_literal71=null;
        PddlParser.conGD_return conGD70 = null;


        Object char_literal68_tree=null;
        Object string_literal69_tree=null;
        Object char_literal71_tree=null;

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:185:2: ( '(' ':constraints' conGD ')' )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:185:4: '(' ':constraints' conGD ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal68=(Token)match(input,55,FOLLOW_55_in_constraints942); if (state.failed) return retval;
            string_literal69=(Token)match(input,67,FOLLOW_67_in_constraints945); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal69_tree = (Object)adaptor.create(string_literal69);
            root_0 = (Object)adaptor.becomeRoot(string_literal69_tree, root_0);
            }
            pushFollow(FOLLOW_conGD_in_constraints948);
            conGD70=conGD();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conGD70.getTree());
            char_literal71=(Token)match(input,57,FOLLOW_57_in_constraints950); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constraints"

    public static class structureDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "structureDef"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:188:1: structureDef : ( actionDef | durativeActionDef | derivedDef );
    public final PddlParser.structureDef_return structureDef() throws RecognitionException {
        PddlParser.structureDef_return retval = new PddlParser.structureDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PddlParser.actionDef_return actionDef72 = null;

        PddlParser.durativeActionDef_return durativeActionDef73 = null;

        PddlParser.derivedDef_return derivedDef74 = null;



        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:189:2: ( actionDef | durativeActionDef | derivedDef )
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==55) ) {
                switch ( input.LA(2) ) {
                case 68:
                    {
                    alt26=1;
                    }
                    break;
                case 80:
                    {
                    alt26=2;
                    }
                    break;
                case 89:
                    {
                    alt26=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:189:4: actionDef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_actionDef_in_structureDef962);
                    actionDef72=actionDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, actionDef72.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:190:4: durativeActionDef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_durativeActionDef_in_structureDef967);
                    durativeActionDef73=durativeActionDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, durativeActionDef73.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:191:4: derivedDef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_derivedDef_in_structureDef972);
                    derivedDef74=derivedDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, derivedDef74.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "structureDef"

    public static class actionDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actionDef"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:195:1: actionDef : '(' ':action' actionSymbol ( ':parameters' ( ( '(' ')' ) | '(' typedVariableList ')' ) ) actionDefBody ')' -> ^( ACTION actionSymbol ( typedVariableList )? actionDefBody ) ;
    public final PddlParser.actionDef_return actionDef() throws RecognitionException {
        PddlParser.actionDef_return retval = new PddlParser.actionDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal75=null;
        Token string_literal76=null;
        Token string_literal78=null;
        Token char_literal79=null;
        Token char_literal80=null;
        Token char_literal81=null;
        Token char_literal83=null;
        Token char_literal85=null;
        PddlParser.actionSymbol_return actionSymbol77 = null;

        PddlParser.typedVariableList_return typedVariableList82 = null;

        PddlParser.actionDefBody_return actionDefBody84 = null;


        Object char_literal75_tree=null;
        Object string_literal76_tree=null;
        Object string_literal78_tree=null;
        Object char_literal79_tree=null;
        Object char_literal80_tree=null;
        Object char_literal81_tree=null;
        Object char_literal83_tree=null;
        Object char_literal85_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleSubtreeStream stream_actionSymbol=new RewriteRuleSubtreeStream(adaptor,"rule actionSymbol");
        RewriteRuleSubtreeStream stream_typedVariableList=new RewriteRuleSubtreeStream(adaptor,"rule typedVariableList");
        RewriteRuleSubtreeStream stream_actionDefBody=new RewriteRuleSubtreeStream(adaptor,"rule actionDefBody");
        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:198:2: ( '(' ':action' actionSymbol ( ':parameters' ( ( '(' ')' ) | '(' typedVariableList ')' ) ) actionDefBody ')' -> ^( ACTION actionSymbol ( typedVariableList )? actionDefBody ) )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:198:4: '(' ':action' actionSymbol ( ':parameters' ( ( '(' ')' ) | '(' typedVariableList ')' ) ) actionDefBody ')'
            {
            char_literal75=(Token)match(input,55,FOLLOW_55_in_actionDef987); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal75);

            string_literal76=(Token)match(input,68,FOLLOW_68_in_actionDef989); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_68.add(string_literal76);

            pushFollow(FOLLOW_actionSymbol_in_actionDef991);
            actionSymbol77=actionSymbol();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_actionSymbol.add(actionSymbol77.getTree());
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:199:8: ( ':parameters' ( ( '(' ')' ) | '(' typedVariableList ')' ) )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:199:10: ':parameters' ( ( '(' ')' ) | '(' typedVariableList ')' )
            {
            string_literal78=(Token)match(input,69,FOLLOW_69_in_actionDef1002); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_69.add(string_literal78);

            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:199:24: ( ( '(' ')' ) | '(' typedVariableList ')' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==55) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==57) ) {
                    int LA27_2 = input.LA(3);

                    if ( (synpred28_Pddl()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_1==VARIABLE) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:199:25: ( '(' ')' )
                    {
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:199:25: ( '(' ')' )
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:199:26: '(' ')'
                    {
                    char_literal79=(Token)match(input,55,FOLLOW_55_in_actionDef1006); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal79);

                    char_literal80=(Token)match(input,57,FOLLOW_57_in_actionDef1008); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_57.add(char_literal80);


                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:199:37: '(' typedVariableList ')'
                    {
                    char_literal81=(Token)match(input,55,FOLLOW_55_in_actionDef1013); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal81);

                    pushFollow(FOLLOW_typedVariableList_in_actionDef1015);
                    typedVariableList82=typedVariableList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typedVariableList.add(typedVariableList82.getTree());
                    char_literal83=(Token)match(input,57,FOLLOW_57_in_actionDef1017); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_57.add(char_literal83);


                    }
                    break;

            }


            }

            pushFollow(FOLLOW_actionDefBody_in_actionDef1033);
            actionDefBody84=actionDefBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_actionDefBody.add(actionDefBody84.getTree());
            char_literal85=(Token)match(input,57,FOLLOW_57_in_actionDef1035); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_57.add(char_literal85);



            // AST REWRITE
            // elements: actionDefBody, typedVariableList, actionSymbol
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 201:8: -> ^( ACTION actionSymbol ( typedVariableList )? actionDefBody )
            {
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:201:11: ^( ACTION actionSymbol ( typedVariableList )? actionDefBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ACTION, "ACTION"), root_1);

                adaptor.addChild(root_1, stream_actionSymbol.nextTree());
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:201:33: ( typedVariableList )?
                if ( stream_typedVariableList.hasNext() ) {
                    adaptor.addChild(root_1, stream_typedVariableList.nextTree());

                }
                stream_typedVariableList.reset();
                adaptor.addChild(root_1, stream_actionDefBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "actionDef"

    public static class actionSymbol_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actionSymbol"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:204:1: actionSymbol : NAME ;
    public final PddlParser.actionSymbol_return actionSymbol() throws RecognitionException {
        PddlParser.actionSymbol_return retval = new PddlParser.actionSymbol_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NAME86=null;

        Object NAME86_tree=null;

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:204:14: ( NAME )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:204:16: NAME
            {
            root_0 = (Object)adaptor.nil();

            NAME86=(Token)match(input,NAME,FOLLOW_NAME_in_actionSymbol1068); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME86_tree = (Object)adaptor.create(NAME86);
            adaptor.addChild(root_0, NAME86_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "actionSymbol"

    public static class actionDefBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actionDefBody"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:210:1: actionDefBody : ( ':precondition' ( ( '(' ')' ) | goalDesc ) )? ( ':poss-precondition' ( ( '(' ')' ) | goalDesc1 ) )? ( ':effect' ( ( '(' ')' ) | effect ) )? ( ':poss-effect' ( ( '(' ')' ) | effect1 ) )? -> ^( PRECONDITION ( goalDesc )? ) ^( POSSPRECONDITION ( goalDesc1 )? ) ^( EFFECT ( effect )? ) ^( POSSEFFECT ( effect1 )? ) ;
    public final PddlParser.actionDefBody_return actionDefBody() throws RecognitionException {
        PddlParser.actionDefBody_return retval = new PddlParser.actionDefBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal87=null;
        Token char_literal88=null;
        Token char_literal89=null;
        Token string_literal91=null;
        Token char_literal92=null;
        Token char_literal93=null;
        Token string_literal95=null;
        Token char_literal96=null;
        Token char_literal97=null;
        Token string_literal99=null;
        Token char_literal100=null;
        Token char_literal101=null;
        PddlParser.goalDesc_return goalDesc90 = null;

        PddlParser.goalDesc1_return goalDesc194 = null;

        PddlParser.effect_return effect98 = null;

        PddlParser.effect1_return effect1102 = null;


        Object string_literal87_tree=null;
        Object char_literal88_tree=null;
        Object char_literal89_tree=null;
        Object string_literal91_tree=null;
        Object char_literal92_tree=null;
        Object char_literal93_tree=null;
        Object string_literal95_tree=null;
        Object char_literal96_tree=null;
        Object char_literal97_tree=null;
        Object string_literal99_tree=null;
        Object char_literal100_tree=null;
        Object char_literal101_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleSubtreeStream stream_effect=new RewriteRuleSubtreeStream(adaptor,"rule effect");
        RewriteRuleSubtreeStream stream_effect1=new RewriteRuleSubtreeStream(adaptor,"rule effect1");
        RewriteRuleSubtreeStream stream_goalDesc=new RewriteRuleSubtreeStream(adaptor,"rule goalDesc");
        RewriteRuleSubtreeStream stream_goalDesc1=new RewriteRuleSubtreeStream(adaptor,"rule goalDesc1");
        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:211:2: ( ( ':precondition' ( ( '(' ')' ) | goalDesc ) )? ( ':poss-precondition' ( ( '(' ')' ) | goalDesc1 ) )? ( ':effect' ( ( '(' ')' ) | effect ) )? ( ':poss-effect' ( ( '(' ')' ) | effect1 ) )? -> ^( PRECONDITION ( goalDesc )? ) ^( POSSPRECONDITION ( goalDesc1 )? ) ^( EFFECT ( effect )? ) ^( POSSEFFECT ( effect1 )? ) )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:211:4: ( ':precondition' ( ( '(' ')' ) | goalDesc ) )? ( ':poss-precondition' ( ( '(' ')' ) | goalDesc1 ) )? ( ':effect' ( ( '(' ')' ) | effect ) )? ( ':poss-effect' ( ( '(' ')' ) | effect1 ) )?
            {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:211:4: ( ':precondition' ( ( '(' ')' ) | goalDesc ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==70) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:211:6: ':precondition' ( ( '(' ')' ) | goalDesc )
                    {
                    string_literal87=(Token)match(input,70,FOLLOW_70_in_actionDefBody1084); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_70.add(string_literal87);

                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:211:22: ( ( '(' ')' ) | goalDesc )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==55) ) {
                        int LA28_1 = input.LA(2);

                        if ( (LA28_1==57) ) {
                            alt28=1;
                        }
                        else if ( (LA28_1==NAME||(LA28_1>=74 && LA28_1<=79)||(LA28_1>=94 && LA28_1<=98)) ) {
                            alt28=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 28, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:211:23: ( '(' ')' )
                            {
                            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:211:23: ( '(' ')' )
                            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:211:24: '(' ')'
                            {
                            char_literal88=(Token)match(input,55,FOLLOW_55_in_actionDefBody1088); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_55.add(char_literal88);

                            char_literal89=(Token)match(input,57,FOLLOW_57_in_actionDefBody1090); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_57.add(char_literal89);


                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:211:35: goalDesc
                            {
                            pushFollow(FOLLOW_goalDesc_in_actionDefBody1095);
                            goalDesc90=goalDesc();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc90.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }

            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:212:4: ( ':poss-precondition' ( ( '(' ')' ) | goalDesc1 ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==71) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:212:6: ':poss-precondition' ( ( '(' ')' ) | goalDesc1 )
                    {
                    string_literal91=(Token)match(input,71,FOLLOW_71_in_actionDefBody1105); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_71.add(string_literal91);

                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:212:27: ( ( '(' ')' ) | goalDesc1 )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==55) ) {
                        int LA30_1 = input.LA(2);

                        if ( (LA30_1==57) ) {
                            alt30=1;
                        }
                        else if ( (LA30_1==NAME||(LA30_1>=74 && LA30_1<=79)||(LA30_1>=94 && LA30_1<=98)) ) {
                            alt30=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 30, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }
                    switch (alt30) {
                        case 1 :
                            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:212:28: ( '(' ')' )
                            {
                            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:212:28: ( '(' ')' )
                            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:212:29: '(' ')'
                            {
                            char_literal92=(Token)match(input,55,FOLLOW_55_in_actionDefBody1109); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_55.add(char_literal92);

                            char_literal93=(Token)match(input,57,FOLLOW_57_in_actionDefBody1111); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_57.add(char_literal93);


                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:212:40: goalDesc1
                            {
                            pushFollow(FOLLOW_goalDesc1_in_actionDefBody1116);
                            goalDesc194=goalDesc1();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_goalDesc1.add(goalDesc194.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }

            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:213:4: ( ':effect' ( ( '(' ')' ) | effect ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==72) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:213:6: ':effect' ( ( '(' ')' ) | effect )
                    {
                    string_literal95=(Token)match(input,72,FOLLOW_72_in_actionDefBody1126); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_72.add(string_literal95);

                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:213:16: ( ( '(' ')' ) | effect )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==55) ) {
                        int LA32_1 = input.LA(2);

                        if ( (LA32_1==57) ) {
                            alt32=1;
                        }
                        else if ( (LA32_1==NAME||LA32_1==74||LA32_1==76||LA32_1==79||LA32_1==90||(LA32_1>=99 && LA32_1<=103)) ) {
                            alt32=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 32, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:213:17: ( '(' ')' )
                            {
                            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:213:17: ( '(' ')' )
                            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:213:18: '(' ')'
                            {
                            char_literal96=(Token)match(input,55,FOLLOW_55_in_actionDefBody1130); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_55.add(char_literal96);

                            char_literal97=(Token)match(input,57,FOLLOW_57_in_actionDefBody1132); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_57.add(char_literal97);


                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:213:29: effect
                            {
                            pushFollow(FOLLOW_effect_in_actionDefBody1137);
                            effect98=effect();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_effect.add(effect98.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }

            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:214:4: ( ':poss-effect' ( ( '(' ')' ) | effect1 ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==73) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:214:6: ':poss-effect' ( ( '(' ')' ) | effect1 )
                    {
                    string_literal99=(Token)match(input,73,FOLLOW_73_in_actionDefBody1147); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_73.add(string_literal99);

                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:214:21: ( ( '(' ')' ) | effect1 )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==55) ) {
                        int LA34_1 = input.LA(2);

                        if ( (LA34_1==57) ) {
                            alt34=1;
                        }
                        else if ( (LA34_1==NAME||LA34_1==74||LA34_1==76||LA34_1==79||LA34_1==90||(LA34_1>=99 && LA34_1<=103)) ) {
                            alt34=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 34, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:214:22: ( '(' ')' )
                            {
                            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:214:22: ( '(' ')' )
                            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:214:23: '(' ')'
                            {
                            char_literal100=(Token)match(input,55,FOLLOW_55_in_actionDefBody1151); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_55.add(char_literal100);

                            char_literal101=(Token)match(input,57,FOLLOW_57_in_actionDefBody1153); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_57.add(char_literal101);


                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:214:34: effect1
                            {
                            pushFollow(FOLLOW_effect1_in_actionDefBody1158);
                            effect1102=effect1();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_effect1.add(effect1102.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: effect1, effect, goalDesc1, goalDesc
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 215:4: -> ^( PRECONDITION ( goalDesc )? ) ^( POSSPRECONDITION ( goalDesc1 )? ) ^( EFFECT ( effect )? ) ^( POSSEFFECT ( effect1 )? )
            {
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:215:7: ^( PRECONDITION ( goalDesc )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PRECONDITION, "PRECONDITION"), root_1);

                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:215:22: ( goalDesc )?
                if ( stream_goalDesc.hasNext() ) {
                    adaptor.addChild(root_1, stream_goalDesc.nextTree());

                }
                stream_goalDesc.reset();

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:215:33: ^( POSSPRECONDITION ( goalDesc1 )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(POSSPRECONDITION, "POSSPRECONDITION"), root_1);

                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:215:52: ( goalDesc1 )?
                if ( stream_goalDesc1.hasNext() ) {
                    adaptor.addChild(root_1, stream_goalDesc1.nextTree());

                }
                stream_goalDesc1.reset();

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:215:64: ^( EFFECT ( effect )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EFFECT, "EFFECT"), root_1);

                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:215:73: ( effect )?
                if ( stream_effect.hasNext() ) {
                    adaptor.addChild(root_1, stream_effect.nextTree());

                }
                stream_effect.reset();

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:215:82: ^( POSSEFFECT ( effect1 )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(POSSEFFECT, "POSSEFFECT"), root_1);

                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:215:95: ( effect1 )?
                if ( stream_effect1.hasNext() ) {
                    adaptor.addChild(root_1, stream_effect1.nextTree());

                }
                stream_effect1.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "actionDefBody"

    public static class effect1_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "effect1"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:218:1: effect1 : effect ;
    public final PddlParser.effect1_return effect1() throws RecognitionException {
        PddlParser.effect1_return retval = new PddlParser.effect1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PddlParser.effect_return effect103 = null;



        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:218:9: ( effect )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:218:11: effect
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_effect_in_effect11204);
            effect103=effect();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, effect103.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "effect1"

    public static class goalDesc1_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "goalDesc1"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:219:1: goalDesc1 : goalDesc ;
    public final PddlParser.goalDesc1_return goalDesc1() throws RecognitionException {
        PddlParser.goalDesc1_return retval = new PddlParser.goalDesc1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PddlParser.goalDesc_return goalDesc104 = null;



        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:219:11: ( goalDesc )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:219:13: goalDesc
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_goalDesc_in_goalDesc11211);
            goalDesc104=goalDesc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc104.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "goalDesc1"

    public static class goalDesc_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "goalDesc"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:232:1: goalDesc : ( atomicTermFormula | '(' 'and' ( goalDesc )* ')' -> ^( AND_GD ( goalDesc )* ) | '(' 'or' ( goalDesc )* ')' -> ^( OR_GD ( goalDesc )* ) | '(' 'not' goalDesc ')' -> ^( NOT_GD goalDesc ) | '(' 'imply' goalDesc goalDesc ')' -> ^( IMPLY_GD goalDesc goalDesc ) | '(' 'exists' '(' typedVariableList ')' goalDesc ')' -> ^( EXISTS_GD typedVariableList goalDesc ) | '(' 'forall' '(' typedVariableList ')' goalDesc ')' -> ^( FORALL_GD typedVariableList goalDesc ) | fComp -> ^( COMPARISON_GD fComp ) );
    public final PddlParser.goalDesc_return goalDesc() throws RecognitionException {
        PddlParser.goalDesc_return retval = new PddlParser.goalDesc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal106=null;
        Token string_literal107=null;
        Token char_literal109=null;
        Token char_literal110=null;
        Token string_literal111=null;
        Token char_literal113=null;
        Token char_literal114=null;
        Token string_literal115=null;
        Token char_literal117=null;
        Token char_literal118=null;
        Token string_literal119=null;
        Token char_literal122=null;
        Token char_literal123=null;
        Token string_literal124=null;
        Token char_literal125=null;
        Token char_literal127=null;
        Token char_literal129=null;
        Token char_literal130=null;
        Token string_literal131=null;
        Token char_literal132=null;
        Token char_literal134=null;
        Token char_literal136=null;
        PddlParser.atomicTermFormula_return atomicTermFormula105 = null;

        PddlParser.goalDesc_return goalDesc108 = null;

        PddlParser.goalDesc_return goalDesc112 = null;

        PddlParser.goalDesc_return goalDesc116 = null;

        PddlParser.goalDesc_return goalDesc120 = null;

        PddlParser.goalDesc_return goalDesc121 = null;

        PddlParser.typedVariableList_return typedVariableList126 = null;

        PddlParser.goalDesc_return goalDesc128 = null;

        PddlParser.typedVariableList_return typedVariableList133 = null;

        PddlParser.goalDesc_return goalDesc135 = null;

        PddlParser.fComp_return fComp137 = null;


        Object char_literal106_tree=null;
        Object string_literal107_tree=null;
        Object char_literal109_tree=null;
        Object char_literal110_tree=null;
        Object string_literal111_tree=null;
        Object char_literal113_tree=null;
        Object char_literal114_tree=null;
        Object string_literal115_tree=null;
        Object char_literal117_tree=null;
        Object char_literal118_tree=null;
        Object string_literal119_tree=null;
        Object char_literal122_tree=null;
        Object char_literal123_tree=null;
        Object string_literal124_tree=null;
        Object char_literal125_tree=null;
        Object char_literal127_tree=null;
        Object char_literal129_tree=null;
        Object char_literal130_tree=null;
        Object string_literal131_tree=null;
        Object char_literal132_tree=null;
        Object char_literal134_tree=null;
        Object char_literal136_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_fComp=new RewriteRuleSubtreeStream(adaptor,"rule fComp");
        RewriteRuleSubtreeStream stream_goalDesc=new RewriteRuleSubtreeStream(adaptor,"rule goalDesc");
        RewriteRuleSubtreeStream stream_typedVariableList=new RewriteRuleSubtreeStream(adaptor,"rule typedVariableList");
        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:233:2: ( atomicTermFormula | '(' 'and' ( goalDesc )* ')' -> ^( AND_GD ( goalDesc )* ) | '(' 'or' ( goalDesc )* ')' -> ^( OR_GD ( goalDesc )* ) | '(' 'not' goalDesc ')' -> ^( NOT_GD goalDesc ) | '(' 'imply' goalDesc goalDesc ')' -> ^( IMPLY_GD goalDesc goalDesc ) | '(' 'exists' '(' typedVariableList ')' goalDesc ')' -> ^( EXISTS_GD typedVariableList goalDesc ) | '(' 'forall' '(' typedVariableList ')' goalDesc ')' -> ^( FORALL_GD typedVariableList goalDesc ) | fComp -> ^( COMPARISON_GD fComp ) )
            int alt38=8;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:233:4: atomicTermFormula
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_atomicTermFormula_in_goalDesc1231);
                    atomicTermFormula105=atomicTermFormula();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atomicTermFormula105.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:234:4: '(' 'and' ( goalDesc )* ')'
                    {
                    char_literal106=(Token)match(input,55,FOLLOW_55_in_goalDesc1236); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal106);

                    string_literal107=(Token)match(input,74,FOLLOW_74_in_goalDesc1238); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_74.add(string_literal107);

                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:234:14: ( goalDesc )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==55) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: goalDesc
                    	    {
                    	    pushFollow(FOLLOW_goalDesc_in_goalDesc1240);
                    	    goalDesc108=goalDesc();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc108.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    char_literal109=(Token)match(input,57,FOLLOW_57_in_goalDesc1243); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_57.add(char_literal109);



                    // AST REWRITE
                    // elements: goalDesc
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 235:12: -> ^( AND_GD ( goalDesc )* )
                    {
                        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:235:15: ^( AND_GD ( goalDesc )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND_GD, "AND_GD"), root_1);

                        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:235:24: ( goalDesc )*
                        while ( stream_goalDesc.hasNext() ) {
                            adaptor.addChild(root_1, stream_goalDesc.nextTree());

                        }
                        stream_goalDesc.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:236:4: '(' 'or' ( goalDesc )* ')'
                    {
                    char_literal110=(Token)match(input,55,FOLLOW_55_in_goalDesc1268); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal110);

                    string_literal111=(Token)match(input,75,FOLLOW_75_in_goalDesc1270); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(string_literal111);

                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:236:13: ( goalDesc )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==55) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: goalDesc
                    	    {
                    	    pushFollow(FOLLOW_goalDesc_in_goalDesc1272);
                    	    goalDesc112=goalDesc();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc112.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    char_literal113=(Token)match(input,57,FOLLOW_57_in_goalDesc1275); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_57.add(char_literal113);



                    // AST REWRITE
                    // elements: goalDesc
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 237:12: -> ^( OR_GD ( goalDesc )* )
                    {
                        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:237:15: ^( OR_GD ( goalDesc )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OR_GD, "OR_GD"), root_1);

                        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:237:23: ( goalDesc )*
                        while ( stream_goalDesc.hasNext() ) {
                            adaptor.addChild(root_1, stream_goalDesc.nextTree());

                        }
                        stream_goalDesc.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:238:4: '(' 'not' goalDesc ')'
                    {
                    char_literal114=(Token)match(input,55,FOLLOW_55_in_goalDesc1300); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal114);

                    string_literal115=(Token)match(input,76,FOLLOW_76_in_goalDesc1302); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_76.add(string_literal115);

                    pushFollow(FOLLOW_goalDesc_in_goalDesc1304);
                    goalDesc116=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc116.getTree());
                    char_literal117=(Token)match(input,57,FOLLOW_57_in_goalDesc1306); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_57.add(char_literal117);



                    // AST REWRITE
                    // elements: goalDesc
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 239:12: -> ^( NOT_GD goalDesc )
                    {
                        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:239:15: ^( NOT_GD goalDesc )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT_GD, "NOT_GD"), root_1);

                        adaptor.addChild(root_1, stream_goalDesc.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:240:4: '(' 'imply' goalDesc goalDesc ')'
                    {
                    char_literal118=(Token)match(input,55,FOLLOW_55_in_goalDesc1330); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal118);

                    string_literal119=(Token)match(input,77,FOLLOW_77_in_goalDesc1332); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_77.add(string_literal119);

                    pushFollow(FOLLOW_goalDesc_in_goalDesc1334);
                    goalDesc120=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc120.getTree());
                    pushFollow(FOLLOW_goalDesc_in_goalDesc1336);
                    goalDesc121=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc121.getTree());
                    char_literal122=(Token)match(input,57,FOLLOW_57_in_goalDesc1338); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_57.add(char_literal122);



                    // AST REWRITE
                    // elements: goalDesc, goalDesc
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 241:12: -> ^( IMPLY_GD goalDesc goalDesc )
                    {
                        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:241:15: ^( IMPLY_GD goalDesc goalDesc )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IMPLY_GD, "IMPLY_GD"), root_1);

                        adaptor.addChild(root_1, stream_goalDesc.nextTree());
                        adaptor.addChild(root_1, stream_goalDesc.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:242:4: '(' 'exists' '(' typedVariableList ')' goalDesc ')'
                    {
                    char_literal123=(Token)match(input,55,FOLLOW_55_in_goalDesc1364); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal123);

                    string_literal124=(Token)match(input,78,FOLLOW_78_in_goalDesc1366); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_78.add(string_literal124);

                    char_literal125=(Token)match(input,55,FOLLOW_55_in_goalDesc1368); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal125);

                    pushFollow(FOLLOW_typedVariableList_in_goalDesc1370);
                    typedVariableList126=typedVariableList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typedVariableList.add(typedVariableList126.getTree());
                    char_literal127=(Token)match(input,57,FOLLOW_57_in_goalDesc1372); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_57.add(char_literal127);

                    pushFollow(FOLLOW_goalDesc_in_goalDesc1374);
                    goalDesc128=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc128.getTree());
                    char_literal129=(Token)match(input,57,FOLLOW_57_in_goalDesc1376); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_57.add(char_literal129);



                    // AST REWRITE
                    // elements: typedVariableList, goalDesc
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 243:12: -> ^( EXISTS_GD typedVariableList goalDesc )
                    {
                        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:243:15: ^( EXISTS_GD typedVariableList goalDesc )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXISTS_GD, "EXISTS_GD"), root_1);

                        adaptor.addChild(root_1, stream_typedVariableList.nextTree());
                        adaptor.addChild(root_1, stream_goalDesc.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:244:4: '(' 'forall' '(' typedVariableList ')' goalDesc ')'
                    {
                    char_literal130=(Token)match(input,55,FOLLOW_55_in_goalDesc1402); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal130);

                    string_literal131=(Token)match(input,79,FOLLOW_79_in_goalDesc1404); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_79.add(string_literal131);

                    char_literal132=(Token)match(input,55,FOLLOW_55_in_goalDesc1406); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal132);

                    pushFollow(FOLLOW_typedVariableList_in_goalDesc1408);
                    typedVariableList133=typedVariableList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typedVariableList.add(typedVariableList133.getTree());
                    char_literal134=(Token)match(input,57,FOLLOW_57_in_goalDesc1410); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_57.add(char_literal134);

                    pushFollow(FOLLOW_goalDesc_in_goalDesc1412);
                    goalDesc135=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc135.getTree());
                    char_literal136=(Token)match(input,57,FOLLOW_57_in_goalDesc1414); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_57.add(char_literal136);



                    // AST REWRITE
                    // elements: typedVariableList, goalDesc
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 245:12: -> ^( FORALL_GD typedVariableList goalDesc )
                    {
                        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:245:15: ^( FORALL_GD typedVariableList goalDesc )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORALL_GD, "FORALL_GD"), root_1);

                        adaptor.addChild(root_1, stream_typedVariableList.nextTree());
                        adaptor.addChild(root_1, stream_goalDesc.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:246:7: fComp
                    {
                    pushFollow(FOLLOW_fComp_in_goalDesc1443);
                    fComp137=fComp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fComp.add(fComp137.getTree());


                    // AST REWRITE
                    // elements: fComp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 247:15: -> ^( COMPARISON_GD fComp )
                    {
                        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:247:18: ^( COMPARISON_GD fComp )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMPARISON_GD, "COMPARISON_GD"), root_1);

                        adaptor.addChild(root_1, stream_fComp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "goalDesc"

    public static class fComp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fComp"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:250:1: fComp : '(' binaryComp fExp fExp ')' ;
    public final PddlParser.fComp_return fComp() throws RecognitionException {
        PddlParser.fComp_return retval = new PddlParser.fComp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal138=null;
        Token char_literal142=null;
        PddlParser.binaryComp_return binaryComp139 = null;

        PddlParser.fExp_return fExp140 = null;

        PddlParser.fExp_return fExp141 = null;


        Object char_literal138_tree=null;
        Object char_literal142_tree=null;

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:251:2: ( '(' binaryComp fExp fExp ')' )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:251:4: '(' binaryComp fExp fExp ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal138=(Token)match(input,55,FOLLOW_55_in_fComp1479); if (state.failed) return retval;
            pushFollow(FOLLOW_binaryComp_in_fComp1482);
            binaryComp139=binaryComp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, binaryComp139.getTree());
            pushFollow(FOLLOW_fExp_in_fComp1484);
            fExp140=fExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, fExp140.getTree());
            pushFollow(FOLLOW_fExp_in_fComp1486);
            fExp141=fExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, fExp141.getTree());
            char_literal142=(Token)match(input,57,FOLLOW_57_in_fComp1488); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fComp"

    public static class atomicTermFormula_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atomicTermFormula"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:254:1: atomicTermFormula : '(' predicate ( term )* ')' -> ^( PRED_HEAD predicate ( term )* ) ;
    public final PddlParser.atomicTermFormula_return atomicTermFormula() throws RecognitionException {
        PddlParser.atomicTermFormula_return retval = new PddlParser.atomicTermFormula_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal143=null;
        Token char_literal146=null;
        PddlParser.predicate_return predicate144 = null;

        PddlParser.term_return term145 = null;


        Object char_literal143_tree=null;
        Object char_literal146_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");
        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:255:2: ( '(' predicate ( term )* ')' -> ^( PRED_HEAD predicate ( term )* ) )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:255:4: '(' predicate ( term )* ')'
            {
            char_literal143=(Token)match(input,55,FOLLOW_55_in_atomicTermFormula1500); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal143);

            pushFollow(FOLLOW_predicate_in_atomicTermFormula1502);
            predicate144=predicate();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_predicate.add(predicate144.getTree());
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:255:18: ( term )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==NAME||LA39_0==VARIABLE) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: term
            	    {
            	    pushFollow(FOLLOW_term_in_atomicTermFormula1504);
            	    term145=term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_term.add(term145.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            char_literal146=(Token)match(input,57,FOLLOW_57_in_atomicTermFormula1507); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_57.add(char_literal146);



            // AST REWRITE
            // elements: predicate, term
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 255:28: -> ^( PRED_HEAD predicate ( term )* )
            {
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:255:31: ^( PRED_HEAD predicate ( term )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PRED_HEAD, "PRED_HEAD"), root_1);

                adaptor.addChild(root_1, stream_predicate.nextTree());
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:255:53: ( term )*
                while ( stream_term.hasNext() ) {
                    adaptor.addChild(root_1, stream_term.nextTree());

                }
                stream_term.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atomicTermFormula"

    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:258:1: term : ( NAME | VARIABLE );
    public final PddlParser.term_return term() throws RecognitionException {
        PddlParser.term_return retval = new PddlParser.term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set147=null;

        Object set147_tree=null;

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:258:6: ( NAME | VARIABLE )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:
            {
            root_0 = (Object)adaptor.nil();

            set147=(Token)input.LT(1);
            if ( input.LA(1)==NAME||input.LA(1)==VARIABLE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set147));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "term"

    public static class durativeActionDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "durativeActionDef"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:260:1: durativeActionDef : '(' ':durative-action' actionSymbol ':parameters' '(' typedVariableList ')' daDefBody ')' -> ^( DURATIVE_ACTION actionSymbol typedVariableList daDefBody ) ;
    public final PddlParser.durativeActionDef_return durativeActionDef() throws RecognitionException {
        PddlParser.durativeActionDef_return retval = new PddlParser.durativeActionDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal148=null;
        Token string_literal149=null;
        Token string_literal151=null;
        Token char_literal152=null;
        Token char_literal154=null;
        Token char_literal156=null;
        PddlParser.actionSymbol_return actionSymbol150 = null;

        PddlParser.typedVariableList_return typedVariableList153 = null;

        PddlParser.daDefBody_return daDefBody155 = null;


        Object char_literal148_tree=null;
        Object string_literal149_tree=null;
        Object string_literal151_tree=null;
        Object char_literal152_tree=null;
        Object char_literal154_tree=null;
        Object char_literal156_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleSubtreeStream stream_actionSymbol=new RewriteRuleSubtreeStream(adaptor,"rule actionSymbol");
        RewriteRuleSubtreeStream stream_daDefBody=new RewriteRuleSubtreeStream(adaptor,"rule daDefBody");
        RewriteRuleSubtreeStream stream_typedVariableList=new RewriteRuleSubtreeStream(adaptor,"rule typedVariableList");
        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:263:2: ( '(' ':durative-action' actionSymbol ':parameters' '(' typedVariableList ')' daDefBody ')' -> ^( DURATIVE_ACTION actionSymbol typedVariableList daDefBody ) )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:263:4: '(' ':durative-action' actionSymbol ':parameters' '(' typedVariableList ')' daDefBody ')'
            {
            char_literal148=(Token)match(input,55,FOLLOW_55_in_durativeActionDef1545); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal148);

            string_literal149=(Token)match(input,80,FOLLOW_80_in_durativeActionDef1547); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_80.add(string_literal149);

            pushFollow(FOLLOW_actionSymbol_in_durativeActionDef1549);
            actionSymbol150=actionSymbol();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_actionSymbol.add(actionSymbol150.getTree());
            string_literal151=(Token)match(input,69,FOLLOW_69_in_durativeActionDef1558); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_69.add(string_literal151);

            char_literal152=(Token)match(input,55,FOLLOW_55_in_durativeActionDef1560); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal152);

            pushFollow(FOLLOW_typedVariableList_in_durativeActionDef1562);
            typedVariableList153=typedVariableList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typedVariableList.add(typedVariableList153.getTree());
            char_literal154=(Token)match(input,57,FOLLOW_57_in_durativeActionDef1564); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_57.add(char_literal154);

            pushFollow(FOLLOW_daDefBody_in_durativeActionDef1577);
            daDefBody155=daDefBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_daDefBody.add(daDefBody155.getTree());
            char_literal156=(Token)match(input,57,FOLLOW_57_in_durativeActionDef1579); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_57.add(char_literal156);



            // AST REWRITE
            // elements: actionSymbol, daDefBody, typedVariableList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 266:8: -> ^( DURATIVE_ACTION actionSymbol typedVariableList daDefBody )
            {
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:266:11: ^( DURATIVE_ACTION actionSymbol typedVariableList daDefBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DURATIVE_ACTION, "DURATIVE_ACTION"), root_1);

                adaptor.addChild(root_1, stream_actionSymbol.nextTree());
                adaptor.addChild(root_1, stream_typedVariableList.nextTree());
                adaptor.addChild(root_1, stream_daDefBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "durativeActionDef"

    public static class daDefBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "daDefBody"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:269:1: daDefBody : ( ':duration' durationConstraint | ':condition' ( ( '(' ')' ) | daGD ) | ':effect' ( ( '(' ')' ) | daEffect ) );
    public final PddlParser.daDefBody_return daDefBody() throws RecognitionException {
        PddlParser.daDefBody_return retval = new PddlParser.daDefBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal157=null;
        Token string_literal159=null;
        Token char_literal160=null;
        Token char_literal161=null;
        Token string_literal163=null;
        Token char_literal164=null;
        Token char_literal165=null;
        PddlParser.durationConstraint_return durationConstraint158 = null;

        PddlParser.daGD_return daGD162 = null;

        PddlParser.daEffect_return daEffect166 = null;


        Object string_literal157_tree=null;
        Object string_literal159_tree=null;
        Object char_literal160_tree=null;
        Object char_literal161_tree=null;
        Object string_literal163_tree=null;
        Object char_literal164_tree=null;
        Object char_literal165_tree=null;

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:270:2: ( ':duration' durationConstraint | ':condition' ( ( '(' ')' ) | daGD ) | ':effect' ( ( '(' ')' ) | daEffect ) )
            int alt42=3;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt42=1;
                }
                break;
            case 82:
                {
                alt42=2;
                }
                break;
            case 72:
                {
                alt42=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:270:4: ':duration' durationConstraint
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal157=(Token)match(input,81,FOLLOW_81_in_daDefBody1612); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal157_tree = (Object)adaptor.create(string_literal157);
                    adaptor.addChild(root_0, string_literal157_tree);
                    }
                    pushFollow(FOLLOW_durationConstraint_in_daDefBody1614);
                    durationConstraint158=durationConstraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, durationConstraint158.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:271:4: ':condition' ( ( '(' ')' ) | daGD )
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal159=(Token)match(input,82,FOLLOW_82_in_daDefBody1619); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal159_tree = (Object)adaptor.create(string_literal159);
                    adaptor.addChild(root_0, string_literal159_tree);
                    }
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:271:17: ( ( '(' ')' ) | daGD )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==55) ) {
                        int LA40_1 = input.LA(2);

                        if ( (LA40_1==57) ) {
                            alt40=1;
                        }
                        else if ( (LA40_1==74||LA40_1==79||(LA40_1>=83 && LA40_1<=85)) ) {
                            alt40=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 40, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:271:18: ( '(' ')' )
                            {
                            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:271:18: ( '(' ')' )
                            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:271:19: '(' ')'
                            {
                            char_literal160=(Token)match(input,55,FOLLOW_55_in_daDefBody1623); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal160_tree = (Object)adaptor.create(char_literal160);
                            adaptor.addChild(root_0, char_literal160_tree);
                            }
                            char_literal161=(Token)match(input,57,FOLLOW_57_in_daDefBody1625); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal161_tree = (Object)adaptor.create(char_literal161);
                            adaptor.addChild(root_0, char_literal161_tree);
                            }

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:271:30: daGD
                            {
                            pushFollow(FOLLOW_daGD_in_daDefBody1630);
                            daGD162=daGD();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, daGD162.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:272:7: ':effect' ( ( '(' ')' ) | daEffect )
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal163=(Token)match(input,72,FOLLOW_72_in_daDefBody1639); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal163_tree = (Object)adaptor.create(string_literal163);
                    adaptor.addChild(root_0, string_literal163_tree);
                    }
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:272:17: ( ( '(' ')' ) | daEffect )
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==55) ) {
                        int LA41_1 = input.LA(2);

                        if ( (LA41_1==57) ) {
                            alt41=1;
                        }
                        else if ( (LA41_1==74||LA41_1==79||LA41_1==84||LA41_1==90||(LA41_1>=99 && LA41_1<=103)) ) {
                            alt41=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 41, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }
                    switch (alt41) {
                        case 1 :
                            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:272:18: ( '(' ')' )
                            {
                            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:272:18: ( '(' ')' )
                            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:272:19: '(' ')'
                            {
                            char_literal164=(Token)match(input,55,FOLLOW_55_in_daDefBody1643); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal164_tree = (Object)adaptor.create(char_literal164);
                            adaptor.addChild(root_0, char_literal164_tree);
                            }
                            char_literal165=(Token)match(input,57,FOLLOW_57_in_daDefBody1645); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal165_tree = (Object)adaptor.create(char_literal165);
                            adaptor.addChild(root_0, char_literal165_tree);
                            }

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:272:30: daEffect
                            {
                            pushFollow(FOLLOW_daEffect_in_daDefBody1650);
                            daEffect166=daEffect();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, daEffect166.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "daDefBody"

    public static class daGD_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "daGD"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:275:1: daGD : ( prefTimedGD | '(' 'and' ( daGD )* ')' | '(' 'forall' '(' typedVariableList ')' daGD ')' );
    public final PddlParser.daGD_return daGD() throws RecognitionException {
        PddlParser.daGD_return retval = new PddlParser.daGD_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal168=null;
        Token string_literal169=null;
        Token char_literal171=null;
        Token char_literal172=null;
        Token string_literal173=null;
        Token char_literal174=null;
        Token char_literal176=null;
        Token char_literal178=null;
        PddlParser.prefTimedGD_return prefTimedGD167 = null;

        PddlParser.daGD_return daGD170 = null;

        PddlParser.typedVariableList_return typedVariableList175 = null;

        PddlParser.daGD_return daGD177 = null;


        Object char_literal168_tree=null;
        Object string_literal169_tree=null;
        Object char_literal171_tree=null;
        Object char_literal172_tree=null;
        Object string_literal173_tree=null;
        Object char_literal174_tree=null;
        Object char_literal176_tree=null;
        Object char_literal178_tree=null;

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:276:2: ( prefTimedGD | '(' 'and' ( daGD )* ')' | '(' 'forall' '(' typedVariableList ')' daGD ')' )
            int alt44=3;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==55) ) {
                switch ( input.LA(2) ) {
                case 83:
                case 84:
                case 85:
                    {
                    alt44=1;
                    }
                    break;
                case 74:
                    {
                    alt44=2;
                    }
                    break;
                case 79:
                    {
                    alt44=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:276:4: prefTimedGD
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_prefTimedGD_in_daGD1665);
                    prefTimedGD167=prefTimedGD();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefTimedGD167.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:277:4: '(' 'and' ( daGD )* ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal168=(Token)match(input,55,FOLLOW_55_in_daGD1670); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal168_tree = (Object)adaptor.create(char_literal168);
                    adaptor.addChild(root_0, char_literal168_tree);
                    }
                    string_literal169=(Token)match(input,74,FOLLOW_74_in_daGD1672); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal169_tree = (Object)adaptor.create(string_literal169);
                    adaptor.addChild(root_0, string_literal169_tree);
                    }
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:277:14: ( daGD )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==55) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: daGD
                    	    {
                    	    pushFollow(FOLLOW_daGD_in_daGD1674);
                    	    daGD170=daGD();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, daGD170.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    char_literal171=(Token)match(input,57,FOLLOW_57_in_daGD1677); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal171_tree = (Object)adaptor.create(char_literal171);
                    adaptor.addChild(root_0, char_literal171_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:278:4: '(' 'forall' '(' typedVariableList ')' daGD ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal172=(Token)match(input,55,FOLLOW_55_in_daGD1682); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal172_tree = (Object)adaptor.create(char_literal172);
                    adaptor.addChild(root_0, char_literal172_tree);
                    }
                    string_literal173=(Token)match(input,79,FOLLOW_79_in_daGD1684); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal173_tree = (Object)adaptor.create(string_literal173);
                    adaptor.addChild(root_0, string_literal173_tree);
                    }
                    char_literal174=(Token)match(input,55,FOLLOW_55_in_daGD1686); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal174_tree = (Object)adaptor.create(char_literal174);
                    adaptor.addChild(root_0, char_literal174_tree);
                    }
                    pushFollow(FOLLOW_typedVariableList_in_daGD1688);
                    typedVariableList175=typedVariableList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedVariableList175.getTree());
                    char_literal176=(Token)match(input,57,FOLLOW_57_in_daGD1690); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal176_tree = (Object)adaptor.create(char_literal176);
                    adaptor.addChild(root_0, char_literal176_tree);
                    }
                    pushFollow(FOLLOW_daGD_in_daGD1692);
                    daGD177=daGD();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, daGD177.getTree());
                    char_literal178=(Token)match(input,57,FOLLOW_57_in_daGD1694); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal178_tree = (Object)adaptor.create(char_literal178);
                    adaptor.addChild(root_0, char_literal178_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "daGD"

    public static class prefTimedGD_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prefTimedGD"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:281:1: prefTimedGD : ( timedGD | '(' 'preference' ( NAME )? timedGD ')' );
    public final PddlParser.prefTimedGD_return prefTimedGD() throws RecognitionException {
        PddlParser.prefTimedGD_return retval = new PddlParser.prefTimedGD_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal180=null;
        Token string_literal181=null;
        Token NAME182=null;
        Token char_literal184=null;
        PddlParser.timedGD_return timedGD179 = null;

        PddlParser.timedGD_return timedGD183 = null;


        Object char_literal180_tree=null;
        Object string_literal181_tree=null;
        Object NAME182_tree=null;
        Object char_literal184_tree=null;

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:282:2: ( timedGD | '(' 'preference' ( NAME )? timedGD ')' )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==55) ) {
                int LA46_1 = input.LA(2);

                if ( ((LA46_1>=84 && LA46_1<=85)) ) {
                    alt46=1;
                }
                else if ( (LA46_1==83) ) {
                    alt46=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:282:4: timedGD
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_timedGD_in_prefTimedGD1705);
                    timedGD179=timedGD();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timedGD179.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:283:4: '(' 'preference' ( NAME )? timedGD ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal180=(Token)match(input,55,FOLLOW_55_in_prefTimedGD1710); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal180_tree = (Object)adaptor.create(char_literal180);
                    adaptor.addChild(root_0, char_literal180_tree);
                    }
                    string_literal181=(Token)match(input,83,FOLLOW_83_in_prefTimedGD1712); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal181_tree = (Object)adaptor.create(string_literal181);
                    adaptor.addChild(root_0, string_literal181_tree);
                    }
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:283:21: ( NAME )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==NAME) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: NAME
                            {
                            NAME182=(Token)match(input,NAME,FOLLOW_NAME_in_prefTimedGD1714); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            NAME182_tree = (Object)adaptor.create(NAME182);
                            adaptor.addChild(root_0, NAME182_tree);
                            }

                            }
                            break;

                    }

                    pushFollow(FOLLOW_timedGD_in_prefTimedGD1717);
                    timedGD183=timedGD();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timedGD183.getTree());
                    char_literal184=(Token)match(input,57,FOLLOW_57_in_prefTimedGD1719); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal184_tree = (Object)adaptor.create(char_literal184);
                    adaptor.addChild(root_0, char_literal184_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prefTimedGD"

    public static class timedGD_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timedGD"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:286:1: timedGD : ( '(' 'at' timeSpecifier goalDesc ')' | '(' 'over' interval goalDesc ')' );
    public final PddlParser.timedGD_return timedGD() throws RecognitionException {
        PddlParser.timedGD_return retval = new PddlParser.timedGD_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal185=null;
        Token string_literal186=null;
        Token char_literal189=null;
        Token char_literal190=null;
        Token string_literal191=null;
        Token char_literal194=null;
        PddlParser.timeSpecifier_return timeSpecifier187 = null;

        PddlParser.goalDesc_return goalDesc188 = null;

        PddlParser.interval_return interval192 = null;

        PddlParser.goalDesc_return goalDesc193 = null;


        Object char_literal185_tree=null;
        Object string_literal186_tree=null;
        Object char_literal189_tree=null;
        Object char_literal190_tree=null;
        Object string_literal191_tree=null;
        Object char_literal194_tree=null;

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:287:2: ( '(' 'at' timeSpecifier goalDesc ')' | '(' 'over' interval goalDesc ')' )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==55) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==84) ) {
                    alt47=1;
                }
                else if ( (LA47_1==85) ) {
                    alt47=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:287:4: '(' 'at' timeSpecifier goalDesc ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal185=(Token)match(input,55,FOLLOW_55_in_timedGD1730); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal185_tree = (Object)adaptor.create(char_literal185);
                    adaptor.addChild(root_0, char_literal185_tree);
                    }
                    string_literal186=(Token)match(input,84,FOLLOW_84_in_timedGD1732); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal186_tree = (Object)adaptor.create(string_literal186);
                    adaptor.addChild(root_0, string_literal186_tree);
                    }
                    pushFollow(FOLLOW_timeSpecifier_in_timedGD1734);
                    timeSpecifier187=timeSpecifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeSpecifier187.getTree());
                    pushFollow(FOLLOW_goalDesc_in_timedGD1736);
                    goalDesc188=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc188.getTree());
                    char_literal189=(Token)match(input,57,FOLLOW_57_in_timedGD1738); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal189_tree = (Object)adaptor.create(char_literal189);
                    adaptor.addChild(root_0, char_literal189_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:288:4: '(' 'over' interval goalDesc ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal190=(Token)match(input,55,FOLLOW_55_in_timedGD1743); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal190_tree = (Object)adaptor.create(char_literal190);
                    adaptor.addChild(root_0, char_literal190_tree);
                    }
                    string_literal191=(Token)match(input,85,FOLLOW_85_in_timedGD1745); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal191_tree = (Object)adaptor.create(string_literal191);
                    adaptor.addChild(root_0, string_literal191_tree);
                    }
                    pushFollow(FOLLOW_interval_in_timedGD1747);
                    interval192=interval();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interval192.getTree());
                    pushFollow(FOLLOW_goalDesc_in_timedGD1749);
                    goalDesc193=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc193.getTree());
                    char_literal194=(Token)match(input,57,FOLLOW_57_in_timedGD1751); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal194_tree = (Object)adaptor.create(char_literal194);
                    adaptor.addChild(root_0, char_literal194_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "timedGD"

    public static class timeSpecifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timeSpecifier"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:291:1: timeSpecifier : ( 'start' | 'end' );
    public final PddlParser.timeSpecifier_return timeSpecifier() throws RecognitionException {
        PddlParser.timeSpecifier_return retval = new PddlParser.timeSpecifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set195=null;

        Object set195_tree=null;

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:291:15: ( 'start' | 'end' )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:
            {
            root_0 = (Object)adaptor.nil();

            set195=(Token)input.LT(1);
            if ( (input.LA(1)>=86 && input.LA(1)<=87) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set195));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "timeSpecifier"

    public static class interval_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interval"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:292:1: interval : 'all' ;
    public final PddlParser.interval_return interval() throws RecognitionException {
        PddlParser.interval_return retval = new PddlParser.interval_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal196=null;

        Object string_literal196_tree=null;

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:292:10: ( 'all' )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:292:12: 'all'
            {
            root_0 = (Object)adaptor.nil();

            string_literal196=(Token)match(input,88,FOLLOW_88_in_interval1773); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal196_tree = (Object)adaptor.create(string_literal196);
            adaptor.addChild(root_0, string_literal196_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "interval"

    public static class derivedDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "derivedDef"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:294:1: derivedDef : '(' ':derived' typedVariableList goalDesc ')' ;
    public final PddlParser.derivedDef_return derivedDef() throws RecognitionException {
        PddlParser.derivedDef_return retval = new PddlParser.derivedDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal197=null;
        Token string_literal198=null;
        Token char_literal201=null;
        PddlParser.typedVariableList_return typedVariableList199 = null;

        PddlParser.goalDesc_return goalDesc200 = null;


        Object char_literal197_tree=null;
        Object string_literal198_tree=null;
        Object char_literal201_tree=null;

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:297:2: ( '(' ':derived' typedVariableList goalDesc ')' )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:297:4: '(' ':derived' typedVariableList goalDesc ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal197=(Token)match(input,55,FOLLOW_55_in_derivedDef1786); if (state.failed) return retval;
            string_literal198=(Token)match(input,89,FOLLOW_89_in_derivedDef1789); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal198_tree = (Object)adaptor.create(string_literal198);
            root_0 = (Object)adaptor.becomeRoot(string_literal198_tree, root_0);
            }
            pushFollow(FOLLOW_typedVariableList_in_derivedDef1792);
            typedVariableList199=typedVariableList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typedVariableList199.getTree());
            pushFollow(FOLLOW_goalDesc_in_derivedDef1794);
            goalDesc200=goalDesc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc200.getTree());
            char_literal201=(Token)match(input,57,FOLLOW_57_in_derivedDef1796); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "derivedDef"

    public static class fExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fExp"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:300:1: fExp : ( NUMBER | '(' binaryOp fExp fExp2 ')' -> ^( BINARY_OP binaryOp fExp fExp2 ) | '(' '-' fExp ')' -> ^( UNARY_MINUS fExp ) | fHead );
    public final PddlParser.fExp_return fExp() throws RecognitionException {
        PddlParser.fExp_return retval = new PddlParser.fExp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NUMBER202=null;
        Token char_literal203=null;
        Token char_literal207=null;
        Token char_literal208=null;
        Token char_literal209=null;
        Token char_literal211=null;
        PddlParser.binaryOp_return binaryOp204 = null;

        PddlParser.fExp_return fExp205 = null;

        PddlParser.fExp2_return fExp2206 = null;

        PddlParser.fExp_return fExp210 = null;

        PddlParser.fHead_return fHead212 = null;


        Object NUMBER202_tree=null;
        Object char_literal203_tree=null;
        Object char_literal207_tree=null;
        Object char_literal208_tree=null;
        Object char_literal209_tree=null;
        Object char_literal211_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_fExp2=new RewriteRuleSubtreeStream(adaptor,"rule fExp2");
        RewriteRuleSubtreeStream stream_fExp=new RewriteRuleSubtreeStream(adaptor,"rule fExp");
        RewriteRuleSubtreeStream stream_binaryOp=new RewriteRuleSubtreeStream(adaptor,"rule binaryOp");
        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:303:2: ( NUMBER | '(' binaryOp fExp fExp2 ')' -> ^( BINARY_OP binaryOp fExp fExp2 ) | '(' '-' fExp ')' -> ^( UNARY_MINUS fExp ) | fHead )
            int alt48=4;
            switch ( input.LA(1) ) {
            case NUMBER:
                {
                alt48=1;
                }
                break;
            case 55:
                {
                int LA48_2 = input.LA(2);

                if ( (synpred60_Pddl()) ) {
                    alt48=2;
                }
                else if ( (synpred61_Pddl()) ) {
                    alt48=3;
                }
                else if ( (true) ) {
                    alt48=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 2, input);

                    throw nvae;
                }
                }
                break;
            case NAME:
                {
                alt48=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:303:4: NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    NUMBER202=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_fExp1811); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER202_tree = (Object)adaptor.create(NUMBER202);
                    adaptor.addChild(root_0, NUMBER202_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:304:4: '(' binaryOp fExp fExp2 ')'
                    {
                    char_literal203=(Token)match(input,55,FOLLOW_55_in_fExp1816); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal203);

                    pushFollow(FOLLOW_binaryOp_in_fExp1818);
                    binaryOp204=binaryOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_binaryOp.add(binaryOp204.getTree());
                    pushFollow(FOLLOW_fExp_in_fExp1820);
                    fExp205=fExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fExp.add(fExp205.getTree());
                    pushFollow(FOLLOW_fExp2_in_fExp1822);
                    fExp2206=fExp2();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fExp2.add(fExp2206.getTree());
                    char_literal207=(Token)match(input,57,FOLLOW_57_in_fExp1824); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_57.add(char_literal207);



                    // AST REWRITE
                    // elements: fExp, binaryOp, fExp2
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 304:32: -> ^( BINARY_OP binaryOp fExp fExp2 )
                    {
                        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:304:35: ^( BINARY_OP binaryOp fExp fExp2 )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BINARY_OP, "BINARY_OP"), root_1);

                        adaptor.addChild(root_1, stream_binaryOp.nextTree());
                        adaptor.addChild(root_1, stream_fExp.nextTree());
                        adaptor.addChild(root_1, stream_fExp2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:305:4: '(' '-' fExp ')'
                    {
                    char_literal208=(Token)match(input,55,FOLLOW_55_in_fExp1841); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal208);

                    char_literal209=(Token)match(input,61,FOLLOW_61_in_fExp1843); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_61.add(char_literal209);

                    pushFollow(FOLLOW_fExp_in_fExp1845);
                    fExp210=fExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fExp.add(fExp210.getTree());
                    char_literal211=(Token)match(input,57,FOLLOW_57_in_fExp1847); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_57.add(char_literal211);



                    // AST REWRITE
                    // elements: fExp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 305:21: -> ^( UNARY_MINUS fExp )
                    {
                        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:305:24: ^( UNARY_MINUS fExp )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARY_MINUS, "UNARY_MINUS"), root_1);

                        adaptor.addChild(root_1, stream_fExp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:306:4: fHead
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_fHead_in_fExp1860);
                    fHead212=fHead();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fHead212.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fExp"

    public static class fExp2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fExp2"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:311:1: fExp2 : fExp ;
    public final PddlParser.fExp2_return fExp2() throws RecognitionException {
        PddlParser.fExp2_return retval = new PddlParser.fExp2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PddlParser.fExp_return fExp213 = null;



        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:311:7: ( fExp )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:311:9: fExp
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_fExp_in_fExp21872);
            fExp213=fExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, fExp213.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fExp2"

    public static class fHead_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fHead"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:313:1: fHead : ( '(' functionSymbol ( term )* ')' -> ^( FUNC_HEAD functionSymbol ( term )* ) | functionSymbol -> ^( FUNC_HEAD functionSymbol ) );
    public final PddlParser.fHead_return fHead() throws RecognitionException {
        PddlParser.fHead_return retval = new PddlParser.fHead_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal214=null;
        Token char_literal217=null;
        PddlParser.functionSymbol_return functionSymbol215 = null;

        PddlParser.term_return term216 = null;

        PddlParser.functionSymbol_return functionSymbol218 = null;


        Object char_literal214_tree=null;
        Object char_literal217_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        RewriteRuleSubtreeStream stream_functionSymbol=new RewriteRuleSubtreeStream(adaptor,"rule functionSymbol");
        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:314:2: ( '(' functionSymbol ( term )* ')' -> ^( FUNC_HEAD functionSymbol ( term )* ) | functionSymbol -> ^( FUNC_HEAD functionSymbol ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==55) ) {
                alt50=1;
            }
            else if ( (LA50_0==NAME) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:314:4: '(' functionSymbol ( term )* ')'
                    {
                    char_literal214=(Token)match(input,55,FOLLOW_55_in_fHead1882); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal214);

                    pushFollow(FOLLOW_functionSymbol_in_fHead1884);
                    functionSymbol215=functionSymbol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_functionSymbol.add(functionSymbol215.getTree());
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:314:23: ( term )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==NAME||LA49_0==VARIABLE) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: term
                    	    {
                    	    pushFollow(FOLLOW_term_in_fHead1886);
                    	    term216=term();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_term.add(term216.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    char_literal217=(Token)match(input,57,FOLLOW_57_in_fHead1889); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_57.add(char_literal217);



                    // AST REWRITE
                    // elements: term, functionSymbol
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 314:33: -> ^( FUNC_HEAD functionSymbol ( term )* )
                    {
                        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:314:36: ^( FUNC_HEAD functionSymbol ( term )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_HEAD, "FUNC_HEAD"), root_1);

                        adaptor.addChild(root_1, stream_functionSymbol.nextTree());
                        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:314:63: ( term )*
                        while ( stream_term.hasNext() ) {
                            adaptor.addChild(root_1, stream_term.nextTree());

                        }
                        stream_term.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:315:4: functionSymbol
                    {
                    pushFollow(FOLLOW_functionSymbol_in_fHead1905);
                    functionSymbol218=functionSymbol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_functionSymbol.add(functionSymbol218.getTree());


                    // AST REWRITE
                    // elements: functionSymbol
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 315:19: -> ^( FUNC_HEAD functionSymbol )
                    {
                        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:315:22: ^( FUNC_HEAD functionSymbol )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_HEAD, "FUNC_HEAD"), root_1);

                        adaptor.addChild(root_1, stream_functionSymbol.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fHead"

    public static class effect_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "effect"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:318:1: effect : ( '(' 'and' ( cEffect )* ')' -> ^( AND_EFFECT ( cEffect )* ) | cEffect );
    public final PddlParser.effect_return effect() throws RecognitionException {
        PddlParser.effect_return retval = new PddlParser.effect_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal219=null;
        Token string_literal220=null;
        Token char_literal222=null;
        PddlParser.cEffect_return cEffect221 = null;

        PddlParser.cEffect_return cEffect223 = null;


        Object char_literal219_tree=null;
        Object string_literal220_tree=null;
        Object char_literal222_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_cEffect=new RewriteRuleSubtreeStream(adaptor,"rule cEffect");
        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:319:2: ( '(' 'and' ( cEffect )* ')' -> ^( AND_EFFECT ( cEffect )* ) | cEffect )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==55) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==74) ) {
                    alt52=1;
                }
                else if ( (LA52_1==NAME||LA52_1==76||LA52_1==79||LA52_1==90||(LA52_1>=99 && LA52_1<=103)) ) {
                    alt52=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:319:4: '(' 'and' ( cEffect )* ')'
                    {
                    char_literal219=(Token)match(input,55,FOLLOW_55_in_effect1924); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal219);

                    string_literal220=(Token)match(input,74,FOLLOW_74_in_effect1926); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_74.add(string_literal220);

                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:319:14: ( cEffect )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==55) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: cEffect
                    	    {
                    	    pushFollow(FOLLOW_cEffect_in_effect1928);
                    	    cEffect221=cEffect();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_cEffect.add(cEffect221.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    char_literal222=(Token)match(input,57,FOLLOW_57_in_effect1931); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_57.add(char_literal222);



                    // AST REWRITE
                    // elements: cEffect
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 319:27: -> ^( AND_EFFECT ( cEffect )* )
                    {
                        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:319:30: ^( AND_EFFECT ( cEffect )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND_EFFECT, "AND_EFFECT"), root_1);

                        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:319:43: ( cEffect )*
                        while ( stream_cEffect.hasNext() ) {
                            adaptor.addChild(root_1, stream_cEffect.nextTree());

                        }
                        stream_cEffect.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:320:4: cEffect
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_cEffect_in_effect1945);
                    cEffect223=cEffect();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cEffect223.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "effect"

    public static class cEffect_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cEffect"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:323:1: cEffect : ( '(' 'forall' '(' typedVariableList ')' effect ')' -> ^( FORALL_EFFECT typedVariableList effect ) | '(' 'when' goalDesc condEffect ')' -> ^( WHEN_EFFECT goalDesc condEffect ) | pEffect );
    public final PddlParser.cEffect_return cEffect() throws RecognitionException {
        PddlParser.cEffect_return retval = new PddlParser.cEffect_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal224=null;
        Token string_literal225=null;
        Token char_literal226=null;
        Token char_literal228=null;
        Token char_literal230=null;
        Token char_literal231=null;
        Token string_literal232=null;
        Token char_literal235=null;
        PddlParser.typedVariableList_return typedVariableList227 = null;

        PddlParser.effect_return effect229 = null;

        PddlParser.goalDesc_return goalDesc233 = null;

        PddlParser.condEffect_return condEffect234 = null;

        PddlParser.pEffect_return pEffect236 = null;


        Object char_literal224_tree=null;
        Object string_literal225_tree=null;
        Object char_literal226_tree=null;
        Object char_literal228_tree=null;
        Object char_literal230_tree=null;
        Object char_literal231_tree=null;
        Object string_literal232_tree=null;
        Object char_literal235_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleSubtreeStream stream_effect=new RewriteRuleSubtreeStream(adaptor,"rule effect");
        RewriteRuleSubtreeStream stream_condEffect=new RewriteRuleSubtreeStream(adaptor,"rule condEffect");
        RewriteRuleSubtreeStream stream_goalDesc=new RewriteRuleSubtreeStream(adaptor,"rule goalDesc");
        RewriteRuleSubtreeStream stream_typedVariableList=new RewriteRuleSubtreeStream(adaptor,"rule typedVariableList");
        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:324:2: ( '(' 'forall' '(' typedVariableList ')' effect ')' -> ^( FORALL_EFFECT typedVariableList effect ) | '(' 'when' goalDesc condEffect ')' -> ^( WHEN_EFFECT goalDesc condEffect ) | pEffect )
            int alt53=3;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==55) ) {
                switch ( input.LA(2) ) {
                case 79:
                    {
                    alt53=1;
                    }
                    break;
                case 90:
                    {
                    alt53=2;
                    }
                    break;
                case NAME:
                case 76:
                case 99:
                case 100:
                case 101:
                case 102:
                case 103:
                    {
                    alt53=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:324:4: '(' 'forall' '(' typedVariableList ')' effect ')'
                    {
                    char_literal224=(Token)match(input,55,FOLLOW_55_in_cEffect1956); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal224);

                    string_literal225=(Token)match(input,79,FOLLOW_79_in_cEffect1958); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_79.add(string_literal225);

                    char_literal226=(Token)match(input,55,FOLLOW_55_in_cEffect1960); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal226);

                    pushFollow(FOLLOW_typedVariableList_in_cEffect1962);
                    typedVariableList227=typedVariableList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typedVariableList.add(typedVariableList227.getTree());
                    char_literal228=(Token)match(input,57,FOLLOW_57_in_cEffect1964); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_57.add(char_literal228);

                    pushFollow(FOLLOW_effect_in_cEffect1966);
                    effect229=effect();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_effect.add(effect229.getTree());
                    char_literal230=(Token)match(input,57,FOLLOW_57_in_cEffect1968); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_57.add(char_literal230);



                    // AST REWRITE
                    // elements: typedVariableList, effect
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 325:4: -> ^( FORALL_EFFECT typedVariableList effect )
                    {
                        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:325:7: ^( FORALL_EFFECT typedVariableList effect )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORALL_EFFECT, "FORALL_EFFECT"), root_1);

                        adaptor.addChild(root_1, stream_typedVariableList.nextTree());
                        adaptor.addChild(root_1, stream_effect.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:326:4: '(' 'when' goalDesc condEffect ')'
                    {
                    char_literal231=(Token)match(input,55,FOLLOW_55_in_cEffect1986); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal231);

                    string_literal232=(Token)match(input,90,FOLLOW_90_in_cEffect1988); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_90.add(string_literal232);

                    pushFollow(FOLLOW_goalDesc_in_cEffect1990);
                    goalDesc233=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc233.getTree());
                    pushFollow(FOLLOW_condEffect_in_cEffect1992);
                    condEffect234=condEffect();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_condEffect.add(condEffect234.getTree());
                    char_literal235=(Token)match(input,57,FOLLOW_57_in_cEffect1994); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_57.add(char_literal235);



                    // AST REWRITE
                    // elements: condEffect, goalDesc
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 327:4: -> ^( WHEN_EFFECT goalDesc condEffect )
                    {
                        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:327:7: ^( WHEN_EFFECT goalDesc condEffect )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHEN_EFFECT, "WHEN_EFFECT"), root_1);

                        adaptor.addChild(root_1, stream_goalDesc.nextTree());
                        adaptor.addChild(root_1, stream_condEffect.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:328:4: pEffect
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pEffect_in_cEffect2012);
                    pEffect236=pEffect();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pEffect236.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "cEffect"

    public static class pEffect_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pEffect"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:331:1: pEffect : ( '(' assignOp fHead fExp ')' -> ^( ASSIGN_EFFECT assignOp fHead fExp ) | '(' 'not' atomicTermFormula ')' -> ^( NOT_EFFECT atomicTermFormula ) | atomicTermFormula );
    public final PddlParser.pEffect_return pEffect() throws RecognitionException {
        PddlParser.pEffect_return retval = new PddlParser.pEffect_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal237=null;
        Token char_literal241=null;
        Token char_literal242=null;
        Token string_literal243=null;
        Token char_literal245=null;
        PddlParser.assignOp_return assignOp238 = null;

        PddlParser.fHead_return fHead239 = null;

        PddlParser.fExp_return fExp240 = null;

        PddlParser.atomicTermFormula_return atomicTermFormula244 = null;

        PddlParser.atomicTermFormula_return atomicTermFormula246 = null;


        Object char_literal237_tree=null;
        Object char_literal241_tree=null;
        Object char_literal242_tree=null;
        Object string_literal243_tree=null;
        Object char_literal245_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_fHead=new RewriteRuleSubtreeStream(adaptor,"rule fHead");
        RewriteRuleSubtreeStream stream_assignOp=new RewriteRuleSubtreeStream(adaptor,"rule assignOp");
        RewriteRuleSubtreeStream stream_atomicTermFormula=new RewriteRuleSubtreeStream(adaptor,"rule atomicTermFormula");
        RewriteRuleSubtreeStream stream_fExp=new RewriteRuleSubtreeStream(adaptor,"rule fExp");
        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:332:2: ( '(' assignOp fHead fExp ')' -> ^( ASSIGN_EFFECT assignOp fHead fExp ) | '(' 'not' atomicTermFormula ')' -> ^( NOT_EFFECT atomicTermFormula ) | atomicTermFormula )
            int alt54=3;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==55) ) {
                switch ( input.LA(2) ) {
                case 76:
                    {
                    alt54=2;
                    }
                    break;
                case 99:
                case 100:
                case 101:
                case 102:
                case 103:
                    {
                    alt54=1;
                    }
                    break;
                case NAME:
                    {
                    alt54=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:332:4: '(' assignOp fHead fExp ')'
                    {
                    char_literal237=(Token)match(input,55,FOLLOW_55_in_pEffect2023); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal237);

                    pushFollow(FOLLOW_assignOp_in_pEffect2025);
                    assignOp238=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignOp.add(assignOp238.getTree());
                    pushFollow(FOLLOW_fHead_in_pEffect2027);
                    fHead239=fHead();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fHead.add(fHead239.getTree());
                    pushFollow(FOLLOW_fExp_in_pEffect2029);
                    fExp240=fExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fExp.add(fExp240.getTree());
                    char_literal241=(Token)match(input,57,FOLLOW_57_in_pEffect2031); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_57.add(char_literal241);



                    // AST REWRITE
                    // elements: fHead, fExp, assignOp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 333:4: -> ^( ASSIGN_EFFECT assignOp fHead fExp )
                    {
                        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:333:7: ^( ASSIGN_EFFECT assignOp fHead fExp )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGN_EFFECT, "ASSIGN_EFFECT"), root_1);

                        adaptor.addChild(root_1, stream_assignOp.nextTree());
                        adaptor.addChild(root_1, stream_fHead.nextTree());
                        adaptor.addChild(root_1, stream_fExp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:334:4: '(' 'not' atomicTermFormula ')'
                    {
                    char_literal242=(Token)match(input,55,FOLLOW_55_in_pEffect2051); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal242);

                    string_literal243=(Token)match(input,76,FOLLOW_76_in_pEffect2053); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_76.add(string_literal243);

                    pushFollow(FOLLOW_atomicTermFormula_in_pEffect2055);
                    atomicTermFormula244=atomicTermFormula();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_atomicTermFormula.add(atomicTermFormula244.getTree());
                    char_literal245=(Token)match(input,57,FOLLOW_57_in_pEffect2057); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_57.add(char_literal245);



                    // AST REWRITE
                    // elements: atomicTermFormula
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 335:4: -> ^( NOT_EFFECT atomicTermFormula )
                    {
                        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:335:7: ^( NOT_EFFECT atomicTermFormula )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT_EFFECT, "NOT_EFFECT"), root_1);

                        adaptor.addChild(root_1, stream_atomicTermFormula.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:336:4: atomicTermFormula
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_atomicTermFormula_in_pEffect2073);
                    atomicTermFormula246=atomicTermFormula();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atomicTermFormula246.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pEffect"

    public static class condEffect_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condEffect"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:341:1: condEffect : ( '(' 'and' ( pEffect )* ')' -> ^( AND_EFFECT ( pEffect )* ) | pEffect );
    public final PddlParser.condEffect_return condEffect() throws RecognitionException {
        PddlParser.condEffect_return retval = new PddlParser.condEffect_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal247=null;
        Token string_literal248=null;
        Token char_literal250=null;
        PddlParser.pEffect_return pEffect249 = null;

        PddlParser.pEffect_return pEffect251 = null;


        Object char_literal247_tree=null;
        Object string_literal248_tree=null;
        Object char_literal250_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_pEffect=new RewriteRuleSubtreeStream(adaptor,"rule pEffect");
        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:342:2: ( '(' 'and' ( pEffect )* ')' -> ^( AND_EFFECT ( pEffect )* ) | pEffect )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==55) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==74) ) {
                    alt56=1;
                }
                else if ( (LA56_1==NAME||LA56_1==76||(LA56_1>=99 && LA56_1<=103)) ) {
                    alt56=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:342:4: '(' 'and' ( pEffect )* ')'
                    {
                    char_literal247=(Token)match(input,55,FOLLOW_55_in_condEffect2086); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal247);

                    string_literal248=(Token)match(input,74,FOLLOW_74_in_condEffect2088); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_74.add(string_literal248);

                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:342:14: ( pEffect )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==55) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: pEffect
                    	    {
                    	    pushFollow(FOLLOW_pEffect_in_condEffect2090);
                    	    pEffect249=pEffect();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_pEffect.add(pEffect249.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);

                    char_literal250=(Token)match(input,57,FOLLOW_57_in_condEffect2093); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_57.add(char_literal250);



                    // AST REWRITE
                    // elements: pEffect
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 342:27: -> ^( AND_EFFECT ( pEffect )* )
                    {
                        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:342:30: ^( AND_EFFECT ( pEffect )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND_EFFECT, "AND_EFFECT"), root_1);

                        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:342:43: ( pEffect )*
                        while ( stream_pEffect.hasNext() ) {
                            adaptor.addChild(root_1, stream_pEffect.nextTree());

                        }
                        stream_pEffect.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:343:4: pEffect
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pEffect_in_condEffect2107);
                    pEffect251=pEffect();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pEffect251.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condEffect"

    public static class binaryOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "binaryOp"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:347:1: binaryOp : ( '*' | '+' | '-' | '/' );
    public final PddlParser.binaryOp_return binaryOp() throws RecognitionException {
        PddlParser.binaryOp_return retval = new PddlParser.binaryOp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set252=null;

        Object set252_tree=null;

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:347:10: ( '*' | '+' | '-' | '/' )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:
            {
            root_0 = (Object)adaptor.nil();

            set252=(Token)input.LT(1);
            if ( input.LA(1)==61||(input.LA(1)>=91 && input.LA(1)<=93) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set252));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "binaryOp"

    public static class binaryComp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "binaryComp"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:349:1: binaryComp : ( '>' | '<' | '=' | '>=' | '<=' );
    public final PddlParser.binaryComp_return binaryComp() throws RecognitionException {
        PddlParser.binaryComp_return retval = new PddlParser.binaryComp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set253=null;

        Object set253_tree=null;

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:349:12: ( '>' | '<' | '=' | '>=' | '<=' )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:
            {
            root_0 = (Object)adaptor.nil();

            set253=(Token)input.LT(1);
            if ( (input.LA(1)>=94 && input.LA(1)<=98) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set253));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "binaryComp"

    public static class assignOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignOp"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:351:1: assignOp : ( 'assign' | 'scale-up' | 'scale-down' | 'increase' | 'decrease' );
    public final PddlParser.assignOp_return assignOp() throws RecognitionException {
        PddlParser.assignOp_return retval = new PddlParser.assignOp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set254=null;

        Object set254_tree=null;

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:351:10: ( 'assign' | 'scale-up' | 'scale-down' | 'increase' | 'decrease' )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:
            {
            root_0 = (Object)adaptor.nil();

            set254=(Token)input.LT(1);
            if ( (input.LA(1)>=99 && input.LA(1)<=103) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set254));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignOp"

    public static class durationConstraint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "durationConstraint"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:354:1: durationConstraint : ( '(' 'and' ( simpleDurationConstraint )+ ')' | '(' ')' | simpleDurationConstraint );
    public final PddlParser.durationConstraint_return durationConstraint() throws RecognitionException {
        PddlParser.durationConstraint_return retval = new PddlParser.durationConstraint_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal255=null;
        Token string_literal256=null;
        Token char_literal258=null;
        Token char_literal259=null;
        Token char_literal260=null;
        PddlParser.simpleDurationConstraint_return simpleDurationConstraint257 = null;

        PddlParser.simpleDurationConstraint_return simpleDurationConstraint261 = null;


        Object char_literal255_tree=null;
        Object string_literal256_tree=null;
        Object char_literal258_tree=null;
        Object char_literal259_tree=null;
        Object char_literal260_tree=null;

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:357:2: ( '(' 'and' ( simpleDurationConstraint )+ ')' | '(' ')' | simpleDurationConstraint )
            int alt58=3;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==55) ) {
                switch ( input.LA(2) ) {
                case 74:
                    {
                    alt58=1;
                    }
                    break;
                case 57:
                    {
                    alt58=2;
                    }
                    break;
                case 84:
                case 96:
                case 97:
                case 98:
                    {
                    alt58=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:357:4: '(' 'and' ( simpleDurationConstraint )+ ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal255=(Token)match(input,55,FOLLOW_55_in_durationConstraint2194); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal255_tree = (Object)adaptor.create(char_literal255);
                    adaptor.addChild(root_0, char_literal255_tree);
                    }
                    string_literal256=(Token)match(input,74,FOLLOW_74_in_durationConstraint2196); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal256_tree = (Object)adaptor.create(string_literal256);
                    adaptor.addChild(root_0, string_literal256_tree);
                    }
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:357:14: ( simpleDurationConstraint )+
                    int cnt57=0;
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==55) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: simpleDurationConstraint
                    	    {
                    	    pushFollow(FOLLOW_simpleDurationConstraint_in_durationConstraint2198);
                    	    simpleDurationConstraint257=simpleDurationConstraint();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleDurationConstraint257.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt57 >= 1 ) break loop57;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(57, input);
                                throw eee;
                        }
                        cnt57++;
                    } while (true);

                    char_literal258=(Token)match(input,57,FOLLOW_57_in_durationConstraint2201); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal258_tree = (Object)adaptor.create(char_literal258);
                    adaptor.addChild(root_0, char_literal258_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:358:4: '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal259=(Token)match(input,55,FOLLOW_55_in_durationConstraint2206); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal259_tree = (Object)adaptor.create(char_literal259);
                    adaptor.addChild(root_0, char_literal259_tree);
                    }
                    char_literal260=(Token)match(input,57,FOLLOW_57_in_durationConstraint2208); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal260_tree = (Object)adaptor.create(char_literal260);
                    adaptor.addChild(root_0, char_literal260_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:359:4: simpleDurationConstraint
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_simpleDurationConstraint_in_durationConstraint2213);
                    simpleDurationConstraint261=simpleDurationConstraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleDurationConstraint261.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "durationConstraint"

    public static class simpleDurationConstraint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleDurationConstraint"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:362:1: simpleDurationConstraint : ( '(' durOp '?duration' durValue ')' | '(' 'at' timeSpecifier simpleDurationConstraint ')' );
    public final PddlParser.simpleDurationConstraint_return simpleDurationConstraint() throws RecognitionException {
        PddlParser.simpleDurationConstraint_return retval = new PddlParser.simpleDurationConstraint_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal262=null;
        Token string_literal264=null;
        Token char_literal266=null;
        Token char_literal267=null;
        Token string_literal268=null;
        Token char_literal271=null;
        PddlParser.durOp_return durOp263 = null;

        PddlParser.durValue_return durValue265 = null;

        PddlParser.timeSpecifier_return timeSpecifier269 = null;

        PddlParser.simpleDurationConstraint_return simpleDurationConstraint270 = null;


        Object char_literal262_tree=null;
        Object string_literal264_tree=null;
        Object char_literal266_tree=null;
        Object char_literal267_tree=null;
        Object string_literal268_tree=null;
        Object char_literal271_tree=null;

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:363:2: ( '(' durOp '?duration' durValue ')' | '(' 'at' timeSpecifier simpleDurationConstraint ')' )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==55) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==84) ) {
                    alt59=2;
                }
                else if ( ((LA59_1>=96 && LA59_1<=98)) ) {
                    alt59=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:363:4: '(' durOp '?duration' durValue ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal262=(Token)match(input,55,FOLLOW_55_in_simpleDurationConstraint2224); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal262_tree = (Object)adaptor.create(char_literal262);
                    adaptor.addChild(root_0, char_literal262_tree);
                    }
                    pushFollow(FOLLOW_durOp_in_simpleDurationConstraint2226);
                    durOp263=durOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, durOp263.getTree());
                    string_literal264=(Token)match(input,104,FOLLOW_104_in_simpleDurationConstraint2228); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal264_tree = (Object)adaptor.create(string_literal264);
                    adaptor.addChild(root_0, string_literal264_tree);
                    }
                    pushFollow(FOLLOW_durValue_in_simpleDurationConstraint2230);
                    durValue265=durValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, durValue265.getTree());
                    char_literal266=(Token)match(input,57,FOLLOW_57_in_simpleDurationConstraint2232); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal266_tree = (Object)adaptor.create(char_literal266);
                    adaptor.addChild(root_0, char_literal266_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:364:4: '(' 'at' timeSpecifier simpleDurationConstraint ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal267=(Token)match(input,55,FOLLOW_55_in_simpleDurationConstraint2237); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal267_tree = (Object)adaptor.create(char_literal267);
                    adaptor.addChild(root_0, char_literal267_tree);
                    }
                    string_literal268=(Token)match(input,84,FOLLOW_84_in_simpleDurationConstraint2239); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal268_tree = (Object)adaptor.create(string_literal268);
                    adaptor.addChild(root_0, string_literal268_tree);
                    }
                    pushFollow(FOLLOW_timeSpecifier_in_simpleDurationConstraint2241);
                    timeSpecifier269=timeSpecifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeSpecifier269.getTree());
                    pushFollow(FOLLOW_simpleDurationConstraint_in_simpleDurationConstraint2243);
                    simpleDurationConstraint270=simpleDurationConstraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleDurationConstraint270.getTree());
                    char_literal271=(Token)match(input,57,FOLLOW_57_in_simpleDurationConstraint2245); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal271_tree = (Object)adaptor.create(char_literal271);
                    adaptor.addChild(root_0, char_literal271_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "simpleDurationConstraint"

    public static class durOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "durOp"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:367:1: durOp : ( '<=' | '>=' | '=' );
    public final PddlParser.durOp_return durOp() throws RecognitionException {
        PddlParser.durOp_return retval = new PddlParser.durOp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set272=null;

        Object set272_tree=null;

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:367:7: ( '<=' | '>=' | '=' )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:
            {
            root_0 = (Object)adaptor.nil();

            set272=(Token)input.LT(1);
            if ( (input.LA(1)>=96 && input.LA(1)<=98) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set272));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "durOp"

    public static class durValue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "durValue"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:369:1: durValue : ( NUMBER | fExp );
    public final PddlParser.durValue_return durValue() throws RecognitionException {
        PddlParser.durValue_return retval = new PddlParser.durValue_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NUMBER273=null;
        PddlParser.fExp_return fExp274 = null;


        Object NUMBER273_tree=null;

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:369:10: ( NUMBER | fExp )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==NUMBER) ) {
                int LA60_1 = input.LA(2);

                if ( (synpred89_Pddl()) ) {
                    alt60=1;
                }
                else if ( (true) ) {
                    alt60=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA60_0==NAME||LA60_0==55) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:369:12: NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    NUMBER273=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_durValue2272); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER273_tree = (Object)adaptor.create(NUMBER273);
                    adaptor.addChild(root_0, NUMBER273_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:369:21: fExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_fExp_in_durValue2276);
                    fExp274=fExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fExp274.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "durValue"

    public static class daEffect_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "daEffect"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:371:1: daEffect : ( '(' 'and' ( daEffect )* ')' | timedEffect | '(' 'forall' '(' typedVariableList ')' daEffect ')' | '(' 'when' daGD timedEffect ')' | '(' assignOp fHead fExpDA ')' );
    public final PddlParser.daEffect_return daEffect() throws RecognitionException {
        PddlParser.daEffect_return retval = new PddlParser.daEffect_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal275=null;
        Token string_literal276=null;
        Token char_literal278=null;
        Token char_literal280=null;
        Token string_literal281=null;
        Token char_literal282=null;
        Token char_literal284=null;
        Token char_literal286=null;
        Token char_literal287=null;
        Token string_literal288=null;
        Token char_literal291=null;
        Token char_literal292=null;
        Token char_literal296=null;
        PddlParser.daEffect_return daEffect277 = null;

        PddlParser.timedEffect_return timedEffect279 = null;

        PddlParser.typedVariableList_return typedVariableList283 = null;

        PddlParser.daEffect_return daEffect285 = null;

        PddlParser.daGD_return daGD289 = null;

        PddlParser.timedEffect_return timedEffect290 = null;

        PddlParser.assignOp_return assignOp293 = null;

        PddlParser.fHead_return fHead294 = null;

        PddlParser.fExpDA_return fExpDA295 = null;


        Object char_literal275_tree=null;
        Object string_literal276_tree=null;
        Object char_literal278_tree=null;
        Object char_literal280_tree=null;
        Object string_literal281_tree=null;
        Object char_literal282_tree=null;
        Object char_literal284_tree=null;
        Object char_literal286_tree=null;
        Object char_literal287_tree=null;
        Object string_literal288_tree=null;
        Object char_literal291_tree=null;
        Object char_literal292_tree=null;
        Object char_literal296_tree=null;

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:372:2: ( '(' 'and' ( daEffect )* ')' | timedEffect | '(' 'forall' '(' typedVariableList ')' daEffect ')' | '(' 'when' daGD timedEffect ')' | '(' assignOp fHead fExpDA ')' )
            int alt62=5;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==55) ) {
                int LA62_1 = input.LA(2);

                if ( (synpred91_Pddl()) ) {
                    alt62=1;
                }
                else if ( (synpred92_Pddl()) ) {
                    alt62=2;
                }
                else if ( (synpred93_Pddl()) ) {
                    alt62=3;
                }
                else if ( (synpred94_Pddl()) ) {
                    alt62=4;
                }
                else if ( (true) ) {
                    alt62=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:372:4: '(' 'and' ( daEffect )* ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal275=(Token)match(input,55,FOLLOW_55_in_daEffect2286); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal275_tree = (Object)adaptor.create(char_literal275);
                    adaptor.addChild(root_0, char_literal275_tree);
                    }
                    string_literal276=(Token)match(input,74,FOLLOW_74_in_daEffect2288); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal276_tree = (Object)adaptor.create(string_literal276);
                    adaptor.addChild(root_0, string_literal276_tree);
                    }
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:372:14: ( daEffect )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==55) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: daEffect
                    	    {
                    	    pushFollow(FOLLOW_daEffect_in_daEffect2290);
                    	    daEffect277=daEffect();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, daEffect277.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    char_literal278=(Token)match(input,57,FOLLOW_57_in_daEffect2293); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal278_tree = (Object)adaptor.create(char_literal278);
                    adaptor.addChild(root_0, char_literal278_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:373:4: timedEffect
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_timedEffect_in_daEffect2298);
                    timedEffect279=timedEffect();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timedEffect279.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:374:4: '(' 'forall' '(' typedVariableList ')' daEffect ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal280=(Token)match(input,55,FOLLOW_55_in_daEffect2303); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal280_tree = (Object)adaptor.create(char_literal280);
                    adaptor.addChild(root_0, char_literal280_tree);
                    }
                    string_literal281=(Token)match(input,79,FOLLOW_79_in_daEffect2305); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal281_tree = (Object)adaptor.create(string_literal281);
                    adaptor.addChild(root_0, string_literal281_tree);
                    }
                    char_literal282=(Token)match(input,55,FOLLOW_55_in_daEffect2307); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal282_tree = (Object)adaptor.create(char_literal282);
                    adaptor.addChild(root_0, char_literal282_tree);
                    }
                    pushFollow(FOLLOW_typedVariableList_in_daEffect2309);
                    typedVariableList283=typedVariableList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedVariableList283.getTree());
                    char_literal284=(Token)match(input,57,FOLLOW_57_in_daEffect2311); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal284_tree = (Object)adaptor.create(char_literal284);
                    adaptor.addChild(root_0, char_literal284_tree);
                    }
                    pushFollow(FOLLOW_daEffect_in_daEffect2313);
                    daEffect285=daEffect();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, daEffect285.getTree());
                    char_literal286=(Token)match(input,57,FOLLOW_57_in_daEffect2315); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal286_tree = (Object)adaptor.create(char_literal286);
                    adaptor.addChild(root_0, char_literal286_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:375:4: '(' 'when' daGD timedEffect ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal287=(Token)match(input,55,FOLLOW_55_in_daEffect2320); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal287_tree = (Object)adaptor.create(char_literal287);
                    adaptor.addChild(root_0, char_literal287_tree);
                    }
                    string_literal288=(Token)match(input,90,FOLLOW_90_in_daEffect2322); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal288_tree = (Object)adaptor.create(string_literal288);
                    adaptor.addChild(root_0, string_literal288_tree);
                    }
                    pushFollow(FOLLOW_daGD_in_daEffect2324);
                    daGD289=daGD();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, daGD289.getTree());
                    pushFollow(FOLLOW_timedEffect_in_daEffect2326);
                    timedEffect290=timedEffect();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timedEffect290.getTree());
                    char_literal291=(Token)match(input,57,FOLLOW_57_in_daEffect2328); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal291_tree = (Object)adaptor.create(char_literal291);
                    adaptor.addChild(root_0, char_literal291_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:376:4: '(' assignOp fHead fExpDA ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal292=(Token)match(input,55,FOLLOW_55_in_daEffect2333); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal292_tree = (Object)adaptor.create(char_literal292);
                    adaptor.addChild(root_0, char_literal292_tree);
                    }
                    pushFollow(FOLLOW_assignOp_in_daEffect2335);
                    assignOp293=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignOp293.getTree());
                    pushFollow(FOLLOW_fHead_in_daEffect2337);
                    fHead294=fHead();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fHead294.getTree());
                    pushFollow(FOLLOW_fExpDA_in_daEffect2339);
                    fExpDA295=fExpDA();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fExpDA295.getTree());
                    char_literal296=(Token)match(input,57,FOLLOW_57_in_daEffect2341); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal296_tree = (Object)adaptor.create(char_literal296);
                    adaptor.addChild(root_0, char_literal296_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "daEffect"

    public static class timedEffect_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timedEffect"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:379:1: timedEffect : ( '(' 'at' timeSpecifier daEffect ')' | '(' 'at' timeSpecifier fAssignDA ')' | '(' assignOp fHead fExp ')' );
    public final PddlParser.timedEffect_return timedEffect() throws RecognitionException {
        PddlParser.timedEffect_return retval = new PddlParser.timedEffect_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal297=null;
        Token string_literal298=null;
        Token char_literal301=null;
        Token char_literal302=null;
        Token string_literal303=null;
        Token char_literal306=null;
        Token char_literal307=null;
        Token char_literal311=null;
        PddlParser.timeSpecifier_return timeSpecifier299 = null;

        PddlParser.daEffect_return daEffect300 = null;

        PddlParser.timeSpecifier_return timeSpecifier304 = null;

        PddlParser.fAssignDA_return fAssignDA305 = null;

        PddlParser.assignOp_return assignOp308 = null;

        PddlParser.fHead_return fHead309 = null;

        PddlParser.fExp_return fExp310 = null;


        Object char_literal297_tree=null;
        Object string_literal298_tree=null;
        Object char_literal301_tree=null;
        Object char_literal302_tree=null;
        Object string_literal303_tree=null;
        Object char_literal306_tree=null;
        Object char_literal307_tree=null;
        Object char_literal311_tree=null;

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:380:2: ( '(' 'at' timeSpecifier daEffect ')' | '(' 'at' timeSpecifier fAssignDA ')' | '(' assignOp fHead fExp ')' )
            int alt63=3;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==55) ) {
                int LA63_1 = input.LA(2);

                if ( (synpred95_Pddl()) ) {
                    alt63=1;
                }
                else if ( (synpred96_Pddl()) ) {
                    alt63=2;
                }
                else if ( (true) ) {
                    alt63=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:380:4: '(' 'at' timeSpecifier daEffect ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal297=(Token)match(input,55,FOLLOW_55_in_timedEffect2352); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal297_tree = (Object)adaptor.create(char_literal297);
                    adaptor.addChild(root_0, char_literal297_tree);
                    }
                    string_literal298=(Token)match(input,84,FOLLOW_84_in_timedEffect2354); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal298_tree = (Object)adaptor.create(string_literal298);
                    adaptor.addChild(root_0, string_literal298_tree);
                    }
                    pushFollow(FOLLOW_timeSpecifier_in_timedEffect2356);
                    timeSpecifier299=timeSpecifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeSpecifier299.getTree());
                    pushFollow(FOLLOW_daEffect_in_timedEffect2358);
                    daEffect300=daEffect();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, daEffect300.getTree());
                    char_literal301=(Token)match(input,57,FOLLOW_57_in_timedEffect2360); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal301_tree = (Object)adaptor.create(char_literal301);
                    adaptor.addChild(root_0, char_literal301_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:381:4: '(' 'at' timeSpecifier fAssignDA ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal302=(Token)match(input,55,FOLLOW_55_in_timedEffect2370); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal302_tree = (Object)adaptor.create(char_literal302);
                    adaptor.addChild(root_0, char_literal302_tree);
                    }
                    string_literal303=(Token)match(input,84,FOLLOW_84_in_timedEffect2372); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal303_tree = (Object)adaptor.create(string_literal303);
                    adaptor.addChild(root_0, string_literal303_tree);
                    }
                    pushFollow(FOLLOW_timeSpecifier_in_timedEffect2374);
                    timeSpecifier304=timeSpecifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeSpecifier304.getTree());
                    pushFollow(FOLLOW_fAssignDA_in_timedEffect2376);
                    fAssignDA305=fAssignDA();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fAssignDA305.getTree());
                    char_literal306=(Token)match(input,57,FOLLOW_57_in_timedEffect2378); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal306_tree = (Object)adaptor.create(char_literal306);
                    adaptor.addChild(root_0, char_literal306_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:382:4: '(' assignOp fHead fExp ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal307=(Token)match(input,55,FOLLOW_55_in_timedEffect2383); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal307_tree = (Object)adaptor.create(char_literal307);
                    adaptor.addChild(root_0, char_literal307_tree);
                    }
                    pushFollow(FOLLOW_assignOp_in_timedEffect2385);
                    assignOp308=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignOp308.getTree());
                    pushFollow(FOLLOW_fHead_in_timedEffect2387);
                    fHead309=fHead();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fHead309.getTree());
                    pushFollow(FOLLOW_fExp_in_timedEffect2389);
                    fExp310=fExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fExp310.getTree());
                    char_literal311=(Token)match(input,57,FOLLOW_57_in_timedEffect2391); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal311_tree = (Object)adaptor.create(char_literal311);
                    adaptor.addChild(root_0, char_literal311_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "timedEffect"

    public static class fAssignDA_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fAssignDA"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:385:1: fAssignDA : '(' assignOp fHead fExpDA ')' ;
    public final PddlParser.fAssignDA_return fAssignDA() throws RecognitionException {
        PddlParser.fAssignDA_return retval = new PddlParser.fAssignDA_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal312=null;
        Token char_literal316=null;
        PddlParser.assignOp_return assignOp313 = null;

        PddlParser.fHead_return fHead314 = null;

        PddlParser.fExpDA_return fExpDA315 = null;


        Object char_literal312_tree=null;
        Object char_literal316_tree=null;

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:386:2: ( '(' assignOp fHead fExpDA ')' )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:386:4: '(' assignOp fHead fExpDA ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal312=(Token)match(input,55,FOLLOW_55_in_fAssignDA2411); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal312_tree = (Object)adaptor.create(char_literal312);
            adaptor.addChild(root_0, char_literal312_tree);
            }
            pushFollow(FOLLOW_assignOp_in_fAssignDA2413);
            assignOp313=assignOp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignOp313.getTree());
            pushFollow(FOLLOW_fHead_in_fAssignDA2415);
            fHead314=fHead();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, fHead314.getTree());
            pushFollow(FOLLOW_fExpDA_in_fAssignDA2417);
            fExpDA315=fExpDA();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, fExpDA315.getTree());
            char_literal316=(Token)match(input,57,FOLLOW_57_in_fAssignDA2419); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal316_tree = (Object)adaptor.create(char_literal316);
            adaptor.addChild(root_0, char_literal316_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fAssignDA"

    public static class fExpDA_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fExpDA"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:389:1: fExpDA : ( '(' ( ( binaryOp fExpDA fExpDA ) | ( '-' fExpDA ) ) ')' | '?duration' | fExp );
    public final PddlParser.fExpDA_return fExpDA() throws RecognitionException {
        PddlParser.fExpDA_return retval = new PddlParser.fExpDA_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal317=null;
        Token char_literal321=null;
        Token char_literal323=null;
        Token string_literal324=null;
        PddlParser.binaryOp_return binaryOp318 = null;

        PddlParser.fExpDA_return fExpDA319 = null;

        PddlParser.fExpDA_return fExpDA320 = null;

        PddlParser.fExpDA_return fExpDA322 = null;

        PddlParser.fExp_return fExp325 = null;


        Object char_literal317_tree=null;
        Object char_literal321_tree=null;
        Object char_literal323_tree=null;
        Object string_literal324_tree=null;

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:390:2: ( '(' ( ( binaryOp fExpDA fExpDA ) | ( '-' fExpDA ) ) ')' | '?duration' | fExp )
            int alt65=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                int LA65_1 = input.LA(2);

                if ( (synpred98_Pddl()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 1, input);

                    throw nvae;
                }
                }
                break;
            case 104:
                {
                alt65=2;
                }
                break;
            case NAME:
            case NUMBER:
                {
                alt65=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:390:4: '(' ( ( binaryOp fExpDA fExpDA ) | ( '-' fExpDA ) ) ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal317=(Token)match(input,55,FOLLOW_55_in_fExpDA2430); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal317_tree = (Object)adaptor.create(char_literal317);
                    adaptor.addChild(root_0, char_literal317_tree);
                    }
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:390:8: ( ( binaryOp fExpDA fExpDA ) | ( '-' fExpDA ) )
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==61) ) {
                        int LA64_1 = input.LA(2);

                        if ( (synpred97_Pddl()) ) {
                            alt64=1;
                        }
                        else if ( (true) ) {
                            alt64=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 64, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( ((LA64_0>=91 && LA64_0<=93)) ) {
                        alt64=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 0, input);

                        throw nvae;
                    }
                    switch (alt64) {
                        case 1 :
                            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:390:9: ( binaryOp fExpDA fExpDA )
                            {
                            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:390:9: ( binaryOp fExpDA fExpDA )
                            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:390:10: binaryOp fExpDA fExpDA
                            {
                            pushFollow(FOLLOW_binaryOp_in_fExpDA2434);
                            binaryOp318=binaryOp();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, binaryOp318.getTree());
                            pushFollow(FOLLOW_fExpDA_in_fExpDA2436);
                            fExpDA319=fExpDA();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, fExpDA319.getTree());
                            pushFollow(FOLLOW_fExpDA_in_fExpDA2438);
                            fExpDA320=fExpDA();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, fExpDA320.getTree());

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:390:36: ( '-' fExpDA )
                            {
                            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:390:36: ( '-' fExpDA )
                            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:390:37: '-' fExpDA
                            {
                            char_literal321=(Token)match(input,61,FOLLOW_61_in_fExpDA2444); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal321_tree = (Object)adaptor.create(char_literal321);
                            adaptor.addChild(root_0, char_literal321_tree);
                            }
                            pushFollow(FOLLOW_fExpDA_in_fExpDA2446);
                            fExpDA322=fExpDA();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, fExpDA322.getTree());

                            }


                            }
                            break;

                    }

                    char_literal323=(Token)match(input,57,FOLLOW_57_in_fExpDA2450); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal323_tree = (Object)adaptor.create(char_literal323);
                    adaptor.addChild(root_0, char_literal323_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:391:4: '?duration'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal324=(Token)match(input,104,FOLLOW_104_in_fExpDA2455); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal324_tree = (Object)adaptor.create(string_literal324);
                    adaptor.addChild(root_0, string_literal324_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:392:4: fExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_fExp_in_fExpDA2460);
                    fExp325=fExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fExp325.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fExpDA"

    public static class problem_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "problem"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:395:1: problem : '(' 'define' problemDecl problemDomain ( requireDef )? ( objectDecl )? init goal ( probConstraints )? ( metricSpec )? ')' -> ^( PROBLEM problemDecl problemDomain ( requireDef )? ( objectDecl )? init goal ( probConstraints )? ( metricSpec )? ) ;
    public final PddlParser.problem_return problem() throws RecognitionException {
        PddlParser.problem_return retval = new PddlParser.problem_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal326=null;
        Token string_literal327=null;
        Token char_literal336=null;
        PddlParser.problemDecl_return problemDecl328 = null;

        PddlParser.problemDomain_return problemDomain329 = null;

        PddlParser.requireDef_return requireDef330 = null;

        PddlParser.objectDecl_return objectDecl331 = null;

        PddlParser.init_return init332 = null;

        PddlParser.goal_return goal333 = null;

        PddlParser.probConstraints_return probConstraints334 = null;

        PddlParser.metricSpec_return metricSpec335 = null;


        Object char_literal326_tree=null;
        Object string_literal327_tree=null;
        Object char_literal336_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleSubtreeStream stream_metricSpec=new RewriteRuleSubtreeStream(adaptor,"rule metricSpec");
        RewriteRuleSubtreeStream stream_objectDecl=new RewriteRuleSubtreeStream(adaptor,"rule objectDecl");
        RewriteRuleSubtreeStream stream_problemDecl=new RewriteRuleSubtreeStream(adaptor,"rule problemDecl");
        RewriteRuleSubtreeStream stream_probConstraints=new RewriteRuleSubtreeStream(adaptor,"rule probConstraints");
        RewriteRuleSubtreeStream stream_requireDef=new RewriteRuleSubtreeStream(adaptor,"rule requireDef");
        RewriteRuleSubtreeStream stream_init=new RewriteRuleSubtreeStream(adaptor,"rule init");
        RewriteRuleSubtreeStream stream_problemDomain=new RewriteRuleSubtreeStream(adaptor,"rule problemDomain");
        RewriteRuleSubtreeStream stream_goal=new RewriteRuleSubtreeStream(adaptor,"rule goal");
        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:398:2: ( '(' 'define' problemDecl problemDomain ( requireDef )? ( objectDecl )? init goal ( probConstraints )? ( metricSpec )? ')' -> ^( PROBLEM problemDecl problemDomain ( requireDef )? ( objectDecl )? init goal ( probConstraints )? ( metricSpec )? ) )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:398:4: '(' 'define' problemDecl problemDomain ( requireDef )? ( objectDecl )? init goal ( probConstraints )? ( metricSpec )? ')'
            {
            char_literal326=(Token)match(input,55,FOLLOW_55_in_problem2474); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal326);

            string_literal327=(Token)match(input,56,FOLLOW_56_in_problem2476); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_56.add(string_literal327);

            pushFollow(FOLLOW_problemDecl_in_problem2478);
            problemDecl328=problemDecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_problemDecl.add(problemDecl328.getTree());
            pushFollow(FOLLOW_problemDomain_in_problem2483);
            problemDomain329=problemDomain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_problemDomain.add(problemDomain329.getTree());
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:400:7: ( requireDef )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==55) ) {
                int LA66_1 = input.LA(2);

                if ( (LA66_1==59) ) {
                    alt66=1;
                }
            }
            switch (alt66) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: requireDef
                    {
                    pushFollow(FOLLOW_requireDef_in_problem2491);
                    requireDef330=requireDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_requireDef.add(requireDef330.getTree());

                    }
                    break;

            }

            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:401:7: ( objectDecl )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==55) ) {
                int LA67_1 = input.LA(2);

                if ( (LA67_1==107) ) {
                    alt67=1;
                }
            }
            switch (alt67) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: objectDecl
                    {
                    pushFollow(FOLLOW_objectDecl_in_problem2500);
                    objectDecl331=objectDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_objectDecl.add(objectDecl331.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_init_in_problem2509);
            init332=init();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_init.add(init332.getTree());
            pushFollow(FOLLOW_goal_in_problem2517);
            goal333=goal();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_goal.add(goal333.getTree());
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:404:7: ( probConstraints )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==55) ) {
                int LA68_1 = input.LA(2);

                if ( (LA68_1==67) ) {
                    alt68=1;
                }
            }
            switch (alt68) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: probConstraints
                    {
                    pushFollow(FOLLOW_probConstraints_in_problem2525);
                    probConstraints334=probConstraints();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_probConstraints.add(probConstraints334.getTree());

                    }
                    break;

            }

            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:405:7: ( metricSpec )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==55) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: metricSpec
                    {
                    pushFollow(FOLLOW_metricSpec_in_problem2534);
                    metricSpec335=metricSpec();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_metricSpec.add(metricSpec335.getTree());

                    }
                    break;

            }

            char_literal336=(Token)match(input,57,FOLLOW_57_in_problem2550); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_57.add(char_literal336);



            // AST REWRITE
            // elements: metricSpec, init, problemDecl, goal, probConstraints, problemDomain, objectDecl, requireDef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 408:7: -> ^( PROBLEM problemDecl problemDomain ( requireDef )? ( objectDecl )? init goal ( probConstraints )? ( metricSpec )? )
            {
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:408:10: ^( PROBLEM problemDecl problemDomain ( requireDef )? ( objectDecl )? init goal ( probConstraints )? ( metricSpec )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROBLEM, "PROBLEM"), root_1);

                adaptor.addChild(root_1, stream_problemDecl.nextTree());
                adaptor.addChild(root_1, stream_problemDomain.nextTree());
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:408:46: ( requireDef )?
                if ( stream_requireDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_requireDef.nextTree());

                }
                stream_requireDef.reset();
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:408:58: ( objectDecl )?
                if ( stream_objectDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_objectDecl.nextTree());

                }
                stream_objectDecl.reset();
                adaptor.addChild(root_1, stream_init.nextTree());
                adaptor.addChild(root_1, stream_goal.nextTree());
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:409:19: ( probConstraints )?
                if ( stream_probConstraints.hasNext() ) {
                    adaptor.addChild(root_1, stream_probConstraints.nextTree());

                }
                stream_probConstraints.reset();
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:409:36: ( metricSpec )?
                if ( stream_metricSpec.hasNext() ) {
                    adaptor.addChild(root_1, stream_metricSpec.nextTree());

                }
                stream_metricSpec.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "problem"

    public static class problemDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "problemDecl"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:412:1: problemDecl : '(' 'problem' NAME ')' -> ^( PROBLEM_NAME NAME ) ;
    public final PddlParser.problemDecl_return problemDecl() throws RecognitionException {
        PddlParser.problemDecl_return retval = new PddlParser.problemDecl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal337=null;
        Token string_literal338=null;
        Token NAME339=null;
        Token char_literal340=null;

        Object char_literal337_tree=null;
        Object string_literal338_tree=null;
        Object NAME339_tree=null;
        Object char_literal340_tree=null;
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:413:5: ( '(' 'problem' NAME ')' -> ^( PROBLEM_NAME NAME ) )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:413:7: '(' 'problem' NAME ')'
            {
            char_literal337=(Token)match(input,55,FOLLOW_55_in_problemDecl2607); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal337);

            string_literal338=(Token)match(input,105,FOLLOW_105_in_problemDecl2609); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_105.add(string_literal338);

            NAME339=(Token)match(input,NAME,FOLLOW_NAME_in_problemDecl2611); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NAME.add(NAME339);

            char_literal340=(Token)match(input,57,FOLLOW_57_in_problemDecl2613); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_57.add(char_literal340);



            // AST REWRITE
            // elements: NAME
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 414:5: -> ^( PROBLEM_NAME NAME )
            {
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:414:8: ^( PROBLEM_NAME NAME )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROBLEM_NAME, "PROBLEM_NAME"), root_1);

                adaptor.addChild(root_1, stream_NAME.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "problemDecl"

    public static class problemDomain_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "problemDomain"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:417:1: problemDomain : '(' ':domain' NAME ')' -> ^( PROBLEM_DOMAIN NAME ) ;
    public final PddlParser.problemDomain_return problemDomain() throws RecognitionException {
        PddlParser.problemDomain_return retval = new PddlParser.problemDomain_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal341=null;
        Token string_literal342=null;
        Token NAME343=null;
        Token char_literal344=null;

        Object char_literal341_tree=null;
        Object string_literal342_tree=null;
        Object NAME343_tree=null;
        Object char_literal344_tree=null;
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:418:2: ( '(' ':domain' NAME ')' -> ^( PROBLEM_DOMAIN NAME ) )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:418:4: '(' ':domain' NAME ')'
            {
            char_literal341=(Token)match(input,55,FOLLOW_55_in_problemDomain2639); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal341);

            string_literal342=(Token)match(input,106,FOLLOW_106_in_problemDomain2641); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_106.add(string_literal342);

            NAME343=(Token)match(input,NAME,FOLLOW_NAME_in_problemDomain2643); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NAME.add(NAME343);

            char_literal344=(Token)match(input,57,FOLLOW_57_in_problemDomain2645); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_57.add(char_literal344);



            // AST REWRITE
            // elements: NAME
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 419:2: -> ^( PROBLEM_DOMAIN NAME )
            {
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:419:5: ^( PROBLEM_DOMAIN NAME )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROBLEM_DOMAIN, "PROBLEM_DOMAIN"), root_1);

                adaptor.addChild(root_1, stream_NAME.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "problemDomain"

    public static class objectDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objectDecl"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:422:1: objectDecl : '(' ':objects' typedNameList ')' -> ^( OBJECTS typedNameList ) ;
    public final PddlParser.objectDecl_return objectDecl() throws RecognitionException {
        PddlParser.objectDecl_return retval = new PddlParser.objectDecl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal345=null;
        Token string_literal346=null;
        Token char_literal348=null;
        PddlParser.typedNameList_return typedNameList347 = null;


        Object char_literal345_tree=null;
        Object string_literal346_tree=null;
        Object char_literal348_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleSubtreeStream stream_typedNameList=new RewriteRuleSubtreeStream(adaptor,"rule typedNameList");
        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:423:2: ( '(' ':objects' typedNameList ')' -> ^( OBJECTS typedNameList ) )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:423:4: '(' ':objects' typedNameList ')'
            {
            char_literal345=(Token)match(input,55,FOLLOW_55_in_objectDecl2665); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal345);

            string_literal346=(Token)match(input,107,FOLLOW_107_in_objectDecl2667); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_107.add(string_literal346);

            pushFollow(FOLLOW_typedNameList_in_objectDecl2669);
            typedNameList347=typedNameList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typedNameList.add(typedNameList347.getTree());
            char_literal348=(Token)match(input,57,FOLLOW_57_in_objectDecl2671); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_57.add(char_literal348);



            // AST REWRITE
            // elements: typedNameList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 424:2: -> ^( OBJECTS typedNameList )
            {
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:424:5: ^( OBJECTS typedNameList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OBJECTS, "OBJECTS"), root_1);

                adaptor.addChild(root_1, stream_typedNameList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "objectDecl"

    public static class init_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "init"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:427:1: init : '(' ':init' ( initEl )* ')' -> ^( INIT ( initEl )* ) ;
    public final PddlParser.init_return init() throws RecognitionException {
        PddlParser.init_return retval = new PddlParser.init_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal349=null;
        Token string_literal350=null;
        Token char_literal352=null;
        PddlParser.initEl_return initEl351 = null;


        Object char_literal349_tree=null;
        Object string_literal350_tree=null;
        Object char_literal352_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleSubtreeStream stream_initEl=new RewriteRuleSubtreeStream(adaptor,"rule initEl");
        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:428:2: ( '(' ':init' ( initEl )* ')' -> ^( INIT ( initEl )* ) )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:428:4: '(' ':init' ( initEl )* ')'
            {
            char_literal349=(Token)match(input,55,FOLLOW_55_in_init2691); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal349);

            string_literal350=(Token)match(input,108,FOLLOW_108_in_init2693); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_108.add(string_literal350);

            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:428:16: ( initEl )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==55) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: initEl
            	    {
            	    pushFollow(FOLLOW_initEl_in_init2695);
            	    initEl351=initEl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_initEl.add(initEl351.getTree());

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

            char_literal352=(Token)match(input,57,FOLLOW_57_in_init2698); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_57.add(char_literal352);



            // AST REWRITE
            // elements: initEl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 429:2: -> ^( INIT ( initEl )* )
            {
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:429:5: ^( INIT ( initEl )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INIT, "INIT"), root_1);

                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:429:12: ( initEl )*
                while ( stream_initEl.hasNext() ) {
                    adaptor.addChild(root_1, stream_initEl.nextTree());

                }
                stream_initEl.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "init"

    public static class initEl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "initEl"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:432:1: initEl : ( nameLiteral | '(' '=' fHead NUMBER ')' -> ^( INIT_EQ fHead NUMBER ) | '(' 'at' NUMBER nameLiteral ')' -> ^( INIT_AT NUMBER nameLiteral ) );
    public final PddlParser.initEl_return initEl() throws RecognitionException {
        PddlParser.initEl_return retval = new PddlParser.initEl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal354=null;
        Token char_literal355=null;
        Token NUMBER357=null;
        Token char_literal358=null;
        Token char_literal359=null;
        Token string_literal360=null;
        Token NUMBER361=null;
        Token char_literal363=null;
        PddlParser.nameLiteral_return nameLiteral353 = null;

        PddlParser.fHead_return fHead356 = null;

        PddlParser.nameLiteral_return nameLiteral362 = null;


        Object char_literal354_tree=null;
        Object char_literal355_tree=null;
        Object NUMBER357_tree=null;
        Object char_literal358_tree=null;
        Object char_literal359_tree=null;
        Object string_literal360_tree=null;
        Object NUMBER361_tree=null;
        Object char_literal363_tree=null;
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");
        RewriteRuleSubtreeStream stream_fHead=new RewriteRuleSubtreeStream(adaptor,"rule fHead");
        RewriteRuleSubtreeStream stream_nameLiteral=new RewriteRuleSubtreeStream(adaptor,"rule nameLiteral");
        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:433:2: ( nameLiteral | '(' '=' fHead NUMBER ')' -> ^( INIT_EQ fHead NUMBER ) | '(' 'at' NUMBER nameLiteral ')' -> ^( INIT_AT NUMBER nameLiteral ) )
            int alt71=3;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==55) ) {
                switch ( input.LA(2) ) {
                case NAME:
                case 76:
                    {
                    alt71=1;
                    }
                    break;
                case 96:
                    {
                    alt71=2;
                    }
                    break;
                case 84:
                    {
                    alt71=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:433:4: nameLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_nameLiteral_in_initEl2719);
                    nameLiteral353=nameLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nameLiteral353.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:434:4: '(' '=' fHead NUMBER ')'
                    {
                    char_literal354=(Token)match(input,55,FOLLOW_55_in_initEl2724); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal354);

                    char_literal355=(Token)match(input,96,FOLLOW_96_in_initEl2726); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_96.add(char_literal355);

                    pushFollow(FOLLOW_fHead_in_initEl2728);
                    fHead356=fHead();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fHead.add(fHead356.getTree());
                    NUMBER357=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_initEl2730); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NUMBER.add(NUMBER357);

                    char_literal358=(Token)match(input,57,FOLLOW_57_in_initEl2732); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_57.add(char_literal358);



                    // AST REWRITE
                    // elements: NUMBER, fHead
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 434:37: -> ^( INIT_EQ fHead NUMBER )
                    {
                        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:434:40: ^( INIT_EQ fHead NUMBER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INIT_EQ, "INIT_EQ"), root_1);

                        adaptor.addChild(root_1, stream_fHead.nextTree());
                        adaptor.addChild(root_1, stream_NUMBER.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:435:4: '(' 'at' NUMBER nameLiteral ')'
                    {
                    char_literal359=(Token)match(input,55,FOLLOW_55_in_initEl2755); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal359);

                    string_literal360=(Token)match(input,84,FOLLOW_84_in_initEl2757); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_84.add(string_literal360);

                    NUMBER361=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_initEl2759); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NUMBER.add(NUMBER361);

                    pushFollow(FOLLOW_nameLiteral_in_initEl2761);
                    nameLiteral362=nameLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_nameLiteral.add(nameLiteral362.getTree());
                    char_literal363=(Token)match(input,57,FOLLOW_57_in_initEl2763); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_57.add(char_literal363);



                    // AST REWRITE
                    // elements: nameLiteral, NUMBER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 435:37: -> ^( INIT_AT NUMBER nameLiteral )
                    {
                        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:435:40: ^( INIT_AT NUMBER nameLiteral )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INIT_AT, "INIT_AT"), root_1);

                        adaptor.addChild(root_1, stream_NUMBER.nextNode());
                        adaptor.addChild(root_1, stream_nameLiteral.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "initEl"

    public static class nameLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nameLiteral"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:438:1: nameLiteral : ( atomicNameFormula | '(' 'not' atomicNameFormula ')' -> ^( NOT_PRED_INIT atomicNameFormula ) );
    public final PddlParser.nameLiteral_return nameLiteral() throws RecognitionException {
        PddlParser.nameLiteral_return retval = new PddlParser.nameLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal365=null;
        Token string_literal366=null;
        Token char_literal368=null;
        PddlParser.atomicNameFormula_return atomicNameFormula364 = null;

        PddlParser.atomicNameFormula_return atomicNameFormula367 = null;


        Object char_literal365_tree=null;
        Object string_literal366_tree=null;
        Object char_literal368_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_atomicNameFormula=new RewriteRuleSubtreeStream(adaptor,"rule atomicNameFormula");
        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:439:2: ( atomicNameFormula | '(' 'not' atomicNameFormula ')' -> ^( NOT_PRED_INIT atomicNameFormula ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==55) ) {
                int LA72_1 = input.LA(2);

                if ( (LA72_1==76) ) {
                    alt72=2;
                }
                else if ( (LA72_1==NAME) ) {
                    alt72=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:439:4: atomicNameFormula
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_atomicNameFormula_in_nameLiteral2785);
                    atomicNameFormula364=atomicNameFormula();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atomicNameFormula364.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:440:4: '(' 'not' atomicNameFormula ')'
                    {
                    char_literal365=(Token)match(input,55,FOLLOW_55_in_nameLiteral2790); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal365);

                    string_literal366=(Token)match(input,76,FOLLOW_76_in_nameLiteral2792); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_76.add(string_literal366);

                    pushFollow(FOLLOW_atomicNameFormula_in_nameLiteral2794);
                    atomicNameFormula367=atomicNameFormula();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_atomicNameFormula.add(atomicNameFormula367.getTree());
                    char_literal368=(Token)match(input,57,FOLLOW_57_in_nameLiteral2796); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_57.add(char_literal368);



                    // AST REWRITE
                    // elements: atomicNameFormula
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 440:36: -> ^( NOT_PRED_INIT atomicNameFormula )
                    {
                        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:440:39: ^( NOT_PRED_INIT atomicNameFormula )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT_PRED_INIT, "NOT_PRED_INIT"), root_1);

                        adaptor.addChild(root_1, stream_atomicNameFormula.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "nameLiteral"

    public static class atomicNameFormula_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atomicNameFormula"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:443:1: atomicNameFormula : '(' predicate ( NAME )* ')' -> ^( PRED_INST predicate ( NAME )* ) ;
    public final PddlParser.atomicNameFormula_return atomicNameFormula() throws RecognitionException {
        PddlParser.atomicNameFormula_return retval = new PddlParser.atomicNameFormula_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal369=null;
        Token NAME371=null;
        Token char_literal372=null;
        PddlParser.predicate_return predicate370 = null;


        Object char_literal369_tree=null;
        Object NAME371_tree=null;
        Object char_literal372_tree=null;
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");
        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:444:2: ( '(' predicate ( NAME )* ')' -> ^( PRED_INST predicate ( NAME )* ) )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:444:4: '(' predicate ( NAME )* ')'
            {
            char_literal369=(Token)match(input,55,FOLLOW_55_in_atomicNameFormula2815); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal369);

            pushFollow(FOLLOW_predicate_in_atomicNameFormula2817);
            predicate370=predicate();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_predicate.add(predicate370.getTree());
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:444:18: ( NAME )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==NAME) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: NAME
            	    {
            	    NAME371=(Token)match(input,NAME,FOLLOW_NAME_in_atomicNameFormula2819); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NAME.add(NAME371);


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            char_literal372=(Token)match(input,57,FOLLOW_57_in_atomicNameFormula2822); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_57.add(char_literal372);



            // AST REWRITE
            // elements: NAME, predicate
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 444:28: -> ^( PRED_INST predicate ( NAME )* )
            {
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:444:31: ^( PRED_INST predicate ( NAME )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PRED_INST, "PRED_INST"), root_1);

                adaptor.addChild(root_1, stream_predicate.nextTree());
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:444:53: ( NAME )*
                while ( stream_NAME.hasNext() ) {
                    adaptor.addChild(root_1, stream_NAME.nextNode());

                }
                stream_NAME.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atomicNameFormula"

    public static class goal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "goal"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:451:1: goal : '(' ':goal' goalDesc ')' -> ^( GOAL goalDesc ) ;
    public final PddlParser.goal_return goal() throws RecognitionException {
        PddlParser.goal_return retval = new PddlParser.goal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal373=null;
        Token string_literal374=null;
        Token char_literal376=null;
        PddlParser.goalDesc_return goalDesc375 = null;


        Object char_literal373_tree=null;
        Object string_literal374_tree=null;
        Object char_literal376_tree=null;
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleSubtreeStream stream_goalDesc=new RewriteRuleSubtreeStream(adaptor,"rule goalDesc");
        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:451:6: ( '(' ':goal' goalDesc ')' -> ^( GOAL goalDesc ) )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:451:8: '(' ':goal' goalDesc ')'
            {
            char_literal373=(Token)match(input,55,FOLLOW_55_in_goal2847); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal373);

            string_literal374=(Token)match(input,109,FOLLOW_109_in_goal2849); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_109.add(string_literal374);

            pushFollow(FOLLOW_goalDesc_in_goal2851);
            goalDesc375=goalDesc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc375.getTree());
            char_literal376=(Token)match(input,57,FOLLOW_57_in_goal2853); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_57.add(char_literal376);



            // AST REWRITE
            // elements: goalDesc
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 451:33: -> ^( GOAL goalDesc )
            {
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:451:36: ^( GOAL goalDesc )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(GOAL, "GOAL"), root_1);

                adaptor.addChild(root_1, stream_goalDesc.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "goal"

    public static class probConstraints_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "probConstraints"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:453:1: probConstraints : '(' ':constraints' prefConGD ')' -> ^( PROBLEM_CONSTRAINT prefConGD ) ;
    public final PddlParser.probConstraints_return probConstraints() throws RecognitionException {
        PddlParser.probConstraints_return retval = new PddlParser.probConstraints_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal377=null;
        Token string_literal378=null;
        Token char_literal380=null;
        PddlParser.prefConGD_return prefConGD379 = null;


        Object char_literal377_tree=null;
        Object string_literal378_tree=null;
        Object char_literal380_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleSubtreeStream stream_prefConGD=new RewriteRuleSubtreeStream(adaptor,"rule prefConGD");
        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:454:2: ( '(' ':constraints' prefConGD ')' -> ^( PROBLEM_CONSTRAINT prefConGD ) )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:454:4: '(' ':constraints' prefConGD ')'
            {
            char_literal377=(Token)match(input,55,FOLLOW_55_in_probConstraints2871); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal377);

            string_literal378=(Token)match(input,67,FOLLOW_67_in_probConstraints2873); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_67.add(string_literal378);

            pushFollow(FOLLOW_prefConGD_in_probConstraints2876);
            prefConGD379=prefConGD();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_prefConGD.add(prefConGD379.getTree());
            char_literal380=(Token)match(input,57,FOLLOW_57_in_probConstraints2878); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_57.add(char_literal380);



            // AST REWRITE
            // elements: prefConGD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 455:4: -> ^( PROBLEM_CONSTRAINT prefConGD )
            {
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:455:7: ^( PROBLEM_CONSTRAINT prefConGD )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROBLEM_CONSTRAINT, "PROBLEM_CONSTRAINT"), root_1);

                adaptor.addChild(root_1, stream_prefConGD.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "probConstraints"

    public static class prefConGD_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prefConGD"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:458:1: prefConGD : ( '(' 'and' ( prefConGD )* ')' | '(' 'forall' '(' typedVariableList ')' prefConGD ')' | '(' 'preference' ( NAME )? conGD ')' | conGD );
    public final PddlParser.prefConGD_return prefConGD() throws RecognitionException {
        PddlParser.prefConGD_return retval = new PddlParser.prefConGD_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal381=null;
        Token string_literal382=null;
        Token char_literal384=null;
        Token char_literal385=null;
        Token string_literal386=null;
        Token char_literal387=null;
        Token char_literal389=null;
        Token char_literal391=null;
        Token char_literal392=null;
        Token string_literal393=null;
        Token NAME394=null;
        Token char_literal396=null;
        PddlParser.prefConGD_return prefConGD383 = null;

        PddlParser.typedVariableList_return typedVariableList388 = null;

        PddlParser.prefConGD_return prefConGD390 = null;

        PddlParser.conGD_return conGD395 = null;

        PddlParser.conGD_return conGD397 = null;


        Object char_literal381_tree=null;
        Object string_literal382_tree=null;
        Object char_literal384_tree=null;
        Object char_literal385_tree=null;
        Object string_literal386_tree=null;
        Object char_literal387_tree=null;
        Object char_literal389_tree=null;
        Object char_literal391_tree=null;
        Object char_literal392_tree=null;
        Object string_literal393_tree=null;
        Object NAME394_tree=null;
        Object char_literal396_tree=null;

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:459:2: ( '(' 'and' ( prefConGD )* ')' | '(' 'forall' '(' typedVariableList ')' prefConGD ')' | '(' 'preference' ( NAME )? conGD ')' | conGD )
            int alt76=4;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==55) ) {
                int LA76_1 = input.LA(2);

                if ( (synpred110_Pddl()) ) {
                    alt76=1;
                }
                else if ( (synpred111_Pddl()) ) {
                    alt76=2;
                }
                else if ( (synpred113_Pddl()) ) {
                    alt76=3;
                }
                else if ( (true) ) {
                    alt76=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 76, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:459:4: '(' 'and' ( prefConGD )* ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal381=(Token)match(input,55,FOLLOW_55_in_prefConGD2900); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal381_tree = (Object)adaptor.create(char_literal381);
                    adaptor.addChild(root_0, char_literal381_tree);
                    }
                    string_literal382=(Token)match(input,74,FOLLOW_74_in_prefConGD2902); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal382_tree = (Object)adaptor.create(string_literal382);
                    adaptor.addChild(root_0, string_literal382_tree);
                    }
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:459:14: ( prefConGD )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==55) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: prefConGD
                    	    {
                    	    pushFollow(FOLLOW_prefConGD_in_prefConGD2904);
                    	    prefConGD383=prefConGD();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefConGD383.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);

                    char_literal384=(Token)match(input,57,FOLLOW_57_in_prefConGD2907); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal384_tree = (Object)adaptor.create(char_literal384);
                    adaptor.addChild(root_0, char_literal384_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:460:4: '(' 'forall' '(' typedVariableList ')' prefConGD ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal385=(Token)match(input,55,FOLLOW_55_in_prefConGD2912); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal385_tree = (Object)adaptor.create(char_literal385);
                    adaptor.addChild(root_0, char_literal385_tree);
                    }
                    string_literal386=(Token)match(input,79,FOLLOW_79_in_prefConGD2914); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal386_tree = (Object)adaptor.create(string_literal386);
                    adaptor.addChild(root_0, string_literal386_tree);
                    }
                    char_literal387=(Token)match(input,55,FOLLOW_55_in_prefConGD2916); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal387_tree = (Object)adaptor.create(char_literal387);
                    adaptor.addChild(root_0, char_literal387_tree);
                    }
                    pushFollow(FOLLOW_typedVariableList_in_prefConGD2918);
                    typedVariableList388=typedVariableList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedVariableList388.getTree());
                    char_literal389=(Token)match(input,57,FOLLOW_57_in_prefConGD2920); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal389_tree = (Object)adaptor.create(char_literal389);
                    adaptor.addChild(root_0, char_literal389_tree);
                    }
                    pushFollow(FOLLOW_prefConGD_in_prefConGD2922);
                    prefConGD390=prefConGD();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefConGD390.getTree());
                    char_literal391=(Token)match(input,57,FOLLOW_57_in_prefConGD2924); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal391_tree = (Object)adaptor.create(char_literal391);
                    adaptor.addChild(root_0, char_literal391_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:461:4: '(' 'preference' ( NAME )? conGD ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal392=(Token)match(input,55,FOLLOW_55_in_prefConGD2929); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal392_tree = (Object)adaptor.create(char_literal392);
                    adaptor.addChild(root_0, char_literal392_tree);
                    }
                    string_literal393=(Token)match(input,83,FOLLOW_83_in_prefConGD2931); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal393_tree = (Object)adaptor.create(string_literal393);
                    adaptor.addChild(root_0, string_literal393_tree);
                    }
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:461:21: ( NAME )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==NAME) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: NAME
                            {
                            NAME394=(Token)match(input,NAME,FOLLOW_NAME_in_prefConGD2933); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            NAME394_tree = (Object)adaptor.create(NAME394);
                            adaptor.addChild(root_0, NAME394_tree);
                            }

                            }
                            break;

                    }

                    pushFollow(FOLLOW_conGD_in_prefConGD2936);
                    conGD395=conGD();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conGD395.getTree());
                    char_literal396=(Token)match(input,57,FOLLOW_57_in_prefConGD2938); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal396_tree = (Object)adaptor.create(char_literal396);
                    adaptor.addChild(root_0, char_literal396_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:462:4: conGD
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_conGD_in_prefConGD2943);
                    conGD397=conGD();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conGD397.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prefConGD"

    public static class metricSpec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "metricSpec"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:465:1: metricSpec : '(' ':metric' optimization metricFExp ')' -> ^( PROBLEM_METRIC optimization metricFExp ) ;
    public final PddlParser.metricSpec_return metricSpec() throws RecognitionException {
        PddlParser.metricSpec_return retval = new PddlParser.metricSpec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal398=null;
        Token string_literal399=null;
        Token char_literal402=null;
        PddlParser.optimization_return optimization400 = null;

        PddlParser.metricFExp_return metricFExp401 = null;


        Object char_literal398_tree=null;
        Object string_literal399_tree=null;
        Object char_literal402_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleSubtreeStream stream_optimization=new RewriteRuleSubtreeStream(adaptor,"rule optimization");
        RewriteRuleSubtreeStream stream_metricFExp=new RewriteRuleSubtreeStream(adaptor,"rule metricFExp");
        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:466:2: ( '(' ':metric' optimization metricFExp ')' -> ^( PROBLEM_METRIC optimization metricFExp ) )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:466:4: '(' ':metric' optimization metricFExp ')'
            {
            char_literal398=(Token)match(input,55,FOLLOW_55_in_metricSpec2954); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal398);

            string_literal399=(Token)match(input,110,FOLLOW_110_in_metricSpec2956); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_110.add(string_literal399);

            pushFollow(FOLLOW_optimization_in_metricSpec2958);
            optimization400=optimization();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_optimization.add(optimization400.getTree());
            pushFollow(FOLLOW_metricFExp_in_metricSpec2960);
            metricFExp401=metricFExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_metricFExp.add(metricFExp401.getTree());
            char_literal402=(Token)match(input,57,FOLLOW_57_in_metricSpec2962); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_57.add(char_literal402);



            // AST REWRITE
            // elements: metricFExp, optimization
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 467:4: -> ^( PROBLEM_METRIC optimization metricFExp )
            {
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:467:7: ^( PROBLEM_METRIC optimization metricFExp )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROBLEM_METRIC, "PROBLEM_METRIC"), root_1);

                adaptor.addChild(root_1, stream_optimization.nextTree());
                adaptor.addChild(root_1, stream_metricFExp.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "metricSpec"

    public static class optimization_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "optimization"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:470:1: optimization : ( 'minimize' | 'maximize' );
    public final PddlParser.optimization_return optimization() throws RecognitionException {
        PddlParser.optimization_return retval = new PddlParser.optimization_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set403=null;

        Object set403_tree=null;

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:470:14: ( 'minimize' | 'maximize' )
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:
            {
            root_0 = (Object)adaptor.nil();

            set403=(Token)input.LT(1);
            if ( (input.LA(1)>=111 && input.LA(1)<=112) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set403));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "optimization"

    public static class metricFExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "metricFExp"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:472:1: metricFExp : ( '(' binaryOp metricFExp metricFExp ')' | '(' ( '*' | '/' ) metricFExp ( metricFExp )+ ')' | '(' '-' metricFExp ')' | NUMBER | '(' functionSymbol ( NAME )* ')' | functionSymbol | 'total-time' | '(' 'is-violated' NAME ')' );
    public final PddlParser.metricFExp_return metricFExp() throws RecognitionException {
        PddlParser.metricFExp_return retval = new PddlParser.metricFExp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal404=null;
        Token char_literal408=null;
        Token char_literal409=null;
        Token set410=null;
        Token char_literal413=null;
        Token char_literal414=null;
        Token char_literal415=null;
        Token char_literal417=null;
        Token NUMBER418=null;
        Token char_literal419=null;
        Token NAME421=null;
        Token char_literal422=null;
        Token string_literal424=null;
        Token char_literal425=null;
        Token string_literal426=null;
        Token NAME427=null;
        Token char_literal428=null;
        PddlParser.binaryOp_return binaryOp405 = null;

        PddlParser.metricFExp_return metricFExp406 = null;

        PddlParser.metricFExp_return metricFExp407 = null;

        PddlParser.metricFExp_return metricFExp411 = null;

        PddlParser.metricFExp_return metricFExp412 = null;

        PddlParser.metricFExp_return metricFExp416 = null;

        PddlParser.functionSymbol_return functionSymbol420 = null;

        PddlParser.functionSymbol_return functionSymbol423 = null;


        Object char_literal404_tree=null;
        Object char_literal408_tree=null;
        Object char_literal409_tree=null;
        Object set410_tree=null;
        Object char_literal413_tree=null;
        Object char_literal414_tree=null;
        Object char_literal415_tree=null;
        Object char_literal417_tree=null;
        Object NUMBER418_tree=null;
        Object char_literal419_tree=null;
        Object NAME421_tree=null;
        Object char_literal422_tree=null;
        Object string_literal424_tree=null;
        Object char_literal425_tree=null;
        Object string_literal426_tree=null;
        Object NAME427_tree=null;
        Object char_literal428_tree=null;

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:473:2: ( '(' binaryOp metricFExp metricFExp ')' | '(' ( '*' | '/' ) metricFExp ( metricFExp )+ ')' | '(' '-' metricFExp ')' | NUMBER | '(' functionSymbol ( NAME )* ')' | functionSymbol | 'total-time' | '(' 'is-violated' NAME ')' )
            int alt79=8;
            alt79 = dfa79.predict(input);
            switch (alt79) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:473:4: '(' binaryOp metricFExp metricFExp ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal404=(Token)match(input,55,FOLLOW_55_in_metricFExp2999); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal404_tree = (Object)adaptor.create(char_literal404);
                    adaptor.addChild(root_0, char_literal404_tree);
                    }
                    pushFollow(FOLLOW_binaryOp_in_metricFExp3001);
                    binaryOp405=binaryOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, binaryOp405.getTree());
                    pushFollow(FOLLOW_metricFExp_in_metricFExp3003);
                    metricFExp406=metricFExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, metricFExp406.getTree());
                    pushFollow(FOLLOW_metricFExp_in_metricFExp3005);
                    metricFExp407=metricFExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, metricFExp407.getTree());
                    char_literal408=(Token)match(input,57,FOLLOW_57_in_metricFExp3007); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal408_tree = (Object)adaptor.create(char_literal408);
                    adaptor.addChild(root_0, char_literal408_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:474:4: '(' ( '*' | '/' ) metricFExp ( metricFExp )+ ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal409=(Token)match(input,55,FOLLOW_55_in_metricFExp3012); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal409_tree = (Object)adaptor.create(char_literal409);
                    adaptor.addChild(root_0, char_literal409_tree);
                    }
                    set410=(Token)input.LT(1);
                    if ( input.LA(1)==91||input.LA(1)==93 ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set410));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_metricFExp_in_metricFExp3020);
                    metricFExp411=metricFExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, metricFExp411.getTree());
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:474:29: ( metricFExp )+
                    int cnt77=0;
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==NAME||LA77_0==NUMBER||LA77_0==55||LA77_0==113) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: metricFExp
                    	    {
                    	    pushFollow(FOLLOW_metricFExp_in_metricFExp3022);
                    	    metricFExp412=metricFExp();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, metricFExp412.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt77 >= 1 ) break loop77;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(77, input);
                                throw eee;
                        }
                        cnt77++;
                    } while (true);

                    char_literal413=(Token)match(input,57,FOLLOW_57_in_metricFExp3025); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal413_tree = (Object)adaptor.create(char_literal413);
                    adaptor.addChild(root_0, char_literal413_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:475:4: '(' '-' metricFExp ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal414=(Token)match(input,55,FOLLOW_55_in_metricFExp3030); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal414_tree = (Object)adaptor.create(char_literal414);
                    adaptor.addChild(root_0, char_literal414_tree);
                    }
                    char_literal415=(Token)match(input,61,FOLLOW_61_in_metricFExp3032); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal415_tree = (Object)adaptor.create(char_literal415);
                    adaptor.addChild(root_0, char_literal415_tree);
                    }
                    pushFollow(FOLLOW_metricFExp_in_metricFExp3034);
                    metricFExp416=metricFExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, metricFExp416.getTree());
                    char_literal417=(Token)match(input,57,FOLLOW_57_in_metricFExp3036); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal417_tree = (Object)adaptor.create(char_literal417);
                    adaptor.addChild(root_0, char_literal417_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:476:4: NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    NUMBER418=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_metricFExp3041); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER418_tree = (Object)adaptor.create(NUMBER418);
                    adaptor.addChild(root_0, NUMBER418_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:477:4: '(' functionSymbol ( NAME )* ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal419=(Token)match(input,55,FOLLOW_55_in_metricFExp3046); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal419_tree = (Object)adaptor.create(char_literal419);
                    adaptor.addChild(root_0, char_literal419_tree);
                    }
                    pushFollow(FOLLOW_functionSymbol_in_metricFExp3048);
                    functionSymbol420=functionSymbol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionSymbol420.getTree());
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:477:23: ( NAME )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==NAME) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: NAME
                    	    {
                    	    NAME421=(Token)match(input,NAME,FOLLOW_NAME_in_metricFExp3050); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    NAME421_tree = (Object)adaptor.create(NAME421);
                    	    adaptor.addChild(root_0, NAME421_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);

                    char_literal422=(Token)match(input,57,FOLLOW_57_in_metricFExp3053); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal422_tree = (Object)adaptor.create(char_literal422);
                    adaptor.addChild(root_0, char_literal422_tree);
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:478:4: functionSymbol
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionSymbol_in_metricFExp3058);
                    functionSymbol423=functionSymbol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionSymbol423.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:479:7: 'total-time'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal424=(Token)match(input,113,FOLLOW_113_in_metricFExp3066); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal424_tree = (Object)adaptor.create(string_literal424);
                    adaptor.addChild(root_0, string_literal424_tree);
                    }

                    }
                    break;
                case 8 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:480:4: '(' 'is-violated' NAME ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal425=(Token)match(input,55,FOLLOW_55_in_metricFExp3071); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal425_tree = (Object)adaptor.create(char_literal425);
                    adaptor.addChild(root_0, char_literal425_tree);
                    }
                    string_literal426=(Token)match(input,114,FOLLOW_114_in_metricFExp3073); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal426_tree = (Object)adaptor.create(string_literal426);
                    adaptor.addChild(root_0, string_literal426_tree);
                    }
                    NAME427=(Token)match(input,NAME,FOLLOW_NAME_in_metricFExp3075); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME427_tree = (Object)adaptor.create(NAME427);
                    adaptor.addChild(root_0, NAME427_tree);
                    }
                    char_literal428=(Token)match(input,57,FOLLOW_57_in_metricFExp3077); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal428_tree = (Object)adaptor.create(char_literal428);
                    adaptor.addChild(root_0, char_literal428_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "metricFExp"

    public static class conGD_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conGD"
    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:483:1: conGD : ( '(' 'and' ( conGD )* ')' | '(' 'forall' '(' typedVariableList ')' conGD ')' | '(' 'at' 'end' goalDesc ')' | '(' 'always' goalDesc ')' | '(' 'sometime' goalDesc ')' | '(' 'within' NUMBER goalDesc ')' | '(' 'at-most-once' goalDesc ')' | '(' 'sometime-after' goalDesc goalDesc ')' | '(' 'sometime-before' goalDesc goalDesc ')' | '(' 'always-within' NUMBER goalDesc goalDesc ')' | '(' 'hold-during' NUMBER NUMBER goalDesc ')' | '(' 'hold-after' NUMBER goalDesc ')' );
    public final PddlParser.conGD_return conGD() throws RecognitionException {
        PddlParser.conGD_return retval = new PddlParser.conGD_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal429=null;
        Token string_literal430=null;
        Token char_literal432=null;
        Token char_literal433=null;
        Token string_literal434=null;
        Token char_literal435=null;
        Token char_literal437=null;
        Token char_literal439=null;
        Token char_literal440=null;
        Token string_literal441=null;
        Token string_literal442=null;
        Token char_literal444=null;
        Token char_literal445=null;
        Token string_literal446=null;
        Token char_literal448=null;
        Token char_literal449=null;
        Token string_literal450=null;
        Token char_literal452=null;
        Token char_literal453=null;
        Token string_literal454=null;
        Token NUMBER455=null;
        Token char_literal457=null;
        Token char_literal458=null;
        Token string_literal459=null;
        Token char_literal461=null;
        Token char_literal462=null;
        Token string_literal463=null;
        Token char_literal466=null;
        Token char_literal467=null;
        Token string_literal468=null;
        Token char_literal471=null;
        Token char_literal472=null;
        Token string_literal473=null;
        Token NUMBER474=null;
        Token char_literal477=null;
        Token char_literal478=null;
        Token string_literal479=null;
        Token NUMBER480=null;
        Token NUMBER481=null;
        Token char_literal483=null;
        Token char_literal484=null;
        Token string_literal485=null;
        Token NUMBER486=null;
        Token char_literal488=null;
        PddlParser.conGD_return conGD431 = null;

        PddlParser.typedVariableList_return typedVariableList436 = null;

        PddlParser.conGD_return conGD438 = null;

        PddlParser.goalDesc_return goalDesc443 = null;

        PddlParser.goalDesc_return goalDesc447 = null;

        PddlParser.goalDesc_return goalDesc451 = null;

        PddlParser.goalDesc_return goalDesc456 = null;

        PddlParser.goalDesc_return goalDesc460 = null;

        PddlParser.goalDesc_return goalDesc464 = null;

        PddlParser.goalDesc_return goalDesc465 = null;

        PddlParser.goalDesc_return goalDesc469 = null;

        PddlParser.goalDesc_return goalDesc470 = null;

        PddlParser.goalDesc_return goalDesc475 = null;

        PddlParser.goalDesc_return goalDesc476 = null;

        PddlParser.goalDesc_return goalDesc482 = null;

        PddlParser.goalDesc_return goalDesc487 = null;


        Object char_literal429_tree=null;
        Object string_literal430_tree=null;
        Object char_literal432_tree=null;
        Object char_literal433_tree=null;
        Object string_literal434_tree=null;
        Object char_literal435_tree=null;
        Object char_literal437_tree=null;
        Object char_literal439_tree=null;
        Object char_literal440_tree=null;
        Object string_literal441_tree=null;
        Object string_literal442_tree=null;
        Object char_literal444_tree=null;
        Object char_literal445_tree=null;
        Object string_literal446_tree=null;
        Object char_literal448_tree=null;
        Object char_literal449_tree=null;
        Object string_literal450_tree=null;
        Object char_literal452_tree=null;
        Object char_literal453_tree=null;
        Object string_literal454_tree=null;
        Object NUMBER455_tree=null;
        Object char_literal457_tree=null;
        Object char_literal458_tree=null;
        Object string_literal459_tree=null;
        Object char_literal461_tree=null;
        Object char_literal462_tree=null;
        Object string_literal463_tree=null;
        Object char_literal466_tree=null;
        Object char_literal467_tree=null;
        Object string_literal468_tree=null;
        Object char_literal471_tree=null;
        Object char_literal472_tree=null;
        Object string_literal473_tree=null;
        Object NUMBER474_tree=null;
        Object char_literal477_tree=null;
        Object char_literal478_tree=null;
        Object string_literal479_tree=null;
        Object NUMBER480_tree=null;
        Object NUMBER481_tree=null;
        Object char_literal483_tree=null;
        Object char_literal484_tree=null;
        Object string_literal485_tree=null;
        Object NUMBER486_tree=null;
        Object char_literal488_tree=null;

        try {
            // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:486:2: ( '(' 'and' ( conGD )* ')' | '(' 'forall' '(' typedVariableList ')' conGD ')' | '(' 'at' 'end' goalDesc ')' | '(' 'always' goalDesc ')' | '(' 'sometime' goalDesc ')' | '(' 'within' NUMBER goalDesc ')' | '(' 'at-most-once' goalDesc ')' | '(' 'sometime-after' goalDesc goalDesc ')' | '(' 'sometime-before' goalDesc goalDesc ')' | '(' 'always-within' NUMBER goalDesc goalDesc ')' | '(' 'hold-during' NUMBER NUMBER goalDesc ')' | '(' 'hold-after' NUMBER goalDesc ')' )
            int alt81=12;
            alt81 = dfa81.predict(input);
            switch (alt81) {
                case 1 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:486:4: '(' 'and' ( conGD )* ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal429=(Token)match(input,55,FOLLOW_55_in_conGD3091); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal429_tree = (Object)adaptor.create(char_literal429);
                    adaptor.addChild(root_0, char_literal429_tree);
                    }
                    string_literal430=(Token)match(input,74,FOLLOW_74_in_conGD3093); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal430_tree = (Object)adaptor.create(string_literal430);
                    adaptor.addChild(root_0, string_literal430_tree);
                    }
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:486:14: ( conGD )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==55) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: conGD
                    	    {
                    	    pushFollow(FOLLOW_conGD_in_conGD3095);
                    	    conGD431=conGD();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, conGD431.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);

                    char_literal432=(Token)match(input,57,FOLLOW_57_in_conGD3098); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal432_tree = (Object)adaptor.create(char_literal432);
                    adaptor.addChild(root_0, char_literal432_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:487:4: '(' 'forall' '(' typedVariableList ')' conGD ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal433=(Token)match(input,55,FOLLOW_55_in_conGD3103); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal433_tree = (Object)adaptor.create(char_literal433);
                    adaptor.addChild(root_0, char_literal433_tree);
                    }
                    string_literal434=(Token)match(input,79,FOLLOW_79_in_conGD3105); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal434_tree = (Object)adaptor.create(string_literal434);
                    adaptor.addChild(root_0, string_literal434_tree);
                    }
                    char_literal435=(Token)match(input,55,FOLLOW_55_in_conGD3107); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal435_tree = (Object)adaptor.create(char_literal435);
                    adaptor.addChild(root_0, char_literal435_tree);
                    }
                    pushFollow(FOLLOW_typedVariableList_in_conGD3109);
                    typedVariableList436=typedVariableList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedVariableList436.getTree());
                    char_literal437=(Token)match(input,57,FOLLOW_57_in_conGD3111); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal437_tree = (Object)adaptor.create(char_literal437);
                    adaptor.addChild(root_0, char_literal437_tree);
                    }
                    pushFollow(FOLLOW_conGD_in_conGD3113);
                    conGD438=conGD();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conGD438.getTree());
                    char_literal439=(Token)match(input,57,FOLLOW_57_in_conGD3115); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal439_tree = (Object)adaptor.create(char_literal439);
                    adaptor.addChild(root_0, char_literal439_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:488:4: '(' 'at' 'end' goalDesc ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal440=(Token)match(input,55,FOLLOW_55_in_conGD3120); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal440_tree = (Object)adaptor.create(char_literal440);
                    adaptor.addChild(root_0, char_literal440_tree);
                    }
                    string_literal441=(Token)match(input,84,FOLLOW_84_in_conGD3122); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal441_tree = (Object)adaptor.create(string_literal441);
                    adaptor.addChild(root_0, string_literal441_tree);
                    }
                    string_literal442=(Token)match(input,87,FOLLOW_87_in_conGD3124); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal442_tree = (Object)adaptor.create(string_literal442);
                    adaptor.addChild(root_0, string_literal442_tree);
                    }
                    pushFollow(FOLLOW_goalDesc_in_conGD3126);
                    goalDesc443=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc443.getTree());
                    char_literal444=(Token)match(input,57,FOLLOW_57_in_conGD3128); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal444_tree = (Object)adaptor.create(char_literal444);
                    adaptor.addChild(root_0, char_literal444_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:489:7: '(' 'always' goalDesc ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal445=(Token)match(input,55,FOLLOW_55_in_conGD3136); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal445_tree = (Object)adaptor.create(char_literal445);
                    adaptor.addChild(root_0, char_literal445_tree);
                    }
                    string_literal446=(Token)match(input,115,FOLLOW_115_in_conGD3138); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal446_tree = (Object)adaptor.create(string_literal446);
                    adaptor.addChild(root_0, string_literal446_tree);
                    }
                    pushFollow(FOLLOW_goalDesc_in_conGD3140);
                    goalDesc447=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc447.getTree());
                    char_literal448=(Token)match(input,57,FOLLOW_57_in_conGD3142); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal448_tree = (Object)adaptor.create(char_literal448);
                    adaptor.addChild(root_0, char_literal448_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:490:4: '(' 'sometime' goalDesc ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal449=(Token)match(input,55,FOLLOW_55_in_conGD3147); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal449_tree = (Object)adaptor.create(char_literal449);
                    adaptor.addChild(root_0, char_literal449_tree);
                    }
                    string_literal450=(Token)match(input,116,FOLLOW_116_in_conGD3149); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal450_tree = (Object)adaptor.create(string_literal450);
                    adaptor.addChild(root_0, string_literal450_tree);
                    }
                    pushFollow(FOLLOW_goalDesc_in_conGD3151);
                    goalDesc451=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc451.getTree());
                    char_literal452=(Token)match(input,57,FOLLOW_57_in_conGD3153); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal452_tree = (Object)adaptor.create(char_literal452);
                    adaptor.addChild(root_0, char_literal452_tree);
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:491:5: '(' 'within' NUMBER goalDesc ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal453=(Token)match(input,55,FOLLOW_55_in_conGD3159); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal453_tree = (Object)adaptor.create(char_literal453);
                    adaptor.addChild(root_0, char_literal453_tree);
                    }
                    string_literal454=(Token)match(input,117,FOLLOW_117_in_conGD3161); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal454_tree = (Object)adaptor.create(string_literal454);
                    adaptor.addChild(root_0, string_literal454_tree);
                    }
                    NUMBER455=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_conGD3163); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER455_tree = (Object)adaptor.create(NUMBER455);
                    adaptor.addChild(root_0, NUMBER455_tree);
                    }
                    pushFollow(FOLLOW_goalDesc_in_conGD3165);
                    goalDesc456=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc456.getTree());
                    char_literal457=(Token)match(input,57,FOLLOW_57_in_conGD3167); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal457_tree = (Object)adaptor.create(char_literal457);
                    adaptor.addChild(root_0, char_literal457_tree);
                    }

                    }
                    break;
                case 7 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:492:4: '(' 'at-most-once' goalDesc ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal458=(Token)match(input,55,FOLLOW_55_in_conGD3172); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal458_tree = (Object)adaptor.create(char_literal458);
                    adaptor.addChild(root_0, char_literal458_tree);
                    }
                    string_literal459=(Token)match(input,118,FOLLOW_118_in_conGD3174); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal459_tree = (Object)adaptor.create(string_literal459);
                    adaptor.addChild(root_0, string_literal459_tree);
                    }
                    pushFollow(FOLLOW_goalDesc_in_conGD3176);
                    goalDesc460=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc460.getTree());
                    char_literal461=(Token)match(input,57,FOLLOW_57_in_conGD3178); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal461_tree = (Object)adaptor.create(char_literal461);
                    adaptor.addChild(root_0, char_literal461_tree);
                    }

                    }
                    break;
                case 8 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:493:4: '(' 'sometime-after' goalDesc goalDesc ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal462=(Token)match(input,55,FOLLOW_55_in_conGD3183); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal462_tree = (Object)adaptor.create(char_literal462);
                    adaptor.addChild(root_0, char_literal462_tree);
                    }
                    string_literal463=(Token)match(input,119,FOLLOW_119_in_conGD3185); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal463_tree = (Object)adaptor.create(string_literal463);
                    adaptor.addChild(root_0, string_literal463_tree);
                    }
                    pushFollow(FOLLOW_goalDesc_in_conGD3187);
                    goalDesc464=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc464.getTree());
                    pushFollow(FOLLOW_goalDesc_in_conGD3189);
                    goalDesc465=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc465.getTree());
                    char_literal466=(Token)match(input,57,FOLLOW_57_in_conGD3191); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal466_tree = (Object)adaptor.create(char_literal466);
                    adaptor.addChild(root_0, char_literal466_tree);
                    }

                    }
                    break;
                case 9 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:494:4: '(' 'sometime-before' goalDesc goalDesc ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal467=(Token)match(input,55,FOLLOW_55_in_conGD3196); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal467_tree = (Object)adaptor.create(char_literal467);
                    adaptor.addChild(root_0, char_literal467_tree);
                    }
                    string_literal468=(Token)match(input,120,FOLLOW_120_in_conGD3198); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal468_tree = (Object)adaptor.create(string_literal468);
                    adaptor.addChild(root_0, string_literal468_tree);
                    }
                    pushFollow(FOLLOW_goalDesc_in_conGD3200);
                    goalDesc469=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc469.getTree());
                    pushFollow(FOLLOW_goalDesc_in_conGD3202);
                    goalDesc470=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc470.getTree());
                    char_literal471=(Token)match(input,57,FOLLOW_57_in_conGD3204); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal471_tree = (Object)adaptor.create(char_literal471);
                    adaptor.addChild(root_0, char_literal471_tree);
                    }

                    }
                    break;
                case 10 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:495:4: '(' 'always-within' NUMBER goalDesc goalDesc ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal472=(Token)match(input,55,FOLLOW_55_in_conGD3209); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal472_tree = (Object)adaptor.create(char_literal472);
                    adaptor.addChild(root_0, char_literal472_tree);
                    }
                    string_literal473=(Token)match(input,121,FOLLOW_121_in_conGD3211); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal473_tree = (Object)adaptor.create(string_literal473);
                    adaptor.addChild(root_0, string_literal473_tree);
                    }
                    NUMBER474=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_conGD3213); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER474_tree = (Object)adaptor.create(NUMBER474);
                    adaptor.addChild(root_0, NUMBER474_tree);
                    }
                    pushFollow(FOLLOW_goalDesc_in_conGD3215);
                    goalDesc475=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc475.getTree());
                    pushFollow(FOLLOW_goalDesc_in_conGD3217);
                    goalDesc476=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc476.getTree());
                    char_literal477=(Token)match(input,57,FOLLOW_57_in_conGD3219); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal477_tree = (Object)adaptor.create(char_literal477);
                    adaptor.addChild(root_0, char_literal477_tree);
                    }

                    }
                    break;
                case 11 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:496:4: '(' 'hold-during' NUMBER NUMBER goalDesc ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal478=(Token)match(input,55,FOLLOW_55_in_conGD3224); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal478_tree = (Object)adaptor.create(char_literal478);
                    adaptor.addChild(root_0, char_literal478_tree);
                    }
                    string_literal479=(Token)match(input,122,FOLLOW_122_in_conGD3226); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal479_tree = (Object)adaptor.create(string_literal479);
                    adaptor.addChild(root_0, string_literal479_tree);
                    }
                    NUMBER480=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_conGD3228); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER480_tree = (Object)adaptor.create(NUMBER480);
                    adaptor.addChild(root_0, NUMBER480_tree);
                    }
                    NUMBER481=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_conGD3230); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER481_tree = (Object)adaptor.create(NUMBER481);
                    adaptor.addChild(root_0, NUMBER481_tree);
                    }
                    pushFollow(FOLLOW_goalDesc_in_conGD3232);
                    goalDesc482=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc482.getTree());
                    char_literal483=(Token)match(input,57,FOLLOW_57_in_conGD3234); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal483_tree = (Object)adaptor.create(char_literal483);
                    adaptor.addChild(root_0, char_literal483_tree);
                    }

                    }
                    break;
                case 12 :
                    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:497:4: '(' 'hold-after' NUMBER goalDesc ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal484=(Token)match(input,55,FOLLOW_55_in_conGD3239); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal484_tree = (Object)adaptor.create(char_literal484);
                    adaptor.addChild(root_0, char_literal484_tree);
                    }
                    string_literal485=(Token)match(input,123,FOLLOW_123_in_conGD3241); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal485_tree = (Object)adaptor.create(string_literal485);
                    adaptor.addChild(root_0, string_literal485_tree);
                    }
                    NUMBER486=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_conGD3243); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER486_tree = (Object)adaptor.create(NUMBER486);
                    adaptor.addChild(root_0, NUMBER486_tree);
                    }
                    pushFollow(FOLLOW_goalDesc_in_conGD3245);
                    goalDesc487=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc487.getTree());
                    char_literal488=(Token)match(input,57,FOLLOW_57_in_conGD3247); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal488_tree = (Object)adaptor.create(char_literal488);
                    adaptor.addChild(root_0, char_literal488_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "conGD"

    // $ANTLR start synpred17_Pddl
    public final void synpred17_Pddl_fragment() throws RecognitionException {   
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:147:5: ( atomicFunctionSkeleton )
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:147:5: atomicFunctionSkeleton
        {
        pushFollow(FOLLOW_atomicFunctionSkeleton_in_synpred17_Pddl726);
        atomicFunctionSkeleton();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_Pddl

    // $ANTLR start synpred28_Pddl
    public final void synpred28_Pddl_fragment() throws RecognitionException {   
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:199:25: ( ( '(' ')' ) )
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:199:25: ( '(' ')' )
        {
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:199:25: ( '(' ')' )
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:199:26: '(' ')'
        {
        match(input,55,FOLLOW_55_in_synpred28_Pddl1006); if (state.failed) return ;
        match(input,57,FOLLOW_57_in_synpred28_Pddl1008); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_Pddl

    // $ANTLR start synpred60_Pddl
    public final void synpred60_Pddl_fragment() throws RecognitionException {   
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:304:4: ( '(' binaryOp fExp fExp2 ')' )
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:304:4: '(' binaryOp fExp fExp2 ')'
        {
        match(input,55,FOLLOW_55_in_synpred60_Pddl1816); if (state.failed) return ;
        pushFollow(FOLLOW_binaryOp_in_synpred60_Pddl1818);
        binaryOp();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_fExp_in_synpred60_Pddl1820);
        fExp();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_fExp2_in_synpred60_Pddl1822);
        fExp2();

        state._fsp--;
        if (state.failed) return ;
        match(input,57,FOLLOW_57_in_synpred60_Pddl1824); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_Pddl

    // $ANTLR start synpred61_Pddl
    public final void synpred61_Pddl_fragment() throws RecognitionException {   
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:305:4: ( '(' '-' fExp ')' )
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:305:4: '(' '-' fExp ')'
        {
        match(input,55,FOLLOW_55_in_synpred61_Pddl1841); if (state.failed) return ;
        match(input,61,FOLLOW_61_in_synpred61_Pddl1843); if (state.failed) return ;
        pushFollow(FOLLOW_fExp_in_synpred61_Pddl1845);
        fExp();

        state._fsp--;
        if (state.failed) return ;
        match(input,57,FOLLOW_57_in_synpred61_Pddl1847); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_Pddl

    // $ANTLR start synpred89_Pddl
    public final void synpred89_Pddl_fragment() throws RecognitionException {   
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:369:12: ( NUMBER )
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:369:12: NUMBER
        {
        match(input,NUMBER,FOLLOW_NUMBER_in_synpred89_Pddl2272); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred89_Pddl

    // $ANTLR start synpred91_Pddl
    public final void synpred91_Pddl_fragment() throws RecognitionException {   
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:372:4: ( '(' 'and' ( daEffect )* ')' )
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:372:4: '(' 'and' ( daEffect )* ')'
        {
        match(input,55,FOLLOW_55_in_synpred91_Pddl2286); if (state.failed) return ;
        match(input,74,FOLLOW_74_in_synpred91_Pddl2288); if (state.failed) return ;
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:372:14: ( daEffect )*
        loop99:
        do {
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==55) ) {
                alt99=1;
            }


            switch (alt99) {
        	case 1 :
        	    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: daEffect
        	    {
        	    pushFollow(FOLLOW_daEffect_in_synpred91_Pddl2290);
        	    daEffect();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop99;
            }
        } while (true);

        match(input,57,FOLLOW_57_in_synpred91_Pddl2293); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred91_Pddl

    // $ANTLR start synpred92_Pddl
    public final void synpred92_Pddl_fragment() throws RecognitionException {   
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:373:4: ( timedEffect )
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:373:4: timedEffect
        {
        pushFollow(FOLLOW_timedEffect_in_synpred92_Pddl2298);
        timedEffect();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred92_Pddl

    // $ANTLR start synpred93_Pddl
    public final void synpred93_Pddl_fragment() throws RecognitionException {   
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:374:4: ( '(' 'forall' '(' typedVariableList ')' daEffect ')' )
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:374:4: '(' 'forall' '(' typedVariableList ')' daEffect ')'
        {
        match(input,55,FOLLOW_55_in_synpred93_Pddl2303); if (state.failed) return ;
        match(input,79,FOLLOW_79_in_synpred93_Pddl2305); if (state.failed) return ;
        match(input,55,FOLLOW_55_in_synpred93_Pddl2307); if (state.failed) return ;
        pushFollow(FOLLOW_typedVariableList_in_synpred93_Pddl2309);
        typedVariableList();

        state._fsp--;
        if (state.failed) return ;
        match(input,57,FOLLOW_57_in_synpred93_Pddl2311); if (state.failed) return ;
        pushFollow(FOLLOW_daEffect_in_synpred93_Pddl2313);
        daEffect();

        state._fsp--;
        if (state.failed) return ;
        match(input,57,FOLLOW_57_in_synpred93_Pddl2315); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred93_Pddl

    // $ANTLR start synpred94_Pddl
    public final void synpred94_Pddl_fragment() throws RecognitionException {   
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:375:4: ( '(' 'when' daGD timedEffect ')' )
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:375:4: '(' 'when' daGD timedEffect ')'
        {
        match(input,55,FOLLOW_55_in_synpred94_Pddl2320); if (state.failed) return ;
        match(input,90,FOLLOW_90_in_synpred94_Pddl2322); if (state.failed) return ;
        pushFollow(FOLLOW_daGD_in_synpred94_Pddl2324);
        daGD();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_timedEffect_in_synpred94_Pddl2326);
        timedEffect();

        state._fsp--;
        if (state.failed) return ;
        match(input,57,FOLLOW_57_in_synpred94_Pddl2328); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred94_Pddl

    // $ANTLR start synpred95_Pddl
    public final void synpred95_Pddl_fragment() throws RecognitionException {   
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:380:4: ( '(' 'at' timeSpecifier daEffect ')' )
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:380:4: '(' 'at' timeSpecifier daEffect ')'
        {
        match(input,55,FOLLOW_55_in_synpred95_Pddl2352); if (state.failed) return ;
        match(input,84,FOLLOW_84_in_synpred95_Pddl2354); if (state.failed) return ;
        pushFollow(FOLLOW_timeSpecifier_in_synpred95_Pddl2356);
        timeSpecifier();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_daEffect_in_synpred95_Pddl2358);
        daEffect();

        state._fsp--;
        if (state.failed) return ;
        match(input,57,FOLLOW_57_in_synpred95_Pddl2360); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred95_Pddl

    // $ANTLR start synpred96_Pddl
    public final void synpred96_Pddl_fragment() throws RecognitionException {   
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:381:4: ( '(' 'at' timeSpecifier fAssignDA ')' )
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:381:4: '(' 'at' timeSpecifier fAssignDA ')'
        {
        match(input,55,FOLLOW_55_in_synpred96_Pddl2370); if (state.failed) return ;
        match(input,84,FOLLOW_84_in_synpred96_Pddl2372); if (state.failed) return ;
        pushFollow(FOLLOW_timeSpecifier_in_synpred96_Pddl2374);
        timeSpecifier();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_fAssignDA_in_synpred96_Pddl2376);
        fAssignDA();

        state._fsp--;
        if (state.failed) return ;
        match(input,57,FOLLOW_57_in_synpred96_Pddl2378); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred96_Pddl

    // $ANTLR start synpred97_Pddl
    public final void synpred97_Pddl_fragment() throws RecognitionException {   
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:390:9: ( ( binaryOp fExpDA fExpDA ) )
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:390:9: ( binaryOp fExpDA fExpDA )
        {
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:390:9: ( binaryOp fExpDA fExpDA )
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:390:10: binaryOp fExpDA fExpDA
        {
        pushFollow(FOLLOW_binaryOp_in_synpred97_Pddl2434);
        binaryOp();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_fExpDA_in_synpred97_Pddl2436);
        fExpDA();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_fExpDA_in_synpred97_Pddl2438);
        fExpDA();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred97_Pddl

    // $ANTLR start synpred98_Pddl
    public final void synpred98_Pddl_fragment() throws RecognitionException {   
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:390:4: ( '(' ( ( binaryOp fExpDA fExpDA ) | ( '-' fExpDA ) ) ')' )
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:390:4: '(' ( ( binaryOp fExpDA fExpDA ) | ( '-' fExpDA ) ) ')'
        {
        match(input,55,FOLLOW_55_in_synpred98_Pddl2430); if (state.failed) return ;
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:390:8: ( ( binaryOp fExpDA fExpDA ) | ( '-' fExpDA ) )
        int alt100=2;
        int LA100_0 = input.LA(1);

        if ( (LA100_0==61) ) {
            int LA100_1 = input.LA(2);

            if ( (synpred97_Pddl()) ) {
                alt100=1;
            }
            else if ( (true) ) {
                alt100=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 1, input);

                throw nvae;
            }
        }
        else if ( ((LA100_0>=91 && LA100_0<=93)) ) {
            alt100=1;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 100, 0, input);

            throw nvae;
        }
        switch (alt100) {
            case 1 :
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:390:9: ( binaryOp fExpDA fExpDA )
                {
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:390:9: ( binaryOp fExpDA fExpDA )
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:390:10: binaryOp fExpDA fExpDA
                {
                pushFollow(FOLLOW_binaryOp_in_synpred98_Pddl2434);
                binaryOp();

                state._fsp--;
                if (state.failed) return ;
                pushFollow(FOLLOW_fExpDA_in_synpred98_Pddl2436);
                fExpDA();

                state._fsp--;
                if (state.failed) return ;
                pushFollow(FOLLOW_fExpDA_in_synpred98_Pddl2438);
                fExpDA();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:390:36: ( '-' fExpDA )
                {
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:390:36: ( '-' fExpDA )
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:390:37: '-' fExpDA
                {
                match(input,61,FOLLOW_61_in_synpred98_Pddl2444); if (state.failed) return ;
                pushFollow(FOLLOW_fExpDA_in_synpred98_Pddl2446);
                fExpDA();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }

        match(input,57,FOLLOW_57_in_synpred98_Pddl2450); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred98_Pddl

    // $ANTLR start synpred110_Pddl
    public final void synpred110_Pddl_fragment() throws RecognitionException {   
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:459:4: ( '(' 'and' ( prefConGD )* ')' )
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:459:4: '(' 'and' ( prefConGD )* ')'
        {
        match(input,55,FOLLOW_55_in_synpred110_Pddl2900); if (state.failed) return ;
        match(input,74,FOLLOW_74_in_synpred110_Pddl2902); if (state.failed) return ;
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:459:14: ( prefConGD )*
        loop101:
        do {
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==55) ) {
                alt101=1;
            }


            switch (alt101) {
        	case 1 :
        	    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: prefConGD
        	    {
        	    pushFollow(FOLLOW_prefConGD_in_synpred110_Pddl2904);
        	    prefConGD();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop101;
            }
        } while (true);

        match(input,57,FOLLOW_57_in_synpred110_Pddl2907); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred110_Pddl

    // $ANTLR start synpred111_Pddl
    public final void synpred111_Pddl_fragment() throws RecognitionException {   
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:460:4: ( '(' 'forall' '(' typedVariableList ')' prefConGD ')' )
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:460:4: '(' 'forall' '(' typedVariableList ')' prefConGD ')'
        {
        match(input,55,FOLLOW_55_in_synpred111_Pddl2912); if (state.failed) return ;
        match(input,79,FOLLOW_79_in_synpred111_Pddl2914); if (state.failed) return ;
        match(input,55,FOLLOW_55_in_synpred111_Pddl2916); if (state.failed) return ;
        pushFollow(FOLLOW_typedVariableList_in_synpred111_Pddl2918);
        typedVariableList();

        state._fsp--;
        if (state.failed) return ;
        match(input,57,FOLLOW_57_in_synpred111_Pddl2920); if (state.failed) return ;
        pushFollow(FOLLOW_prefConGD_in_synpred111_Pddl2922);
        prefConGD();

        state._fsp--;
        if (state.failed) return ;
        match(input,57,FOLLOW_57_in_synpred111_Pddl2924); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred111_Pddl

    // $ANTLR start synpred113_Pddl
    public final void synpred113_Pddl_fragment() throws RecognitionException {   
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:461:4: ( '(' 'preference' ( NAME )? conGD ')' )
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:461:4: '(' 'preference' ( NAME )? conGD ')'
        {
        match(input,55,FOLLOW_55_in_synpred113_Pddl2929); if (state.failed) return ;
        match(input,83,FOLLOW_83_in_synpred113_Pddl2931); if (state.failed) return ;
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:461:21: ( NAME )?
        int alt102=2;
        int LA102_0 = input.LA(1);

        if ( (LA102_0==NAME) ) {
            alt102=1;
        }
        switch (alt102) {
            case 1 :
                // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: NAME
                {
                match(input,NAME,FOLLOW_NAME_in_synpred113_Pddl2933); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_conGD_in_synpred113_Pddl2936);
        conGD();

        state._fsp--;
        if (state.failed) return ;
        match(input,57,FOLLOW_57_in_synpred113_Pddl2938); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred113_Pddl

    // $ANTLR start synpred115_Pddl
    public final void synpred115_Pddl_fragment() throws RecognitionException {   
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:473:4: ( '(' binaryOp metricFExp metricFExp ')' )
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:473:4: '(' binaryOp metricFExp metricFExp ')'
        {
        match(input,55,FOLLOW_55_in_synpred115_Pddl2999); if (state.failed) return ;
        pushFollow(FOLLOW_binaryOp_in_synpred115_Pddl3001);
        binaryOp();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_metricFExp_in_synpred115_Pddl3003);
        metricFExp();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_metricFExp_in_synpred115_Pddl3005);
        metricFExp();

        state._fsp--;
        if (state.failed) return ;
        match(input,57,FOLLOW_57_in_synpred115_Pddl3007); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred115_Pddl

    // $ANTLR start synpred118_Pddl
    public final void synpred118_Pddl_fragment() throws RecognitionException {   
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:474:4: ( '(' ( '*' | '/' ) metricFExp ( metricFExp )+ ')' )
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:474:4: '(' ( '*' | '/' ) metricFExp ( metricFExp )+ ')'
        {
        match(input,55,FOLLOW_55_in_synpred118_Pddl3012); if (state.failed) return ;
        if ( input.LA(1)==91||input.LA(1)==93 ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        pushFollow(FOLLOW_metricFExp_in_synpred118_Pddl3020);
        metricFExp();

        state._fsp--;
        if (state.failed) return ;
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:474:29: ( metricFExp )+
        int cnt103=0;
        loop103:
        do {
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==NAME||LA103_0==NUMBER||LA103_0==55||LA103_0==113) ) {
                alt103=1;
            }


            switch (alt103) {
        	case 1 :
        	    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: metricFExp
        	    {
        	    pushFollow(FOLLOW_metricFExp_in_synpred118_Pddl3022);
        	    metricFExp();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt103 >= 1 ) break loop103;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(103, input);
                    throw eee;
            }
            cnt103++;
        } while (true);

        match(input,57,FOLLOW_57_in_synpred118_Pddl3025); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred118_Pddl

    // $ANTLR start synpred119_Pddl
    public final void synpred119_Pddl_fragment() throws RecognitionException {   
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:475:4: ( '(' '-' metricFExp ')' )
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:475:4: '(' '-' metricFExp ')'
        {
        match(input,55,FOLLOW_55_in_synpred119_Pddl3030); if (state.failed) return ;
        match(input,61,FOLLOW_61_in_synpred119_Pddl3032); if (state.failed) return ;
        pushFollow(FOLLOW_metricFExp_in_synpred119_Pddl3034);
        metricFExp();

        state._fsp--;
        if (state.failed) return ;
        match(input,57,FOLLOW_57_in_synpred119_Pddl3036); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred119_Pddl

    // $ANTLR start synpred122_Pddl
    public final void synpred122_Pddl_fragment() throws RecognitionException {   
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:477:4: ( '(' functionSymbol ( NAME )* ')' )
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:477:4: '(' functionSymbol ( NAME )* ')'
        {
        match(input,55,FOLLOW_55_in_synpred122_Pddl3046); if (state.failed) return ;
        pushFollow(FOLLOW_functionSymbol_in_synpred122_Pddl3048);
        functionSymbol();

        state._fsp--;
        if (state.failed) return ;
        // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:477:23: ( NAME )*
        loop104:
        do {
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==NAME) ) {
                alt104=1;
            }


            switch (alt104) {
        	case 1 :
        	    // C:\\Users\\CHW\\Downloads\\graphplanner\\grammar\\edu\\usu\\cs\\pddl\\antlr\\Pddl.g:0:0: NAME
        	    {
        	    match(input,NAME,FOLLOW_NAME_in_synpred122_Pddl3050); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop104;
            }
        } while (true);

        match(input,57,FOLLOW_57_in_synpred122_Pddl3053); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred122_Pddl

    // Delegated rules

    public final boolean synpred94_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred94_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred113_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred113_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred96_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred96_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred98_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred98_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred61_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred95_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred95_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred115_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred115_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred89_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred89_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred118_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred118_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred111_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred111_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred93_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred93_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred119_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred119_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred91_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred91_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred122_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred122_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred92_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred92_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred110_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred110_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred97_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred97_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA13 dfa13 = new DFA13(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA79 dfa79 = new DFA79(this);
    protected DFA81 dfa81 = new DFA81(this);
    static final String DFA13_eotS =
        "\4\uffff";
    static final String DFA13_eofS =
        "\4\uffff";
    static final String DFA13_minS =
        "\2\56\2\uffff";
    static final String DFA13_maxS =
        "\1\71\1\75\2\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA13_specialS =
        "\4\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\1\12\uffff\1\2",
            "\1\1\12\uffff\1\2\3\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "125:7: ( ( NAME )* | ( singleTypeNameList )+ ( NAME )* )";
        }
    }
    static final String DFA11_eotS =
        "\4\uffff";
    static final String DFA11_eofS =
        "\4\uffff";
    static final String DFA11_minS =
        "\2\56\2\uffff";
    static final String DFA11_maxS =
        "\1\71\1\75\2\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA11_specialS =
        "\4\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1\12\uffff\1\2",
            "\1\1\12\uffff\1\2\3\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "()+ loopback of 125:16: ( singleTypeNameList )+";
        }
    }
    static final String DFA24_eotS =
        "\4\uffff";
    static final String DFA24_eofS =
        "\4\uffff";
    static final String DFA24_minS =
        "\2\60\2\uffff";
    static final String DFA24_maxS =
        "\1\71\1\75\2\uffff";
    static final String DFA24_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA24_specialS =
        "\4\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\1\6\uffff\1\2\1\uffff\1\2",
            "\1\1\6\uffff\1\2\1\uffff\1\2\3\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "176:8: ( ( VARIABLE )* | ( singleTypeVarList )+ ( VARIABLE )* )";
        }
    }
    static final String DFA22_eotS =
        "\4\uffff";
    static final String DFA22_eofS =
        "\4\uffff";
    static final String DFA22_minS =
        "\2\60\2\uffff";
    static final String DFA22_maxS =
        "\1\71\1\75\2\uffff";
    static final String DFA22_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA22_specialS =
        "\4\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\1\6\uffff\1\2\1\uffff\1\2",
            "\1\1\6\uffff\1\2\1\uffff\1\2\3\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "()+ loopback of 176:21: ( singleTypeVarList )+";
        }
    }
    static final String DFA38_eotS =
        "\12\uffff";
    static final String DFA38_eofS =
        "\12\uffff";
    static final String DFA38_minS =
        "\1\67\1\56\10\uffff";
    static final String DFA38_maxS =
        "\1\67\1\142\10\uffff";
    static final String DFA38_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\1";
    static final String DFA38_specialS =
        "\12\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\1",
            "\1\11\33\uffff\1\2\1\3\1\4\1\5\1\6\1\7\16\uffff\5\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "232:1: goalDesc : ( atomicTermFormula | '(' 'and' ( goalDesc )* ')' -> ^( AND_GD ( goalDesc )* ) | '(' 'or' ( goalDesc )* ')' -> ^( OR_GD ( goalDesc )* ) | '(' 'not' goalDesc ')' -> ^( NOT_GD goalDesc ) | '(' 'imply' goalDesc goalDesc ')' -> ^( IMPLY_GD goalDesc goalDesc ) | '(' 'exists' '(' typedVariableList ')' goalDesc ')' -> ^( EXISTS_GD typedVariableList goalDesc ) | '(' 'forall' '(' typedVariableList ')' goalDesc ')' -> ^( FORALL_GD typedVariableList goalDesc ) | fComp -> ^( COMPARISON_GD fComp ) );";
        }
    }
    static final String DFA79_eotS =
        "\12\uffff";
    static final String DFA79_eofS =
        "\12\uffff";
    static final String DFA79_minS =
        "\1\56\1\0\10\uffff";
    static final String DFA79_maxS =
        "\1\161\1\0\10\uffff";
    static final String DFA79_acceptS =
        "\2\uffff\1\4\1\6\1\7\1\1\1\2\1\3\1\5\1\10";
    static final String DFA79_specialS =
        "\1\uffff\1\0\10\uffff}>";
    static final String[] DFA79_transitionS = {
            "\1\3\2\uffff\1\2\5\uffff\1\1\71\uffff\1\4",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA79_eot = DFA.unpackEncodedString(DFA79_eotS);
    static final short[] DFA79_eof = DFA.unpackEncodedString(DFA79_eofS);
    static final char[] DFA79_min = DFA.unpackEncodedStringToUnsignedChars(DFA79_minS);
    static final char[] DFA79_max = DFA.unpackEncodedStringToUnsignedChars(DFA79_maxS);
    static final short[] DFA79_accept = DFA.unpackEncodedString(DFA79_acceptS);
    static final short[] DFA79_special = DFA.unpackEncodedString(DFA79_specialS);
    static final short[][] DFA79_transition;

    static {
        int numStates = DFA79_transitionS.length;
        DFA79_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA79_transition[i] = DFA.unpackEncodedString(DFA79_transitionS[i]);
        }
    }

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = DFA79_eot;
            this.eof = DFA79_eof;
            this.min = DFA79_min;
            this.max = DFA79_max;
            this.accept = DFA79_accept;
            this.special = DFA79_special;
            this.transition = DFA79_transition;
        }
        public String getDescription() {
            return "472:1: metricFExp : ( '(' binaryOp metricFExp metricFExp ')' | '(' ( '*' | '/' ) metricFExp ( metricFExp )+ ')' | '(' '-' metricFExp ')' | NUMBER | '(' functionSymbol ( NAME )* ')' | functionSymbol | 'total-time' | '(' 'is-violated' NAME ')' );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA79_1 = input.LA(1);

                         
                        int index79_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Pddl()) ) {s = 5;}

                        else if ( (synpred118_Pddl()) ) {s = 6;}

                        else if ( (synpred119_Pddl()) ) {s = 7;}

                        else if ( (synpred122_Pddl()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index79_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 79, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA81_eotS =
        "\16\uffff";
    static final String DFA81_eofS =
        "\16\uffff";
    static final String DFA81_minS =
        "\1\67\1\112\14\uffff";
    static final String DFA81_maxS =
        "\1\67\1\173\14\uffff";
    static final String DFA81_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14";
    static final String DFA81_specialS =
        "\16\uffff}>";
    static final String[] DFA81_transitionS = {
            "\1\1",
            "\1\2\4\uffff\1\3\4\uffff\1\4\36\uffff\1\5\1\6\1\7\1\10\1\11"+
            "\1\12\1\13\1\14\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA81_eot = DFA.unpackEncodedString(DFA81_eotS);
    static final short[] DFA81_eof = DFA.unpackEncodedString(DFA81_eofS);
    static final char[] DFA81_min = DFA.unpackEncodedStringToUnsignedChars(DFA81_minS);
    static final char[] DFA81_max = DFA.unpackEncodedStringToUnsignedChars(DFA81_maxS);
    static final short[] DFA81_accept = DFA.unpackEncodedString(DFA81_acceptS);
    static final short[] DFA81_special = DFA.unpackEncodedString(DFA81_specialS);
    static final short[][] DFA81_transition;

    static {
        int numStates = DFA81_transitionS.length;
        DFA81_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA81_transition[i] = DFA.unpackEncodedString(DFA81_transitionS[i]);
        }
    }

    class DFA81 extends DFA {

        public DFA81(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 81;
            this.eot = DFA81_eot;
            this.eof = DFA81_eof;
            this.min = DFA81_min;
            this.max = DFA81_max;
            this.accept = DFA81_accept;
            this.special = DFA81_special;
            this.transition = DFA81_transition;
        }
        public String getDescription() {
            return "483:1: conGD : ( '(' 'and' ( conGD )* ')' | '(' 'forall' '(' typedVariableList ')' conGD ')' | '(' 'at' 'end' goalDesc ')' | '(' 'always' goalDesc ')' | '(' 'sometime' goalDesc ')' | '(' 'within' NUMBER goalDesc ')' | '(' 'at-most-once' goalDesc ')' | '(' 'sometime-after' goalDesc goalDesc ')' | '(' 'sometime-before' goalDesc goalDesc ')' | '(' 'always-within' NUMBER goalDesc goalDesc ')' | '(' 'hold-during' NUMBER NUMBER goalDesc ')' | '(' 'hold-after' NUMBER goalDesc ')' );";
        }
    }
 

    public static final BitSet FOLLOW_domain_in_pddlDoc319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_problem_in_pddlDoc323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_domain338 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_domain340 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_domainName_in_domain342 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_requireDef_in_domain350 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_typesDef_in_domain359 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_constantsDef_in_domain368 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_predicatesDef_in_domain377 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_functionsDef_in_domain386 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_constraints_in_domain395 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_structureDef_in_domain404 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_57_in_domain413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_domainName497 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_domainName499 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_NAME_in_domainName501 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_domainName503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_requireDef530 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_requireDef532 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_REQUIRE_KEY_in_requireDef534 = new BitSet(new long[]{0x0200800000000000L});
    public static final BitSet FOLLOW_57_in_requireDef537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_typesDef558 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_typesDef560 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_typedNameList_in_typesDef562 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_typesDef564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_typedNameList591 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_singleTypeNameList_in_typedNameList596 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_NAME_in_typedNameList599 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_NAME_in_singleTypeNameList619 = new BitSet(new long[]{0x2000400000000000L});
    public static final BitSet FOLLOW_61_in_singleTypeNameList622 = new BitSet(new long[]{0x0080400000000000L});
    public static final BitSet FOLLOW_type_in_singleTypeNameList626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_type653 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_type655 = new BitSet(new long[]{0x0080400000000000L});
    public static final BitSet FOLLOW_primType_in_type657 = new BitSet(new long[]{0x0280400000000000L});
    public static final BitSet FOLLOW_57_in_type660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primType_in_type679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_primType689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_functionsDef699 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_functionsDef701 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_functionList_in_functionsDef703 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_functionsDef705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicFunctionSkeleton_in_functionList726 = new BitSet(new long[]{0x2080000000000002L});
    public static final BitSet FOLLOW_61_in_functionList730 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_functionType_in_functionList732 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_atomicFunctionSkeleton748 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_functionSymbol_in_atomicFunctionSkeleton751 = new BitSet(new long[]{0x0201000000000000L});
    public static final BitSet FOLLOW_typedVariableList_in_atomicFunctionSkeleton754 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_atomicFunctionSkeleton756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_functionSymbol767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_functionType776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_constantsDef787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_constantsDef789 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_typedNameList_in_constantsDef791 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_constantsDef793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_predicatesDef813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_predicatesDef815 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_atomicFormulaSkeleton_in_predicatesDef817 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_57_in_predicatesDef820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_atomicFormulaSkeleton841 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_predicate_in_atomicFormulaSkeleton844 = new BitSet(new long[]{0x0201000000000000L});
    public static final BitSet FOLLOW_typedVariableList_in_atomicFormulaSkeleton847 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_atomicFormulaSkeleton849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_predicate860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_typedVariableList876 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_singleTypeVarList_in_typedVariableList881 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_typedVariableList884 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_singleTypeVarList904 = new BitSet(new long[]{0x2001000000000000L});
    public static final BitSet FOLLOW_61_in_singleTypeVarList907 = new BitSet(new long[]{0x0080400000000000L});
    public static final BitSet FOLLOW_type_in_singleTypeVarList911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_constraints942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_constraints945 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_conGD_in_constraints948 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_constraints950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionDef_in_structureDef962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_durativeActionDef_in_structureDef967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_derivedDef_in_structureDef972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_actionDef987 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_actionDef989 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_actionSymbol_in_actionDef991 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_actionDef1002 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_actionDef1006 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_actionDef1008 = new BitSet(new long[]{0x0200000000000000L,0x00000000000003C0L});
    public static final BitSet FOLLOW_55_in_actionDef1013 = new BitSet(new long[]{0x0201000000000000L});
    public static final BitSet FOLLOW_typedVariableList_in_actionDef1015 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_actionDef1017 = new BitSet(new long[]{0x0200000000000000L,0x00000000000003C0L});
    public static final BitSet FOLLOW_actionDefBody_in_actionDef1033 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_actionDef1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_actionSymbol1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_actionDefBody1084 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_actionDefBody1088 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_actionDefBody1090 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000380L});
    public static final BitSet FOLLOW_goalDesc_in_actionDefBody1095 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000380L});
    public static final BitSet FOLLOW_71_in_actionDefBody1105 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_actionDefBody1109 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_actionDefBody1111 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_goalDesc1_in_actionDefBody1116 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_72_in_actionDefBody1126 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_actionDefBody1130 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_actionDefBody1132 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_effect_in_actionDefBody1137 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_actionDefBody1147 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_actionDefBody1151 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_actionDefBody1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_effect1_in_actionDefBody1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_effect_in_effect11204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_goalDesc_in_goalDesc11211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicTermFormula_in_goalDesc1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_goalDesc1236 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_goalDesc1238 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_goalDesc1240 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_57_in_goalDesc1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_goalDesc1268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_goalDesc1270 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_goalDesc1272 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_57_in_goalDesc1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_goalDesc1300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_goalDesc1302 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_goalDesc1304 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_goalDesc1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_goalDesc1330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_goalDesc1332 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_goalDesc1334 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_goalDesc1336 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_goalDesc1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_goalDesc1364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_goalDesc1366 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_goalDesc1368 = new BitSet(new long[]{0x0201000000000000L});
    public static final BitSet FOLLOW_typedVariableList_in_goalDesc1370 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_goalDesc1372 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_goalDesc1374 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_goalDesc1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_goalDesc1402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_goalDesc1404 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_goalDesc1406 = new BitSet(new long[]{0x0201000000000000L});
    public static final BitSet FOLLOW_typedVariableList_in_goalDesc1408 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_goalDesc1410 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_goalDesc1412 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_goalDesc1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fComp_in_goalDesc1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_fComp1479 = new BitSet(new long[]{0x0000000000000000L,0x00000007C0000000L});
    public static final BitSet FOLLOW_binaryComp_in_fComp1482 = new BitSet(new long[]{0x0082400000000000L});
    public static final BitSet FOLLOW_fExp_in_fComp1484 = new BitSet(new long[]{0x0082400000000000L});
    public static final BitSet FOLLOW_fExp_in_fComp1486 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_fComp1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_atomicTermFormula1500 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_predicate_in_atomicTermFormula1502 = new BitSet(new long[]{0x0201400000000000L});
    public static final BitSet FOLLOW_term_in_atomicTermFormula1504 = new BitSet(new long[]{0x0201400000000000L});
    public static final BitSet FOLLOW_57_in_atomicTermFormula1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_term0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_durativeActionDef1545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_durativeActionDef1547 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_actionSymbol_in_durativeActionDef1549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_durativeActionDef1558 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_durativeActionDef1560 = new BitSet(new long[]{0x0201000000000000L});
    public static final BitSet FOLLOW_typedVariableList_in_durativeActionDef1562 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_durativeActionDef1564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000060100L});
    public static final BitSet FOLLOW_daDefBody_in_durativeActionDef1577 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_durativeActionDef1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_daDefBody1612 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_durationConstraint_in_daDefBody1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_daDefBody1619 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_daDefBody1623 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_daDefBody1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_daGD_in_daDefBody1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_daDefBody1639 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_daDefBody1643 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_daDefBody1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_daEffect_in_daDefBody1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefTimedGD_in_daGD1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_daGD1670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_daGD1672 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_daGD_in_daGD1674 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_57_in_daGD1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_daGD1682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_daGD1684 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_daGD1686 = new BitSet(new long[]{0x0201000000000000L});
    public static final BitSet FOLLOW_typedVariableList_in_daGD1688 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_daGD1690 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_daGD_in_daGD1692 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_daGD1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timedGD_in_prefTimedGD1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_prefTimedGD1710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_prefTimedGD1712 = new BitSet(new long[]{0x0080400000000000L});
    public static final BitSet FOLLOW_NAME_in_prefTimedGD1714 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_timedGD_in_prefTimedGD1717 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_prefTimedGD1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_timedGD1730 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_timedGD1732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_timeSpecifier_in_timedGD1734 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_timedGD1736 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_timedGD1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_timedGD1743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_timedGD1745 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_interval_in_timedGD1747 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_timedGD1749 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_timedGD1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_timeSpecifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_interval1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_derivedDef1786 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_derivedDef1789 = new BitSet(new long[]{0x0081000000000000L});
    public static final BitSet FOLLOW_typedVariableList_in_derivedDef1792 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_derivedDef1794 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_derivedDef1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_fExp1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_fExp1816 = new BitSet(new long[]{0x2000000000000000L,0x0000000038000000L});
    public static final BitSet FOLLOW_binaryOp_in_fExp1818 = new BitSet(new long[]{0x0082400000000000L});
    public static final BitSet FOLLOW_fExp_in_fExp1820 = new BitSet(new long[]{0x0082400000000000L});
    public static final BitSet FOLLOW_fExp2_in_fExp1822 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_fExp1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_fExp1841 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_fExp1843 = new BitSet(new long[]{0x0082400000000000L});
    public static final BitSet FOLLOW_fExp_in_fExp1845 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_fExp1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fHead_in_fExp1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fExp_in_fExp21872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_fHead1882 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_functionSymbol_in_fHead1884 = new BitSet(new long[]{0x0201400000000000L});
    public static final BitSet FOLLOW_term_in_fHead1886 = new BitSet(new long[]{0x0201400000000000L});
    public static final BitSet FOLLOW_57_in_fHead1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionSymbol_in_fHead1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_effect1924 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_effect1926 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_cEffect_in_effect1928 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_57_in_effect1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cEffect_in_effect1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_cEffect1956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_cEffect1958 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_cEffect1960 = new BitSet(new long[]{0x0201000000000000L});
    public static final BitSet FOLLOW_typedVariableList_in_cEffect1962 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_cEffect1964 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_effect_in_cEffect1966 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_cEffect1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_cEffect1986 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_cEffect1988 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_cEffect1990 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_condEffect_in_cEffect1992 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_cEffect1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pEffect_in_cEffect2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_pEffect2023 = new BitSet(new long[]{0x0000000000000000L,0x000000F800000000L});
    public static final BitSet FOLLOW_assignOp_in_pEffect2025 = new BitSet(new long[]{0x0082400000000000L});
    public static final BitSet FOLLOW_fHead_in_pEffect2027 = new BitSet(new long[]{0x0082400000000000L});
    public static final BitSet FOLLOW_fExp_in_pEffect2029 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_pEffect2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_pEffect2051 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_pEffect2053 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_atomicTermFormula_in_pEffect2055 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_pEffect2057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicTermFormula_in_pEffect2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_condEffect2086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_condEffect2088 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_pEffect_in_condEffect2090 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_57_in_condEffect2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pEffect_in_condEffect2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_binaryOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_binaryComp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_durationConstraint2194 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_durationConstraint2196 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_simpleDurationConstraint_in_durationConstraint2198 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_57_in_durationConstraint2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_durationConstraint2206 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_durationConstraint2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleDurationConstraint_in_durationConstraint2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_simpleDurationConstraint2224 = new BitSet(new long[]{0x0000000000000000L,0x0000000700000000L});
    public static final BitSet FOLLOW_durOp_in_simpleDurationConstraint2226 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_simpleDurationConstraint2228 = new BitSet(new long[]{0x0082400000000000L});
    public static final BitSet FOLLOW_durValue_in_simpleDurationConstraint2230 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_simpleDurationConstraint2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_simpleDurationConstraint2237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_simpleDurationConstraint2239 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_timeSpecifier_in_simpleDurationConstraint2241 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_simpleDurationConstraint_in_simpleDurationConstraint2243 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_simpleDurationConstraint2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_durOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_durValue2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fExp_in_durValue2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_daEffect2286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_daEffect2288 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_daEffect_in_daEffect2290 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_57_in_daEffect2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timedEffect_in_daEffect2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_daEffect2303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_daEffect2305 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_daEffect2307 = new BitSet(new long[]{0x0201000000000000L});
    public static final BitSet FOLLOW_typedVariableList_in_daEffect2309 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_daEffect2311 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_daEffect_in_daEffect2313 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_daEffect2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_daEffect2320 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_daEffect2322 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_daGD_in_daEffect2324 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_timedEffect_in_daEffect2326 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_daEffect2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_daEffect2333 = new BitSet(new long[]{0x0000000000000000L,0x000000F800000000L});
    public static final BitSet FOLLOW_assignOp_in_daEffect2335 = new BitSet(new long[]{0x0082400000000000L});
    public static final BitSet FOLLOW_fHead_in_daEffect2337 = new BitSet(new long[]{0x0082400000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_fExpDA_in_daEffect2339 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_daEffect2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_timedEffect2352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_timedEffect2354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_timeSpecifier_in_timedEffect2356 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_daEffect_in_timedEffect2358 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_timedEffect2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_timedEffect2370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_timedEffect2372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_timeSpecifier_in_timedEffect2374 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_fAssignDA_in_timedEffect2376 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_timedEffect2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_timedEffect2383 = new BitSet(new long[]{0x0000000000000000L,0x000000F800000000L});
    public static final BitSet FOLLOW_assignOp_in_timedEffect2385 = new BitSet(new long[]{0x0082400000000000L});
    public static final BitSet FOLLOW_fHead_in_timedEffect2387 = new BitSet(new long[]{0x0082400000000000L});
    public static final BitSet FOLLOW_fExp_in_timedEffect2389 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_timedEffect2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_fAssignDA2411 = new BitSet(new long[]{0x0000000000000000L,0x000000F800000000L});
    public static final BitSet FOLLOW_assignOp_in_fAssignDA2413 = new BitSet(new long[]{0x0082400000000000L});
    public static final BitSet FOLLOW_fHead_in_fAssignDA2415 = new BitSet(new long[]{0x0082400000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_fExpDA_in_fAssignDA2417 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_fAssignDA2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_fExpDA2430 = new BitSet(new long[]{0x2000000000000000L,0x0000000038000000L});
    public static final BitSet FOLLOW_binaryOp_in_fExpDA2434 = new BitSet(new long[]{0x0082400000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_fExpDA_in_fExpDA2436 = new BitSet(new long[]{0x0082400000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_fExpDA_in_fExpDA2438 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_61_in_fExpDA2444 = new BitSet(new long[]{0x0082400000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_fExpDA_in_fExpDA2446 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_fExpDA2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_fExpDA2455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fExp_in_fExpDA2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_problem2474 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_problem2476 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_problemDecl_in_problem2478 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_problemDomain_in_problem2483 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_requireDef_in_problem2491 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_objectDecl_in_problem2500 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_init_in_problem2509 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_goal_in_problem2517 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_probConstraints_in_problem2525 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_metricSpec_in_problem2534 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_problem2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_problemDecl2607 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_problemDecl2609 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_NAME_in_problemDecl2611 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_problemDecl2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_problemDomain2639 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_problemDomain2641 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_NAME_in_problemDomain2643 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_problemDomain2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_objectDecl2665 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_objectDecl2667 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_typedNameList_in_objectDecl2669 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_objectDecl2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_init2691 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_init2693 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_initEl_in_init2695 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_57_in_init2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameLiteral_in_initEl2719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_initEl2724 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_initEl2726 = new BitSet(new long[]{0x0082400000000000L});
    public static final BitSet FOLLOW_fHead_in_initEl2728 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_NUMBER_in_initEl2730 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_initEl2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_initEl2755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_initEl2757 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_NUMBER_in_initEl2759 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_nameLiteral_in_initEl2761 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_initEl2763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicNameFormula_in_nameLiteral2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_nameLiteral2790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_nameLiteral2792 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_atomicNameFormula_in_nameLiteral2794 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_nameLiteral2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_atomicNameFormula2815 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_predicate_in_atomicNameFormula2817 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_NAME_in_atomicNameFormula2819 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_57_in_atomicNameFormula2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_goal2847 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_goal2849 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_goal2851 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_goal2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_probConstraints2871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_probConstraints2873 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_prefConGD_in_probConstraints2876 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_probConstraints2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_prefConGD2900 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_prefConGD2902 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_prefConGD_in_prefConGD2904 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_57_in_prefConGD2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_prefConGD2912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_prefConGD2914 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_prefConGD2916 = new BitSet(new long[]{0x0201000000000000L});
    public static final BitSet FOLLOW_typedVariableList_in_prefConGD2918 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_prefConGD2920 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_prefConGD_in_prefConGD2922 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_prefConGD2924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_prefConGD2929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_prefConGD2931 = new BitSet(new long[]{0x0080400000000000L});
    public static final BitSet FOLLOW_NAME_in_prefConGD2933 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_conGD_in_prefConGD2936 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_prefConGD2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conGD_in_prefConGD2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_metricSpec2954 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_metricSpec2956 = new BitSet(new long[]{0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_optimization_in_metricSpec2958 = new BitSet(new long[]{0x0082400000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_metricFExp_in_metricSpec2960 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_metricSpec2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_optimization0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_metricFExp2999 = new BitSet(new long[]{0x2000000000000000L,0x0000000038000000L});
    public static final BitSet FOLLOW_binaryOp_in_metricFExp3001 = new BitSet(new long[]{0x0082400000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_metricFExp_in_metricFExp3003 = new BitSet(new long[]{0x0082400000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_metricFExp_in_metricFExp3005 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_metricFExp3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_metricFExp3012 = new BitSet(new long[]{0x0000000000000000L,0x0000000028000000L});
    public static final BitSet FOLLOW_set_in_metricFExp3014 = new BitSet(new long[]{0x0082400000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_metricFExp_in_metricFExp3020 = new BitSet(new long[]{0x0082400000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_metricFExp_in_metricFExp3022 = new BitSet(new long[]{0x0282400000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_57_in_metricFExp3025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_metricFExp3030 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_metricFExp3032 = new BitSet(new long[]{0x0082400000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_metricFExp_in_metricFExp3034 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_metricFExp3036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_metricFExp3041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_metricFExp3046 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_functionSymbol_in_metricFExp3048 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_NAME_in_metricFExp3050 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_57_in_metricFExp3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionSymbol_in_metricFExp3058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_metricFExp3066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_metricFExp3071 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_metricFExp3073 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_NAME_in_metricFExp3075 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_metricFExp3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_conGD3091 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_conGD3093 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_conGD_in_conGD3095 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_57_in_conGD3098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_conGD3103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_conGD3105 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_conGD3107 = new BitSet(new long[]{0x0201000000000000L});
    public static final BitSet FOLLOW_typedVariableList_in_conGD3109 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_conGD3111 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_conGD_in_conGD3113 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_conGD3115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_conGD3120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_conGD3122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_conGD3124 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_conGD3126 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_conGD3128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_conGD3136 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_conGD3138 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_conGD3140 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_conGD3142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_conGD3147 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_conGD3149 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_conGD3151 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_conGD3153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_conGD3159 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_conGD3161 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_NUMBER_in_conGD3163 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_conGD3165 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_conGD3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_conGD3172 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_conGD3174 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_conGD3176 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_conGD3178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_conGD3183 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_conGD3185 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_conGD3187 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_conGD3189 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_conGD3191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_conGD3196 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_conGD3198 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_conGD3200 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_conGD3202 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_conGD3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_conGD3209 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_conGD3211 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_NUMBER_in_conGD3213 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_conGD3215 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_conGD3217 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_conGD3219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_conGD3224 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_conGD3226 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_NUMBER_in_conGD3228 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_NUMBER_in_conGD3230 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_conGD3232 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_conGD3234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_conGD3239 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_conGD3241 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_NUMBER_in_conGD3243 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_conGD3245 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_conGD3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicFunctionSkeleton_in_synpred17_Pddl726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred28_Pddl1006 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_synpred28_Pddl1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred60_Pddl1816 = new BitSet(new long[]{0x2000000000000000L,0x0000000038000000L});
    public static final BitSet FOLLOW_binaryOp_in_synpred60_Pddl1818 = new BitSet(new long[]{0x0082400000000000L});
    public static final BitSet FOLLOW_fExp_in_synpred60_Pddl1820 = new BitSet(new long[]{0x0082400000000000L});
    public static final BitSet FOLLOW_fExp2_in_synpred60_Pddl1822 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_synpred60_Pddl1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred61_Pddl1841 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_synpred61_Pddl1843 = new BitSet(new long[]{0x0082400000000000L});
    public static final BitSet FOLLOW_fExp_in_synpred61_Pddl1845 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_synpred61_Pddl1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_synpred89_Pddl2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred91_Pddl2286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_synpred91_Pddl2288 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_daEffect_in_synpred91_Pddl2290 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_57_in_synpred91_Pddl2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timedEffect_in_synpred92_Pddl2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred93_Pddl2303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_synpred93_Pddl2305 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_synpred93_Pddl2307 = new BitSet(new long[]{0x0201000000000000L});
    public static final BitSet FOLLOW_typedVariableList_in_synpred93_Pddl2309 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_synpred93_Pddl2311 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_daEffect_in_synpred93_Pddl2313 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_synpred93_Pddl2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred94_Pddl2320 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_synpred94_Pddl2322 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_daGD_in_synpred94_Pddl2324 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_timedEffect_in_synpred94_Pddl2326 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_synpred94_Pddl2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred95_Pddl2352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_synpred95_Pddl2354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_timeSpecifier_in_synpred95_Pddl2356 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_daEffect_in_synpred95_Pddl2358 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_synpred95_Pddl2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred96_Pddl2370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_synpred96_Pddl2372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_timeSpecifier_in_synpred96_Pddl2374 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_fAssignDA_in_synpred96_Pddl2376 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_synpred96_Pddl2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binaryOp_in_synpred97_Pddl2434 = new BitSet(new long[]{0x0082400000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_fExpDA_in_synpred97_Pddl2436 = new BitSet(new long[]{0x0082400000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_fExpDA_in_synpred97_Pddl2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred98_Pddl2430 = new BitSet(new long[]{0x2000000000000000L,0x0000000038000000L});
    public static final BitSet FOLLOW_binaryOp_in_synpred98_Pddl2434 = new BitSet(new long[]{0x0082400000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_fExpDA_in_synpred98_Pddl2436 = new BitSet(new long[]{0x0082400000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_fExpDA_in_synpred98_Pddl2438 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_61_in_synpred98_Pddl2444 = new BitSet(new long[]{0x0082400000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_fExpDA_in_synpred98_Pddl2446 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_synpred98_Pddl2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred110_Pddl2900 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_synpred110_Pddl2902 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_prefConGD_in_synpred110_Pddl2904 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_57_in_synpred110_Pddl2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred111_Pddl2912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_synpred111_Pddl2914 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_synpred111_Pddl2916 = new BitSet(new long[]{0x0201000000000000L});
    public static final BitSet FOLLOW_typedVariableList_in_synpred111_Pddl2918 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_synpred111_Pddl2920 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_prefConGD_in_synpred111_Pddl2922 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_synpred111_Pddl2924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred113_Pddl2929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_synpred113_Pddl2931 = new BitSet(new long[]{0x0080400000000000L});
    public static final BitSet FOLLOW_NAME_in_synpred113_Pddl2933 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_conGD_in_synpred113_Pddl2936 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_synpred113_Pddl2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred115_Pddl2999 = new BitSet(new long[]{0x2000000000000000L,0x0000000038000000L});
    public static final BitSet FOLLOW_binaryOp_in_synpred115_Pddl3001 = new BitSet(new long[]{0x0082400000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_metricFExp_in_synpred115_Pddl3003 = new BitSet(new long[]{0x0082400000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_metricFExp_in_synpred115_Pddl3005 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_synpred115_Pddl3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred118_Pddl3012 = new BitSet(new long[]{0x0000000000000000L,0x0000000028000000L});
    public static final BitSet FOLLOW_set_in_synpred118_Pddl3014 = new BitSet(new long[]{0x0082400000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_metricFExp_in_synpred118_Pddl3020 = new BitSet(new long[]{0x0082400000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_metricFExp_in_synpred118_Pddl3022 = new BitSet(new long[]{0x0282400000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_57_in_synpred118_Pddl3025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred119_Pddl3030 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_synpred119_Pddl3032 = new BitSet(new long[]{0x0082400000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_metricFExp_in_synpred119_Pddl3034 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_synpred119_Pddl3036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred122_Pddl3046 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_functionSymbol_in_synpred122_Pddl3048 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_NAME_in_synpred122_Pddl3050 = new BitSet(new long[]{0x0200400000000000L});
    public static final BitSet FOLLOW_57_in_synpred122_Pddl3053 = new BitSet(new long[]{0x0000000000000002L});

}