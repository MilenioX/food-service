package com.mundox.foodservice.core.environment

import com.mundox.foodservice.core.services.FruitService

trait IEnvironment[F[_], T] {

  def fruitsService: FruitService[F, T]
}
