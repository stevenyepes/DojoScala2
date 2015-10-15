package  models
import play.api.libs.json.Json   

case class Person(name: String, age : Int)

object Person {
    
   //En  scala para tener una variable disponible desde cualquier sitio dentro del proyecto  se le agrega el implicit
   //Como es un objeto para traer de la base de datos usamos el json.format
   
   implicit val personFormat = Json.format[Person]
}