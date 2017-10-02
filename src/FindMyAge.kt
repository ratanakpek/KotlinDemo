import java.util.*

/**
 * Created by r.pek on 02.10.2017.
 */


fun main(a:Array<String>){
    //input
    println("Please enter your DBO!")
    var year:Int= readLine()!!.toInt()

    //process
    var currentYear:Int= Calendar.getInstance().get(Calendar.YEAR)
    var age:Int =currentYear-year

    //output
    println("Your age is $age")

}