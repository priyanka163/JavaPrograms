import java.util.*;
import java.util.Scanner;


class BinarySearch{

public static void main(String args[]){
 
int start,end,mid,size,count=0;

Scanner sc= new Scanner(System.in);
System.out.println("enter strings");

String names=sc.next();
 String str1[]=names.split(",");
   size = str1.length;
		String str2;
		System.out.println("Please Enter the string to be find :");
		str2 = sc.next();

		//Sorting the string
		for(int i=1;i<size;i++){
			for(int j=i;j>0;j--){
				if(str1[j-1].compareTo(str1[j])>0){
					String temp = str1[j];
					str1[j] = str1[j-1];
					str1[j-1] = temp;
				}
			}
		}

		System.out.print("Sorted Strings are: ");
		System.out.println((Arrays.toString(str1))); //Generic type array printing
		
		start = 0;
		end  = size-1;

		while(start <= end){
			mid = (start+end)/2;
			if (str2.compareTo(str1[mid])==0){
				System.out.println("\nSearch found at position :"+mid);
				count++;
				break;
			}
			if(str2.compareTo(str1[mid])<0)
				end = mid-1;
			else
				start = mid+1;		
		}
		if(count == 0)
			System.out.println("\nSearch not found");		
		
	}
}
