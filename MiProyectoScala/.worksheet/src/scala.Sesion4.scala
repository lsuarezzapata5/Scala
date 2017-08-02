package scala

object Sesion4 {
  class Cat(val name: String, val colour: String, val food:String){
  	  
  };import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(156); 
  
  val cat1=new Cat("Oswalt","Black","Milk");System.out.println("""cat1  : scala.Sesion4.Cat = """ + $show(cat1 ));$skip(49); 
  val cat2=new Cat("Henderson","Ginger","Chips");System.out.println("""cat2  : scala.Sesion4.Cat = """ + $show(cat2 ));$skip(56); 
  val cat3=new Cat("Quentin","Tabby and White","Curry");System.out.println("""cat3  : scala.Sesion4.Cat = """ + $show(cat3 ));$skip(21); 
  println(cat1.name)
  
  object ChipShop{
  	def willserve(c: Cat): Boolean=
  	  	c.food=="Chips"
  };$skip(113); val res$0 = 
  
  ChipShop.willserve(cat1);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(27); val res$1 = 
  ChipShop.willserve(cat2);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(27); val res$2 = 
  ChipShop.willserve(cat3);System.out.println("""res2: Boolean = """ + $show(res$2))}
  
  
}
