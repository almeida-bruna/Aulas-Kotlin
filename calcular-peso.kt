fun pesoIdeal(h: Double, fn:(Double) -> (Double)): Double {
     return fn(h)
}

fun pesoHomem(h: Double) = 72.5 * h - 58

fun pesoMulher(h: Double) = 62.1 * h - 44.7

fun main(args: Array<String>) {
    var p = pesoIdeal(1.70) { 72.5 * it - 58 }
    print(p)
}
