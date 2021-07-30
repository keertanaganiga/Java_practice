import java.io.*;
import java.util.*;
class A
{
    //parameterized constructor definition
    int rn;
    String name;
    A(int r,String name)//constructor
    {
        rn=r;
        this.name=name;
    }
    public void display()
    {
        System.out.println("Roll number: "+rn+"\n");
        System.out.println("Name : "+name+"\n");
    }
}

class B extends A
{
    //constructor definition for B
    int t;
    B(int total)
    {
        super(36,"Keertana");
        t=total;
    }
    public void display()
    {
        super.display();
        System.out.println("Total marks: "+t+"\n");
        
    }
}
class D extends B
{
    double percentage;
    D(double per)
    {
        super(95);
        percentage=per;
    }
    public void disp()
    {
        super.display();
        System.out.println("Percentage: "+percentage);
    }
}

class c
{
    public static void main(String args[])
    {
        D ob=new D(84.0);
        //ob.display();
        ob.disp();
    }
}
