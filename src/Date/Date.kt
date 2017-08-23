package Date

class Date(m: Int, d: Int, y: Int) {

    private val value: Int = y * 512 + m * 32 + d

    fun month(): Int {
        return value / 32 % 16
    }

    fun day(): Int {
        return value % 32
    }

    fun year(): Int {
        return value / 512
    }

    override fun toString(): String {
        return month().toString() + "/" + day() + "/" + year()
    }
}