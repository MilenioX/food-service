package com.mundox.foodservice.ports.config.properties

import pureconfig.ConfigSource
import pureconfig.generic.auto._

case class Configuration(
                        http: HttpConfig
                        )

object Configuration {

  def loadConfiguration(): Option[Configuration] =
    ConfigSource
      .resources("properties.conf")
      .load[Configuration]
      .toOption
}