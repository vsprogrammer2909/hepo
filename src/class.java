/* write a java program to print all natural numbers from number one to ten */
import java.io.*;

class Onetoten {
    public static void main(String args[]) throws IOException {
        int n = 0;
        for (int i = 1; i <= 10; i++) {
            n = i;
        }
        System.out.println("all natural numbers from one to ten: " + n);
    }
}

/* write a java program to print the addition of first ten natural numbers */

class Natural {
    public static void main(String args[]) {
        int n = 0;
        for (int i = 1; i <= 10; i++) {
            n += i;
        }
        System.out.println("the addition first ten natural numbers: " + n);
    }
}
/* write a java program to print the addition of first ten even numbers */

class Teneven {
    public static void main(String args[]) {
        int n = 0;
        for (int i = 1; i <= 20; i++) {
            if (n % 2 == 0) {
                n += i;
            }
        }
        System.out.println("the sum of first ten even numbers: " + n);
    }
}
/* write a java progrma to print the addition of first twenty odd numbers */

class Twenty {
    public static void main(String args[]) {
        int o = 0;
        for (int i = 1; i <= 40; i++) {
            if (i % 2 != 0) {
                o += i;
            }
        }
        System.out.println("the additin of first twenty odd numbers: " + o);
    }
}
/* write a java progrma to print  the first twenty even and odd numbers  in the seperate line */

class Evenodd {
    public static void main(String args[]) {
        int o = 0;
        int n = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                i = n;
            } else {
                i = o;
            }
        }
        System.out.println("the first ten en=ven numbers: " + n);
        System.out.println("the first ten odd numbers: " + o);
    }
}
/*write a java program to print the sum of factors of number*/

class Factor {
    public static void main(String args[]) throws IOException {
        DataInputStream ins = new DataInputStream(System.in);
        int c = 0;
        System.out.println("enter the number");
        int n = Integer.parseInt(ins.readLine());
        for (int i = 1; n >= i; i++) {
            if (n % i == 0) ;
            {
                c++;
            }
        }
        System.out.println("frequency of factors of the number: " + c);
    }
}


class Perfect {
    public static void main(String args[]) throws IOException {
        DataInputStream ins = new DataInputStream(System.in);
        int s = 0;
        System.out.println("enter a number");
        int n = Integer.parseInt(ins.readLine());
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                s += i;
            }
        }
        if (s == n) {
            System.out.println("it is a perfect number");
        } else {
            System.out.println("it is not a perfect number");
        }
    }
}
/* write a java program to input three different numbers and print the lcm of them. */

class Yo {
    public static void main(String args[]) throws IOException {
        DataInputStream ins = new DataInputStream(System.in);
        System.out.println("enter three different numbers");
        int a = Integer.parseInt(ins.readLine());
        int b = Integer.parseInt(ins.readLine());
        int c = Integer.parseInt(ins.readLine());
        int p = a * b * c, lcm = 0;
        for (int i = 1; i <= p; i++) {
            if (i % a == 0 && i % b == 0 && i % c == 0) {
                lcm = i;
                break;
            }
        }
        System.out.println("lcm: " + lcm);
    }
}

/* write a java program to input two different numbers and find lcm of them. */

class Input {
    public static void main(String args[]) throws IOException {
        DataInputStream ins = new DataInputStream((System.in));
        System.out.println("enetr two different number");
        int a = Integer.parseInt(ins.readLine());
        int b = Integer.parseInt(ins.readLine());
        int p = a * b, lcm = 0;
        for (int i = 1; i <= p; i++) {
            if (i % a == 0 && i % b == 0) {
                lcm = i;
                break;
            }
        }
        System.out.println("lcm: " + lcm);
    }
}

/* write a java program to input two different numbers and print the hcf of them. */

