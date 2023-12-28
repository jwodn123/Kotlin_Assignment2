package com.teamsparta.assignment2.repository

import com.teamsparta.assignment2.model.Coffee
import org.springframework.data.jpa.repository.JpaRepository

interface MenuRepository: JpaRepository<Coffee, Long> {
}