package com.sammidev.employee.entity

import java.util.*

data class Absent(
    var employee: Employee,
    var come: Date,
    var go: Date
)