public class Studentinfo{
public static void main(String[] args){
Student s=new Student("james","12345");
s.display();
}
}
class Student{
String nam,rn;
Student(String name,String rln){
nam=name;
rn=rln;
}
pubilc void display()
{
System.out..println("Welcome %s rln is %s\n",nam,rn);
}
}

