import java.util.*;
import java.util.Scanner;

class VendingMachine{

  static int total=0;
 

static void function(int value){

 if(value>=1000){
value=value-1000;
System.out.print("1000 ");
total++;
function(value);
}

else if(value>=500){

   value=value-500;
     System.out.print("500 ");
total++;
function(value);
   }

else if(value>=100){
 value=value-100;
System.out.print("100 ");
 total++;
function(value);
}
   
    		else if (value >=50){
			value = value-50;
			System.out.print("50 ");
			total++;
			function(value);
		}




		else if (value >=10){
			value = value-10;
			System.out.print("10 ");
			total++;
			function(value);
		}

		else if (value >=5){
			value = value-5;
			System.out.print("5 ");
			total++;
			function(value);
		}
		else if (value >=2){
			value = value-2;
			System.out.print("2 ");
			total++;
			function(value);
		}

         		else if (value >=1){
			value = value-1;
			System.out.print("1 ");
			total++;
			function(value);
		}

}
public static void main(String args[])
{

Scanner sc = new Scanner(System.in);
VendingMachine v= new VendingMachine();
System.out.println("Enter value of change to be returned");
 int value  =sc.nextInt();
System.out.println("\nchange values: ");

if(value!=0){
function(value);
}
else{
System.out.println("no change");
}
 System.out.println("\nTotal no of notes: "+ total);
}
}


