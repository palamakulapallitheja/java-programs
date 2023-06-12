import java.util.Scanner;
class Polymorpisam{
void print(){System.out.println("Welcome");}
void print(String n){System.out.println("Welcome"+n);}
}
class day106{
public static void main(String args[])
{
Polymorpisam obj=new Polymorpisam();
obj.print();
Scanner sc=new Scanner(System.in);
System.out.println("please type your name");
String s=sc.next();
obj.print(s);}
}
