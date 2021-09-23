package com.android.testing

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correct passwords returns true`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Zarka",
            "123",
            "123"
        )

        assertThat(result).isTrue()
    }

    @Test
    fun `username exists returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Maki",
            "123",
            "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `password is empty returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Maki",
            "",
            ""
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `password repeated incorrectly returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Maki",
            "123",
            "456"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `password contains less than 2 digts returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Maki",
            "1",
            "1"
        )

        assertThat(result).isFalse()
    }
}