class Ear {
    public static void main(String args[]) throws IOException {
        DataInputStream ins = new DataInputStream(System.in);
        System.out.println("enter two numbers");
        int a = Integer.parseInt(ins.readLine());
        int b = Integer.parseInt(ins.readLine());
        int hcf = 0;
        int sm = a < b ? a : b;
        for (int i = 1; i <= sm; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        System.out.println("Hcf of two numbers. :" + hcf);
    }
}

/* write a java program to input three different numbers and print the hcf of them */

class Gh {
    public static void main(String args[]) throws IOException {
        DataInputStream ins = new DataInputStream(System.in);
        System.out.println("enter three different numbers");
        int a = Integer.parseInt(ins.readLine());
        int b = Integer.parseInt(ins.readLine());
        int c = Integer.parseInt(ins.readLine());
        int hcf = 0, sm = 0;
        if (a < b && b < c)
            sm = a;
        else if (b < a && b < c)
            sm = b;
        else
            sm = c;
        for (int i = 1; i < sm; i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                hcf = i;
            }
        }
        System.out.println("hcf of three numbers :" + hcf);
    }
}
/* write a java program to check whether a abundant number or not */

class Abundant {
    public static void main(String args[]) throws IOException {
        DataInputStream ins = new DataInputStream(System.in);
    }
}


/* write a java program to accept a number check and print whwether it is a perfect number or abudant number or deficient number */
/* how to input 10 numbers at runtime:*/
//eg:
class Huh {
    public static void main(String args[]) throws IOException {
        DataInputStream ins = new DataInputStream(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("enter a number");
            int n = Integer.parseInt(ins.readLine());
            System.out.println("Numer entered by you:" + n);
        }
        System.out.println("ten numbers completed"); /* ten numbers completed*/
    }
}

/* write a java program to input ten numbers from the user and print the sum of all numbers*/

class Sum {
    public static void main(String args[]) throws IOException {
        DataInputStream ins = new DataInputStream(System.in);
        int s = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter a number");
            int n = Integer.parseInt(ins.readLine());
            s = s + n;
        }
        System.out.println("Sum of ten numbers:" + s);
    }
}

/* write a java program to input 10 numbers and print odd numbers only */

class Ou {
    public static void main(String args[]) throws IOException {
        DataInputStream ins = new DataInputStream(System.in);
        int f = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("enter a number");
            int n = Integer.parseInt(ins.readLine());
            if (n % 2 != 0) {
                f = 1;
                System.out.println("odd numbers:" + n);
            }
            /* else // modified version not for copy( just for HW{Homework})
            {
                System.out.println("It is an even number");
            }*/
        }
        if (f == 0)
            System.out.println("There is no odd numbers ");
        System.out.println("ten numbers completed"); //just to modify not for copy
    }
}

/* HW: Dry run the sum command  11 may 2020 */

/*  HW: write a java program to input 10 numbers and print only even numbers  , dry run the below
 code also 13 May 2020 */

/* write a java program to input ten numbers and print the addition of even numbers
 and if there is no even number entered  by the user provide a relevant error message  */

class Even {
    public static void main(String args[]) throws IOException {
        DataInputStream ins = new DataInputStream(System.in);
        int s = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("enter a number");
            int n = Integer.parseInt(ins.readLine());
            if (n % 2 == 0) {
                s = s + n;
            }
        }
        if (s == 0) {
            System.out.println("there is no even numbers in 10 numbers");
        } else {
            System.out.println("the sum of even numbers: " + s);
        }

    }
}

/* write a java program to input ten numbers and print the greatest number */

class Greatest {
    public static void main(String args[]) throws IOException {
        DataInputStream ins = new DataInputStream(System.in);
        int gr = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("enter a number");
            int n = Integer.parseInt(ins.readLine());
            if (n > gr) {
                gr = n;
            }
        }
        System.out.println("the greatest number: " + gr);
    }
}

/* write a java program to input 10 numbers and print the greatest numbers */
/* will be reconstructed tommorrow 16 may 2020 */

