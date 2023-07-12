package com.mundox.foodservice.ports.config.environment

import com.mundox.foodservice.core.environment.IEnvironment
import com.mundox.foodservice.core.services.FruitService
import com.mundox.foodservice.ports.adapters.FruitAdapter
import com.mundox.foodservice.ports.config.properties.Configuration
import monix.eval.Task

class Environment private(config: Configuration) extends IEnvironment[Task, Either[String, String]] {

  override def fruitsService: FruitService[Task, Either[String, String]] = new FruitAdapter
}

object Environment {
  def startEnvironment(): Option[Environment] = {
    Configuration.loadConfiguration().map(conf => {
      new Environment(conf)
    })
  }
}
