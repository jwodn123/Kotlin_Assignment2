package com.teamsparta.assignment2.controller

import com.teamsparta.assignment2.dto.MenuResponse
import com.teamsparta.assignment2.service.MenuService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/menus")
class MenuController(private val menuService: MenuService) {

    // 커피 메뉴 조회
    @GetMapping
    fun getMenuList(): ResponseEntity<List<MenuResponse>> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(menuService.getAllCoffees())
    }
}