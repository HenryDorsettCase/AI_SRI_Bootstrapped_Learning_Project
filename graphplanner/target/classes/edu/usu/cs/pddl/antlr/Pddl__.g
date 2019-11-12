lexer grammar Pddl;

@header {package edu.usu.cs.pddl.antlr;}

T__55 : '(' ;
T__56 : 'define' ;
T__57 : ')' ;
T__58 : 'domain' ;
T__59 : ':requirements' ;
T__60 : ':types' ;
T__61 : '-' ;
T__62 : 'either' ;
T__63 : ':functions' ;
T__64 : 'number' ;
T__65 : ':constants' ;
T__66 : ':predicates' ;
T__67 : ':constraints' ;
T__68 : ':action' ;
T__69 : ':parameters' ;
T__70 : ':precondition' ;
T__71 : ':poss-precondition' ;
T__72 : ':effect' ;
T__73 : ':poss-effect' ;
T__74 : 'and' ;
T__75 : 'or' ;
T__76 : 'not' ;
T__77 : 'imply' ;
T__78 : 'exists' ;
T__79 : 'forall' ;
T__80 : ':durative-action' ;
T__81 : ':duration' ;
T__82 : ':condition' ;
T__83 : 'preference' ;
T__84 : 'at' ;
T__85 : 'over' ;
T__86 : 'start' ;
T__87 : 'end' ;
T__88 : 'all' ;
T__89 : ':derived' ;
T__90 : 'when' ;
T__91 : '*' ;
T__92 : '+' ;
T__93 : '/' ;
T__94 : '>' ;
T__95 : '<' ;
T__96 : '=' ;
T__97 : '>=' ;
T__98 : '<=' ;
T__99 : 'assign' ;
T__100 : 'scale-up' ;
T__101 : 'scale-down' ;
T__102 : 'increase' ;
T__103 : 'decrease' ;
T__104 : '?duration' ;
T__105 : 'problem' ;
T__106 : ':domain' ;
T__107 : ':objects' ;
T__108 : ':init' ;
T__109 : ':goal' ;
T__110 : ':metric' ;
T__111 : 'minimize' ;
T__112 : 'maximize' ;
T__113 : 'total-time' ;
T__114 : 'is-violated' ;
T__115 : 'always' ;
T__116 : 'sometime' ;
T__117 : 'within' ;
T__118 : 'at-most-once' ;
T__119 : 'sometime-after' ;
T__120 : 'sometime-before' ;
T__121 : 'always-within' ;
T__122 : 'hold-during' ;
T__123 : 'hold-after' ;

// $ANTLR src "C:\Users\CHW\Downloads\graphplanner\grammar\edu\usu\cs\pddl\antlr\Pddl.g" 502
/************* LEXER ****************************/


REQUIRE_KEY
    : ':strips'
    | ':typing'
    | ':negative-preconditions'
    | ':disjunctive-preconditions'
    | ':equality'
    | ':existential-preconditions'
    | ':universal-preconditions'
    | ':quantified-preconditions'
    | ':conditional-effects'
    | ':fluents'
    | ':adl'
    | ':durative-actions'
    | ':derived-predicates'
    | ':timed-initial-literals'
    | ':preferences'
    | ':constraints'
    | ':incomplete-domain'
    ;


// $ANTLR src "C:\Users\CHW\Downloads\graphplanner\grammar\edu\usu\cs\pddl\antlr\Pddl.g" 526
NAME:    LETTER ANY_CHAR* ;

// $ANTLR src "C:\Users\CHW\Downloads\graphplanner\grammar\edu\usu\cs\pddl\antlr\Pddl.g" 528
fragment LETTER:	'a'..'z' | 'A'..'Z';

// $ANTLR src "C:\Users\CHW\Downloads\graphplanner\grammar\edu\usu\cs\pddl\antlr\Pddl.g" 530
fragment ANY_CHAR: LETTER | '0'..'9' | '-' | '_';

// $ANTLR src "C:\Users\CHW\Downloads\graphplanner\grammar\edu\usu\cs\pddl\antlr\Pddl.g" 532
VARIABLE : '?' LETTER ANY_CHAR* ;

// $ANTLR src "C:\Users\CHW\Downloads\graphplanner\grammar\edu\usu\cs\pddl\antlr\Pddl.g" 534
NUMBER : DIGIT+ ('.' DIGIT+)? ;

// $ANTLR src "C:\Users\CHW\Downloads\graphplanner\grammar\edu\usu\cs\pddl\antlr\Pddl.g" 536
fragment DIGIT: '0'..'9';

// $ANTLR src "C:\Users\CHW\Downloads\graphplanner\grammar\edu\usu\cs\pddl\antlr\Pddl.g" 538
LINE_COMMENT
    : ';' ~('\n'|'\r')* '\r'? '\n' { $channel = HIDDEN; }
    ;

// $ANTLR src "C:\Users\CHW\Downloads\graphplanner\grammar\edu\usu\cs\pddl\antlr\Pddl.g" 542
WHITESPACE
    :   (   ' '
        |   '\t'
        |   '\r'
        |   '\n'
        )+
        { $channel = HIDDEN; }
    ;
