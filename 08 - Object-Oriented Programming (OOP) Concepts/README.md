# Object-Oriented Programming (OOP) Concepts:

###	Encapsulation

    Encapsulation hides the internal state (data) of an object from the outside world. It encapsulates the data within the class and provides controlled access to it through methods.
    
    Access modifiers such as private, public, protected, and default are used to control the visibility of class members (variables and methods). By marking variables as private, they can only be accessed and modified by methods within the same class.

###	Getters and setters

    Encapsulation promotes the use of getter and setter methods to access and modify the private data of a class. Getter methods (also known as accessor methods) are used to retrieve the value of a private variable, while setter methods (also known as mutator methods) which are in same class where private vars exist, are used to modify the value of a private variable. This allows for better control over how data is accessed and modified.

###	this keyword

    like self in python.
    inorder to update the class variable.
    if this is not added, will get default value,

###	Constructor

    Default method in a class

    public class MyClass {
        public MyClass() {

        }
    }

    This code will be executed each time an object of MyClass is created.
    Useful for initializing instance variables or performing instance-specific tasks.
    can return something

###	Default vs Parameterized Constructor

    Default one does not have args as shown above and will be called automatically when class is instatiated

    Parameterized one will have args and has to be called specifically with args

###	this and super method

    this is used to refer to the current object instance within the class, while super is used to refer to the superclass members from a subclass.
    
    this is commonly used for accessing instance variables and invoking methods of the current object, while super is used for invoking superclass constructors and methods.

    When a class is initiated, by default it's default constructer is called. Default consturctor first calls Super() by default to call parent class default construct. super() : it is a default function which already exist 

    we can parameterize the super and call them with parameters i.e, super(int 5)

    this();  //call constructor of same class

###	Naming Convention

    Camel casing

    class and interface - Calc (first letter capital)
    variable and method - marks, show() (small letters)
    constants - PIE, BRAND (all capital letters)
    showMyMarks() (first letter of each word is capital from second word)

    Snake casing

    show_my_marks() (not prefered in Java)

###	Anonymous Object

    Object without reference:

    new Myclass(); //anonymous object
    Myclass().method() 
    
    instead of 
    
        Myclass obj = new Myclass(); 
        obj.method()