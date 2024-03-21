import java.util.*;
public class Switch{
public static void main(String[] args){
int a=4,b=2;
Scanner sc=new Scanner(System.in);
System.out.println("******");
System.out.println("##Arithymetic operat6ions#");
System.out.println("1.Add");
System.out.println("2.Sub");
System.out.println("3.Mul");
System.out.println("4.Div");
System.out.println("ENTER YOUR CHOICE");
int ch=sc.nextInt();
switch(ch)
{
case 1->System.out.println("Addition result is"+(a+b));
case 2->System.out.println("Sustraction result is"+(a-b));
case 3->System.out.println("Multiplication result is"+(a*b));
case 4->System.out.println("Div result is"+(a/b));
default->System.out.println("try next time");
}
}
}










