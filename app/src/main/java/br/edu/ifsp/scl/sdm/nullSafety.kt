package br.edu.ifsp.scl.sdm

fun main() {
    var nome: String?
    nome = null

    var sobrenome: String?
    sobrenome = null

    var sn: String
    sn = sobrenome?:"Nobile"

    if (sobrenome != null) {
        println(sobrenome.capitalize())
        println(sobrenome.length)
    }

    println(sobrenome?.capitalize())
    println(sobrenome?.length)

    try {
        println(sobrenome!!.capitalize())
        println(sobrenome!!.length)
    } catch (kne: KotlinNullPointerException) {
        println("Deu exceção, mané!")
    }

}