# 🚀 Zalenium Docker Web Automation Framework

This repository contains a **Web UI automation framework** that leverages **Zalenium (Docker + Selenium Grid)** to run scalable, reliable browser tests inside Docker containers.  
Tests are written in Java using **Selenium WebDriver** and orchestrated via **TestNG** with reporting and logging support.

> This framework allows you to run browser tests in an isolated containerized Selenium Grid powered by Zalenium, eliminating local driver setup and enabling efficient cross-browser testing.:contentReference[oaicite:1]{index=1}

---

## 📌 Table of Contents

- ⭐ About
- 🚀 Features
- 🧱 Project Structure
- 🛠 Tech Stack
- 🔧 Prerequisites
- 📦 Setup & Installation
- 🧪 Running Tests
- 📊 Reports & Logs
- 🧠 Design & Workflows
- 🔧 Configuration
- 🤝 Contributing
- 📄 License
- 📬 Contact

---

## ⭐ About

**Zalenium_Docker_Web** is a container-based web automation framework that allows automated UI testing using Selenium tests executed against a Zalenium Docker instance.  
Zalenium dynamically manages browser sessions and containers to provide **scalable and disposable test environments**.:contentReference[oaicite:2]{index=2}

---

## 🚀 Key Features

✔ Runs Selenium tests against a Zalenium-powered Selenium Grid  
✔ Containerized test execution (Docker / Docker-Compose)  
✔ Automatically scales browser nodes at runtime  
✔ Supports Chrome & Firefox out of the box (extendable)  
✔ TestNG for test orchestration  
✔ HTML test reporting  
✔ Logs and Screenshots capture  
✔ Works locally and in CI/CD pipelines  

---

## 🧱 Project Structure

Zalenium_Docker_Web/
├── Configuration/ # Config files (environment, browser settings)
├── Drivers/ # Optional driver utilities (if any)
├── Screenshots/ # Screenshots of failures
├── logs/ # Log files
├── src/
│ ├── main/java/ # Framework utilities & helpers
│ └── test/java/ # Test classes
├── docker/ # Docker / Zalenium config
├── docker-compose.yml # Compose file to spin up Zalenium Grid
├── pom.xml # Maven dependencies
├── TestNG.xml # TestNG suite configuration
├── log4j.properties # Logging setup
├── report-config.xml # Reporting / HTML report config
└── README.md


---

## 🛠 Tech Stack

| Technology | Purpose |
|------------|---------|
| Java | Language for tests & framework |
| Selenium WebDriver | Browser automation |
| TestNG | Test runner & suites |
| Maven | Build & dependencies |
| Zalenium (Docker) | Selenium Grid in Docker |
| Docker | Container runtime |
| Log4j | Logging |
| HTML Reporter | Test reports |

---

## 🔧 Prerequisites

Make sure you have the following installed:

- 🔹 **Java 8+ / OpenJDK 11+**
- 🔹 **Maven**
- 🔹 **Docker**
- 🔹 **Docker-Compose** (optional but recommended)

Also ensure Docker daemon is running before starting Zalenium.:contentReference[oaicite:3]{index=3}

---

## 📦 Setup & Installation

### 1️⃣ Clone Repository

```bash
git clone https://github.com/ProfessionalTiger/Zalenium_Docker_Web.git
cd Zalenium_Docker_Web

**Start Zalenium Grid**
docker-compose up -d

🧪 Running Tests

After the grid is running:

▶ Via Maven
mvn clean test -DsuiteXmlFile=TestNG.xml
This will trigger the test suite defined in TestNG.xml.

📊 Reports & Logs
Test Reports: generated in target/surefire-reports/ or project-configured report directory
Logs: stored in logs/ for diagnostics
Screenshots: captured in Screenshots/ on test failure
Use these to verify test execution results and investigate failures.

🧠 Framework Design
🧩 Zalenium Integration
The grid listens on port 4444 (or custom if configured)
Framework WebDriver tests point to the Zalenium hub (http://localhost:4444/wd/hub)
Zalenium automatically starts and scales Selenium node containers as required
Containers are disposed once sessions end, enabling efficient resource usage.
GitHub

📌 Test Architecture
Tests follow:
Base test class setup
Page Object Model (POM) pattern (if implemented)
Utility helpers for common operations
Logging & reporting hooks

🔧 Configuration
File	Purpose
pom.xml	Dependencies & build
TestNG.xml	Test suite config
docker-compose.yml	Zalenium + support compose services
log4j.properties	Logging config
report-config.xml	Custom report theme

📬 Contact

Brought to you by ProfessionalTiger — QA Automation & Framework Engineering.
For issues or improvements:
Open a GitHub Issue
Submit a Pull Request
