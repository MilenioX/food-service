package com.mundox.foodservice.ports

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class HelloSpec extends AnyFlatSpec with Matchers {
  "Hello" should "return hello" in {
    "Hello" shouldEqual "Hello"
  }
}
