import java.util.Scanner;
class LinearSearch
{
public static void main(String args[])
{
int c, n, search, array[];
Scanner sct = new Scanner(System.in);
System.out.println("Enter number of elements");
n = sct.nextInt();
array = new int[n];
System.out.println("Enter " + n + " integers");
for (c = 0; c < n; c++) 
{
array[c] = sct.nextInt();
}
System.out.println("Enter value to find"); 
search = sct.nextInt();
for (c = 0; c < n; c++)
{
if (array[c] == search)
{
System.out.println(search + "  present at location " + (c + 1) + ".");
break;
}
}
if (c == n)
System.out.println(search + "  not present inside array.");
}
}
