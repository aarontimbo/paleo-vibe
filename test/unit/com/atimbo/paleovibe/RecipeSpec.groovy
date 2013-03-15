package com.atimbo.paleovibe

import com.atimbo.util.Rating
import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(Recipe)
class RecipeSpec extends Specification {

    void "Create a new recipe"() {

       when: "a recipe is created"
       new Recipe(
               title: title,
               rating: Rating.GOOD,
               userCreated: user,
               userUpdated: user
       ).save()

       then: "the recipe exists"
       assert Recipe.findByTitle(title)

       where:
       title = "Pork stew"
       user = "ast"
    }
}
