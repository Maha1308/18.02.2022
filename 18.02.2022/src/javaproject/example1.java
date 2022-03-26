package javaproject;

import java.util.Scanner; 
public class example1 {

	public static void main(String[] args) {
		 
		    int choice;int number;
		    Scanner scanner=new Scanner(System.in);
		    System.out.println("Enter the  number =");
		    number=scanner.nextInt();
		    for(int i=0;i<number;i++){
		        System.out.println("Enter character=");
		    if(scanner.hasNextInt())
		    {
		        int a =scanner.nextInt();
		        choice=1;
		    }
		    else
		    {
		        char ch=scanner.next().charAt(0);
		        if(ch>='a' && ch<='z')
		        {
		            choice=2;
		        }
		        else
		        {
		            choice=3;
		        }
		    }
		    switch(choice)
		    {
		       case 1:
		       {
		          System.out.println("Its a digit");
		          System.out.println("______________________");
		          break;
		       }	
		       case 2:
		       {
		          System.out.println("Its an Alphabet");
		          System.out.println("______________________");
		          break;
		       }
		       case 3:
		       {
		          System.out.println("Its a special character");
		          System.out.println("______________________");
		          break;
		       }
		       default:
		           System.out.println("Invalid");
		     }
		    }
		    scanner.close();
		    }
	

	}


