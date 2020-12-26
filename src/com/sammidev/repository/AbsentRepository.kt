package com.sammidev.repository

import com.sammidev.controller.EmployeeServiceImpl
import com.sammidev.entity.Absent
import com.sammidev.entity.Employee
import java.io.BufferedReader
import java.io.FileReader
import java.text.SimpleDateFormat


class AbsentRepository {
    private val database = mutableListOf<Absent>()

    fun readAbsentFile() {
        val tarifCSV = "C:\\Users\\DELL\\Downloads\\KotlinFile\\src\\com\\sammidev\\data\\absen.csv"
        try {
            val csvRates = FileReader(tarifCSV)
            val reader = BufferedReader(csvRates)
            var data = reader.readLine() // ignore the header
            val parser = SimpleDateFormat("yyyy-MM-dd HH:mm")

            while (reader.readLine().also { data = it } != null) {
                val line = data.split(",".toRegex()).toTypedArray()

                val nomor = line[0]
                val date = line[1]
                val come = line[2]
                val go = line[3]

                val employeeServiceImpl = EmployeeServiceImpl()
                employeeServiceImpl.readEmployeeFile()

                val findEmployee: Employee? = employeeServiceImpl.findByNomor(nomor)
                val absentTemp = findEmployee?.let {
                    Absent(
                        employee = it,
                        come = parser.parse("$date $come"),
                        go = parser.parse("$date $go")
                    )
                }
                absentTemp?.let { database.add(it) }
            }
            reader.close()
        }catch (ex: Exception) {
            println(ex.printStackTrace())
        }

        println(this.database)
    }

    fun findAllAbsent(): MutableList<Absent> {
        return database
    }
}