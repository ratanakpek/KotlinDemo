package oop

/**
 * Created by r.pek on 04.10.2017.
 */
class CarConstructor(name:String, model:String, speed:Double, owner:String){
    var carName:String?=name
    var model:String?=model
    var speed:Double?=speed
    var owner:String?=owner

    var speed2:Double?=speed
    var owner2:String?=owner

    constructor(carName:String, model:String, speed:Double, owner:String, type:String):this(carName, model, speed, owner){
        println("Car Name : $carName")
        println("Model : $model")
        println("Speed : $speed")
        println("Owner : $owner")

//        this.carName=carName
//        this.model=model
//        this.speed=speed
//        this.owner=owner

    }
    constructor():this("BMW", "DD", 23.3, "Vorn"){

    }

    fun getModels():String?{
        return this.model
    }
    fun setModels(name:String){
        this.carName=name
    }


    /*
    * We can use init{} block to initilize fields
    * as I observed:
    * 1. CarConstructor(name:String, model:String, speed:Double, owner:String) is primary constructor
    *    and it required other construck to call it
    * 2. constructor(carName:String, model:String, speed:Double, owner:String, type:String):this(carName, model, speed, owner)
    *    -> this(...) try to initialize value to fields
    * 3. this(...) will not execute value in constructor, it will navigate to primary constructors and initialize field*/




}

fun main(args:Array<String>){
    var car = CarConstructor("Lexus", "Honda", 230.20, "Ratanak Pek")
    println("Car Name : ${car.carName}")
    println("Car Model : "+ car.getModels())


    /* println("Car name :")
     println("###############################################")
     Car("Lexus", "Honda", 230.20, "Ratanak Pek")
     println("###############################################")
     Car("Range Over", "Suziki", 10.1, "Vorn Katort")*/

}