package dk.colle.steamproject.util

import java.lang.Exception

sealed class Result <out T: Any>{
    data class Success<out T: Any>(val data: T): Result<T>()
    data class Error(val message: String, val exception: Exception): Result<Nothing>()
}
