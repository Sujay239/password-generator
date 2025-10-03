# 🔑 Java Password Generator

A simple, secure password generator written in **Java**.  
This project uses `SecureRandom` to generate strong random passwords suitable for real-world usage.

## 🚀 Features
- Generate random passwords of custom length
- Options to include:
    - ✅ Uppercase letters (A–Z)
    - ✅ Lowercase letters (a–z)
    - ✅ Digits (0–9)
    - ✅ Special symbols (!@#$%^&* etc.)
- Uses `SecureRandom` for cryptographic safety
- Console-based interactive menu

---

## 🛠️ Requirements
- Java 8 or above
- Any Java IDE (IntelliJ, Eclipse, VS Code) or command-line setup

---

## 📦 How to Run

### 1. Compile
```
javac PasswordGenerator.java
javac Main.java
```

### 2. Run
```
java MainApp
```
## ⚙️ Usage
```aiexclude
=== Java Password Generator ===
Enter password length: 12
Include UPPERCASE? (y/n): y
Include lowercase? (y/n): y
Include digits? (y/n): y
Include symbols? (y/n): y

Generated Password: R#9uT8!aP2qL

```