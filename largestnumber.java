class largestnumber{
    public static void main(String[]args){
        int[] a =new int[]{22,54,887,2,5};
        int max = a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("the given array is:");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("the largest number is:"+max);
    }
}