# JUnit String Utility Project ☕🚀

Welcome to the **JUnit String Utility** project! This is a clean, modular Java application designed to demonstrate the power of **Unit Testing** using the JUnit 5 framework.

It includes a utility class for common string manipulations and a robust test suite to ensure everything works perfectly—even from the command line! 💻

## 🌟 Features

* **String Reversal**: Flips your strings backward. 🔄
* **Uppercase Conversion**: shouts your text! 🔠
* **Vowel Counter**: Counts vowels (`a, e, i, o, u`) efficiently. 🔢
* **Comprehensive Testing**: Full test coverage including null checks and edge cases. ✅

## 🛠️ Tech Stack

* **Language**: Java 17 / 21
* **Build Tool**: Apache Maven 📦
* **Testing Framework**: JUnit 5 (Jupiter) 🪐

## 📂 Project Structure

```text
JunitExample/
├── pom.xml                 # Maven dependencies & build configuration
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── gfg/
│   │               ├── Main.java           # Entry point
│   │               └── StringUtility.java  # Logic class
│   └── test/
│       └── java/
│           └── com/
│               └── gfg/
│                   └── StringUtilityTest.java # JUnit Test Cases

## 🚀 How to Run
Prerequisites
Ensure you have Java and Maven installed on your machine.

1. Run Unit Tests 🧪
Execute the test suite to verify that all logic is working correctly.

mvn test

## Expected Output:

[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0

2. Run the Main Application 🏃‍♂️
To see the utility in action via the Main class:

mvn compile exec:java -Dexec.mainClass="com.example"

Expected Output:

Reversed: elpmaxe Uppercase: EXAMPLE Vowel count: 3

## 📦 Build the Project
To compile the code and package it up (skipping tests if needed):

mvn clean package

## 🐛 Troubleshooting
mvn command not found? Make sure Maven is added to your System Environment Variables (PATH).

Java version error? Check the <source> and <target> versions in your pom.xml to match your installed JDK.
