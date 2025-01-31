package domain.vo

@JvmInline
value class Width(val value: Int) {

    init {
        require(value > 0) { "너비는 1 이상이어야 합니다" }
    }

    operator fun times(other: Height): Int = value * other.value
}
