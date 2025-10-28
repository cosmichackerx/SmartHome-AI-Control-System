package com.smarthome.controllers

import com.smarthome.core.DeviceState
import com.smarthome.core.SmartDevice

class FanController(device: SmartDevice) : Controller(device) {
    override fun control(action: String) {
        when (action.lowercase()) {
            "on" -> device.state = DeviceState.On
            "off" -> device.state = DeviceState.Off
            else -> println("⚠️ Invalid action for fan.")
        }
        println("🌀 Fan '${device.name}' is ${device.state::class.simpleName}")
    }
}
