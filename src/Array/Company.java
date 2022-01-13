package Array;

import java.util.Scanner;

//Q. There is a company that manufactures three types of products. In this company, there are 5 salesmen. Each salesman is supposed to sell three products. Write a program to print
//        (i) The total no of sales by each salesman and
//        (ii) total sales of each item.
//        The structure of the class Company is as follows:-
//class Company{
//    int products[];}
//HInt:-
//        Company salesman[]= new Company[5];
//        Output :-
//        Enter the sales of 3 items sold by salesman 1: 23 23 45
//        Enter the sales of 3 items sold by salesman 2: 34 45 63
//        Enter the sales of 3 items sold by salesman 3: 36 33 43
//        Enter the sales of 3 items sold by salesman 4: 33 52 35
//        Enter the sales of 3 items sold by salesman 5: 32 45 64
//        Total Sales By Salesman 1 = 91
//        Total Sales By Salesman 2 = 142
//        Total Sales By Salesman 3 = 112
//        Total Sales By Salesman 4 = 120
//        Total Sales By Salesman 5 = 141
//        Total sales of item 1 = 158
//        Total sales of item 2 = 198
//        Total sales of item 3 = 250

class Comp {
    int[] products;
    Comp(int a,int b,int c)
    {   products=new int[3];
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
        for(int i=0;i< salesman.length;i++) {
            System.out.println("Enter sales of 3 items sold by salesman " + (i+1) + ":  ");
            salesman[i] = new Comp(s.nextInt(), s.nextInt(), s.nextInt());
        }
        for (int i=0;i< salesman.length;i++)
            System.out.println("Total sales by salesman"+(i+1)+":   "+salesman[i].totsal());
        for(int i=0;i<3;i++)
        {   int n=0;
            for (Comp comp : salesman) {
                n = n + comp.products[i];
            }
            System.out.println("Total sales of Product "+(i+1)+":   "+n);
        }
    }
}
