# Java Conditionals, Logic, and Loops

This repository contains Java examples demonstrating various control flow statements including if-else, switch statements, and loops.

## Contents

- `src/Main.java`: Contains examples of if-else and switch statements

## Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/mdaz78/ConditionalsInJava.git
   ```

2. Navigate to the project directory:
   ```bash
   cd ConditionalsInJava
   ```

3. Compile the Java files:
   ```bash
   javac src/*.java -d out/
   ```

4. Run the program:
   ```bash
   java -cp out Main
   ```

## Examples

### If-Else Statement
```java
public static void ifStatements(int age) {
    if (age < 18) {
        System.out.println("Can't Drink Sorry! :(");
    } else if (age > 18) {
        System.out.println("Sure, Grab a drink");
    } else {
        System.out.println("Meh!! Do whatever you want, I don't care");
    }
}
```

### Switch Statement
```java
public static void switchStatements(int day) {
    switch (day) {
        case 1: System.out.println("Monday"); break;
        case 2: System.out.println("Tuesday"); break;
        // ... more cases ...
        default: System.out.println("Invalid day");
    }
}
```

## License

This project is open source and available under the [MIT License](LICENSE).
