package main.kotlin

fun main() {
    println("Hello, World!")
    println()

    var n : Int = 2 // [var]은 가변 변수
    n = 10
    val m : Int = 11 // [val]은 불변

    println("var n: " + n)
    println("var n: $n")
    println("var n: $n.toString()")
    println("var n: ${n.toString()}")
    println("n is ${if (n == 10) "10" else "not 10"}")
    println("qwer\$asdf")
    println()

//    [?]가 있으면 null 값을 가질 수 있음
//    val a : Int = null // Non-Null 타입이므로 오류 발생
    val b : Int? = null // Nullable 타입이므로 null 값을 가질 수 있음

//    [?.]은 호출하려는 값이 null이 아니면 그대로 메소드가 호출되고
//    null이면 null값을 반환함
    println(b.toString() == null) // false
    println(b?.toString() == null) // true

//    c의 값이 null이기 때문에 오류 발생
//    val c : String? = null
//    println(c.length)

    println(elvisTest(null))
    println(elvisTest("Hello"))
    println()

    println("fibo 10: " + fibonacci(10))
    println("fibo 10: ${fibonacci(10)}")
    println()

    for (i in 1..3) print("$i ")
    println()
    val len = 3
    for (i in 1..len) print("$i ")
    println()
    for (i in 1..<len) print("$i ") // [..<]는 [until]과 같은 역할을 함
    println()
    for (i in 1..10 step 2) print("$i ")
    println()
//    for (i in 5..1 step(-1)) print("$i ") // [step]은 음수를 지원하지 않아 오류 발생
//    println()
    for (i in 5 downTo 1) print("$i ")
    println()
    for (i in 10 downTo 1 step 2) print("$i ")
    println()
    println()

    var a = 1
    while (a < 10) print("${a++} ")
    println()
    do {
        print("${--a} ")
    } while (a > 1)
    println()
    println()

    val array1 = arrayOf(1, 2, 3, 4, 5) // 특정 값을 넣어서 배열 생성
    val array2 = arrayOf("Hello,", "World!", 0, 1, 2.3) // [arrayOf]에 특정 타입을 지정하지 않으면 어떤 타입이 들어가도 상관없음
    val array3 = Array(5) { 0 } // 배열의 크기를 정해서 람다로 생성
    val array4 = Array(5) {i -> i * i }
    for (i in 0..<array1.size) print("${array1[i]} ")
    println()
    for (i in array1) print("$i ")
    println()
    for (i in array2) print("$i ")
    println()
    for (i in array3) print("$i ")
    println()
    for (i in array4) print("$i ")
    println()
    println(array4[3]) // array4.get(3)과 동일
    println()

    val twoDimArray = Array(3) { i -> Array(3) { j -> i*3+j } }
    for (i in twoDimArray) {
        for (j in i) print("$j ")
        println()
    }
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

fun elvisTest(str: String?) : String {
//    [?:]은 엘비스 연산자로 좌항의 값이 null이 아니면 좌항 값을 반환하고 null이라면 우항 값을 반환함
    return str ?: "this is null"
}