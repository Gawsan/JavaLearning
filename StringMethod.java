import java.util.Scanner;

public class StringMethod {

	public static void main(String[] args) {
		
		String s="gaw san";
		String empty="";
		String name="Gawsan";
		String fname="Raveenthiran";
		int [] x= {60,90,45,12};
		String trim;
		Scanner myscan=new Scanner(System.in);
		
		//s.charAt this specify index of character
		System.out.println(s.charAt(3));
		
		//concat method
		System.out.println(name.concat(" "+fname));
		System.out.println(name+fname);
		System.out.println(name+=fname); 
		
		//boolean equals method(anyObject o)
		//for content comparison
		//to check equality  
		//to validate password 
		System.out.println(s.equals("Gawsan"));
		
		//if we want to ignore case
		//case is ignored
		//to validate username
		System.out.println(s.equalsIgnoreCase("Gawsan"));
		
		//string is empty or not
		//length method applicable for string
		//we can't use length varible in string 
		System.out.println(empty.isEmpty());
		System.out.println(s.isEmpty());
		
		//number of character in string
		System.out.println(s.length());
		
		//length variable applicable for array
		System.out.println(x.length);
		
		//replace method replace(char old,char new)
		System.out.println(s.replace('g', 'G'));
		
		//two substring methods are available
		//subString method substring(int begin)
		//from begin index of end of index
		System.out.println(s.substring(3));
		
		//another substring thats two arguments
		//substring(int begin,int end)
		//from begin index to end -1 object
		System.out.println(s.substring(2,5));
		
		
		//index of specify charcter
		//indexOf(char ch)//if the charcter not avilable we will get -1
		//if the charcter avilble mutible time this will return first character
		System.out.println(s.indexOf('s'));
		
		
		//if we want to find last occurrence character
		System.out.println(s.lastIndexOf('a'));
		
		//change lower case
		System.out.println(s.toLowerCase());
		
		//change to uppercase
		System.out.println(s.toUpperCase());
		
		//remove the unwanted spaces
		//remove the blank spaces trim 
		System.out.print("Enter you name: ");
		trim=myscan.next().trim();
		System.out.println(trim);
		


	}

}
