(define (problem depotprob1212) (:domain Depot)
(:objects
	depot0 - Depot
	distributor0 distributor1 - Distributor
	truck0 truck1 - Truck
	pallet0 pallet1 pallet2 - Pallet
	crate0 crate1 crate2 crate3 crate4 crate5 crate6 crate7 crate8 crate9 - Crate
	hoist0 hoist1 hoist2 - Hoist)
(:init
	(at_location pallet0 depot0)
	(clear crate4)
	(at_location pallet1 distributor0)
	(clear crate8)
	(at_location pallet2 distributor1)
	(clear crate9)
	(at_location truck0 depot0)
	(at_location truck1 distributor0)
	(at_location hoist0 depot0)
	(at_location hoist1 distributor0)
	(at_location hoist2 distributor1)
	(at_location crate0 distributor1)
	(on crate0 pallet2)
	(at_location crate1 depot0)
	(on crate1 pallet0)
	(at_location crate2 distributor1)
	(on crate2 crate0)
	(at_location crate3 depot0)
	(on crate3 crate1)
	(at_location crate4 depot0)
	(on crate4 crate3)
	(at_location crate5 distributor1)
	(on crate5 crate2)
	(at_location crate6 distributor0)
	(on crate6 pallet1)
	(at_location crate7 distributor0)
	(on crate7 crate6)
	(at_location crate8 distributor0)
	(on crate8 crate7)
	(at_location crate9 distributor1)
	(on crate9 crate5)
	(heavy crate0)
	(heavy crate1)
	(heavy crate2)
	(heavy crate3)
	(heavy crate4)
	(light crate5)
	(light crate6)
	(light crate7)
	(light crate8)
	(light crate9)
	(okay truck0)
	(okay truck1)
	(empty truck0)
	(empty truck1)
)

(:goal (and
		(on crate0 crate5)
		(on crate1 pallet1)
		(on crate2 crate0)
		(on crate3 pallet2)
		(on crate4 crate6)
		(on crate5 crate4)
		(on crate6 crate9)
		(on crate7 crate1)
		(on crate8 crate3)
		(on crate9 pallet0)
	)
))