class Great {
    public static void main(String args[]) throws IOException {
        DataInputStream ins = new DataInputStream(System.in);
        int gr = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("enter the number");
            int n = Integer.parseInt(ins.readLine());
            if (i == 1) {
                gr = n;
            } else if (n > gr) {
                gr = n;
            }
        }
        System.out.println("the greatest number: " + gr);
    }
}


/* write a java program o input ten numbers and print even and odd numbers */

class Eve {
    public static void main(String args[]) throws IOException {
        DataInputStream ins = new DataInputStream(System.in);
        int se = 0, so = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("enter a number");
            int n = Integer.parseInt(ins.readLine());
            if (n % 2 == 0) {
                se += n;
            } else {
                so += n;
            }
        }
        System.out.println("Sum of even numbers: " + se);
        System.out.println("Sum of odd  numbers: " + so);
    }
}

/* write a java program to input ten numbers and print the smallest number */

class Small {
    public static void main(String args[]) throws IOException {
        DataInputStream ins = new DataInputStream(System.in);
        int sm = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("enter a number");
            int n = Integer.parseInt(ins.readLine());
            if (i == 1) {
                sm = n;
            } else if (n < sm) {
                sm = n;
            }
        }
        System.out.println("Smalest number: " + sm);
    }
}

/* write a java program to input ten numbers and print the greatest number and the smallest number */

class Hg {
    public static void main(String args[]) throws IOException {
        DataInputStream ins = new DataInputStream(System.in);
        int sm = 0, gr = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("enter a number");
            int n = Integer.parseInt(ins.readLine());
            if (i == 1) {
                gr = n;
                sm = n;
            } else if (n > gr) {
                gr = n;
            } else if (n < sm) {
                sm = n;
            }
        }
        System.out.println("Greatest number: " + gr);
        System.out.println("Smallest number: " + sm);
    }
}

/* write a java program to input 10 numbers and print the greatest and second greatest number */

class Seco {
    public static void main(String args[]) throws IOException {
        DataInputStream ins = new DataInputStream(System.in);
        int gr = 0, sgr = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("enter the number");
            int n = Integer.parseInt(ins.readLine());
            if (i == 1) {
                gr = n;
                sgr = n;
            }
        }
    }
}

/* write a java program to input ten numbers and print the smallest number and the second smallest number */

class Secondsmallest {
    public static void main(String args[]) throws IOException {
        DataInputStream ins = new DataInputStream(System.in);
        int sm = 0, ssm = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("enter the number");
            int n = Integer.parseInt(ins.readLine());
            if (i == 1) {
                sm = n;
                ssm = n;
            } else if (n < sm) {
                ssm = sm;
                sm = n;
            } else if (n > sm && n < ssm) {
                ssm = n;
            } else if (n > sm && sm == ssm) {
                ssm = n;
            }
        }
        System.out.println("smallest number: " + sm);
        System.out.println("second smallest number: " + ssm);
    }
}

// HW: dry run the above program for better understanding

/*

break statement:
it is one of the jumping statement of java . this statement is only used in switch and loop .whenever it is encountered
in the body of loop ,it forcefully terminate the loop and the program control resumes at the next statement folowing the loop.

eg.

for(int i=1;i<=5;i++)
{
       if(i%4==0)
       {
               System out println("loop is terminating");
               System.out.println("terminated");
                break;
       }
       System.out.println("hello india");
}


output: hello india
*

Continue statement:
continue statement is one of the jumping statement of java.This statement only used in
loop and whenever it is encountered(found) in a loop it forcefully not terminated  the loop
rather the next eteration of the loop takes place and skipping the execution of the statement which is given after it.
we can use java continue statement in all types of loops such as : for loop,while loop,do while loop.

eg:

for(int i=1;i<=5;i++)
{
    if(i<=3)
    {
        continue;
    }
    System.out.println("india is great");
}

output: india is great
        india is great

*/

