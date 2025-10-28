package com.smarthome.app

class SmartHome(val name: String) {

    private val rooms = mutableListOf<Room>()

    fun addRoom(roomName: String) {
        rooms.add(Room(roomName))
    }

    fun showRooms() {
        println("🏡 $name has rooms:")
        rooms.forEach { println(" - ${it.roomName}") }
    }

    inner class Room(val roomName: String) {
        fun describe() = println("🛋️ Room: $roomName belongs to $name")
    }

    class Blueprint(val architect: String) {
        fun show() = println("📐 Blueprint designed by $architect")
    }
}
