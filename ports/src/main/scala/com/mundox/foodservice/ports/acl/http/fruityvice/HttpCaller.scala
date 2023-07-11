package com.mundox.foodservice.ports.acl.http.fruityvice

import monix.eval.Task
import sttp.capabilities.WebSockets
import sttp.client3._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.concurrent.duration._

class HttpCaller {

  implicit val backend: SttpBackend[Future, WebSockets] = HttpClientFutureBackend(options=SttpBackendOptions.connectionTimeout(25.seconds))

  def callService(): Task[Either[String, String]] = {
    Task.fromFuture {
      basicRequest
        .get(uri"https://www.fruityvice.com/api/fruit/all")
        .send()
        .map(_.body)
    }
  }

}
