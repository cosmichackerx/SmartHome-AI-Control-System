package com.smarthome.controllers

import com.smarthome.core.SmartDevice

abstract class Controller(protected val device: SmartDevice) {
    abstract fun control(action: String)
}
