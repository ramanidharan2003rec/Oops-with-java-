import java.util.Scanner;
class minimum{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] a=new int[n];
int sum=0;

for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
int min=a[0];
for(int i=0;i<n;i++)
{
if(a[i]<min)
{
min=a[i];
}
}
while(min!=0)
{
int b=min%10;
sum=sum+b;
min=min/10;
}
System.out.println(sum);

if(sum%2==0){
System.out.println(1);
}
else{
System.out.println(0);
}
}
}



