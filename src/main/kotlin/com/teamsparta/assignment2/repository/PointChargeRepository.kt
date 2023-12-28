package com.teamsparta.assignment2.repository

import com.teamsparta.assignment2.model.PointCharge
import org.springframework.data.jpa.repository.JpaRepository

interface PointChargeRepository: JpaRepository<PointCharge, Long> {
}