package oop

/**
 * Created by r.pek on 04.10.2017.
 */
class SingleTon{
    var name:String?=null
    private constructor(){
        println("Instance is created")
    }
    companion object {
        val instance:SingleTon by lazy { SingleTon() }
    }
}

fun main(args:Array<String>){
    var s1=SingleTon.instance
    s1.name="I love you"
    println(s1.name)


    var s2=SingleTon.instance
    println(s2.name)


    var s3=SingleTon.instance
    println(s3.name)

}