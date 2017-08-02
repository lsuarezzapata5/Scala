package scala

class Director(val firstName: String, val lastname: String, 
                  val yearOfBirth: Int) {
  
  def name():String={
    return firstName+" "+lastname
  }
  
}