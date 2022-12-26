package String;

public class String1 {
	
	

	public static void main(String[] args) {
		
		String s1="VaibhavChavan";//creating string by java literal
		
		char ch[]={'V','a','i','b','h','a','v','C','h','a','v','a','n'};
		
		//converting char array to string
		String s2=new String(ch);
		
		String s3=new String("VaibhavChavan");
		
		String s4="Aurangabad";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		

	}

}