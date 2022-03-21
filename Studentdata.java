class Studentdata{
    String name;
    int roolno;
    String section;
    int internalmarks;
    int externalmarks;
    int projectmarks;
    void grade()
    {
        int per;
        int total=sinternalmarks+sexternalmarks+sprojectmarks;
        per=(total/300)*100;
        if(per<90 && per>=80)
        {
            System.out.println(sname+"is grade A");
        }
        else if(per<80 && per>=70)
        {
            System.out.println(sname+"is grade B");
        }
        else if(per<70 && per>=60)
        {
            System.out.println(sname+"is grade C");
        }
        else (per>60)
        {
        System.out.println
      
}