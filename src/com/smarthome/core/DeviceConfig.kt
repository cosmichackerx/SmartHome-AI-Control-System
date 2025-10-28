package com.smarthome.core

data class DeviceConfig(
    val powerLimit: Int,
    val autoSleep: Boolean,
    val network: NetworkSettings
) {
    data class NetworkSettings(
        val ip: String,
        val macAddress: String
    )
}
