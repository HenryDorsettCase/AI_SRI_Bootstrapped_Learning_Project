(define (problem manyfault_p1)
    (:domain manyfault)
    (:objects o1 o2 o3 o4 o5)
    (:init 
    	(q o1)
    	(s o1 o2)
    	(s o2 o3) 
    	(s o3 o4)
    	(s o4 o5) 
    )

    (:goal (and (q o5) (p)))
)