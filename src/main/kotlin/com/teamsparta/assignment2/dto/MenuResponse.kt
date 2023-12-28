package com.teamsparta.assignment2.dto

data class MenuResponse(
    val id: Long?,
    val name: String,
    val description: String,
    var price: Double
) {
    constructor(name: String, description: String, price: Double) : this(null, name, description, price)
}
