package com.mundox.foodservice.core.domain

trait Fact {
  def value: Double
}

case class Calories(value: Double) extends Fact
case class Fat(value: Double) extends Fact
case class Sugar(value: Double) extends Fact
case class Carbohydrates(value: Double) extends Fact
case class Protein(value: Double) extends Fact

case class NutritionFact(
                        calories: Calories,
                        fat: Fat,
                        sugar: Sugar,
                        carbohydrates: Carbohydrates,
                        protein: Protein
                        )