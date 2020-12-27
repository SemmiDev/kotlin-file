package com.sammidev.employee.service

import com.sammidev.employee.entity.Absent

interface AbsentService {
    fun readAbsentFile()
    fun findAllAbsent() : List<Absent>
}