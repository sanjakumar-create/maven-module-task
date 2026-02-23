



# Maven Module Theory & Static Analysis Task

## 📖 Overview
This project is a practical implementation of **Java Module Theory (JPMS)** and **Static Code Analysis** within a **Maven Multi-Module** architecture. It was built to demonstrate how to separate logic into distinct modules, manage dependencies between them, and enforce strict code quality standards during the build lifecycle.

## 🏗️ Project Structure
The project utilizes a Parent-Child Maven structure consisting of a root `pom.xml` and two submodules:

```text
module-theory-task/ (Parent Project)
│
├── pom.xml (Manages Checkstyle plugin and submodules)
│
├── math-core/ (Submodule)
│   ├── pom.xml
│   └── src/main/java/
│       ├── module-info.java (Exports com.example.math)
│       └── com/example/math/Addition.java
│
└── calculator-app/ (Submodule)
    ├── pom.xml (Depends on math-core)
    └── src/main/java/
        ├── module-info.java (Requires math.core)
        └── org/example/Main.java

```

## 🚀 Key Concepts Demonstrated

### 1. Java Platform Module System (JPMS)

The project strictly adheres to Java Module Theory.

* **`math.core`**: Acts as the foundational library. It explicitly `exports` its internal packages to make them accessible to other modules.
* **`calculator.app`**: Acts as the consumer. It explicitly `requires` the `math.core` module to function, demonstrating strict module boundaries and encapsulation.

### 2. Static Code Analysis

The parent `pom.xml` is configured with the **Maven Checkstyle Plugin** (`maven-checkstyle-plugin` v3.3.0).

* **Rule Set:** Google Java Style Guide (`google_checks.xml`).
* **Enforcement:** Bound to the Maven `validate` phase. If any class lacks proper Javadocs, correct indentation, or violates the configured styling rules, the build will automatically fail (`failsOnError=true`).

## 🛠️ How to Build and Run

**Requirements:**

* Java Development Kit (JDK) 17 or higher
* Apache Maven 3.x

**1. Build and Analyze:**
To compile the project and trigger the static code analysis, run the following command from the root directory:

```bash
mvn clean install

```

*If successful, you will see a `BUILD SUCCESS` message, indicating that the code complies with all Checkstyle rules and the JPMS dependencies are correctly linked.*

**2. Run the Application:**
Execute the `Main.java` class located in the `calculator-app` module to see the cross-module addition logic in action.

```bash
# Output:
# Starting the Calculator App...
# The result of 15 + 25 is: 40

```

```

```

