package com.mundox.foodservice.core.domain

case class Fruit(
                  name: String,
                  id: Int,
                  family: Family,
                  order: Order,
                  genus: Genus,
                  nutritionFacts: NutritionFact,
)