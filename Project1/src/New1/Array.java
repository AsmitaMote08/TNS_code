package New1;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int a[]= new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array:");
		for(int i=0;i<=a.length;i++) {
			a[i]=sc.nextInt(10);
			break;
				
		}
		System.out.println("Array is:");
		for(int i=0;i<=a.length;i++) {
			System.out.println(a[i]);
			
			
			
		}
		
//Reverse a string
		/*while(obj1>0) {
			ans=obj1%10;
			obj1=obj1/10;
			System.out.println(ans);
			
			
		}*/
//adding digits of numbers
		/*while(obj1>0) {
			ans+=obj1%10;
			obj1=obj1/10;
			System.out.println(ans);
			
			
		}
		*/
		
//Calculating no. of digits in number
		/*		Scanner sc=new Scanner(System.in);
		int obj1=sc.nextInt();
		int ans=0;
		int n=0;
		while(obj1>0) {
			n=obj1%10;
			ans=ans+n;
			
		}
		System.out.println(ans);
*/
	}
	

}
