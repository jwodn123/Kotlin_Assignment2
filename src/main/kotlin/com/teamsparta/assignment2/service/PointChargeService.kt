package com.teamsparta.assignment2.service

import com.teamsparta.assignment2.dto.PointChargeRequest
import com.teamsparta.assignment2.dto.PointChargeResponse
import com.teamsparta.assignment2.model.PointCharge
import com.teamsparta.assignment2.repository.PointChargeRepository
import org.springframework.stereotype.Service
import java.text.NumberFormat

@Service
class PointChargeService(private val pointChargeRepository: PointChargeRepository) {

    fun chargePoints(pointChargeRequest: PointChargeRequest): PointChargeResponse {

        val transaction = PointCharge(
            userId = pointChargeRequest.userId,
            amount = pointChargeRequest.amount
        )

        val savedTransaction = pointChargeRepository.save(transaction)
        val formattedAmount = formatAmount(savedTransaction.amount)

        return PointChargeResponse(
            userId = savedTransaction.userId,
            amountCharged = formattedAmount
        )
    }

    private fun formatAmount(amount: Long): String {
        val currencyFormatter = NumberFormat.getCurrencyInstance()
        return "${currencyFormatter.format(amount)}P"
    }
}