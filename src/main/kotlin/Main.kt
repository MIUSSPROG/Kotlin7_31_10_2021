import java.util.*
import kotlin.collections.ArrayList
import kotlin.reflect.typeOf

fun main(){
//    var num1 = 2
//    var num2 = 3
//    if (num1>num2 || 2/0 > 1){
//        println("Hello")
//    }

    var nestedList = mutableListOf<MutableList<Int>>()
    nestedList.add(mutableListOf(1, 2, 3))
    nestedList.add(mutableListOf(4, 5))
    println(nestedList)
    var res: List<String>  = listOf("dgfdfg", "stsrtr")
    var mas = arrayOf<Int>(1, 2)
//    var arr1 = arrayOf(intArrayOf(1, 2), floatArrayOf(3.0f, 4.0f))
    var arr1 = intArrayOf(1, 2)
    arr1[0] = 3
    println(arr1.contentToString())
    var arrList = arrayListOf<ArrayList<Int>>(arrayListOf(1,2), arrayListOf(3, 4, 5))
    arrList[0] = arrayListOf(2, 1)
    arrList.add(arrayListOf(6, 7))
    println(arrList)


    val map = mapOf("One" to 1, "Two" to 2, "Eight" to 8)
    println(map)
    println(map.containsKey("Oner"))
    println(map["Oner"])
    println(map.getOrDefault("Oner", "НЕТ"))
    println(map.getOrElse("Oner"){"No such key"})

    for((key, value) in map){
        println("Key is $key, value is $value")
//        println(item.key + " " + item.value)
    }

    val map2 = mapOf(1 to "one", 3 to "three", 9 to "nine")
    println(map2.mapValues { it.value.uppercase(Locale.getDefault()) })
    println(map2.mapKeys { it.value + "!"})

    val map3 = mutableMapOf("One" to 1, "Two" to 2, "Three" to 3)
    map3["Four"] = 4
    println(map3)

//    var item = mutableMapOf<String, String>()
    val currenciesMutableMap: MutableMap<String, String> =
        mutableMapOf("Гривна" to "Украина", "Доллар" to "США", "Рубль" to "Россия")
    println("Страны: ${currenciesMutableMap.values}")
    println("Валюты: ${currenciesMutableMap.keys}")
    currenciesMutableMap["Тугрик"] = "Монголия"
    currenciesMutableMap.remove("Доллар")
    println(currenciesMutableMap)

    val map4 = mutableMapOf("One" to 1, "Two" to 2, "Three" to 3)
    map4 += "Five" to 5
    map4 += "Two" to 22
    map4 -= "Two"
    println(map4)

//    var map6: MutableMap<String, Int> = mutableMapOf()
//    map6["One"] = 1
//    println(map6)
    val map5 = mutableMapOf("One" to 1, "Two" to 2, "Three" to 3)
    val entry1 = Pair("Four", 4)
    val entry2 = Pair("Five", 5)
    val entryToAdd = mapOf(entry1, entry2)
    map5.putAll(entryToAdd)
    println(map5)
    println(map5.toList().first().first)

    val inventory = mutableMapOf(
        "Vanilla" to 24,
        "Chocolate" to 14,
        "Strawberry" to 9,
    )

    val lotsLeft = inventory.filterValues { qty -> qty > 10 }
    println(lotsLeft)
    val lotsLeftByKey = inventory.filterKeys { key -> key.startsWith("V") }
    println(lotsLeftByKey)

    val asStrings = inventory.map { (flavor, qty) -> "$qty tubs of $flavor" }
    for (c in asStrings[0]){
        println(c.code)
    }

    println(inventory.toSortedMap())
}