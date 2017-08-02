package scala

object Sesion3 {

	  object Test2 {
	def name: String = "Probably the best object ever"
	};import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(117); val res$0 = 
	Test2.name
	
	object Test3 {
		def hello(name: String) =
		"Hello " + name
	};System.out.println("""res0: String = """ + $show(res$0));$skip(88); val res$1 = 
	Test3.hello("Noel")
	
	object Test4 {
		val name = "Noel"
		def hello(other: String): String =
		name + " says hi to " + other
	};System.out.println("""res1: String = """ + $show(res$1));$skip(131); val res$2 = 
	Test4.hello("Dave")
	
	object Test7 {
		val simpleField = {
			println("Evaluating simpleField")
			42
		}
		def noParameterMethod = {
			println("Evaluating noParameterMethod")
			42
		}
	};System.out.println("""res2: String = """ + $show(res$2));$skip(190); val res$3 = 
	Test7.simpleField;System.out.println("""res3: Int = """ + $show(res$3));$skip(25); val res$4 = 
	Test7.noParameterMethod;System.out.println("""res4: Int = """ + $show(res$4));$skip(27); val res$5 = 
	if(1<2) "Alien" else 2001;System.out.println("""res5: Any = """ + $show(res$5));$skip(27); val res$6 = 
	if(1>2) "Alien" else 2001;System.out.println("""res6: Any = """ + $show(res$6));$skip(19); val res$7 = 
	if(false) "hello";System.out.println("""res7: Any = """ + $show(res$7))}
}
