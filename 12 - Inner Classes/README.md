# Inner Classes:

###	Inner class

    Class inside Class
    
    class A
    {
        int age;
        
        public void show()
        {
            System.out.println("in show");
        }
        
    //	class B
    //	{
    //		public void config()
    //		{
    //			System.out.println("in config");
    //		}
    //	}
        
        static class B
        {
            public void config()
            {
                System.out.println("in config");
            }
        }
    }

    public class  Demo{
        public static void main(String[] args) {
            A obj=new A();
            obj.show();
            
    //    	A.B obj1=obj.new B();
    //    	obj1.config();
            
            A.B obj1=new A.B();  //only if B is static Class
            obj1.config();

        }
    }


###	Anonymous Inner class
    
    Inheretence can be written in another format which is called anonymous inner class

            class A
            {
                public void show() 
                {
                    System.out.println("in A show");
                }
            }

            // class B extends A
            // {
            // 	public void show()
            // 	{
            // 		System.out.println("in B Show");
            // 	}
            // }

            public class  Demo{
                public static void main(String[] args) {
                    
                    // A obj=new B();
                    // obj.show();     //in B Show
                    
                    A obj=new A() 
                    {							//anonymous inner class
                        public void show()
                        {
                            System.out.println("in new show");
                        }
                    };
                    obj.show();  //in new show
                }
            }


###	Abstract and Anonymous Inner class

        Similar to above, abstract can also be written in another format which is called anonymous inner class

            abstract class A
            {
                public abstract void show();

            }

            // class B extends A
            // {
            // 	public void show()
            // 	{
            // 		System.out.println("in B show");
            // 	}
            // }

            public class  Demo{
                public static void main(String[] args) {
                    
                    // A obj=new B();
                    // obj.show();  //in B show
                    
                    A obj=new A() 
                    {
                        public void show()
                        {
                            System.out.println("in new show");
                        }
                    };
                    obj.show();  //in new show
                    
                }
            }

