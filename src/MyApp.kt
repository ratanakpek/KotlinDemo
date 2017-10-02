/**
 * Created by r.pek on 02.10.2017.
 */


fun main(args:Array<String>){

    println("Welcome to kotlin!")
    var name:String= readLine().toString()
    println("Your name is " + name)
    println("How old are you?")
    var age:Int = readLine()!!.toInt()
    println("Your age is "+ age)


}