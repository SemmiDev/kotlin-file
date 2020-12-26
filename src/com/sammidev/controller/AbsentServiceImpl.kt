package com.sammidev.controller

import com.sammidev.entity.Absent
import com.sammidev.repository.AbsentRepository
import com.sammidev.service.AbsentService

class AbsentServiceImpl : AbsentService {
    private val absentRepository = AbsentRepository()

    override fun readAbsentFile( ) = absentRepository.readAbsentFile()
    override fun findAllAbsent(): List<Absent> = absentRepository.findAllAbsent()

}