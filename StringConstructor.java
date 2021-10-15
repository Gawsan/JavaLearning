//6 types of constructors are there
public class StringConstructor {



	public static void main(String[] args) {
		
		char [] ch= {'j','a','v','a'};
		//range of byte -128 to +127
		byte [] b= {97,98,99,100,65};
		StringBuffer sb=new StringBuffer("Hello world");
		StringBuilder sb1=new StringBuilder("Gawsan");
		String s= new String();
		String s1=new String("Gawsan");
		String s2=new String(sb);
		String s3=new String(sb1);
		String test=new String(ch);
		//this will change number as character(unicode value)
		String test1=new String(b);
		
		System.out.println(s+"\n"+s1+"\n"+s2+"\n"+s3+"\n"+test+"\n"+test1);
	

		

	}

}
