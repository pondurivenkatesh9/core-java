# Static Members:

###	Static variable

    In Java, a static variable is a variable that belongs to the class rather than to any specific instance of the class. This means that you can call a static variable without creating an instance of the class.

    [ Myclass.var; ] instaead of [ Myclass obj = new Myclass; obj.var; ]

###	Static method

    In Java, a static method is a method that belongs to the class rather than to any specific instance of the class. This means that you can call a static method without creating an instance of the class.

    [ Myclass.method(); ] instead of [ Myclass obj = new Myclass; obj.method(); ]
    
###	Static block

    public class MyClass {
        static {

        }
    }

    This block will be executed when the class is loaded.
    Useful for initializing static variables or performing one-time tasks.
    It does not return anything.

    Constructor: It comes in next section

        public class MyClass {
            public MyClass() {

            }
        }

        This code will be executed each time an object of MyClass is created.
        Useful for initializing instance variables or performing instance-specific tasks.
        can return something