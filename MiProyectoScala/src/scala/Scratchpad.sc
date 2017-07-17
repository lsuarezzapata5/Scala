package scala

object Scratchpad {
	val p= new Persona("luisa")               //> p  : Persona = scala.Persona@3eb07fd3
	println(5.min(2))                         //> 2
  println(2.min(5))                               //> 2
  //"Hello world!"
  "3".toInt                                       //> res0: Int = 3
  3.2.toInt                                       //> res1: Int = 3
  "hello".toUpperCase                             //> res2: String = HELLO
  "luisa".take(3)                                 //> res3: String = lui
  "hola mundo".take(3+1)                          //> res4: String = hola
  43-3+2                                          //> res5: Int = 42
  "programar es una maravilla".split(" ")         //> res6: Array[String] = Array(programar, es, una, maravilla)
  "foo".take(1)                                   //> res7: String = f
  1.+(2).-(0)                                     //> res8: Int = 3
  true                                            //> res9: Boolean(true) = true
  false                                           //> res10: Boolean(false) = false
  'a'                                             //> res11: Char('a') = a
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
}