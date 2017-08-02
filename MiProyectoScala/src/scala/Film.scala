package scala

class Film(val name: String, val yearOfRealese: Int,
            val imdRating: Double, val director:Director) {
  def directorAge():Int={
    return yearOfRealese-director.yearOfBirth
  }
  
  def isDirectedBy(dir:Director):Boolean={
    return this.director.equals(dir)
  }
  
  def copy( name:String = this.name,  yearOfRealese: Int= this.yearOfRealese,
            imdRating: Double= this.imdRating, 
            director:Director= this.director) ={
    println(name+ " " + yearOfRealese +" "+ imdRating + " "+ director.name())  
    new Film(name,yearOfRealese,imdRating, director)
     
    
            
  }
}