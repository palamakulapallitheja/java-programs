import java.io.*;
class FileRead2{ 
public static void main(String args[]) throws Exception{
FileReader fr=new FileReader("c:\\fh\\demo.txt");
BufferedReader br=new BufferedReader(fr); 
int i;
int count=0;
while((i=br.read())!=-1){
if(((char)i>='')&&((char)i<='9')){

countDigit++;}
}
System.out.print(countDigit);
}
}