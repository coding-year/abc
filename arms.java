import java.util.*;
class arms
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int a,b,i;
System.out.println("enter the first number");
a=sc.nextInt();
System.out.println("enter the second number");
b=sc.nextInt();
for(i=a;i<b;i++)
{
int n,sum=0,rem;
n=i;
while(n!=0)
{
rem=n%10;
sum=sum+rem*rem*rem;
n=n/10;
}
if(sum==i)
{
System.out.println(" armstrong number is=" +i);
}
}
}
}
