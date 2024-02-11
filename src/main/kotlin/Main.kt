package main.kotlin

fun main() {
    println("Hello, World!")

    var n : Int = 2 // [var]은 가변 변수
    n = 10

    val m : Int = 11 // [val]은 불변 변수

    println("fibo 10: " + fibonacci(n))
    println("fibo 11: " + fibonacci(m))
}

fun fibonacci(n: Int): Int =
    if (n <= 1) n
    else fibonacci(n - 1) + fibonacci(n - 2)

// 위 함수와 동일
//fun fibonacci(n: Int): Int {
//    if (n <= 1) {
//        return n
//    }
//    else {
//        return fibonacci(n - 1) + fibonacci(n - 2)
//    }
//}
