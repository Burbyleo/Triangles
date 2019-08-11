package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double  x1,y1,
                x2,y2,
                x3, y3,
                x4,y4,
                x5,y5,
                x6,y6;

        double a,b,c,d,e,f;
        double per1, per2;

        Scanner num = new Scanner(System.in);

        System.out.println("Triangle #1:");
        System.out.println("Vertex A:");

if (!num.hasNextDouble()){
    System.out.println("Invalid input!");
    System.exit(1);}
    x1 = num.nextDouble();
        if (!num.hasNextDouble()){
            System.out.println("Invalid input!");
            System.exit(1);}
    y1 = num.nextDouble();

    System.out.println("Vertex B:");
        if (!num.hasNextDouble()){
            System.out.println("Invalid input!");
            System.exit(1);}
    x2 = num.nextDouble();
        if (!num.hasNextDouble()){
            System.out.println("Invalid input!");
            System.exit(1);}
    y2 = num.nextDouble();
    System.out.println("Vertex C:");
        if (!num.hasNextDouble()){
            System.out.println("Invalid input!");
            System.exit(1);}
    x3 = num.nextDouble();
        if (!num.hasNextDouble()){
            System.out.println("Invalid input!");
            System.exit(1);}
    y3 = num.nextDouble();

      a = Math.sqrt( (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2) );
      b = Math.sqrt( (x1-x3)*(x1-x3) + (y1-y3)*(y1-y3) );
      c = Math.sqrt( (x2-x3)*(x2-x3) + (y2-y3)*(y2-y3));

        if   (a+b-c<= 1e-12 *c*c || a+c-b<= 1e-12*b*b || b+c-a<= 1e-12*a*a){
            System.out.println("The points do not form a triangle");
            System.exit(1);
        }
        System.out.println("Triangle #2:");
        System.out.println("Vertex A:");
        if (!num.hasNextDouble()){
            System.out.println("Invalid input!");
            System.exit(1);}
        x4 = num.nextDouble();
        if (!num.hasNextDouble()){
            System.out.println("Invalid input!");
            System.exit(1);}
        y4 = num.nextDouble();


        System.out.println("Vertex B:");
        if (!num.hasNextDouble()){
            System.out.println("Invalid input!");
            System.exit(1);}
        x5 = num.nextDouble();
        if (!num.hasNextDouble()){
            System.out.println("Invalid input!");
            System.exit(1);}
        y5 = num.nextDouble();

        System.out.println("Vertex C:");
        if (!num.hasNextDouble()){
            System.out.println("Invalid input!");
            System.exit(1);}
        x6 = num.nextDouble();
        if (!num.hasNextDouble()){
            System.out.println("Invalid input!");
            System.exit(1);}
        y6 = num.nextDouble();

        d = Math.sqrt((x4-x6)*(x4-x6)+(y4-y6)*(y4-y6));
        e = Math.sqrt((x4-x5)*(x4-x5)+(y4-y5)*(y4-y5));
        f = Math.sqrt((x5-x6)*(x5-x6)+(y5-y6)*(y5-y6));

        per1 = a+b+c;
        per2 = d+e+f;

        if   (d+e-f<= 1e-12 *f*f || e+f-d<= 1e-12*d*d || d+f-e<= 1e-12*e*e){
            System.out.println("The points do not form a triangle.");
        System.exit(1);
        }

        if ((a == d || a == e || a == f) && (b == d || b == e || b ==f) && (c == d || c == e || c == f)) {
            System.out.println("The triangles are identical.");
           System.exit (0);}
        if ((per1 - per2 <= 1e-12 * per2 * per2) && (per2 - per1 <= 1e-12 * per1 * per1))  {
            System.out.println("The triangles are not identical, however, they have the same circumference.");
            System.exit(0);}

        else if (  per1-per2> 1e-12 *per2*per2){
            System.out.println("Triangle #1 has a longer circumference.");
            System.exit(0);}

        else {
            System.out.println("Triangle #2 has a longer circumference.");
            System.exit(0);
        }

            }

    }

