package com.mundox.foodservice.ports.adapters

import com.mundox.foodservice.core.services.FruitService
import com.mundox.foodservice.ports.acl.http.fruityvice.HttpCaller
import monix.eval.Task

class FruitAdapter extends FruitService[Task, Either[String, String]]{

  val httpCaller: HttpCaller = new HttpCaller()

  override def getFruits[A]()(f: Either[String, String] => A): Task[A] =
    for {
      serviceRes <- httpCaller.callService()
      res <- Task {f(serviceRes)}
    } yield res

  override def getFruitById[A](id: Int): Task[A] = ???
}
