class Main1{
public static void main(String args[]){
int[] numbers={1,2,3,4,5,6};
int sum=0;
for(int number:numbers){
sum+=number;
}
int arrayLength=numbers.length;
double average=((double)sum/(double)arrayLength);
System.out.println("sum="+sum);
System.out.println("Average="+average);
}
}