package com.smarthome.data

object Analytics {
    fun calculateEnergyUsage(hours: Double, power: Int): Double {
        return (hours * power) / 1000 // kWh
    }
}
