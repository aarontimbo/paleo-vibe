package com.atimbo.paleovibe

import com.atimbo.util.Rating
import grails.plugin.spock.UnitSpec

class RecipeSpec extends UnitSpec {

    void "Create a new recipe"() {
       given:
       mockDomain(Recipe)

       when:
       new Recipe(
               title: title,
               rating: Rating.GOOD,
               userCreated: user,
               userUpdated: user
       ).save()

       then:
       assert Recipe.findByTitle(title)

       where:
       title = "Pork stew"
       user = "ast"
    }
}
