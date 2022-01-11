package Array;

import java.util.Scanner;

class Comp {
    int[] products=new int[3];
    Comp(int a,int b,int c)
    {
        this.products[0]=a;
        this.products[1]=b;
        this.products[2]=c;
    }
    int totsal()
    {
        return this.products[0]+this.products[1]+this.products[2];
    }
}
public class Company
{
    public static void main(String[] args) {
        Comp[] salesman=new Comp[5];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<5;i++) {
            System.out.println("Enter sales of 3 items sold by salesman " + (i+1) + ":  ");
            salesman[i] = new Comp(s.nextInt(), s.nextInt(), s.nextInt());
        }
        for (int i=0;i<5;i++)
            System.out.println("Total sales by salesman"+(i+1)+":   "+salesman[i].totsal());
        for(int i=0;i<3;i++)
        {   int n=0;
            for (int j=0;j<5;j++)
            {
                n=n+salesman[j].products[i];
            }
            System.out.println("Total sales of Product "+(i+1)+":   "+n);
        }
    }
}
