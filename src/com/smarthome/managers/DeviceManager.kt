package com.smarthome.managers

class DeviceManager<T> {
    private val devices = mutableListOf<T>()

    fun add(device: T) = devices.add(device)
    fun getAll(): List<T> = devices
}
