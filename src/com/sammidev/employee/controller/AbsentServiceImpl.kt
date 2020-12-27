package com.sammidev.employee.controller

import com.sammidev.employee.entity.Absent
import com.sammidev.employee.repository.AbsentRepository
import com.sammidev.employee.service.AbsentService

class AbsentServiceImpl : AbsentService {
    private val absentRepository = AbsentRepository()

    override fun readAbsentFile() = absentRepository.readAbsentFile()
    override fun findAllAbsent(): List<Absent> = absentRepository.findAllAbsent()

}