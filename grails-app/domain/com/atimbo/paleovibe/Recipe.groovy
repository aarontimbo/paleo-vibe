package com.atimbo.paleovibe

import com.atimbo.util.Rating

class Recipe {
    String title
    String description

    Rating rating

    String userCreated
    String userUpdated

    Date dateCreated = new Date()
    Date lastUpdated = new Date()

    //static hasMany = [ ingredients: RecipeIngredient ]

    static constraints = {
        description nullable: true, maxSize: 2000
        rating nullable: true
        userCreated maxSize: 50
        userUpdated maxSize: 50
    }

}
