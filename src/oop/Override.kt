package oop

/**
 * Created by r.pek on 04.10.2017.
 */
open class Father1(a:String){

    var fatherName:String?=a

    fun isHandsome(){
        println("He is handsome!")
    }
    open fun isRich(){
        println("He is the riches!")
    }
}
class Son1:Father1{

    var sonName:String?=null

    constructor(a:String):super(a){

    }

    fun isCute(){
        println("He is cute!")
        this.sonName
    }
    fun canSpeak(){
        println("He can Speak English and Korea!")
    }
    override fun isRich(){
        println("He is not the riches!")
    }
}

fun main(a:Array<String>){
    var son = Son()
    //isRich method had been overide by subclass
    son.isRich()
}

