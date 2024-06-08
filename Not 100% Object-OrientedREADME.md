# Java: Not 100% Object-Oriented

This repository contains a simple Java program (`java2.java`) that demonstrates why Java is not considered 100% object-oriented.

## Code Explanation

```java
public class java2 {
    public static void main(String[] args) {
        int primitiveInt = 5; // Primitive type
        Integer objectInt = 5; // Wrapper class (Object)

        System.out.println(primitiveInt); // Using primitive int
        System.out.println(objectInt.toString()); // Using Integer object
    }
}
```


## Description

Java is often touted as an object-oriented programming (OOP) language due to its strong support for objects and classes. However, it falls short of being 100% object-oriented due to the existence of primitive data types like `int`, `char`, `boolean`, etc.

### In the provided code:

- `primitiveInt`: Represents a primitive `int` variable initialized with the value `5`.
- `objectInt`: Represents an `Integer` object initialized with the value `5`.

## Why Java is not 100% Object-Oriented

### Primitive Types:

Java includes primitive data types like `int`, which are not objects. These primitives lack the properties and methods associated with objects, violating the pure object-oriented paradigm.

### Wrapper Classes:

While Java provides wrapper classes like `Integer` to encapsulate primitive types in objects, their existence doesn't make Java 100% object-oriented. The need for wrapper classes implies a compromise in the object-oriented design.

## Conclusion

Java's support for primitive types alongside objects makes it a hybrid language, blending object-oriented and procedural programming paradigms. While it heavily emphasizes OOP concepts, the presence of primitives prevents it from being truly 100% object-oriented.

