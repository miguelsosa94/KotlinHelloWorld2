import java.lang.Exception
import kotlin.system.exitProcess

val menuPrincipal: List<String> = listOf<String>("Hacer una Recete","Ver mis Recetas","Salir")
 val ingredientes :  List<String> = listOf<String>("Agua","Leche","Carne","Verduras", "Frutas","Cereal","Huevos","Aceite")
val recetas : MutableMap<String?,MutableList<String>> = mutableMapOf();
const val INVALID = "-------------------------------------\n|        Opción no valida           |\n-------------------------------------"
fun main(){

    do {
        println("Selecciona la opción deseada")
        for ((index, option) in menuPrincipal.withIndex()) {
            println("${index + 1}. $option")
        }

        val optionMenu: String? = readLine()
        when (optionMenu) {
            "1" -> hacerReceta()
            "2" -> verRecetas()
            "3" -> salir()
            else -> {
                println(INVALID)
                main()
            }
        }
    }while (optionMenu!="3")
}


 fun salir() {
     println("FINALIZANDO")
     exitProcess(0)
 }

 fun verRecetas() {
     if (recetas.isEmpty()) {
         println("NO EXISTEN RECETAS")
     }else {
         for (nombreReceta in recetas.keys) {
             println()
             println("------------------------------")
             println(nombreReceta!!.toUpperCase())
             println("INGREDIENTES: ${recetas.get(nombreReceta)}")
             println("------------------------------")
         }
     }
 }

 fun hacerReceta() {
     println("Hacer Receta")
     print("Introduzca el nombre de su receta: ")
     val nombreReceta: String? = readLine()
     val listaIngredientes: MutableList<String> = mutableListOf()
     do {
         println("Seleccione el ingrediente a agregar o escoga la opción 9 para salir:")
         for ((index, option) in ingredientes.withIndex()) {
             println("${index + 1}. $option")
         }
         val opcion: String? = readLine()
         var opcionInt: Int = OpcionToInt(opcion)

         when (opcionInt) {
             in 1..8 ->{
                 println("-------------------------------------")
                 println("Agregando ${ingredientes.get(opcionInt - 1)}")
                 println("-------------------------------------")
                 listaIngredientes.add(ingredientes.get(opcionInt - 1))
             }
             9 -> {
                 break}
             else -> println(INVALID)
         }
     } while (opcion != "9")

     recetas.put(nombreReceta, listaIngredientes);
 }


fun OpcionToInt(opcion: String?): Int {
    try {
        return opcion!!.toInt()
    } catch (e: Exception) {
        return 0
    }
}


