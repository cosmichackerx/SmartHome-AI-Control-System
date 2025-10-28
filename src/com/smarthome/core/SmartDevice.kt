package com.smarthome.core

import com.smarthome.interfaces.Controllable

open class SmartDevice(
    val id: DeviceID,
    val name: String,
    val type: DeviceType
) : Controllable {

    var state: DeviceState = DeviceState.Off

    companion object {
        private var deviceCount = 0
        fun generateID(): DeviceID {
            deviceCount++
            return DeviceID(deviceCount)
        }
    }

    override fun turnOn() {
        state = DeviceState.On
        println("🔹 $name is now ON")
    }

    override fun turnOff() {
        state = DeviceState.Off
        println("🔹 $name is now OFF")
    }

    override fun toString() = "SmartDevice(name='$name', type=$type, state=$state)"
}
