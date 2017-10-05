package thread

/**
 * Created by r.pek on 05.10.2017.
 */
fun main(a:Array<String>){
var t1 = ThreadRTK("Thread One");
    t1.start()

    var t2 = ThreadRTK("Thread Two")
    t2.start()
   // t2.join()
    println("Last thing to do!")


   /* var t3 = ThreadRTK("Thread Three")
    t3.start()*/
}

class ThreadRTK() : Thread(){

    var threadName:String = ""
    constructor(threadName:String):this(){
        this.threadName=threadName
        println(this.threadName+" was created!")
    }

    override fun run() {
        for(i in 0..9){
            println("${this.threadName} ->Value : $i")
            Thread.sleep(1000)
        }



    }
}