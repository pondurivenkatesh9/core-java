// size does matter for conversion. we cannot conver integer into byte

public class hello {

	public static void main(String[] args) {
		byte b=12;
		int a=b;
		System.out.println(b);
		System.out.println(a);
		
		
		int aa=383;
		byte k=(byte)aa;
		System.out.println(k);


		float f=5.6f;
		int t=(int)f;
		
		int a2=2567;
		byte b2=(byte)a;
		
		
		byte a3=10;
		byte b4=20;
		// int t=a*b;
		System.out.println(t);
	
	}

}
// be carefull with conversions