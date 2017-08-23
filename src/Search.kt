import java.math.BigInteger

/**
 * Created by Euranto on 25/07/2017.
 */

fun fibonacci(n: Int): (Int) {
    if (n <= 1) return 1
    return fibonacci(n - 1) + fibonacci(n - 2)
}

fun levenshtein(s1: String, s2: String): Int {

    val d = Array(s1.length + 1) { IntArray(s2.length + 1) }

    for (i in 0..s1.length) {
        d[i][0] = i
    }

    for (j in 1..s2.length) {
        d[0][j] = j
    }

    for (i in 1..s1.length) {
        for (j in 1..s2.length) {
            val cost = if (s1[i - 1] == s2[j - 1]) 0 else 1
            d[i][j] = Math.min(d[i - 1][j] + 1, Math.min(d[i][j - 1] + 1, d[i - 1][j - 1] + cost))
        }
    }

    return d[s1.length][s2.length]
}