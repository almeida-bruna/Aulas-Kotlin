fun <T> contaLista(lista: List<T>, x: T): Int {
    var cont = 0
    for (e in lista)
    	if (e == x) cont++
    return cont
}
fun main(arg: Array<String>) {
    var listaInt = listOf(1,2,3,3,3,3,4,5)
    var n = contaLista<Int>(listaInt, 3)
    print(n)
    
    var listaInt2 = listOf("a", "a", "a")
    var n2 = contaLista<String>(listaInt2, "a")
    print(n2)
}
