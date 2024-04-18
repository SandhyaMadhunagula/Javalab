import java.util.*;
class strB{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the string:");
String s1=sc.next();
s1.concat("hi");
Sytem.out.println("string after concatenation is: "+s1);
StringBuffer sb=new StringBuffer("hello");
sb.append("hi");
Sytem.out.println("string after appending is: "+sb);
}
}

