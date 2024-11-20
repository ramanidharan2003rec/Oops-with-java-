import java.util.Scanner;
class squares{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] a=new int[n];
int[] b=new int[n];
int sum=0;
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
if(a[i]<10){
b[i]=a[i];
}
else{
while(a[i]!=0)
{
b[i]=a[i]%10;
a[i]=a[i]/10;
}
}
}
for(int i=0;i<n;i++){
b[i]=b[i]*b[i];
System.out.println(b[i]);
sum=sum+b[i];
}
System.out.println(sum);
}
}

