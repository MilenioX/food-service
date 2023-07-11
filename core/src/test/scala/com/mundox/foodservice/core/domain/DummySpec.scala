package com.mundox.foodservice.core.domain

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class DummySpec extends AnyFlatSpec with Matchers {

  "Dummy class" should "return the value sent" in {
    Dummy("Value").value shouldEqual "Value"
  }

}
