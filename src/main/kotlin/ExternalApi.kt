import kotlin.random.Random

class ExternalApi {

    fun calculateName(): String? {
        return if (Random.nextInt() != 0) return "name" else null
    }
}