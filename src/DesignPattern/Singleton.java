package DesignPattern;
/**
  The Singleton Pattern is a design pattern that restricts the instantiation of a class to one object. Here are the four parts of the Singleton Pattern:

  1. Name: The Singleton Pattern is a creational design pattern that ensures that a class has only one instance, while providing a global access point to this instance.

  2. Problem to solve: The Singleton Pattern solves the problem of having multiple instances of a class in an application. Sometimes, it is necessary to have only one instance of a class, for example, a single database connection shared by multiple objects, as creating a separate database connection for every object may be costly.

  3. Solution to the problem: The Singleton Pattern ensures that only one instance of a class is created and provides a global point of access to that instance. It achieves this by making the constructor of the class private, so that it cannot be instantiated from outside the class. Instead, it provides a static method that returns the same instance of the class every time it is called.

  4. Consequences: The Singleton Pattern has several consequences, including:

  - It ensures that only one instance of a class is created, which can save memory and improve performance.
  - It provides a global point of access to the instance, which can simplify code and improve maintainability.
  - It can make the code harder to test, as it introduces a global state that can affect the behavior of other parts of the code.
  - It can make the code harder to extend, as it limits the number of instances of a class that can be created.

  Remember that the Singleton Pattern is not a bad pattern in itself, but it can be used improperly. It is important to use it only when necessary and to be aware of its consequences.

 */

public class Singleton {
  private Singleton() {

  }

  private static Singleton instance;

  public synchronized static Singleton getObject() {
    if (instance == null) {
      instance = new Singleton();
    }

    return instance;
  }
}
