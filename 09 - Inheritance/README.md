# Inheritance:

###	Need of Inheritance

    Inheritance is essential in Java and object-oriented programming because it promotes code reuse, simplifies maintenance, enables polymorphism, and provides a flexible and hierarchical structure for organizing and managing classes in software systems. It is a powerful mechanism for building modular, extensible, and maintainable codebases

    Class Calc   //Parent class , Super, Base
    {
        add()
        sub()
        multi()
        div()
    }

    Class AdvCalc extends Calc    //Child class, Sub, Derived 
    {
        {
        }
    }	


###	What is Inheritance

    Inheritance in Java is a mechanism by which a new class (subclass or derived class) is created based on an existing class (superclass or base class). The subclass inherits properties and behaviors (methods and fields) from its superclass, allowing it to reuse and extend the functionality of the superclass.

###	Single and Multilevel Inheritance

    Single Inheritance:
        
        class Subclass extends Superclass

    Multilevel Inheritance:

        class IntermediateClass extends Superclass
        class Subclass extends IntermediateClass

    Hierarchical Inheritance:

        class Subclass1 extends Superclass
        class Subclass2 extends Superclass

    Multiple Inheritance:

        Multiple inheritance does not supported by Java
        Using interface we can achieve some level of multiple Inheritance (this comes in later sections)
        Ambiguity issue

        interface Interface1 {
            void method1();
        }

        interface Interface2 {
            void method2();
        }

        class MyClass implements Interface1, Interface2 {
            public void method1() {
                // Implementation of method1
            }

            public void method2() {
                // Implementation of method2
            }
        }
    
    Hybrid Inheritance:

        class Subclass extends IntermediateClass implements Interface1


###	Multiple Inheritance

    Multiple inheritance does not supported by Java.
    Using interface we can achieve some level of multiple Inheritance as shown above.
    Ambiguity issue

###	Method Overriding

    Method overriding in Java is a feature of object-oriented programming that allows a subclass to provide a specific implementation of a method that is already defined in its superclass. When a subclass overrides a method, it replaces the implementation of the method inherited from the superclass with its own implementation.