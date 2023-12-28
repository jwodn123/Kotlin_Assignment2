package com.teamsparta.assignment2.model

import jakarta.persistence.*

@Entity
@Table(name = "coffee")
data class Coffee(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(name = "name")
    val name: String,

    @Column(name = "explanation")
    val explanation: String,

    @Column(name = "price")
    var price: Double,
)