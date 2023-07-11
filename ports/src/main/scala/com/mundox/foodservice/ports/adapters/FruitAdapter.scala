package com.mundox.foodservice.ports.adapters

import com.mundox.foodservice.core.domain.{Calories, Carbohydrates, Family, Fat, Fruit, Genus, NutritionFact, Order, Protein, Sugar}
import com.mundox.foodservice.core.services.FruitService
import com.mundox.foodservice.ports.acl.http.fruityvice.HttpCaller
import monix.eval.Task

class FruitAdapter extends FruitService[Task]{

  val httpCaller: HttpCaller = new HttpCaller()

  override def getFruits(): Task[Either[String,List[Fruit]]] =
    for {
      serviceRes <- httpCaller.callService()
      res <- Task {serviceRes.map(_ => List(Fruit("Hello",1, Family.Moraceae(), Order.Rosales(), Genus.Musa(), NutritionFact(Calories(10),Fat(13),Sugar(12),Carbohydrates(10),Protein(10)))))}
    } yield res

  override def getFruitById(id: Int): Task[Either[String, Option[Fruit]]] = ???
}
