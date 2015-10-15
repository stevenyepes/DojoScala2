package controllers

import play.api._
import play.api.mvc._
import play.api.data.Form
import play.api.data.Forms._
import models.{Person,DB}

class Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  
  
  
  //Los metodos html deben retornar un valor
 def addPerson = Action { implicit request =>
    
    val persons = formPerson.bindFromRequest.get
    //Una vez guardada una persona redireccione de nuevo al formulario index:
    Redirect(routes.Application.index)
 }

 val formPerson: Form[Person] = Form {
    mapping (
        "name" -> text,
        "age" -> number
    )(Person.apply)(Person.unapply)
 }
}
