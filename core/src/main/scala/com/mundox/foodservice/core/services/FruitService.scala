package com.mundox.foodservice.core.services

import com.mundox.foodservice.core.domain.Fruit

trait FruitService[F[_]] {

  def getFruits(): F[List[Fruit]]

  def getFruitById(id: Int): F[Option[Fruit]]
}
