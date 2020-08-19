import java.io.*;
class On
{
    public static void main(String args[])throws IOException
    {
        DataInputStream ins=new DataInputStream(System.in);
        int p=0;
        int ar=0;
        int ws=0;
        int s=4;
        int a=Integer.parseInt(ins.readLine());
        int b=Integer.parseInt(ins.readLine());
        int c=Integer.parseInt(ins.readLine());
        int t=Integer.parseInt(ins.readLine());
        switch (a)
        {
            case 1:
                p=a+b+c;
                System.out.println("the perimeter: "+p);
            case 2:
                ar=(s*(s-a)*(s-b)*(s-c))^2;
                System.out.println("the area with sides: "+ar);
            case 3:
                ws=(a+b+c)/2;
                System.out.println("the area without sides: "+ws);
                break;
        }
    }
}

class Java
{
    public static void main(String args[])throws IOException
    {
        DataInputStream ins=new DataInputStream(System.in);
        System.out.println("hello world");
    }
}

class Triplet
{
    public static void main(String args[])throws IOException
    {
        DataInputStream ins=new DataInputStream(System.in);
        int h=Integer.parseInt(ins.readLine());
        int p=Integer.parseInt(ins.readLine());
        int b=Integer.parseInt(ins.readLine());
        if(h*h==p*p+b*b)
        {
            System.out.println("they are Pythagorean triplet");
        }
    }
}

class Average
{
    public static void main(String args[])throws IOException
    {
        DataInputStream ins=new DataInputStream(System.in);
        System.out.println("enter the first number");
        int n=Integer.parseInt(ins.readLine());
        System.out.println("enter the second nimber");
        int o=Integer.parseInt(ins.readLine());
        System.out.println("enter the third number");
        int p=Integer.parseInt(ins.readLine());
        int avg=(n+o+p)/3;
        System.out.println("the average of the three numbers: "+avg);
    }
}

class Student
{
    public static void main(String args[])throws IOException
    {
        DataInputStream ins=new DataInputStream(System.in);
        System.out.println("the name of the student");
        String n=ins.readLine();
        System.out.println("the roll number of the student");
        int r=Integer.parseInt(ins.readLine());
        System.out.println("the marks percentage of the student");
        int mp=Integer.parseInt(ins.readLine());
        System.out.println("the name the name of the student: "+n);
        System.out.println("the roll number of the student: "+r);
        System.out.println("the marks percentage of the student: "+mp+"%");

    }
}

class Oo
{
    public static void main(String args[])throws IOException
    {
        DataInputStream ins=new DataInputStream(System.in);
        String n=ins.readLine();
        double v=Double.parseDouble(ins.readLine());
        int g=Integer.parseInt(ins.readLine());
        String f=ins.readLine();

    }
}

