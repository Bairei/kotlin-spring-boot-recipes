package com.bairei.springrecipes.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class UnitOfMeasure (@Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long = 0,
                     var description: String = ""
)


