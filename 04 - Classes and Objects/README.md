# Classes and Objects:
###	Class And Object Theory
    Object Oriented programming
    Object - Properties and Beahaviors
###	Class and Object Practical
    class Calculator{
        public int add(int n1, int n2)
        {
            System.out.println("in add");
        }
    }

    class Demo
    {
        public static void main(String[] args) 
        {
            int num1=4;
            int num2=5;
            Calculator calc= new Calculator();
            //Reference var = instatiate class(object)
            int result=calc.add(4,5);            
        }
    }
###	JDK JRE JVM
    We downlaod JDK which will have JVM and JRE. 
    JRE and JVM are enough to run the compiled code. JDK is not required in servers

    JDK- Java Development Kit
    JVM- Java Virtual Machine
    JRE- Java Runtime Environment

                +------------------------------------------------------+
                |                            JDK                       |
                +------------------------------------------------------+
                                |
                                v
                +------------------------------------------------------+
                |                            JRE                       |
                +------------------------------------------------------+
                    |                       |
                    v                       v
    +---------------------------+   +---------------------------+
    |           JVM             |   |      JRE Libraries        |
    +---------------------------+   +---------------------------+

###	Methods
    public static void main(String[] args) {
		
	}
###	Method Overloading
    Class will have multiple methods with same name, but with different type/no.of arguments. When we call a method it will run the method whose args are matching
    
    Usecase: lets say I have a requirement where I need to add more arguments for one of the existing methods. If I update the existing method I have to update all the references. Instead of that I can create new method with same name but with different arguments. I can refernece the same methid with new arguments which automatically calls the new method
###	Stack And Heap
    Stack is used for managing method invocation and local variables, follows a LIFO structure, and has a fixed size. 

    Heap is used for dynamic memory allocation, has a more flexible structure, and is managed by the garbage collector. 
    
    Understanding these differences is crucial for effective memory management and writing efficient programs.