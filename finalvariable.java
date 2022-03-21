class Student
{
final int rollno=123;
void display()
{
System.out.println("display");
}
}
class Toppers
{
void display()
{
System.out.println("edit");
}
}
class finalvariable
{
public static void main(String args[])
{
Student s=new Student();
//s.rollno();
s.display();
System.out.println(s.rollno);
}
}