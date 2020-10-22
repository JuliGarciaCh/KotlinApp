package com.example.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Ejemplo 1
        //variablesYConstantes()

        //Ejemplo 2
        //tiposDeDatos()

        //Ejemplo 3
        //sentenceIf()

        //Ejemplo 4
        //sentenciaWhen()

        //Ejemplo 5
        arrays()
    }

    private fun variablesYConstantes(){

        //VARIABLES
        //CamelCase Cada palabra nueva de la variable debe ir en mayuscula excepto la primera
        var miPrimerVariable = "texto de prueba"

        println(miPrimerVariable)

        miPrimerVariable = "Cambiamos de texto"

        println(miPrimerVariable)

        //No podemos asignar un tipo int a una variable de tipo texto,
       // miPrimerVariable = 1

        var miSegundaVariable = "Segundo texto"

        println(miSegundaVariable)

        miSegundaVariable = miPrimerVariable

        println(miSegundaVariable)


        //CONSTANTES
        val miPrimeraConstante = "Soy una constante"
        println(miPrimeraConstante)

        //No se puede asignar otro valor a una constante ya definida
        //miPrimeraConstante ="Soy otra constante"

        val mySegundaConstante = miPrimerVariable
        println(miSegundaVariable)
    }

    private fun tiposDeDatos(){

        //String
        //inferencia de datos, sabe el tipo de dato de la variable por el valor que tiene la misma
        //val miString:String = "Esto es un String" Poner String es redundante

        val miString = "ESTO ES UN STRING"
        val miString2 ="SEGUNDO STRING"
        val miString3 = miString +"  "+ miString2
        println(miString3)

        //ENTEROS
        // (Byte= representa números entre 127 y 128
        // Short= 32768 y 32767
        // Int=-2,147,483,647 a 2,147,483,647.
        // Long= -9,223,372,036,854,775,807 a 9,223,372,036,854,775,807.)

        val myInt= 1
        val myInt2 = 2
        val myInt3 = myInt + myInt2
        println(myInt3)

        //DECIMALES (Float, Double)
        val myFloat: Float = 1.5f
        val myDouble = 1.5
        val myDouble2 = 2.6
        val myDouble3 = 1.0 //Esto es un entero (cambiarlo a double)
        val myDouble4 = myFloat + myDouble + myDouble2 + myDouble3
        println(myDouble4)
        //BOOLEAN (Bool) Describe 2 condiciones
        val myBool = false
        val myBool2 = false
        println(myBool == myBool2)
        println(myBool && myBool2)
    }

    private fun sentenceIf(){
        val miNumero = 57

        if(miNumero <= 10 && miNumero >= 5 || miNumero == 70) {
            println("$miNumero EL NUMERO ESTA ENTRE 10 Y 5")
        }else {
            println("$miNumero EL NUMERO NO ESTA ENTRE 10 Y 5")
        }

        }

    private fun sentenciaWhen() {

       val pais = "EHLJKHKJLHL"

        when(pais){
            "Colombia" ->{
                println("El idioma es español")
            }"España" ->{
                println("El idioma es español")
           }"Argentina" ->{
                println("El idioma es español")
            }"Francia" ->{
                println("El idioma es frances")
            }"EEUU" ->{
                println("El idioma es ingles")
             }else ->{
                println("No se conoce el idioma")
            }
        }

    }

    private fun arrays(){
        val nombre = "Juan"
        val apellido = "Perez"
        val edad = "45"

        val miArray: ArrayList<String> = arrayListOf<String>()

        miArray.add(nombre)
        miArray.add(apellido)
        miArray.add(edad)

        println(miArray)

        //Añadir un conjunto de datos
        miArray.addAll(listOf("adicional", "adicional 2"))
        println(miArray)

     //Acceso a datos
        val miEdad = miArray[2]
        println(miEdad)

        miArray[2] = "19"
        println(miArray)

       //Recorrer
        miArray.forEach{
            println(it)
        }
    //it es el valor que toma cada vez que se esta accediendo a un dato
//https://www.youtube.com/watch?v=hug4TNmhw78&list=PLNdFk2_brsRdYF0FXDtSaGvluzBNHRbNe&index=2

    }

    }
