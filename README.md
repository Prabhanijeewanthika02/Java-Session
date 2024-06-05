# Java-Session
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
