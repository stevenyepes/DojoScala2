package models

//en scala ._ es el equivalente a .*
import sorm._

//jdbc:h2:mem:person h2 es el tipo de BD, mem es que es una bd en memoria, person el nombre de la base de datos
object DB extends Instance(entities= Seq(Entity[Person]()), url ="jdbc:h2:mem:person")