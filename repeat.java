import java.util.*;

class Repeated
{
    public static void main(String args[])
    {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = ip.nextInt();
        }
        int fl=0;
        for(int i = 0; i < n; i++)
        {
            for(int j = i+1; j < n; j++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.println(arr[i]);
                    fl=1;
                }
            }
            if(fl == 1)
            {
                break;
            }
        }
    }
}