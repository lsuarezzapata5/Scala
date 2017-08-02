package scala

object Sesion5 {
   val eastwood = new Director("Clint", "Eastwood", 1930)
                                                  //> eastwood  : Director = scala.Director@3eb07fd3
		val mcTiernan = new Director("John", "McTiernan", 1951)
                                                  //> mcTiernan  : Director = scala.Director@7cf10a6f
		val nolan = new Director("Christopher", "Nolan", 1970)
                                                  //> nolan  : Director = scala.Director@7e0babb1
		val someBody = new Director("Just", "Some Body", 1990)
                                                  //> someBody  : Director = scala.Director@6debcae2
		val memento = new Film("Memento", 2000, 8.5, nolan)
                                                  //> memento  : Film = scala.Film@5ba23b66
		val darkKnight = new Film("Dark Knight", 2008, 9.0, nolan)
                                                  //> darkKnight  : Film = scala.Film@2ff4f00f
		val inception = new Film("Inception", 2010, 8.8, nolan)
                                                  //> inception  : Film = scala.Film@c818063
		val highPlainsDrifter = new Film("High Plains Drifter", 1973, 7.7, eastwood)
                                                  //> highPlainsDrifter  : Film = scala.Film@3f0ee7cb
		val outlawJoseyWales = new Film("The Outlaw Josey Wales", 1976, 7.9, eastwood)
                                                  //> outlawJoseyWales  : Film = scala.Film@75bd9247
		val unforgiven = new Film("Unforgiven", 1992, 8.3, eastwood)
                                                  //> unforgiven  : Film = scala.Film@7d417077
		val granTorino = new Film("Gran Torino", 2008, 8.2, eastwood)
                                                  //> granTorino  : Film = scala.Film@7dc36524
		val invictus = new Film("Invictus", 2009, 7.4, eastwood)
                                                  //> invictus  : Film = scala.Film@35bbe5e8
		val predator = new Film("Predator", 1987, 7.9, mcTiernan)
                                                  //> predator  : Film = scala.Film@2c8d66b2
		val dieHard = new Film("Die Hard", 1988, 8.3, mcTiernan)
                                                  //> dieHard  : Film = scala.Film@5a39699c
		val huntForRedOctober = new Film("The Hunt for Red October", 1990, 7.6, mcTiernan)
                                                  //> huntForRedOctober  : Film = scala.Film@3cb5cdba
		val thomasCrownAffair = new Film("The Thomas Crown Affair", 1999, 6.8, mcTiernan)
                                                  //> thomasCrownAffair  : Film = scala.Film@56cbfb61
		eastwood.yearOfBirth              //> res0: Int = 1930
		dieHard.director.name             //> res1: String = John McTiernan
		invictus.isDirectedBy(nolan)      //> res2: Boolean = false
		
		 highPlainsDrifter.copy(name = "L'homme des hautes plaines")
                                                  //> L'homme des hautes plaines 1973 7.7 Clint Eastwood
                                                  //| res3: Film = scala.Film@6bdf28bb
     thomasCrownAffair.copy(yearOfRealese = 1968,director = new Director("Norman", "Jewison", 1926))
                                                  //> The Thomas Crown Affair 1968 6.8 Norman Jewison
                                                  //| res4: Film = scala.Film@6b71769e
		 inception.copy().copy().copy()   //> Inception 2010 8.8 Christopher Nolan
                                                  //| Inception 2010 8.8 Christopher Nolan
                                                  //| Inception 2010 8.8 Christopher Nolan
                                                  //| res5: Film = scala.Film@2752f6e2
	

		
		  
}