package this_;

public class league extends pro{
String c ="python";
int d = 400;
String e ="google";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            league k = new league();
            System.out.println(k.a);  //calling variable from super class
            System.out.println(k.b);  //calling variable from super class
            k.m1();
            k.m2();
            k.m3();
            k.m4();
            
	}

	
	public void m3()
	{
		System.out.println(super.e); // e is same variable in both classes,calling variable from super class
		System.out.println("language is " + d);
	}
	
	
	
	public void m4()
	{
		System.out.println("Amount is " + d);
	}
	
	
	
	
	
	
	
	
	
	
	
}
