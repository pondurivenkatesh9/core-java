public class hello {

	public static void main(String[] args) {
		int num1=9;
		byte by=127;
		short sh=558;
		long l=5854l;
		
		float f=5.8f;
		double d=5.8;
		
		char c='k';
		
		boolean b=true;


        System.out.println("Byte size " + Byte.SIZE );
        System.out.println("Short size " + Short.SIZE );
        System.out.println("Int size " + Integer.SIZE );
        System.out.println("Long size " + Long.SIZE );

        System.out.println("Float size " + Float.SIZE );
        System.out.println("Double size " + Double.SIZE );

        System.out.println("Char size " + Character.SIZE );

        //below one is invalid invalid 
        // System.out.println("short size " + Boolean.SIZE );


	}

}