/*  class For
    {
        public static void main(String args[])
        {
            for(int i=1;i<=5;i++)
            {
                if(i<=3)
                {
                    continue;
                }
                System.out.println("india is great");
            }
        }
    }
    // just to see the output
 */

/* for (int i=1;i<=5;i++)
{
      continue;
      System.out.println("india is great");
}

the above example is not going to be compiled ,because of statement unreachable.

note: if a continue statement is encountered in the body of for loop the next iteration (repetation)
      will take place and the flow of control shifted back to the updation of the loop.

Nested loop:
  loop within a loop is known as nested loop.

eg:
   for(int i=1;i<=5;i++)
   {
        for(j=1;j<=i;j++)
        {
            System.out.print(i);
        }
        System.out.println();
   }

output:
1
22
333
4444
55555

// HW: DRY RUN THE CODE(UPPER)


for(inti=1;i<=5;i++)
{
    for(int j=1;j<=i;i++)
    {
        System.out.print(j);
    }
    System.out.println();
}

output:
1
12
123
1234
12345


write a java program to print the multiplication table of number 5,2,20 upto ten times
 */

class Dk {
    public static void main(String args[]) throws IOException {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

class Multiplicationtable {
    public static void main(String args[]) throws IOException {
        for (int i = 5; i <= 20; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "*" + j + "=" + (i * j));
            }
            System.out.println();
        }
    }
}

/* write a java program to print the factors of number 5 to 20

eg:
no.:5
factor of no. 5 :1
factor of no. 5 :5
vice versa
*/

class Twentyfactor {
    public static void main(String args[]) throws IOException {
        DataInputStream ins = new DataInputStream(System.in);
        for (int i = 5; i <= 20; i++) {
            System.out.println("factors of number: " + i);
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}

class Perfectyg {
    public static void main(String args[]) {
        int s = 0;
        for (int i = 2; i <= 50; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    s += j;
                }
            }
            if (s == i) {
                System.out.println("perfect number: " + i);
            }
            s = 0;
        }
    }
}

/* write a java program print the abundant number from 2 to 50 */

class Perfecty {
    public static void main(String args[]) {
        int s = 0;
        for (int i = 2; i <= 50; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    s += j;
                }
            }
            if (s == i) {
                System.out.println("perfect number: " + i);
            }
            s = 0;
        }
    }
}

/* write a java program to print the deficient number 2 to 50 */

class Deficientnumbers {
    public static void main(String args[]) throws IOException {
        int s = 0;
        for (int i = 2; i <= 50; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    s += j;
                }
            }
            if (s < i) {
                System.out.println("Deficient no.: " + i);
            }
            s = 0;
        }
    }
}

/* write a java program to print all the prime numbers from number 2 to 50  */

class Primenumbers {
    public static void main(String args[]) {
        int s = 0;
        for (int i = 2; i <= 50; i++) {
            for (int j = i; j <= i; j++) {
                if (i % j == 0) {
                    s++;
                }
            }
            if (s == 2) {
                System.out.println("the prime no.: " + i);
            }
            s = 0;
        }
    }
}

/*

pattern based program:
1)1
  12
  123
  1234
  12345
2)1
  22
  333
  4444
  55555
3)A
  AB
  ABC
  ABCD
  ABCDE
4)A
  BB
  CCC
  DDDD
  EEEEE
5)1
  00
  111
  0000
  11111
6)1
  10
  101
  1010
  10101
7)1
  01
  010
  1010
  10101
8)12345
  1234
  123
  12
  1
9)ABCDE
  ABCD
  ABC
  AB
  A
10)AAAAA
   BBBB
   CCC
   DD
   E
11)EDCBA
   EDCB
   EDC
   ED
   E
12)54321
   5432
   543
   54
   5
13)55555
   4444
   333
   22
   1
*/

