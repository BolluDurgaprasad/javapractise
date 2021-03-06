class shape{
    void draw()
    {
        System.out.println("drawing");
    }
}
class rectangle extends shape{
    void draw()
    {
        System.out.println("drawing rectangle");
    }
}
class circle extends shape{
    void draw()
    {
        System.out.println("drawing circle");
    }
}
class triangle extends shape{
    void draw()
    {
        System.out.println("drawing triangle");
    }
}
class Main{
    public static void main(String[]args){
        shape s;
        s=new rectangle();
        s.draw();
        s=new circle();
        s.draw();
        s=new triangle();
        s.draw();
    }
}
----------------------------------------------------------------------------------------------------------------------------------
class rectangle{
    double length,breadth;
    rectangle(double length,double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    void area()
    {
        System.out.println((length*breadth));
    }
    void perimeter()
    {
        System.out.println((2*(length+breadth)));
    }
}
class square extends rectangle{
    square(double side)
    {
        super(side,side);
    }
}
class Main{
    public static void main(String[]args){
        square s=new square(2);
        rectangle r=new
        rectangle(2,3);
        System.out.println("square");
        r.area();
        r.perimeter();
        }
}
---------------------------------------------------------------------------------------------------------------------------------
abstract class bank
{
    float rateofintrest()
    {
      return 0;  
    }
}
class SBI extends bank
{
    float rateofintrest()
    {
       return 8;
    }
}
class AXIS extends bank
{
    float rateofintrest()
    {
      return 7;
    }
}
class union extends bank
{
    float rateofintrest()
    {
       return 6;
    }
}
class Main{
    public static void main(String[]args){
      bank b;
      b=new SBI();
      System.out.println("SBI rateofintrest:"+b.rateofintrest());
      b=new AXIS();
        System.out.println("AXIS rateofintrest:"+b.rateofintrest());
        b=new union();
          System.out.println("union rateofintrest:"+b.rateofintrest());
    }
}
-------------------------------------------------------------------------------------------------------------------------------
interface shape{
    public static final int side=1;
    abstract void draw();
}
class circle implements shape{
    public void draw()
    {
        System.out.println("circle");
    }
}
class Main{
    public static void main(String[]args)
    {
        circle c=new circle();
        c.draw();
    }
}
--------------------------------------------------------------------------------------------------------
interface animal{
    public static final int side=1;
    abstract void eat();
}
class dog implements animal{
    public void eat()
    {
        System.out.println(" dog is eating");
    }
}
class cat implements animal{
    public void eat()
    {
        System.out.println("cat is eating");
    }
}
class Main{
    public static void main(String[]args)
    {
        cat c=new cat();
        c.eat();
        dog d=new dog();
        d.eat();
    }
}
