
public class Imutablity {

	public static void main(String[] args) {
		
		
		//objected created in heap area  in run time 
		//if there are no change that object pointed existing the same object 
		String s1=new String("gawsan");
		String s2=s1.toUpperCase();
		String s3=s1.toLowerCase();
		String test1="test1";
		String test2=test1.toString();
		String test3=test1.toUpperCase();
		System.out.println(s1==s2);
		
		
		//pointed the existing object 
		System.out.println(s1==s3);
		
		System.out.println("Any changes create object");
		System.out.println(test1==test2);
		System.out.println(test1==test3);
		System.out.println(test2==test3);
		
	}

}
