package scala

object ClassCap3 {
 class Person {
		val firstName = "Luisa"
		val lastName = "Suarez"
		def name = firstName + " " + lastName
	};import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(166); 
	
	val p=new Person();System.out.println("""p  : scala.ClassCap3.Person = """ + $show(p ));$skip(8); val res$0 = 
	p.name
 
 object alien {
	def greet(p: Person) =
	"Greetings, " + p.firstName + " " + p.lastName
	};System.out.println("""res0: String = """ + $show(res$0));$skip(109); val res$1 = 
	alien.greet(p)
	
	class Persona(first:String, last:String){
		val firstName=first
		val lastName=last
		def name= firstName+ " "+ lastName
	
	};System.out.println("""res1: String = """ + $show(res$1));$skip(172); 
	
	val lui= new Persona("Luisa", "Suarez");System.out.println("""lui  : scala.ClassCap3.Persona = """ + $show(lui ));$skip(15); val res$2 = 
	lui.firstName;System.out.println("""res2: String = """ + $show(res$2))}
	
	
	
	
}
