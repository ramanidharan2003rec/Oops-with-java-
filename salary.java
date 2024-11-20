import java.util.Scanner;
class salary{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int sph=sc.nextInt();
int hours=sc.nextInt();
int week=sc.nextInt();
if(hours>=20&&hours<=40)
{
System.out.println("Total Salary:"+(sph*hours*week));
}
else if(hours>40)
{
int a=hours-40;
System.out.println("Total Salary:"+((sph*40*week)+(a*1.5*sph*week)));
}
else
{
int b=sph*hours;
int c=b*10/100;
int d=b-c;
System.out.println(d*week);
}
}
}

