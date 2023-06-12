import java.util.Scanner;
import java.util.Arrays;
class Sort1
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("");
int n=sc.nextInt();
int sum=0;
float avg=0;
int a[]=new int[n];
System.out.println("");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
sum=sum+a[i];
avg=(float)(sum/n);
}
Arrays.sort(a);
for(int j:a)
System.out.println(j+"");
System.out.println(a[0]+" "+a[n-1]);
System.out.println(sum);
System.out.println(avg);
}
}
