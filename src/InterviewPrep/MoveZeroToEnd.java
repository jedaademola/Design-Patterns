package InterviewPrep;

import java.util.Scanner;

public class MoveZeroToEnd {
        public static void main (String[] args)
        {
            //code
            System.out.println("start");

            Scanner sc=new Scanner(System.in);
            System.out.print("Enter T:");
            int T=sc.nextInt();
           while(T -->0)
            {
            System.out.println("start1");

            System.out.print("Enter n:");
            int n=sc.nextInt();
            System.out.println("start2");

            int ar[]=new int[n];
                for(int i=0;i<n;i++) {
                    System.out.print("Enter array element:");
                    ar[i] = sc.nextInt();
                }
                int count=0;
                for(int i=0;i<n;i++)
                {
                    if (ar[i] != 0)
                        ar[count++] = ar[i];
                }
                while(count<n)
                    ar[count++]=0;
                for(int i=0;i<n;i++)
                    System.out.print(ar[i]+" ");
                System.out.println();
            }
        }

}
