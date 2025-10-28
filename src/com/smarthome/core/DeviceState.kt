package com.smarthome.core

sealed class DeviceState {
    object On : DeviceState(){
        override fun toString() = "ON"
    }
    object Off : DeviceState(){
        override fun toString() = "OFF"
    }
    data class Error(val message: String) : DeviceState(){
        override fun toString() = "ERROR: $message"
    }
}
