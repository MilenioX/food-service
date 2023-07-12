package com.mundox.foodservice.core.services

import com.mundox.foodservice.core.domain.Fruit

trait FruitService[F[_], R] {

  def getFruits[A]()(f: R => A): F[A]

  def getFruitById[A](id: Int): F[A]
}
