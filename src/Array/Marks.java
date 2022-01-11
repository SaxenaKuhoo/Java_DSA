package Array;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        int [][] arr=new int[4][5];
        int n=0;
        Scanner s=new Scanner(System.in);
        for(int i=0;i<4;i++)
            for(int j=0;j<5;j++)
                arr[i][j] = s.nextInt();
        for(int i=0;i<4;i++)
        {   int sum=0;
            for(int j=0;j<5;j++)
            {
                System.out.print(arr[i][j]+"    ");
                sum=sum+arr[i][j];
            }
            System.out.print(sum/5);
            if(sum/5<50)
                n++;
            System.out.println();
        }
        for(int i=0;i<5;i++)
        {   int sum=0;
            for(int j=0;j<4;j++)
            {
                sum=sum+arr[j][i];
            }
            System.out.print(sum/4+"    ");
        }
        System.out.println();
        System.out.println("No. of students whose average is below 50 are:  "+n);
    }
}
