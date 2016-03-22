package controllers

import play.api.mvc._

class DemoController extends Controller {

  def index = Action {
    Ok("This is a test").withSession("some-key" -> "some-value")
  }
}