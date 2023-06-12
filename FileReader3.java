import java.io.*;
class FileReader3{ 
public static void main(String args[]) throws Exception{
FileReader fr=new FileReader("C:\\fh\\demo.txt");
BufferedReader br=new BufferedReader(fr); 
int i;
int countVowel=0;
int countConsonents=0;
while((i=br.read())!=-1){
if(((char)i=='a')||((char)i=='e')||((char)i=='i')||((char)i=='o')||((char)i=='u')){
countVowel++;}
else
{
countConsonents++;}
}
System.out.println(countVowel);
System.out.print(countConsonents);
}
}