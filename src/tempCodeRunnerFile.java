import java.io.*;
class Second
{
    public static void main(String args[])throws IOException
    {
        DataInputStream ins=new DataInputStream(System.in);
        int gr=0,sgr=0;
        for(int i=1;i<=10;i++)
        {
            System.out.println("enter the number");
            int n=Integer.parseInt(ins.readLine());
            if(i==1)
            {
                gr=n;
                sgr=n;
            }
            
        }
    }
}