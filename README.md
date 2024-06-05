# Java-Session
# Lesson 01 :
# CAT Class in Java

This simple Java program demonstrates the creation and use of a class named `CAT` with a single method `eat`. Here's an explanation of each part of the code:

## Code Breakdown

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
- `CAT myCat1 = new CAT();` creates an instance (or object) of the `CAT` class named `myCat1`.
- `myCat1.eat();` calls the `eat` method on the `myCat1` object, which triggers the printing of "I'm eating".

## Summary

When we run this program, it creates an object of the `CAT` class and calls its `eat` method, which prints "I'm eating" to the console. This example demonstrates basic object-oriented programming concepts in Java, such as class definition, object creation, and method invocation.
