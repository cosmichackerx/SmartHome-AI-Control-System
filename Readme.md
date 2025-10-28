# SmartHome AI Control System

![1](resources/KotlinSmartHomeAISystemArchitecture.png)

### 🔹 *A Kotlin project designed to demonstrate every major OOP and advanced Kotlin concept — from Regular and Data Classes to Sealed, Inline, and Object Singletons — in one cohesive, real-world simulation.*

---

## 🚀 Project Overview

The **SmartHome AI Control System** simulates a connected smart home environment, where devices (like lights, fans, etc.) are managed, monitored, and controlled through an AI-based hub.

Each Kotlin class type is applied in a realistic way — reflecting how these concepts are used in professional software systems.

---

## 🧱 Tech Stack

* **Language:** Kotlin 2.2.20
* **IDE:** IntelliJ IDEA 2025.2
* **Paradigm:** OOP + Functional + Reactive principles
* **Build System:** Gradle (Kotlin DSL)

---

## 🗂️ Directory Structure

```
SmartHomeAIControlSystem/
│
├── src/
│   └── main/
│       └── kotlin/com/smarthome/
│           ├── core/
│           │   ├── SmartDevice.kt
│           │   ├── DeviceType.kt
│           │   ├── DeviceState.kt
│           │   ├── DeviceID.kt
│           │   └── DeviceConfig.kt
│           │
│           ├── controllers/
│           │   ├── Controller.kt
│           │   ├── LightController.kt
│           │   └── FanController.kt
│           │
│           ├── data/
│           │   ├── DeviceStatus.kt
│           │   ├── UsageRecord.kt
│           │   └── Analytics.kt
│           │
│           ├── managers/
│           │   ├── DeviceManager.kt
│           │   └── SmartHub.kt
│           │
│           ├── interfaces/
│           │   ├── Controllable.kt
│           │   └── Schedulable.kt
│           │
│           ├── utils/
│           │   ├── Logger.kt
│           │   └── EventHandlers.kt
│           │
│           └── app/
│               ├── SmartHome.kt
│               └── Main.kt
│
├── build.gradle.kts
└── README.md
```

---

## 🧩 Class Type Definitions & Code Locations

| **Type**                        | **Definition**                                                         | **File(s) & Location**                                              | **Purpose in Project**                                         |
| ------------------------------- | ---------------------------------------------------------------------- | ------------------------------------------------------------------- | -------------------------------------------------------------- |
| 🟦 **Regular Class**            | Standard Kotlin class with properties & functions.                     | `core/SmartDevice.kt`                                               | Represents a smart device with ID, name, and type.             |
| 🟩 **Data Class**               | Holds immutable data, auto-generates equals(), hashCode(), toString(). | `data/DeviceStatus.kt`, `core/DeviceConfig.kt`                      | Used for structured device info and configurations.            |
| 🟣 **Nested Data Class**        | Data class inside another data class.                                  | `core/DeviceConfig.kt`, `data/UsageRecord.kt`                       | Defines nested data models (e.g., NetworkSettings, Analytics). |
| 🟧 **Abstract Class**           | Cannot be instantiated; defines blueprint for subclasses.              | `controllers/Controller.kt`                                         | Base class for all device controllers.                         |
| 🟨 **Open Class**               | Allows inheritance.                                                    | `core/SmartDevice.kt`                                               | Parent class for all controllable devices.                     |
| 🟥 **Sealed Class**             | Restricts class hierarchy to known subclasses.                         | `core/DeviceState.kt`                                               | Represents finite device states (On, Off, Error).              |
| ⚪ **Enum Class**                | Fixed set of constants.                                                | `core/DeviceType.kt`                                                | Lists all device types (LIGHT, FAN, CAMERA, etc.).             |
| 🟤 **Inline / Value Class**     | Wraps a single value efficiently at compile time.                      | `core/DeviceID.kt`                                                  | Represents unique device identifiers.                          |
| 🔵 **Object Class (Singleton)** | One instance shared across app.                                        | `managers/SmartHub.kt`, `utils/Logger.kt`, `utils/EventHandlers.kt` | Central hub for all connected devices & global utilities.      |
| 🟠 **Companion Object**         | Static-like members in a class.                                        | Inside `SmartDevice.kt`                                             | Generates unique device IDs.                                   |
| 🔴 **Anonymous Class**          | Declared without a name; usually inside functions.                     | `utils/EventHandlers.kt`                                            | Used for event listener simulation.                            |
| 🟢 **Interface**                | Defines behavior contracts to be implemented.                          | `interfaces/Controllable.kt`, `Schedulable.kt`                      | Ensures devices can be turned on/off or scheduled.             |
| ⚫ **Generic Class**             | Class that works with any data type.                                   | `managers/DeviceManager.kt`                                         | Manages collections of any device type.                        |
| 🟡 **Inner Class**              | Has access to outer class members.                                     | `app/SmartHome.kt → Room`                                           | Each room belongs to a SmartHome instance.                     |
| ⚪ **Nested Class**              | Independent of outer class instance.                                   | `app/SmartHome.kt → Blueprint`                                      | Represents static design blueprints.                           |

---

## ⚙️ How It Works (Flow)

```
Main.kt
  ↓
SmartDevice.kt → Creates devices (Light, Fan)
  ↓
Controller.kt → Abstract class defines control()
  ↓
LightController / FanController → Execute actions
  ↓
SmartHub.kt → Singleton manages all devices
  ↓
DeviceManager.kt → Stores devices generically
  ↓
SmartHome.kt → Uses Inner & Nested classes for rooms/blueprints
  ↓
EventHandlers.kt → Handles anonymous motion event simulation
```

---

## 🧠 Example Output

```
📡 Connected: Bedroom Light
📡 Connected: Ceiling Fan
💡 Light 'Bedroom Light' is On
🌀 Fan 'Ceiling Fan' is Off

🌐 Connected Devices:
 - SmartDevice(name='Bedroom Light', type=LIGHT, state=ON)
 - SmartDevice(name='Ceiling Fan', type=FAN, state=OFF)

🏡 Arslan's Home has rooms:
 - Bedroom
 - Kitchen
📐 Blueprint designed by Yasmin 🩵
🚨 Motion Event Detected: Living Room Movement
```

---

## 🧰 Key Concepts Demonstrated

✅ OOP — Classes, Objects, Inheritance, Polymorphism
✅ Abstraction — Abstract & Interface
✅ Encapsulation — Using private and internal members
✅ Sealed Hierarchy — Controlled inheritance
✅ Composition — Classes within classes (Inner/Nested)
✅ Generics — Type-safe managers
✅ Companion & Singleton Patterns
✅ Anonymous Implementations — Real-world event handling

---

## 🧪 How to Run

1. **Clone or copy the project:**

   ```bash
   git clone https://github.com/<your-username>/SmartHomeAIControlSystem.git
   ```

2. **Open in IntelliJ IDEA**

   * File → Open → select the project folder.

3. **Run the program:**

   * Navigate to: `com.smarthome.app.Main.kt`
   * Press ▶️ Run

4. **Expected Output:** (see above)

---

## 🧭 Future Enhancements

* Add **AI-based scheduling** for devices.
* Integrate **real-time analytics** (simulate power usage tracking).
* Build a **Kotlin Compose UI dashboard**.
* Introduce **network simulation (MQTT / Socket)** for device communication.

---

## ✨ Credits

**Created by:** Muhammad Arslan 🇵🇰
**Date:** October 2025
**Version:** 1.0.0

> 💡 *This project turns every abstract Kotlin concept into a living, breathing smart home simulation — from OOP fundamentals to advanced Kotlin features.*

---
