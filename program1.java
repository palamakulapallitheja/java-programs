import java.io.*;
class program1{ 
public static void main(String args[]) throws Exception{
String x=‪‪"C:\\fh\\demo.txt";
FileReader fr=new FileReader(‪‪"C:\\fh\\demo.txt");
BufferedReader br=new BufferedReader(fr); 
int i;
while((i=br.read())!=-1){
System.out.println((char)i);}
br.close();
fr.close();
}
}
