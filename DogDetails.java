class Dog{
    String name;
    String colour;
    String bread;
    String eyecolour;
    void barking()
    {
        System.out.println(name+"barking");
    }
    void eating()
    {
        System.out.println(name+"eating");
    }
    class DogDetails{
        public static void main(String[]args)
        {
            Dog d1=new Dog();
            d1.name="cutie";
            d1.colour="white";
            d1.bread="german";
            d1.eyecolour="black";
            System.out.println("Dog information");
            System.out.println("d1.name+d1.colour+d1.bread+d1.eyecolour");
            d1.barking();
            d1.eating();
             Dog d2=new Dog();
            d2.name="sweety";
            d2.colour="black";
            d2.bread="japanese";
            d2.eyecolour="black";
            System.out.println("Dog information");
            System.out.println("d2.name+d2.colour+d2.bread+d2.eyecolour");
            d2.barking();
            d2.eating();
        }
    }
}