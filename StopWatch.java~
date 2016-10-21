import java.util.*;
import java.util.Scanner;

class StopWatch{
  
 long StartTime=0,StopTime=0,Elapsed=0;

public void start()
{
StartTime=System.currentTimeMillis();
}

public void stop(){
   StopTime=System.currentTimeMillis();
}

public long getElapsedTime(){
Elapsed=(StopTime-StartTime);
return Elapsed;
}

 
   public static void main(String args[]){
 Scanner sc =new Scanner(System.in);

int startChoice,stopChoice;
 
 StopWatch sw= new StopWatch();
		System.out.println("Please Choose your option:\n1. Start\n2. Stop");
  startChoice=sc.nextInt();
sw.start();
		System.out.println("Time is Started\nPlease Enter 2 for Stopping the clock: ");

stopChoice=sc.nextInt();
sw.stop();
		System.out.println("Elapsed Time-: "+sw.getElapsedTime()+" mili Seconds");
}
}








      
