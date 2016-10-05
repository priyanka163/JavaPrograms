import java.io.*;
import java.util.Scanner;
class StringReplace
{
	public static void main(String ar[])
	{
		String UserNM="Hello username,How are you?",UserName=null;
		Scanner in=new Scanner((System.in));
		System.out.println("Please Enter User Name");
			try
			{
			 	 UserName=in.next();
			}catch(Exception e)
			{	
				System.out.print(e);
			}
			String UserNP=UserNM.replace("username",UserName);
		System.out.println(UserNP);
	}
}		
		
