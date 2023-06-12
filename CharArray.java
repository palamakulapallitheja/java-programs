import java.io.CharArrayReader;
public class CharArray{
public static void main(String args[])throws Exception{
char[] ary={'a','d','e','r','z'};
CharArrayReader reader=new  CharArrayReader(ary);
int k=0;
while((k=reader.read())!=-1)
{
char ch=(char)k;
System.out.println(ch+":");
System.out.println(k);
}
}
}
