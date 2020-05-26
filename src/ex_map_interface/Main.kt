package ex_map_interface

/*
// Map 인터페이스

interface Map<K, out V>

// Map 인터페이스 멤버

interface Entry<out K, out V>

abstract val size: Int

abstract val keys: Set<K>

abstract val value: Collection<V>

abstract val entries: Set<Map.Entry<K, V>>

abstract fun isEmpty(): Boolean

abstract fun containsKey(key: K): Boolean

abstract fun containsValue(value: V): Boolean

abstract operator fun et(key: K): V?

open fun getOrDefault(ket: K, defaultValue: V): V
 */

fun main(args: Array<String>){
    val map: Map<String, String> = mapOf("Apple" to "사과", "Banana" to "바나나")

    println(map.size)
    println(map.keys)
    println(map.values)
    println(map.entries)
    println(map.isEmpty())
    println(map.containsKey("Cocoa"))
    println(map.containsValue("바나나"))
    println(map["Apple"])
    println(map.getOrDefault("Cocoa", "코코아"))
}
