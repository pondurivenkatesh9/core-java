# Interfaces:

###	Need of Interface

    Interfaces play a crucial role in Java programming by providing a way to define contracts, achieve polymorphism, enable multiple inheritance of behaviors, and promote loose coupling between components. They are an essential tool for building modular, flexible, and maintainable software systems.

###	What is Interface

    In Java, an interface is a reference type, similar to a class, that can contain only constants, method signatures (abstract methods), default methods, static methods, and nested types. It defines a contract or a set of methods that a class must implement. Here are some key points about interfaces:

    Definition: An interface is declared using the interface keyword followed by the interface name.
    
        public interface Animal {
            void makeSound();
            void eat();
        }

    Methods:

        Interfaces can contain method signatures but not method bodies. These methods are implicitly public and abstract.
        
        interface Animal {
            void makeSound(); // Abstract method
            void eat(); // Abstract method
        }

    Constants:

        Interfaces can contain constants, which are implicitly public, static, and final.
        
        interface Constants {
            int MAX_VALUE = 100;
        }

    Default Methods:

        Java 8 introduced default methods, which allow interfaces to provide a default implementation for a method.
        Default methods are declared using the default keyword.

        interface Animal {
            default void sleep() {
                System.out.println("Animal is sleeping");
            }
        }

    Static Methods:

        Java 8 also introduced static methods in interfaces, which provide utility methods that are not tied to any specific instance of the interface.
        Static methods are declared using the static keyword.

        interface Utility {
            static void printMessage() {
                System.out.println("Hello from static method");
            }
        }

    In summary, an interface in Java defines a contract that classes can implement. It provides a way to achieve abstraction, multiple inheritance of behavior, and polymorphism, making it a powerful tool for designing modular and flexible software systems.

###	More on Interfaces

    Inheritance:

        Interfaces can extend one or more other interfaces using the extends keyword.
        
        interface Animal {
            default void sleep() {
                System.out.println("Animal is sleeping");
            }
        }

        interface Mammal extends Animal {
            void breathe();
        }

    Implementation:

        A class implements an interface by providing concrete implementations for all of the methods declared in the interface.
        
        class Dog implements Animal {
            public void makeSound() {
                System.out.println("Bark");
            }
            public void eat() {
                System.out.println("Eating bones");
            }
        }



    // class - class -> extends
    // class - interface -> implements
    // interface - interface -> extends