package basic

/**
 * Created by r.pek on 02.10.2017.
 */
fun main(a:Array<String>){

    var x:Int=6

    when(x){
        1, 10->{
            print("Value 1 or 10")
        }
        in 2..4->{
            print("value 2")
        }
        !in 3..5->{
            print("vale 3")
        }
        else->{
            print("I don't know!")
        }
    }


}