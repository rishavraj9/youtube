import java.util.Scanner;
class Search{
int m, n;
Scanner sc = new Scanner(System.in);
Boolean Calculate(int arr[][]){
int row = 0;
int num;
int col = arr[row].lenght;
System.out.println("Enter the number to find");
num = sc.nextInt();
while(row<arr.lenght && col>=0){
if(arr[row][col]==num){
System.out.println("The number has been found at array index["+row+"]["+col+"]);
return true;
}
if(arr[row][col]<num)
{
row++;
}
else
{
col--;
}
}
System.out.println("The number is not found is the entered array");
return false;
}
public static void main(String[] args){
int m,n;
System.out.println("Enter the size of 20 array");
Scanner sc = new Scanner(System.in);
m = sc.nextInt();
n = sc.nextInt();
int arr[][] = new int[m][n];
System.out.println("enter the number for the array");
for(int i=0; i<m; i++)
for(int j=0; j<n; j++)
arr[i][j] = sc.nextInt();
search sc = new Search();
sc.calculator(arr);
}
}
