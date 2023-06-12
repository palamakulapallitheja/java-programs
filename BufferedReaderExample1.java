import java.io.*;
public class BufferedReaderExample1{
public static void main(String args[])throws Exception{
InputStreamReader r=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(r);
System.out.println("enter your name:");
String name="";
while(!name.equals("shop")){
System.out.println("enter data");
name=br.readLine();
System.out.println("data is"+name);
}
br.close();
r.close();
}
}
