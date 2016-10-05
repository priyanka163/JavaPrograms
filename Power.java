class Power
{

public static void main(String args[])
{
int power=Integer.parseInt(args[0]);
int result=1;

if(power>0 & power<31){
for(int i=0;i<=power;i++){

System.out.println("2^"+i+"="+result);
result=2*result;
}
}
else
System.out.println("given number between 1 and 30 ");
    }
    }






