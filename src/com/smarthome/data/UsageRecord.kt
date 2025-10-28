package com.smarthome.data

data class UsageRecord(
    val deviceName: String,
    val durationHours: Double,
    val energyUsed: Double,
    val analytics: Analytics
) {
    data class Analytics(
        val averageUsage: Double,
        val costEstimate: Double
    )
}
