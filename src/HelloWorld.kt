
const val N = "MIKE"
fun main(args: Array<String>){
//    print("Hola mundo, con Kotlin")
//    println(1+1)
//    println(3-1)
//    println(2*2)
//    println(4/2)
//    println(7%2)
//    println("---------")
//    val a = 4
//    val b = 3
//
//    println(a.plus(b))
//    println(a.minus(b))
//    println(a.times(b))
//    println(a.div(b))
//    println(a.rem(b))
//
//    var a = true
//    var b = a.not()
//    print("b: $b")
//
//    val name = args[0]
//
//    println(name)
//    println(N)


  /*  val parrafo:String = """
       ** Lorem ipsum dolor sit amet, consectetur adipiscing elit, 
       ** sed eiusmod tempor incidunt ut labore et dolore magna aliqua. 
       ** Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquid ex ea commodi consequat. 
       ** Quis aute iure reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. 
       ** Excepteur sint obcaecat cupiditat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
    """.trimIndent()

    println(parrafo)
    println()
    println(parrafo.trimMargin("** "))
*/
    val oneToHundred:IntRange = 1..5
    for (number in oneToHundred){
        println(number)
    }

    for (letra in 'a'..'d'){
        println(letra)
    }

    val numero = 2

    if (numero.equals(5)){
        println("Sí son iguales")
    }else{
        println("No son iguales")
    }

    when(numero){
         2 -> "Es igual a 2"
        in 1..5 -> println("Entre 1 y 5")
        in 1..3 -> println("Entre 1 y 3")
        !in 5..10 -> println("No está entre 5 y 10")
        else -> println("No está en ninguno de los anteriores")
    }

    print("-------While--------")
    var i = 1
    while (i < 1){
        println(i)
        i++
    }

    print("-------Do While--------")
    i = 1

    do {
        println(i)
        i++
    } while(i<1)


    println("-----For-----")
    var daysOfWeek = listOf("Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado")
    for (day in daysOfWeek){
        println(day)
    }

    for ((index,day) in daysOfWeek.withIndex()){
        println("$index, $day")
    }


    println("-----ForEach-----")
    daysOfWeek.forEach{
        println(it)
    }

    println("-----Break-----")

    for (i in 1..3){
        println("\ni: $i")
        for (j in 1..5){
            if (j.equals(3)) break
            println("j: $j")
        }
    }
println("-----Continue-----")
    for (i in 1..3){
        println("\ni: $i")
        for (j in 1..5){
            if (j.equals(3)) continue
            println("j: $j")
        }
    }

println("-----Break+Label-----")

terminarTodoCiclo@ for (i in 1..3){
    println("\ni: $i ")
    for (j in 1..3){
        println("\nj: $j")
        for (k in 1..5) {
            if(k.equals(3)) break@terminarTodoCiclo
            println("k: $k")
        }
    }
}

    println("-----Continue+Label-----")
    terminarTodoCiclo@ for (i in 1..3){
        println("\ni: $i ")
        for (j in 1..3){
            println("\nj: $j")
            for (k in 1..5) {
                if(k.equals(3)) continue@terminarTodoCiclo
                println("k: $k")
            }
        }
    }




    /*
        VALORES NULOS Y DOUBLE BANG

        variable:Int? ---> Sirve para poder inicializar una variable como nula.
        variable?.metodo() --> Verificamos que la variable no sea nula antes de ejecutar el mètodo.
     */

    //val filePath = argsuments?.getString(ARGUMENTS_PATH)

    // DOUBLE BANG !!
    /*
    var msg: string?
    msg = null
    println(msg!!.length) -- En esta parte tenemos que cachar la excepción.
     */

    /* OPERADOR ELVIS ?:
    if(list != null) retutn list.size
    else return 0

    it.listFiles()?.size ?: 0
*/
/*

    var compute: String? = null

    println("-----Valores Nulos y Double Bang-----")
    try {
        var longitud : Int = compute!!.length
    }catch (e : NullPointerException){
        println("No acepta valores nulos")
    }*/
    println("-----Valores Nulos y Double Bang-----")
    // LLAMADA SEGURA
    var compute :  String ?=null
    var longitud:  Int? = compute?.length
    println("Longitud $longitud")

    var teclado : String ?= null
    val longitudDeTeclado: Int = teclado?.length ?: 0
    println("LongitudTeclado $longitudDeTeclado")

    val listhWithNulls : List<Int?> = listOf<Int?>(7,null,null,4)
    println("Lista con Null: ${listhWithNulls}")
    val listWithoutNulls : List<Int?> = listhWithNulls.filterNotNull()
    println(listWithoutNulls)

}