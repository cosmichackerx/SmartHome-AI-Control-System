# SmartHome AI Control System

![1](resources/KotlinSmartHomeAISystemArchitecture.png)

This project is a Kotlin-based simulation of a Smart Home AI control system. It demonstrates core concepts of object-oriented programming and smart device management.

## Project Structure

The project is organized into the following packages:

*   `com.smarthome.app`: Contains the main application logic.
*   `com.smarthome.controllers`: Includes controllers for different smart devices.
*   `com.smarthome.core`: Defines the core components of smart devices.
*   `com.smarthome.data`: Manages data-related classes.
*   `com.smarthome.interfaces`: Defines interfaces for device control and scheduling.
*   `com.smarthome.managers`: Contains managers for devices and the central hub.
*   `com.smarthome.utils`: Provides utility functions and event handlers.

## How to Run

To run the simulation, execute the `main` function in `com.smarthome.app.Main.kt`.

## Example Usage

The `main` function in `Main.kt` demonstrates how to:

1.  Create smart devices (lights, fans).
2.  Connect devices to the `SmartHub`.
3.  Control device states (on/off).
4.  Display the status of all connected devices.
5.  Manage rooms within the smart home.
