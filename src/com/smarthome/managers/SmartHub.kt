package com.smarthome.managers

import com.smarthome.core.SmartDevice

object SmartHub {
    private val connectedDevices = mutableListOf<SmartDevice>()

    fun connect(device: SmartDevice) {
        connectedDevices.add(device)
        println("📡 Connected: ${device.name}")
    }

    fun showAllDevices() {
        println("\n🌐 Connected Devices:")
        connectedDevices.forEach { println(" - $it") }
    }
}
