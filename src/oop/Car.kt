package oop

/**
 * Created by r.pek on 04.10.2017.
 */
class Car(carName:String, model:String, speed:Double, owner:String){
    var carName:String?=null
    var model:String?=null
    var speed:Double?=null
    var owner:String?=null

    init{
        /*println("Car Name : $carName")
        println("Model : $model")
        println("Speed : $speed")
        println("Owner : $owner")*/

        this.carName=carName
        this.model=model
        this.speed=speed
        this.owner=owner

    }

    fun getModels():String?{
       return this.model
    }
    fun setModels(name:String){
        this.carName=name
    }




}

fun main(args:Array<String>){
    var car = Car("Lexus", "Honda", 230.20, "Ratanak Pek")
    println("Car Name : ${car.carName}")
    println("Car Model : "+ car.getModels())


   /* println("Car name :")
    println("###############################################")
    Car("Lexus", "Honda", 230.20, "Ratanak Pek")
    println("###############################################")
    Car("Range Over", "Suziki", 10.1, "Vorn Katort")*/

}
