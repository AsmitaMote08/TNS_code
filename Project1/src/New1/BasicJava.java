package New1;

public class BasicJava {
	public static void Fibbonaci(int count){
		int a=0;
		int b=1;
		int c=1;
		for(int i=0;i<=count;i++) {
			System.out.println(a);
			a=b;
			b=c;
			c=a+b;
			
			
		}
		a=b;
		b=c;
		c=a+b;
		System.out.println("Fibanacci series as:"+c);
		
	}

	public static void main(String[] args) {
		Fibbonaci(10);
	}

}
