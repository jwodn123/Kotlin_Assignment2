package com.teamsparta.assignment2.service

import com.teamsparta.assignment2.dto.MenuResponse
import com.teamsparta.assignment2.repository.MenuRepository
import org.springframework.stereotype.Service

@Service
class MenuService(private val menuRepository: MenuRepository) {

    fun getAllCoffees(): List<MenuResponse> {
        val coffeeList = menuRepository.findAll()
        return coffeeList.map { coffee ->
            MenuResponse(
                id = coffee.id,
                name = coffee.name,
                description = coffee.explanation,
                price = coffee.price
            )
        }
    }
}