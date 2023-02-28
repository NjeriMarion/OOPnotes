import java.awt.print.Book

fun main(){
    val toyo = Car("Toyoto", "Belta", "KBY 864Y", 0)
    val audi = Car("Audi", "A4", "KBK 108W", 0)
    audi.start()
    audi.accelerate(21)
    println(toyo.speed)
    println(audi.speed)
    println(audi.accelerate(20))
    println(audi.decelarate(15))
    println(audi.hoot())
    println(audi.stop())
    val myBook = Book("Born a crime", "Trevor Noah", 160, 2017)
    println(myBook.title)
    println(myBook.author)

}
class Car(var make:String, var model: String, var registration: String, var speed:Int){
    fun start(){
        println("vvvrrrooooommmm")
    }
    fun accelerate(acceleration:Int):Int{
        speed += acceleration
        return speed
    }
    fun decelarate(decelaration:Int):Int{
        speed -= decelaration
        return speed
    }
    fun hoot(){
        println("beeeeep")
    }
    fun stop():Int {
        speed -= speed
        return speed
    }

}

data class Book(var title:String, var author:String, var pages:Int, var year: Int )

