package dk.colle.steamproject.util

class Consumable<T>(private val data: T){
    private var consumed = false

    fun consume(block: Consumable<T>.(T) -> Unit){
        if (!consumed){
            consumed = true
            block(data)
        }
    }
}