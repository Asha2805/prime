import java.util.*;
public class prime
{
public static void main(String[]args)
{
int n1;
int n2;
Scanner q=new Scanner(System.in);
n1=q.nextInt();
n2=q.nextInt();
for(int i=n1;i<=n2;i++)
{
int count=0;
for(int j=2;j<i;j++)
{
if(i%j==0)
{
count++;
}
}
System.out.println(count);
}
}
}
