import java.util.Scanner;
class factors1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int count=0;
for(int i=1;i<=n;i++){
if(n%i==0){ 
System.out.print(i);
count++;
if(i!=n) 
System.out.print(",");
else {
System.out.print("");}
}
}
System.out.print("count:"+count);
if(count==2){
 System.out.print("PRIME");}
else{
 System.out.print("NOT");}
}
}



