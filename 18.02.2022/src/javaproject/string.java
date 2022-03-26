package javaproject;

public class string {

	public static void main(String[]args) {
	
		
		int vcount=0;
		int ccount=0;
		
		 String a=" i am learning java full stack developement";
		
		 
		 for(int i=0;i<a.length();i++)
		 {
			 if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
			 {
				 vcount++;
			 }
			 else if(a.charAt(i)=='a'&&a.charAt(i)=='z')
			 {
				 ccount++;
				 
			 }
		 }
		 
		 
	
		System.out.println("count of vowels:"+vcount);	 
		System.out.println("count of consonant:"+ccount);	 
		 
			 
	}

}
