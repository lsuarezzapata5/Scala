package scala

object Sesion3 {

	  object Test2 {
	def name: String = "Probably the best object ever"
	}
	Test2.name                                //> res0: String = Probably the best object ever
	
	object Test3 {
		def hello(name: String) =
		"Hello " + name
	}
	Test3.hello("Noel")                       //> res1: String = Hello Noel
	
	object Test4 {
		val name = "Noel"
		def hello(other: String): String =
		name + " says hi to " + other
	}
	Test4.hello("Dave")                       //> res2: String = Noel says hi to Dave
	
	object Test7 {
		val simpleField = {
			println("Evaluating simpleField")
			42
		}
		def noParameterMethod = {
			println("Evaluating noParameterMethod")
			42
		}
	}
	Test7.simpleField                         //> Evaluating simpleField
                                                  //| res3: Int = 42
	Test7.noParameterMethod                   //> Evaluating noParameterMethod
                                                  //| res4: Int = 42
	if(1<2) "Alien" else 2001                 //> res5: Any = Alien
	if(1>2) "Alien" else 2001                 //> res6: Any = 2001
	if(false) "hello"                         //> res7: Any = ()
}