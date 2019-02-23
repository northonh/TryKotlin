package br.edu.ifsp.scl.sdm

/* Função SINGLE-EXPRESSION */
//fun multiplo(a: Int = 10, b: Int) = a % b == 0
fun multiplo(a: Int = 10, b: Int) = if (a % b == 0) true else false


/* Função estendida e infixada */
/*infix fun Int.multiplo(b: Int): Boolean {
    val c: Int = this % b
    if (c == 0) {
        return true
    }
    return false
}*/

fun main() {
    println(multiplo(b=2))
    //println( 10.multiplo(2) )
    //println( 10 multiplo 2 )
}