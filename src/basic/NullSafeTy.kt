package basic

/**
 * Created by r.pek on 02.10.2017.
 */
 fun main(arg:Array<String>){
    var name:String?;
    name=null
    println(name!!)

    var age:Int = readLine()!!.toInt();
    println("Your age is : "+ age)
}