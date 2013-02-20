package com.atimbo.paleovibe

import com.atimbo.util.UnitOfMeasure
import grails.plugin.spock.UnitSpec

class IngredientSpec extends UnitSpec {

    def setup() {
    }

    def cleanup() {
    }

    void "Add a new ingredient"() {
        given:
        mockDomain(Ingredient)

        when:
        new Ingredient(
                title: title,
                amount: 0.5,
                unitOfMeasure: UnitOfMeasure.TABLESPOON
        ).save()

        then:
        assert Ingredient.findByTitle(title)

        where:
        title = "ground cumin"

    }
}