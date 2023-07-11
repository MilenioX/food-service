package com.mundox.foodservice.core.services

import com.mundox.foodservice.core.domain.Fruit

trait FruitService[F[_]] {

  def getFruits(): F[Either[String, List[Fruit]]]

  def getFruitById(id: Int): F[Either[String, Option[Fruit]]]
}
