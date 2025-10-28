package com.smarthome.utils

interface EventListener {
    fun onEvent(event: String)
}

object EventHandlers {
    fun motionSensor() {
        val listener = object : EventListener {
            override fun onEvent(event: String) {
                println("🚨 Motion Event Detected: $event")
            }
        }
        listener.onEvent("Living Room Movement")
    }
}
