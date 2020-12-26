package com.sammidev.service

import com.sammidev.entity.Absent

interface AbsentService {
    fun readAbsentFile()
    fun findAllAbsent() : List<Absent>
}