import java.util.Scanner;
class Prime{
int num;
Scanner sc = new Scanner(System.in);
void Calculate(){
System.out.println("Enter the number: ");
num = sc.nextInt();
System.out.println("The prime numbers in the range 2-"+num+" are as follows");
iterate(num);
}
void iterate(int n)
{
for(int i=2; i<=n; i++)
if(isPrime(i))
System.out.println(i);
}
Boolean isPrime(int n)
{
int count=0; 
for(int i=1; i<=n; i++){
if(n%i==0)
count ++;
}
if(count<=2)
return true;
else
return false;
}
public static void main(String[] args){
Prime P = new Prime();
P.Calculate();
}
}