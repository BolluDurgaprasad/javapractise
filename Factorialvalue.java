class Factorialvalue{
    public static void main(String[]args){
        int n,f;
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        n=sc.nextInt();
        for(f=1;n>=1;n--)
        {
            f=f*n;
        }
        System.out.println("The factorial value is:");
    }
}
