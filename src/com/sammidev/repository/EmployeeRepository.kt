package com.sammidev.repository

import com.sammidev.entity.Employee
import java.io.BufferedReader
import java.io.FileReader

class EmployeeRepository {
    private var database = mutableListOf<Employee>()

    fun readEmployeeFile() {
        val absenCSV = "C:\\Users\\DELL\\Downloads\\KotlinFile\\src\\com\\sammidev\\data\\tarif.csv"
        try {
            val csvRates = FileReader(absenCSV)
            val reader = BufferedReader(csvRates)
            var data = reader.readLine() // ignore the header

            while (reader.readLine().also { data = it } != null) {
                val line = data.split(",".toRegex()).toTypedArray()

                // [0] -> employee_number, [1] -> employee_name, [...] -> ...
                val employeeTemp = Employee(
                    nomor = line[0],
                    name = line[1],
                    salary = line[2].toBigDecimal(),
                    amercement = line[3].toBigDecimal(),
                    overtime = line[4].toBigDecimal(),
                    transport = line[5].toBigDecimal()
                )
                database.add(employeeTemp)
            }
            reader.close()
        }catch (ex: Exception) {
            println(ex.printStackTrace())
        }
    }

    fun findAllEmployees(): MutableList<Employee> {
        return database
    }

    fun findByNomor(nomor: String): Employee? {
        database.forEach {
                employee -> if (nomor == employee.nomor) {
            return employee
        }
        }
        return null
    }

    fun findByName(name: String): Employee? {
        database.forEach {
                employee -> if (name == employee.name) { return employee }
        }
        return null
    }
}