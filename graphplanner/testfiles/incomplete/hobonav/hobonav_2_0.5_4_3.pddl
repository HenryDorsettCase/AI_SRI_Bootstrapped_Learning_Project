(define (domain HoboNav)
(:requirements :fluents :incomplete-domain)

(:predicates
 (at_x0) (at_y0) (at_x1) (at_y1)
 (have_bindle) (have_california_blankets) (have_glad_rags) (have_road_stake)
)

(:action move_0_0_1_0
 :parameters ()
 :precondition (and (at_x0) (at_y0))
 :poss-precondition (and (have_glad_rags) (have_road_stake))
 :effect (and (not (at_x0)) (at_x1))
 :poss-effect (and (not (have_glad_rags)) (not (have_road_stake)))
)

(:action move_1_0_0_0
 :parameters ()
 :precondition (and (at_x1) (at_y0))
 :poss-precondition (and (have_bindle) (have_glad_rags) (have_road_stake))
 :effect (and (not (at_x1)) (at_x0))
 :poss-effect (and (not (have_bindle)) (not (have_glad_rags)) (not (have_road_stake)))
)

(:action move_0_0_0_1
 :parameters ()
 :precondition (and (at_x0) (at_y0))
 :poss-precondition (and (have_bindle))
 :effect (and (not (at_y0)) (at_y1))
 :poss-effect (and (not (have_bindle)))
)

(:action move_0_1_0_0
 :parameters ()
 :precondition (and (at_x0) (at_y1))
 :poss-precondition (and (have_bindle) (have_glad_rags))
 :effect (and (not (at_y1)) (at_y0))
 :poss-effect (and (not (have_bindle)) (not (have_glad_rags)))
)

(:action move_0_1_1_1
 :parameters ()
 :precondition (and (at_x0) (at_y1))
 :poss-precondition (and (have_california_blankets) (have_road_stake))
 :effect (and (not (at_x0)) (at_x1))
 :poss-effect (and (not (have_california_blankets)) (not (have_road_stake)))
)

(:action move_1_1_0_1
 :parameters ()
 :precondition (and (at_x1) (at_y1))
 :poss-precondition (and (have_bindle) (have_california_blankets) (have_road_stake))
 :effect (and (not (at_x1)) (at_x0))
 :poss-effect (and (not (have_bindle)) (not (have_california_blankets)) (not (have_road_stake)))
)

(:action move_1_0_1_1
 :parameters ()
 :precondition (and (at_x1) (at_y0))
 :poss-precondition (and (have_bindle) (have_glad_rags))
 :effect (and (not (at_y0)) (at_y1))
 :poss-effect (and (not (have_bindle)) (not (have_glad_rags)))
)

(:action move_1_1_1_0
 :parameters ()
 :precondition (and (at_x1) (at_y1))
 :poss-precondition (and (have_bindle) (have_glad_rags) (have_road_stake))
 :effect (and (not (at_y1)) (at_y0))
 :poss-effect (and (not (have_bindle)) (not (have_glad_rags)) (not (have_road_stake)))
)

(:action gamble_bindle_0_0
 :parameters ()
 :precondition (and (at_x0) (at_y0))
 :effect (and )
 :poss-effect (and (have_bindle))
)

(:action gamble_california_blankets_0_0
 :parameters ()
 :precondition (and (at_x0) (at_y0))
 :effect (and )
 :poss-effect (and (have_california_blankets))
)

(:action gamble_glad_rags_0_0
 :parameters ()
 :precondition (and (at_x0) (at_y0))
 :effect (and )
 :poss-effect (and (have_glad_rags))
)

(:action gamble_road_stake_0_0
 :parameters ()
 :precondition (and (at_x0) (at_y0))
 :effect (and )
 :poss-effect (and (have_road_stake))
)

(:action gamble_bindle_0_1
 :parameters ()
 :precondition (and (at_x0) (at_y1))
 :effect (and )
 :poss-effect (and (have_bindle))
)

(:action gamble_bindle_1_0
 :parameters ()
 :precondition (and (at_x1) (at_y0))
 :effect (and )
 :poss-effect (and (have_bindle))
)

(:action gamble_glad_rags_1_0
 :parameters ()
 :precondition (and (at_x1) (at_y0))
 :effect (and )
 :poss-effect (and (have_glad_rags))
)

(:action gamble_california_blankets_1_1
 :parameters ()
 :precondition (and (at_x1) (at_y1))
 :effect (and )
 :poss-effect (and (have_california_blankets))
)

(:action gamble_road_stake_1_1
 :parameters ()
 :precondition (and (at_x1) (at_y1))
 :effect (and )
 :poss-effect (and (have_road_stake))
)

(:action easymark_bindle_0_1
 :parameters ()
 :precondition (and (at_x0) (at_y1))
 :effect (and (have_bindle))
)

(:action easymark_glad_rags_1_0
 :parameters ()
 :precondition (and (at_x1) (at_y0))
 :effect (and (have_glad_rags))
)
)
