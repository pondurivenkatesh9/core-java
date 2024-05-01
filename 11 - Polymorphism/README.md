# Polymorphism:


###	Polymorphism

    Many behaviour ( same object or reference has differnet behaviours)

    Polymorphism in Java allows for many behaviors through two main mechanisms: method overloading and method overriding.

    Method Overloading:

        Method overloading enables a single method name to represent multiple behaviors based on the parameters it accepts.
        By defining multiple methods with the same name but different parameter lists, each method can perform a different action.
        This allows for many behaviors of the same method name within the same class.
    
    Method Overriding:

        Method overriding allows for many behaviors of a method name across different classes in an inheritance hierarchy.
        When a subclass overrides a method of its superclass, it provides a specific implementation of that method tailored to its own behavior.
        This enables different subclasses to exhibit different behaviors for the same method name.

    Through method overloading and method overriding, polymorphism in Java allows for many behaviors to be associated with a single method name, either within the same class or across different classes in an inheritance hierarchy. This flexibility and extensibility are key features of object-oriented programming, enabling code reuse and abstraction of behavior.

###	Dynamic Method Dispatch

    Dynamic method dispatch is a feature of polymorphism in Java where the JVM determines which version of an overridden method to execute at runtime based on the actual type of the object. This allows for more flexible and dynamic behavior in object-oriented programming.

    Here's an example demonstrating dynamic method dispatch:

    class Animal {
        void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }

    class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Dog barks");
        }
    }

    class Cat extends Animal {
        @Override
        void makeSound() {
            System.out.println("Cat meows");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Animal animal1 = new Dog(); // Upcasting
            Animal animal2 = new Cat(); // Upcasting

            animal1.makeSound(); // Output: Dog barks
            animal2.makeSound(); // Output: Cat meows
        }
    }

    In this example:

    We have a superclass Animal and two subclasses Dog and Cat. Both Dog and Cat override the makeSound() method inherited from Animal with their own implementations.
    In the main method, we create objects animal1 and animal2 of type Animal but actually referring to instances of Dog and Cat respectively. This is known as upcasting, where a subclass object is treated as a superclass reference.
    When we invoke the makeSound() method on animal1 and animal2, the JVM determines which version of the makeSound() method to execute based on the actual type of the object referred to by the reference variable (animal1 or animal2). This is dynamic method dispatch.
    As a result, the output will be "Dog barks" for animal1 and "Cat meows" for animal2, demonstrating how the method invocation is resolved dynamically at runtime based on the actual object type.

    Another Explanation:

    Let's consider a hypothetical scenario where we have a piece of code that does not utilize dynamic method dispatch, resulting in less flexible and harder-to-maintain code. Here's an example:

    Suppose we have a Project class that assigns work to employees. Initially, the Project class has separate methods to assign work to managers and engineers:

    class Project {
        void assignWorkToManager(Manager manager) {
            manager.manage();
        }

        void assignWorkToEngineer(Engineer engineer) {
            engineer.code();
        }
    }

    In this design, the Project class has separate methods for assigning work to managers and engineers. If we introduce a new type of employee in the future, such as Tester, we would need to modify the Project class to add a new method assignWorkToTester(). This violates the Open/Closed Principle of SOLID design, which states that classes should be open for extension but closed for modification.

    To fix this issue and make the code more flexible and maintainable, we can utilize dynamic method dispatch by introducing a common superclass Employee and polymorphism:

    java
    Copy code
    class Employee {
        void work() {
            System.out.println("Employee is working");
        }
    }

    class Manager extends Employee {
        void manage() {
            System.out.println("Manager is managing");
        }
    }

    class Engineer extends Employee {
        void code() {
            System.out.println("Engineer is coding");
        }
    }

    class Project {
        void assignWork(Employee employee) {
            employee.work(); // Dynamic method dispatch
        }
    }

    With the introduction of the Employee superclass and the assignWork() method that accepts an Employee object, the Project class becomes more flexible and extensible. Now, we can add new types of employees without modifying the Project class. For example, if we introduce a Tester subclass of Employee in the future, we can still use the assignWork() method to assign work to testers without any changes to the Project class:

    java
    Copy code
    class Tester extends Employee {
        void test() {
            System.out.println("Tester is testing");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Project project = new Project();

            Employee manager = new Manager();
            Employee engineer = new Engineer();
            Employee tester = new Tester();

            project.assignWork(manager); // Output: Manager is managing
            project.assignWork(engineer); // Output: Engineer is coding
            project.assignWork(tester); // Output: Employee is working
        }
    }

    In this example, dynamic method dispatch allows the assignWork() method to work with objects of different types of employees without requiring changes to the Project class, making the code more flexible and maintainable.

###	Final keyword

    In Java, the final keyword is used to apply various kinds of immutability and constraints to variables, methods, and classes. Here's a summary of its usage:

    Final Variable:
        When applied to a variable, the final keyword ensures that its value cannot be changed once initialized.
        Example: final int MAX_VALUE = 100;

    Final Method:
        When applied to a method, the final keyword prevents the method from being overridden in subclasses.
       
        class Superclass {
            final void method() {
                // Method implementation
            }
        }

    Final Class:
        When applied to a class, the final keyword prevents the class from being subclassed. In other words, it makes the class immutable. It cannot be inherited by anyother class
        
        final class FinalClass {
            // Class members and methods
        }

    Final Parameters:
        When applied to method parameters, the final keyword ensures that the parameter cannot be reassigned within the method.
        
        void method(final int x) {
            // x cannot be reassigned within this method
        }

    Use Cases:
        Constants: Use final variables for constants whose values should not change.
        Security: Use final methods or classes to prevent unintended changes or extensions that could compromise security or integrity.
        Performance: Use final parameters for method arguments to ensure that they are not inadvertently changed, which can improve code readability and maintainability.
        
    Overall, the final keyword in Java is a powerful tool for enforcing immutability, ensuring integrity, and improving code robustness. It is widely used in various contexts to indicate that certain entities should not be modified or extended.

