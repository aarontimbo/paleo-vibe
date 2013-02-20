package com.atimbo.paleovibe

import com.atimbo.util.UnitOfMeasure

class Ingredient {
    String title

    Double amount
    UnitOfMeasure unitOfMeasure

    Date dateCreated = new Date()
    Date lastUpdated = new Date()

    static constraints = {

    }
}
