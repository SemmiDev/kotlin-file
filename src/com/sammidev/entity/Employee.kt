package com.sammidev.entity

import java.math.BigDecimal

data class Employee(
    var nomor: String,
    var name: String,
    var salary: BigDecimal,
    var amercement: BigDecimal,
    var overtime: BigDecimal,
    var transport: BigDecimal
)