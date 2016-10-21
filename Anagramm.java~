
import java.util.Arrays;
import java.util.Scanner;

class Anagramm{

private static boolean isAnagram(String str1,String str2){

if(str1.length()!=str2.length()){
return false;
 } 
//sort characters

str1=sortCharacters(str1);
str2=sortCharacters(str2);
 
return str1.equals(str2);
}

private static String  sortCharacters(String str){

char[] ch=str.toLowerCase().toCharArray();
Arrays.sort(ch);
return String.valueOf(ch);
}

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("Enter first string");
 String str1=sc.next();
System.out.println("Enter second string");
String str2=sc.next();


if (isAnagram(str1,str2))
{
System.out.println(str1  +  " is anagram of " + str2);
}

else
{
System.out.println("Strings are not anagram");
  
 }  
     }

}


