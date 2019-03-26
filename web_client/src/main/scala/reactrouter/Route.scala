package reactrouter

import slinky.core.ExternalComponent
import slinky.core.ReactComponentClass
import slinky.core.annotations.react
import slinky.core.facade.ReactElement

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("react-router-dom", JSImport.Default)
@js.native
object ReactRoute extends js.Object {
  val Route: js.Object = js.native
}

@js.native
trait RouteProps extends js.Object {
  val `match`: js.Object = js.native
  val location: js.Object = js.native
  val history: History = js.native
}

@js.native
trait History extends js.Object {
  def push(path: String, state: js.UndefOr[js.Object] = js.undefined): Unit = js.native
  def replace(path: String, state: js.UndefOr[js.Object] = js.undefined): Unit = js.native
}

@react object Route extends ExternalComponent {
  case class Props(component: UndefOr[ReactComponentClass[_]] = js.undefined,
                   render: UndefOr[js.Function1[RouteProps, ReactElement]] = js.undefined,
                   // children -> TODO
                   path: String | js.Array[String] = "/",
                   exact: Boolean = false,
                   strict: Boolean = false,
                   location: UndefOr[js.Object] = js.undefined,
                   sensitive: Boolean = false)

  override val component = ReactRoute.Route
}
