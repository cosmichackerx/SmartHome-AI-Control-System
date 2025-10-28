package com.smarthome.app

import com.smarthome.controllers.*
import com.smarthome.core.*
import com.smarthome.managers.*
import com.smarthome.utils.*

fun main() {
    val light = SmartDevice(SmartDevice.generateID(), "Bedroom Light", DeviceType.LIGHT)
    val fan = SmartDevice(SmartDevice.generateID(), "Ceiling Fan", DeviceType.FAN)

    val lightController = LightController(light)
    val fanController = FanController(fan)

    SmartHub.connect(light)
    SmartHub.connect(fan)

    lightController.control("on")
    fanController.control("off")

    SmartHub.showAllDevices()

    val home = SmartHome("Arslan's Home")
    home.addRoom("Bedroom")
    home.addRoom("Kitchen")
    home.showRooms()

    val blueprint = SmartHome.Blueprint("Box 🩵")
    blueprint.show()

    EventHandlers.motionSensor()
}
