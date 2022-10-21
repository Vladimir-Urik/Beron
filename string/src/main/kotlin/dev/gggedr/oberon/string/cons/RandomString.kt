package dev.gggedr.oberon.string.cons

import dev.gggedr.oberon.string.enums.StringCase
import java.util.*

class RandomString(private val builder: RandomString.Builder) {

    private val random = Random()
    private val alphabet = "abcdefghijklmnopqrstuvwxyz"
    private val numbers = "0123456789"
    private val symbols = "!@#$%^&*_=+-/.?<>)"

    class Builder {
        var length = 0

        var case = StringCase.MIXED

        var hasNumbers = false
        var hasSymbols = false
        var hasAlphabet = false

        fun setLength(length: Int): Builder {
            this.length = length
            return this
        }

        fun setUppercase(): Builder {
            this.case = StringCase.UPPERCASE
            return this
        }

        fun setLowercase(): Builder {
            this.case = StringCase.LOWERCASE
            return this
        }

        fun setNumbers(hasNumbers: Boolean): Builder {
            this.hasNumbers = hasNumbers
            return this
        }

        fun setSymbols(hasSymbols: Boolean): Builder {
            this.hasSymbols = hasSymbols
            return this
        }

        fun build(): RandomString {
            return RandomString(this)
        }
    }

    override fun toString(): String {
        val result = StringBuilder()
        val alphabet = StringBuilder()

        if (builder.hasAlphabet) {
            alphabet.append(this.alphabet)
        }

        if (builder.hasNumbers) {
            alphabet.append(this.numbers)
        }

        if (builder.hasSymbols) {
            alphabet.append(this.symbols)
        }

        for (i in 0 until builder.length) {
            val index = random.nextInt(alphabet.length)
            val randomChar = alphabet[index]
            result.append(randomChar)
        }

        if(builder.case != StringCase.MIXED) {
            if(builder.case == StringCase.UPPERCASE) {
                return result.toString().uppercase(Locale.getDefault())
            } else {
                return result.toString().lowercase(Locale.getDefault())
            }
        }

        return result.toString()
    }

}