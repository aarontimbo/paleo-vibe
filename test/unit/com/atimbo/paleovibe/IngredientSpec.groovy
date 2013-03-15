package com.atimbo.paleovibe

import com.atimbo.util.UnitOfMeasure
import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(Ingredient)
class IngredientSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "Add a new ingredient"() {

        when: "a new ingredient is created"
        new Ingredient(
                title: title,
                amount: 0.5,
                unitOfMeasure: UnitOfMeasure.TABLESPOON
        ).save()

        then: "the ingredient can be found"
        assert Ingredient.findByTitle(title)

        where:
        title = "ground cumin"

    }
}