package com.example.prueba.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name= "Asistente")
class Asistente {
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Id
        @Column(updatable = false)

        var id:Long? = null
    var nui:String? = null
    var name:String? = null
    var mail:String? = null
    var institution:String? = null
    var position:String? = null
}

