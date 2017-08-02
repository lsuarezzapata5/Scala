package scala

object Sesion5 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(89); 
   val eastwood = new Director("Clint", "Eastwood", 1930);System.out.println("""eastwood  : Director = """ + $show(eastwood ));$skip(58); 
		val mcTiernan = new Director("John", "McTiernan", 1951);System.out.println("""mcTiernan  : Director = """ + $show(mcTiernan ));$skip(57); 
		val nolan = new Director("Christopher", "Nolan", 1970);System.out.println("""nolan  : Director = """ + $show(nolan ));$skip(57); 
		val someBody = new Director("Just", "Some Body", 1990);System.out.println("""someBody  : Director = """ + $show(someBody ));$skip(54); 
		val memento = new Film("Memento", 2000, 8.5, nolan);System.out.println("""memento  : Film = """ + $show(memento ));$skip(61); 
		val darkKnight = new Film("Dark Knight", 2008, 9.0, nolan);System.out.println("""darkKnight  : Film = """ + $show(darkKnight ));$skip(58); 
		val inception = new Film("Inception", 2010, 8.8, nolan);System.out.println("""inception  : Film = """ + $show(inception ));$skip(79); 
		val highPlainsDrifter = new Film("High Plains Drifter", 1973, 7.7, eastwood);System.out.println("""highPlainsDrifter  : Film = """ + $show(highPlainsDrifter ));$skip(81); 
		val outlawJoseyWales = new Film("The Outlaw Josey Wales", 1976, 7.9, eastwood);System.out.println("""outlawJoseyWales  : Film = """ + $show(outlawJoseyWales ));$skip(63); 
		val unforgiven = new Film("Unforgiven", 1992, 8.3, eastwood);System.out.println("""unforgiven  : Film = """ + $show(unforgiven ));$skip(64); 
		val granTorino = new Film("Gran Torino", 2008, 8.2, eastwood);System.out.println("""granTorino  : Film = """ + $show(granTorino ));$skip(59); 
		val invictus = new Film("Invictus", 2009, 7.4, eastwood);System.out.println("""invictus  : Film = """ + $show(invictus ));$skip(60); 
		val predator = new Film("Predator", 1987, 7.9, mcTiernan);System.out.println("""predator  : Film = """ + $show(predator ));$skip(59); 
		val dieHard = new Film("Die Hard", 1988, 8.3, mcTiernan);System.out.println("""dieHard  : Film = """ + $show(dieHard ));$skip(85); 
		val huntForRedOctober = new Film("The Hunt for Red October", 1990, 7.6, mcTiernan);System.out.println("""huntForRedOctober  : Film = """ + $show(huntForRedOctober ));$skip(84); 
		val thomasCrownAffair = new Film("The Thomas Crown Affair", 1999, 6.8, mcTiernan);System.out.println("""thomasCrownAffair  : Film = """ + $show(thomasCrownAffair ));$skip(23); val res$0 = 
		eastwood.yearOfBirth;System.out.println("""res0: Int = """ + $show(res$0));$skip(24); val res$1 = 
		dieHard.director.name;System.out.println("""res1: String = """ + $show(res$1));$skip(31); val res$2 = 
		invictus.isDirectedBy(nolan);System.out.println("""res2: Boolean = """ + $show(res$2));$skip(66); val res$3 = 
		
		 highPlainsDrifter.copy(name = "L'homme des hautes plaines");System.out.println("""res3: Film = """ + $show(res$3));$skip(101); val res$4 = 
     thomasCrownAffair.copy(yearOfRealese = 1968,director = new Director("Norman", "Jewison", 1926));System.out.println("""res4: Film = """ + $show(res$4));$skip(34); val res$5 = 
		 inception.copy().copy().copy();System.out.println("""res5: Film = """ + $show(res$5))}
	

		
		  
}
