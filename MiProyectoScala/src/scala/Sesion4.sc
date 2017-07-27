package scala

object Sesion4 {
  class Cat(val name: String, val colour: String, val food:String){
  	  
  }
  
  val cat1=new Cat("Oswalt","Black","Milk")       //> cat1  : scala.Sesion4.Cat = scala.Sesion4$Cat@25f38edc
  val cat2=new Cat("Henderson","Ginger","Chips")  //> cat2  : scala.Sesion4.Cat = scala.Sesion4$Cat@7cf10a6f
  val cat3=new Cat("Quentin","Tabby and White","Curry")
                                                  //> cat3  : scala.Sesion4.Cat = scala.Sesion4$Cat@7e0babb1
  println(cat1.name)                              //> Oswalt
  
  object ChipShop{
  	def willserve(c: Cat): Boolean=
  	  	c.food=="Chips"
  }
  
  ChipShop.willserve(cat1)                        //> res0: Boolean = false
  ChipShop.willserve(cat2)                        //> res1: Boolean = true
  ChipShop.willserve(cat3)                        //> res2: Boolean = false
  
  
}