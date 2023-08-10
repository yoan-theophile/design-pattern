package DesignPattern.Strategy;
/**
 The Strategy Design Pattern is a behavioral design pattern that solves the problem of having multiple algorithms or behaviors in an application that need to be interchangeable at runtime. Here are the four parts of the Strategy Design Pattern:

  1. Name: The Strategy Design Pattern is a behavioral design pattern that lets you define a family of algorithms, encapsulate each one, and make them interchangeable.

  2. Problem to solve: The Strategy Design Pattern solves the problem of having multiple algorithms or behaviors in an application that need to be interchangeable at runtime. Without this pattern, you would need to hard-code each algorithm into the program, which would make it complex and hard to maintain.

  3. Solution to the problem: The Strategy Design Pattern defines a set of related algorithms or behaviors and encapsulates each one in a separate class. It allows the client to choose any algorithm at runtime and switch between them easily. The pattern separates the algorithm from the client code, making it more flexible and easier to maintain.

  4. Consequences: The Strategy Design Pattern has several consequences, including:

  - It makes the code more flexible and easier to maintain by separating the algorithm from the client code.
  - It allows the client to choose any algorithm at runtime and switch between them easily.
  - It can increase the number of classes in the application, which can make it more complex.
  - It can introduce overhead due to the need to create and manage multiple objects.

  Remember that the Strategy Design Pattern is a powerful tool for managing multiple algorithms or behaviors in an application. It allows you to separate the algorithm from the client code and switch between them easily at runtime.
 */

public interface ColorStrategy {
  public String format(String text);
}
