import java.io.*;
import java.util.Scanner;

class StringReplace1
{
  public static void main(String args[])
    { 
    String UserNM=" hello username,how are you",UserName=null;
 Scanner sc = new Scanner(System.in);

System.out.println("Enter your String");

try{
UserName=sc.next();

}
catch(Exception e) {
System.out.print(e);
}
String UserNP=UserNM.replace("username",UserName);
System.out.println(UserNP);
} 
}
