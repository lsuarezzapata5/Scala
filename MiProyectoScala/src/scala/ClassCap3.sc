package scala

object ClassCap3 {
 class Person {
		val firstName = "Luisa"
		val lastName = "Suarez"
		def name = firstName + " " + lastName
	}
	
	val p=new Person()                        //> p  : scala.ClassCap3.Person = scala.ClassCap3$Person@25f38edc
	p.name                                    //> res0: String = Luisa Suarez
 
 object alien {
	def greet(p: Person) =
	"Greetings, " + p.firstName + " " + p.lastName
	}
	alien.greet(p)                            //> res1: String = Greetings, Luisa Suarez
	
	class Persona(first:String, last:String){
		val firstName=first
		val lastName=last
		def name= firstName+ " "+ lastName
	
	}
	
	val lui= new Persona("Luisa", "Suarez")   //> lui  : scala.ClassCap3.Persona = scala.ClassCap3$Persona$1@3f0ee7cb
	lui.firstName                             //> res2: String = Luisa
	
	
	
	
}