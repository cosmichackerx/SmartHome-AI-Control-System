package com.smarthome.controllers

import com.smarthome.core.DeviceState
import com.smarthome.core.SmartDevice

class LightController(device: SmartDevice) : Controller(device) {
    override fun control(action: String) {
        when (action.lowercase()) {
            "on" -> device.state = DeviceState.On
            "off" -> device.state = DeviceState.Off
            else -> println("⚠️ Invalid action for light.")
        }
        println("💡 Light '${device.name}' is ${device.state::class.simpleName}")
    }
}