###	Object Class equals toString hashcode

    In Java, the Object class is the root class of all classes in the Java class hierarchy. Every class in Java directly or indirectly extends the Object class. The Object class is defined in the java.lang package, which is automatically imported into all Java programs.

    Here are some key points about the Object class in Java:

    Superclass of All Classes:

        The Object class is the superclass of all classes in Java. Every class inherits methods from the Object class, either directly or indirectly.

    Common Methods:

        The Object class provides several commonly used methods that are inherited by all classes. Some of the most commonly used methods include:

        toString(): Returns a string representation of the object.
        equals(Object obj): Indicates whether some other object is "equal to" this one.
        hashCode(): Returns a hash code value for the object.
        getClass(): Returns the runtime class of the object.
        wait(), notify(), notifyAll(): Methods used for inter-thread communication (related to multithreading).

    Default Implementation:

        The Object class provides default implementations for these methods. However, these implementations are generally not very useful and are often overridden in subclasses to provide more meaningful behavior.

        Overriding toString() Method:
            It is common practice to override the toString() method in user-defined classes to provide a meaningful string representation of the object. This is often useful for debugging and logging purposes.

        Equals and HashCode:
            The equals() and hashCode() methods are closely related and are often overridden together. The equals() method is used to check for object equality, while the hashCode() method is used for storing objects in hash-based collections like HashMap and HashSet.
        
        Use in Generics:
            The Object class is used extensively in Java generics. When a generic type is not specified, it defaults to Object. For example, ArrayList without a type argument is effectively an ArrayList<Object>.

    In summary, the Object class serves as the foundation of the Java class hierarchy and provides common methods and behaviors that are inherited by all classes. Understanding the Object class and its methods is essential for effective Java programming.

###	Upcasting and Downcasting

    In Java, upcasting and downcasting are related to the assignment of object references between superclass and subclass types. These concepts are closely tied to inheritance and polymorphism. Here's an explanation of each:

    Upcasting:
        Upcasting involves assigning a reference of a subclass type to a reference variable of a superclass type.
        Upcasting is always safe and implicit because a subclass object "is a" superclass object (due to inheritance).
        It allows you to treat the subclass object as if it were an instance of the superclass.
        
        class Animal { }
        class Dog extends Animal { }

        Animal animal = new Dog(); // Upcasting

    Downcasting:
        Downcasting involves assigning a reference of a superclass type to a reference variable of a subclass type.
        Downcasting is potentially unsafe and requires explicit casting because a superclass object may not necessarily be a subclass object.
        It allows you to access the specific methods or fields of the subclass that are not available in the superclass.
        
        Animal animal = new Dog(); // Upcasting
        Dog dog = (Dog) animal; // Downcasting

    Safety of Downcasting:
        Downcasting can lead to ClassCastException at runtime if the object being referenced is not actually an instance of the subclass.
        To avoid this exception, you can use the instanceof operator to check the type before performing downcasting:
        
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; // Downcasting
            // Access specific Dog methods
        }

    Use Cases:
        Upcasting is commonly used to achieve polymorphism, where objects of different subclasses can be treated uniformly as instances of their common superclass.
        Downcasting is used when you need to access specific methods or fields of a subclass that are not available in the superclass.
        
    In summary, upcasting and downcasting are essential concepts in Java that enable polymorphism and facilitate interaction between superclass and subclass objects. Upcasting is implicit and safe, while downcasting requires explicit casting and careful handling to avoid runtime errors.

###	Abstract keyword

    In Java, the abstract keyword is used to define abstract classes and abstract methods. Here's an explanation of both:

    Abstract Class:
        An abstract class is a class that cannot be instantiated directly. It serves as a blueprint for other classes and may contain abstract methods, concrete methods, or both.
        Abstract classes are declared using the abstract keyword.
        Abstract classes can have constructors, fields, and concrete methods (methods with a body).
        Abstract classes may also contain abstract methods (methods without a body), which are declared using the abstract keyword and are intended to be implemented by subclasses.
        
        abstract class Shape {
            abstract void draw(); // Abstract method
            void display() {
                System.out.println("Displaying shape");
            }
        }

    Abstract Method:
        An abstract method is a method declared in an abstract class but does not have a method body.
        Abstract methods are intended to be implemented by subclasses. They provide a contract for subclasses to follow.
        Abstract methods are declared using the abstract keyword and must end with a semicolon (;).
        Subclasses of an abstract class must implement all abstract methods defined by the superclass, or they themselves must be declared abstract.

        abstract class Animal {
            abstract void makeSound(); // Abstract method
        }
        
    Use Cases:
        Abstract classes are useful when you want to provide a common interface for a group of related classes, but you don't want to provide a complete implementation.
        Abstract methods are useful when you want to define a method signature without specifying the implementation, leaving it to subclasses to provide their own implementations.
        
    In summary, abstract classes and methods in Java provide a way to define common interfaces and behaviors for subclasses while allowing for variations in implementation. They promote code reusability, maintainability, and flexibility in object-oriented design.
