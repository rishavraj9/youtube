import java.util.Scanner;
class Main{
public static void main(String[] args){
int a,b;
int arr[] = new int[5];
Scanner sc = new Scanner(System.in);
System.out.println("Enter a & b: ");
a = sc.nextInt();
b = sc.nextInt();
if(b!=0)
System.out.println(a+"/"+b+"="+(a/b));
else throw new ArithmeticException("b is equal to 0!");
for(int i=0;i<=5;i++){
arr[i] = i;/*In this Line, after the 5th iteration, when assigning a value to the array index 5 it raises an error called'ArrayIndexOutofBoundsException'. This is because there is no space available as the size of the array is constrained to 5*/
}
}
}