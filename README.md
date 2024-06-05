# Java-Session

Lesson 01 :


---

# Welcome to My First Java Code

### Introduction

This is my very first Java program! It's a simple "Hello World" example that prints the message to the console.

### Code Explanation

```java
public class FirstJavaCode {

    public static void main(String[] args) {
        
        // Print "Hello World" to the console
        System.out.println("Hello World");
        
    }
    
}
```

#### Explanation:

- **`public class FirstJavaCode {`**: Defines a class named `FirstJavaCode`. In Java, the filename must match the class name exactly.

- **`public static void main(String[] args) {`**: This line signifies the start of the program's execution. Every Java application starts executing from the `main` method.

- **`System.out.println("Hello World");`**: This line prints the string "Hello World" to the console. `System.out` is an object that represents the console, and `println` is a method to print a line.

### How to Run

To run this Java program, follow these steps:

1. **Compile**: Open our terminal or command prompt, navigate to the directory containing `FirstJavaCode.java`, and compile the code using the `javac` command:
   ```
   javac FirstJavaCode.java
   ```

2. **Execute**: After compiling successfully, run the compiled program using the `java` command:
   ```
   java FirstJavaCode
   ```

3. **Output**: We should see the message "Hello World" printed to the console.

---
Lesson 02 :
# CAT Class in Java

### Class Definition

```java
public class CAT {
    public void eat() {    
        System.out.println("I'm eating");
    }
}
```

- `public class CAT` defines a class named `CAT`.
- Inside the `CAT` class, there is a method `eat` that prints "I'm eating" to the console when called.

### Main Method

```java
public static void main(String[] args) {     
    CAT myCat1 = new CAT(); 
    myCat1.eat();   
}
```

- `public static void main(String[] args)` is the entry point of the program. The program starts running from this method.
- `CAT myCat1 = new CAT();` creates an instance (or object) of the `CAT` class named `myCat1`. This line both declares the variable `myCat1` and initializes it with a new `CAT` object.
- `myCat1.eat();` calls the `eat` method on the `myCat1` object, which triggers the printing of "I'm eating".

## Summary

When we run this program, it starts executing from the `main` method. Within the `main` method, it creates an object of the `CAT` class and calls its `eat` method, which prints "I'm eating" to the console. This example demonstrates basic object-oriented programming concepts in Java, such as class definition, object creation, and method invocation.
