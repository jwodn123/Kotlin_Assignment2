package com.teamsparta.assignment2.controller

import com.teamsparta.assignment2.dto.PointChargeRequest
import com.teamsparta.assignment2.dto.PointChargeResponse
import com.teamsparta.assignment2.service.PointChargeService
import org.springframework.http.*
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/points")
class PointChargeController(private val pointChargeService: PointChargeService) {

    // 포인트 충전
    @PostMapping
    fun chargePoints(@RequestBody pointChargeRequest: PointChargeRequest): ResponseEntity<PointChargeResponse> {
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(pointChargeService.chargePoints(pointChargeRequest))
    }
}