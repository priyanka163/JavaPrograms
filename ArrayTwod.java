import java.util.Scanner;
import java.io.*;

public class ArrayTwod{
	public static void main(String[] args){
		int row,column,choice;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Please choose which type of array you want to create :");
		System.out.println(" 1.Integer \n 2.Double \n 3.Boolean");
		choice = sc.nextInt();
		//Using switch case for perticular choice
		switch(choice){
			case 1:{
				System.out.println("Please Enter no. of Rows :");
					row = sc.nextInt();
				System.out.println("Please Enter no. Columns :");
					column = ();
					Integer array[][] = new Integer[row][column];

					//taking array input from user
					for(int i=0;i<row;i++){
						for(int j=0;j<column;j++){
						System.out.print("Please enter Element at position ("+i+","+j+"): ");
						array[i][j] = sc.nextInt();
					}
				}
		
				//Array Printing function from Utility class
				System.out.println("Array is");
				System.out.println(array,row,column);
				break;
			}

			case 2:{
				System.out.println("Please Enter no. of Rows :");
					row =sc.nextInt();
				System.out.println("Please Enter no. Columns :");
					column = sc.nextInt();
					Double array[][] = new Double[row][column];

					//taking array input from user
					for(int i=0;i<row;i++){
						for(int j=0;j<column;j++){
						System.out.print("Please enter Element at position ("+i+","+j+"): ");
						array[i][j] = sc.nextDouble();
					}
				}
		
				///Array Printing function from Utility class
				System.out.println("Array is");
				System.out.println(array,row,column);
				break;
			}

			case 3:{
				System.out.println("Please Enter no. of Rows :");
					row =sc.nextInt();
				System.out.println("Please Enter no. Columns :");
					column = sc.nextInt();
					Boolean array[][] = new Boolean[row][column];

					//taking array input from user
					for(int i=0;i<row;i++){
						for(int j=0;j<column;j++){
						System.out.print("Please enter Element at position ("+i+","+j+"): ");
						array[i][j] = sc.nextBoolean();
					}
				}
		
				//Array Printing function from Utility class
				System.out.println("Array is");
				System.out.println(array,row,column);
				break;
			}
	
		}


	}	
}



