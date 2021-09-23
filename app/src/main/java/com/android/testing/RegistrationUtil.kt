package com.android.testing

object RegistrationUtil {

    /**
     * input is not valid if:
     * ..the username/pass is empty
     * ..the username is taken
     * ..passwords are not same
     * ..pass contains less than 2 ddigts
     */

    private val existingUserList = arrayListOf("Aki", "Maki", "Dlaki", "Faki")

    fun validateRegistrationInput(
        userName: String,
        password: String,
        confirmPassword: String
    ): Boolean {
        if (userName.isEmpty() || password.isEmpty())
            return false

        if (userName in existingUserList)
            return false

        if (confirmPassword != password)
            return false

        if (password.count{it.isDigit()} < 2)
            return false

        return true
    }
}