// Ecrire une fonction qui affiche les x premiers nombres pairs ou impairs

fun func1(x:Int, isPair:Boolean = true) {
    if (isPair) {
        for (i in 0..x step (2)) {
            println(i)
        }
    } else {
        for (i in 1..x step (2)) {
            println(i)
        }
    }
}

func1(8)
func1(8, false)

// Ecrire une fonction qui affiche les x premiers nombres de la suite Fibonacci

fun fibo(x:Int) {
    var i = 0
    var num1 = 0
    var num2 = 1
    var next_number = num2
    while (i <= x) {
        println(next_number)
        i++
        num1 = num2
        num2 = next_number
        next_number = num1 + num2
    }
}

fibo(10)

// Ecrire une fonction qui calcule le factoriel d’un nombre x,
// utiliser 10 par défaut si aucun nombre n’est spécifié.

fun facto(x:Int = 10) : Int {
    var output = 1
    for (i in x downTo 1) {
        output *= i
    }
    return output
}

println(facto())
println(facto(6))

// Ecrire une fonction qui affiche les x premiers nombres premiers

fun isPrime(num: Int): Boolean {
    if (num <= 1) return false
    for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }
    return true
}

fun printFirstNPrimes(x: Int) {
    var count = 0
    var num = 2
    while (count < x) {
        if (isPrime(num)) {
            println(num)
            count++
        }
        num++
    }
}

printFirstNPrimes(10)
