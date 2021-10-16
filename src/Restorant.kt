package tasks

fun main()
{
    var officiant:Officiant = Officiant("Andriano Chelentano")

    var client1:Clients = Clients("Billy Herrington", 1, "meet")
    var client2:Clients = Clients("Harley Davidson", 1, "bike")
    var client3:Clients = Clients("Scarlet Yohanson", 2, "sup")
    var client4:Clients = Clients("Leonardo Dicaprio", 2, "fish")



    var cook:Cooking = Cooking()
    var officiantWork:Officiant = Officiant("")
    val clientsList: Array<Clients> = arrayOf(client1,client2,client3,client4)
    for (client in clientsList)
    {
        cook.cooking(client)
        officiantWork.bringFood(client.locationTable)
    }
}
open class Person(var name:String)
{

}
 class Officiant ( name:String):Person(name)
{
    fun bringFood(locationTable: Int)
    {
        println("Officiant going to $locationTable table")
    }
}
class Clients( name:String, var locationTable: Int, var food:String): Person(name)
{

}
  class Cooking()
 {
        open fun cooking(Cooking:Clients)
         {
             println("Cook prepared ${Cooking.food} for ${Cooking.name}")

         }

     }
