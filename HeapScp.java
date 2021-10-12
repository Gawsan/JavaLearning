
public class HeapScp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//this created different reference so ref value not equal in heap 
		String s1=new String("You can not change me");
		String s2=new String("You can not change me");
		System.out.println(s1==s2);
		//s1 created heap and s3 created 
		String s3="You can not change me";
		System.out.println(s1==s3);
		//s4,s3 created in scp same reference address so  statement must be a true
		String s4="You can not change me";
		System.out.println(s3==s4);
		//in the  compile time both are same references 
		String s5="You can not "+"change me";
		System.out.println(s4==s5);
		//run time only
		String s6="You can not ";
		String s7=s6+"Change me";
		System.out.println(s4==s7);
		//every final variable will be replace compile time only 
		final String s8="You can not ";
		String s9=s8+"Change me";
		System.out.println(s4==s9);

	}

}
