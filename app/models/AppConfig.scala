package models

import play.api.Play
import play.api.Play.current

object AppConfig {
  val DEFAULT_CONTEXT = "CONSOLE"
  val DEFAULT_COOKIE = "PROTE_SESSION"

  val targetHost = Play.configuration.getString("target.host")
  val forceSSL = Play.configuration.getBoolean("target.ssl").getOrElse(false)
  val consoleContext = Play.configuration.getString("console.context").getOrElse(DEFAULT_CONTEXT)
  val cookieName = Play.configuration.getString("cookie.name").getOrElse(DEFAULT_COOKIE)
}