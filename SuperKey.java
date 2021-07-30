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
    public void disp()
    {
        System.out.println("Total marks: "+t);
    }
}

class SuperKey
{
    public static void main(String args[])
    {
        B ob=new B(100);
        ob.display();
        ob.disp();
    }
}
