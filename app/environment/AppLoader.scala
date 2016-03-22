package environment

import controllers.DemoController
import play.api.ApplicationLoader.Context
import play.api.routing.Router
import play.api.{Application, ApplicationLoader, BuiltInComponentsFromContext}
import router.Routes

class AppLoader extends ApplicationLoader {
  override def load(context: Context): Application = new AppComponents(context).application
}

class AppComponents(context: Context) extends BuiltInComponentsFromContext(context) {

  lazy val appController = new DemoController()

  override def router: Router = new Routes(
    httpErrorHandler, appController
  )
}