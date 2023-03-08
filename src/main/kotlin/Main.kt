fun main(){
    //quiz1
var toyota=Car("Toyota","Probox","grey",5)
toyota.carry(4)
    toyota.carry(7)
    toyota.identity()
    println(toyota.calculateParkingFees(6))
    //quiz2
    var cityhopper=Bus("Mercedese","Type C","yellow",50)
    println(cityhopper.maxTripFare(50.0))
    println(cityhopper.calculateParkingFees(8))
}
//quiz1
open class Car(var make:String,var model:String,var color:String, var capacity:Int){
    fun carry(people:Int){
        var x=people-capacity
        if (capacity>=people) {
            println("Carrying $people passengers")
        }
        else{
             println("Over capacity by $x people" )
        }
    }
    fun identity(){
println("I am a $color $make $model")
    }
   open fun calculateParkingFees(hours:Int):Int{
     var fees =hours*20
        return fees
    }
}
//quiz2
class Bus(make:String,model:String,color:String,capacity:Int):Car(make,model,color,capacity){
    fun maxTripFare(fare:Double):Double{
        return capacity*fare
    }
    override fun calculateParkingFees(hours: Int): Int {
//        return super.calculateParkingFees(hours)
        var fees=hours*capacity
       return fees
    }
    }



