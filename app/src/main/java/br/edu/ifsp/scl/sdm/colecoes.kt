package br.edu.ifsp.scl.sdm

fun main() {
    // List e MutableList
    var familia: List<String> = listOf<String>("Pedro", "Marcela", "João", "Cadu")

    // familia.add("Paçoca") // Erro porque a lista é imutável

    // Percorrendo usando FOR
    for (integrante in familia){
        println(integrante)
    }

    val listaInteiros: List<Int> = (1..10).toList()
    // Percorrer usando FOR usando IntRange
    for (i in 0..9) {
        println(listaInteiros[i])
    }

    val listaInteiros2: List<Int> = (1..10 step 2).toList()
    // Percorrer usando FOR usando IntRange
    for (i in 0..listaInteiros2.size - 1) {
        println(listaInteiros2[i])
    }

    // listaInteiros.add(11)

    // Lista mutável
    val listaCursos: MutableList<String> = mutableListOf<String>("Sistemas para Dispositivos Móveis", "Análise e Desenvolvimento de Sistemas")

    // Adicionando elemento à lista
    listaCursos.add("Técnico em Informática para Internet")

    // Percorrendo a lista com LAMBDA
    //listaCursos.forEach {println(it)}

    listaCursos.add("Manutenção de Aeronaves")
    listaCursos.add("Técnico em Células")
    listaCursos.add("Processos Gerenciais")


    // Solução 1
/*    val listaCursosSistemas = mutableListOf<String>()
    for (curso in listaCursos) {
        if (curso.contains("Sistemas")){
            listaCursosSistemas.add(curso)
        }
    }

    for (i in 0..listaCursosSistemas.size - 1) {
        println("$i - ${listaCursosSistemas[i]}")
    }*/

    // Solução 2
/*
    val listaCursosSistemas = listaCursos.filter{ it.contains("Sistemas") }
    listaCursosSistemas.withIndex().forEach { println("${it.index} - ${it.value}")}
*/

    // Solução 3
    var funcao = fun (ci: IndexedValue<String>) {
        println("${ci.index} - ${ci.value}")
    }

    var g: (IndexedValue<String>) -> Unit
    g = funcao

    val listaCursosSistemas = listaCursos.filter{ it.contains("Sistemas") }
    listaCursosSistemas.withIndex().forEach(g)

    println("Set e MutableSet")
    val setCursos: MutableSet<String> = mutableSetOf<String>("ADS", "SDM", "TII")
    setCursos.add("ADS")
    setCursos.add("SDM")
    setCursos.add("TMA")

    setCursos.forEach { println(it) }

    println("Map e MutableMap")
    val familiaMap: MutableMap<String, String> = mutableMapOf(Pair("Pai", "Pedro"), Pair("Mãe", "Marcela"))
    familiaMap.put("Filho", "João")
    familiaMap.put("Caçula", "Cadu")
    familiaMap.put("Pet", "Paçoca")

    // Solução 1
    for (chave in familiaMap.keys) {
        println("${chave} - ${familiaMap.get(chave)}")
    }

    // Solução 2
    familiaMap.keys.forEach { println("${it} - ${familiaMap.get(it)}") }

    // Solução 3
    fun percorreMap(par: Map.Entry<String, String>): Unit {
        println("${par.key} - ${par.value}")
    }
    familiaMap.forEach(::percorreMap)


    // Solução 4
    val percorreMap: (String, String) -> Unit = fun (k, v) {
        println("$k - $v")
    }

    familiaMap.forEach(percorreMap)

    // Solução 5
    familiaMap.forEach { t, u ->  println("$t - $u")}





}