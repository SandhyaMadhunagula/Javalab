import java.util.Scanner;
class eqlsIgnoreCase{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter your subject");
String sub=sc.next();
String lan=new String("Python");
if(sub.equalsIgnoreCase("java")){
System.out.println("both the strings are equal");
}
else
{
System.out.println("both the strings are not equal");
}
}
}
