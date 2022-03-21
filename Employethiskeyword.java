import java.util.*;
class Employe
{
private int id;
private String name;
private double salary;
void setId(int id)//set the values for private datamembers
{
this.id=id;
}
void setName(String name)
{
this.name=name;
}
void setSalary(double salary)
{
this.salary=salary;
}
//to get the private variables
int getId()
{
return this.id;
}
String getName()
{
return this.name;
}
double getsalary()
{
return this.salary;
}
}

class Employethiskeyword
{
public static void main(String args[])
{
Employe e=new Employe();
Scanner sc=new Scanner(System.in);
System.out.println("enter id");
int i=sc.nextInt();
e.setId(i);
System.out.println("enter name");
String n=sc.next();
e.setName(n);
System.out.println("enter salary");
double s1=sc.next();
e.setSalary(s1);
System.out.println(e.getId());
System.out.println(e.getName());
System.out.println(e.getSalary());
}
}
