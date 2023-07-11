package com.mundox.foodservice.core.domain
trait Order

object Order {
  case class Caricacea() extends Order
  case class Caryophyllales() extends Order
  case class Cucurbitaceae() extends Order
  case class Cucurbitales() extends Order
  case class Ericales() extends Order
  case class Laurales() extends Order
  case class Malpighiales() extends Order
  case class Malvales() extends Order
  case class Myrtales() extends Order
  case class Myrtoideae() extends Order
  case class Poales() extends Order
  case class Rosales() extends Order
  case class Sapindales() extends Order
  case class Saxifragales() extends Order
  case class Solanales() extends Order
  case class Struthioniformes() extends Order
  case class Vitales() extends Order
  case class Zingiberales() extends Order
}