class Pattern1// related to 1)
{
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

class Pattern2//RELATED TO 2)
{
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

class Pattern3 //RELATED TO 3)
{
    public static void main(String args[]) {
        for (int i = 65; i <= 69; i++) {
            for (int j = 65; j <= i; j++) {
                System.out.print((char) j);
            }
            System.out.println();
        }
    }
}

class Pattern4//RELATED TO 4)
{
    public static void main(String args[]) {
        for (int i = 65; i <= 69; i++) {
            for (int j = 65; j <= i; j++) {
                System.out.print((char) i);
            }
            System.out.println();
        }
    }
}

class Pattern5//RELATED TO 5)
{
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}

class Pattern6//RELATED TO 6)
{
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}

class Pattern7//RELATED TO 7)
{
    public static void main(String args[]) {
        int c = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (c % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
                c++;
            }
            System.out.println();
        }
    }
}

class Pattern8//RELATED TO 8)
{
    public static void main(String args[]) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

class Pattern9//RELATED TO 9)
{
    public static void main(String args[]) {
        for (int i = 69; i >= 65; i--) {
            for (int j = 65; j <= i; j++) {
                System.out.print((char) j);
            }
            System.out.println();
        }
    }
}

class Pattern10//RELATED TO 10)
{
    public static void main(String args[]) {
        char ch = 'A';
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
            ch++;
        }
    }
}

class Pattern11 {
    public static void main(String args[]) {
        for (int i = 65; i <= 69; i++) {
            for (int j = 69; j >= i; j--) {
                System.out.print((char) j);
            }
            System.out.println();
        }
    }
}

class Pattern12 {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

class Pattern13 {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

/*
17)    A
      BA
     CBA
    DCBA
   EDCBA
18)12345
    1234
     123
      12
       1

*/

class Pattern17 {
    public static void main(String args[]) {
        int sp = 4;
        for (int i = 65; i <= 69; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 65; k--) {
                System.out.print((char) k);
            }
            System.out.println();
            sp--;
        }
    }
}

class Pattern18 {
    public static void main(String args[]) {
        int sp = 0;
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
            sp++;
        }
    }
}

class Pattern19//HW
{
    public static void main(String args[]) {
        int sp = 0;
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
            sp++;
        }
    }
}

class Pattern20 {
    public static void main(String args[]) {
        int sp = 0;
        for (int i = 69; i <= 65; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 65; k++) {
                System.out.print((char) k);
            }
            System.out.println();
            sp++;
        }
    }
}

/*
22)ACEGI
    ACEG
     ACE
      AC
       A
*/

class Pattern22
{
    public static void main(String args[])
    {
        int sp=0;
        char ch='A';
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=sp;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(ch);
                ch+=2;
            }
            System.out.println();
            sp++;
            ch='A';
        }
    }
}

class Pattern23
{
    public static void main(String args[])
    {
        int sp=4,sy=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=sp;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=sy;k++)
            {
                System.out.print("*");
            }
            System.out.println();
            sp--;
            sy+=2;
        }
    }
}

/*
hw
      1
     123
    12345
   1234567
  123456789
 */

class Pattern24
{
    public static void main(String args[])
    {
        int sp=4,sy=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=sp;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=sy;k++)
            {
                System.out.print(k);
            }
            System.out.println();
            sp--;
            sy+=2;
        }
    }
}

class Pattern25
{
    public static void main(String args[])
    {
        int sp=4,sy=65;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=sp;j++)
            {
                System.out.print(" ");
            }
            for(int k=65;k<=sy;k++)
            {
                System.out.print((char)k);
            }
            System.out.println();
            sp--;
            sy+=2;
        }
    }
}

class Pattern26
{
    public static void main(String args[])
    {
        int sp=0,sy=9;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=sp;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=sy;k++)
            {
                System.out.print("*");
            }
            System.out.println();
            sp++;
            sy-=2;
        }
    }
}

