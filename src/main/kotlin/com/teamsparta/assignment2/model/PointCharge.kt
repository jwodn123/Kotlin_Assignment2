package com.teamsparta.assignment2.model

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "point_charge")
class PointCharge(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(name = "user_id")
    val userId: Long,

    @Column(name = "amount")
    var amount: Long
)
