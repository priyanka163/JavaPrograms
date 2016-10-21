
import com.bridgelabz.util.Utility;
import java.util.Stack;


class SimpleBalanced{

public static void main(String args[]){

Utility u=new Utility();

String st=new String();

System.out.println("Enter the mathematical expression");
  st=u.inputString();

     Stack sk=new Stack();
//push and pop operation
 for(int i=0;i<st.length();i++){


   if(st.charAt(i)=='{'){
    sk.push('{');
}

if(st.charAt(i)=='('){
 sk.push('(');

}
if(st.charAt(i)=='['){
sk.push('[');
}
if(st.charAt(i)=='}'){
sk.pop();
}
if(st.charAt(i)==')'){
sk.pop();
}

if(st.charAt(i)==']'){
sk.pop();
}
}
   if(sk.empty())
System.out.println("expression is balanced");

else 
System.out.println("expression is imbalance");

}
}
