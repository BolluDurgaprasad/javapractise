class Student
{
final int rollno=123;
final void display()
{
System.out.println("display");
}
}
class Toppers
{
void display()//cant do
{
System.out.println("edit");
}
}
class finalclass
{
public static void main(String args[])
{
Student s=new Student();
//.rollno=345;
s.display();
System.out.println(s.rollno);
}
}