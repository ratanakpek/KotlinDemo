package oop

/**
 * Created by r.pek on 04.10.2017.
 */
open class Father(){
    var fatherName:String?=null

   private fun isHandsome(){
        println("He is handsome!")
    }
    fun isRich(){
        println("He is the riches!")
    }
}
class Son:Father(){
    var sonName:String?=null
    fun isCute(){
        println("He is cute!")
    }
    fun canSpeak(){
        println("He can Speak English and Korea!")
    }
}

fun main(a:Array<String>){
    var son = Son()
    son.canSpeak()
    son.isCute()
   // son.isHandsome()
    son.isRich()

    var father = Father()
   // father.isHandsome()
}