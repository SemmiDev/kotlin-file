package com.sammidev.studentAuth.validation

class Validation {
    fun nameValidator(name: String): Boolean {
        return when (name.length) {
            in 5..30 -> {
                true
            }
            else -> {
                false
            }
        }

    }

    fun nimValidator(nim: String): Boolean {
        return when (nim.length) {
            10 -> {
                true
            }
            else -> {
                false
            }
        }
    }

    fun emailValidator(email: String): Boolean {
        when {
            nameValidator(email) && email.contains("@") && email.contains(".") -> {
                return true
            }
            else -> {
                return false
            }
        }
    }

    fun phoneNumberValidator(phoneNumber: String): Boolean {
        return nimValidator(phoneNumber)
    }

    fun passwordValidator(password: String): Boolean {
        return password.length < 50
    }
}