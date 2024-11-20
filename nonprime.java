import java.util.Scanner;
class nonprime{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0;
int[] a=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=i;j>1;j--)
{
if(i%j==0)
{
sum=sum+a[i];
}
else{
int[] b=new int[n];
}
}
}

System.out.prinln(sum);
}
}

