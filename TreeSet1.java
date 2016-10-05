import java.util.*;
 class TreeSet1{
public static void main(String args[]){

TreeSet<String> tr=new TreeSet<String>();

tr.add("hi");
tr.add("hello");
tr.add("bye");
Iterator hf;
hf=tr.iterator();
while(hf.hasNext())
{



 System.out.println(hf.next());
  }
}
}
