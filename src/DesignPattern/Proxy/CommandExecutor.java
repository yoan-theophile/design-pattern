package DesignPattern.Proxy;
/*
Here is the information you requested about the Proxy Design Pattern:

1. The name: The Proxy Design Pattern is a type of structural design pattern.
2. The problem to solve: The Proxy Design Pattern provides a surrogate or placeholder for another object to control access to it[2]. It is used when we need to create a wrapper to cover the main object's complexity from the client[1]. For example, it can be used to restrict and control access to underlying objects[5].
3. The solution to the problem: The Proxy Design Pattern creates a proxy class whose objects can be used in place of original objects in an application. The proxy acts as an intermediatory layer between the client and the real object and hence can control the access to the real object, add additional functionality, and even restrict client access[6]. It provides a means of accessing the main object when required[1]. 
4. The consequences: The Proxy Design Pattern allows us to add a level of indirection to the original object, which can be useful for a variety of reasons, such as improving performance or adding security[2]. It can also be used to provide a wrapper implementation for better performance[2]. However, it can add complexity to the codebase[5]. 

Overall, the Proxy Design Pattern is a useful tool for controlling access to objects and adding additional functionality.

EXAMPLE:
The Proxy Design Pattern can be understood using an example from real life. One common example is a security guard acting as a proxy for a building. Here is how the example relates to the different aspects of the Proxy Design Pattern:

1. The name: The proxy in this example is the security guard.
2. The problem to solve: The building owner wants to control access to the building and add an additional layer of security. They also want to restrict certain areas of the building to authorized personnel only.
3. The solution to the problem: The security guard acts as a proxy between the visitors and the building. They check the identification of the visitors, verify their authorization, and grant or deny access accordingly. They also monitor the building and ensure that only authorized personnel enter restricted areas.
4. The consequences: The use of a proxy (security guard) provides several benefits. It enhances security by controlling access to the building and verifying the identity of visitors. It also adds an additional layer of protection by restricting access to certain areas. However, it may introduce some delays as visitors need to go through the security check. It also adds an extra cost to hire and maintain the security guard.

In summary, the Proxy Design Pattern can be compared to a security guard acting as a proxy for a building, controlling access and adding an extra layer of security.

link: https://www.perplexity.ai/search/c5e1bb07-935e-496b-9e47-57e3fde0666d?s=u

*/

public interface CommandExecutor {
  public void runCommand(String cmd) throws Exception;
}
