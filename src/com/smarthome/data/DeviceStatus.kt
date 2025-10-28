package com.smarthome.data

import com.smarthome.core.DeviceState

data class DeviceStatus(
    val name: String,
    val state: DeviceState,
    val lastUpdated: String
)
