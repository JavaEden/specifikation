package com.eden.speks.impl.strings

import com.eden.speks.api.Spek

class MinLengthSpek(val minLength: Int) : Spek<String, Boolean> {
    override suspend fun evaluate(candidate: String): Boolean {
        return candidate.length >= minLength
    }
}

class MaxLengthSpek(val minLength: Int) : Spek<String, Boolean> {
    override suspend fun evaluate(candidate: String): Boolean {
        return candidate.length <= minLength
    }
}
