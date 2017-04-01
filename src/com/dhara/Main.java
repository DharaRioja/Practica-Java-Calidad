package com.dhara;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
	    // EXERCISE 1
        Driver driver1 = new Driver();
        driver1.registerTravels();
        driver1.report();

        //EXERCISE 2
        Palindrome palindrome=new Palindrome();
        palindrome.read();
        if(palindrome.palindromeOrNo())
        {
            System.out.printf("The number %d is palindrome \n",palindrome.getNumber());
        }
        else
        {
            System.out.printf("The number %d is not palindrome \n",palindrome.getNumber());
        }

        //EXERCISE 3
        int n;
        //a)
        System.out.print("Number: ");
        n=input.nextInt();
        Factorial factorialA=new Factorial(n);
        System.out.printf("Factorial the %d is %d \n",n,factorialA.factorial());
        //b)
        System.out.print("Number: ");
        n=input.nextInt();
        Factorial factorialB=new Factorial(n);
        System.out.printf("Constant e is %d \n",factorialB.constant_e());
        //c)
        System.out.print("Number: ");
        n=input.nextInt();
        Factorial factorialC=new Factorial(n);
        System.out.printf("Constant e is %d \n",factorialC.constant_e_x());

        //EXERCISE 4
        int side1,side2,hypotenuse;
        for(int i=1;i<498;i++)
        {
            side1=i;
            side2=i+1;
            hypotenuse=i+2;
            if(((side1^2)+(side2^2))==(hypotenuse^2))
            {
                System.out.printf("%d ^2 + %d ^2 = %d ^2 \n",side1,side2,hypotenuse);
            }
        }

        //EXERCISE 5
        Airline airline=new Airline();
        int op;
        do {
            System.out.println("1. First Class");
            System.out.println("2. Economy Class");
            System.out.println("0. Quit");
            System.out.print("Enter an option: ");
            op = input.nextInt();

            switch (op){
                case 1:
                    if(airline.First_Class())
                    {
                        System.out.println("Right");
                    }
                    else
                    {
                        System.out.println("All busy...Do you want choose Economy Class?");
                        int r1;
                        System.out.println("1. Yes");
                        System.out.println("2. No");
                        System.out.print("Enter an option: ");
                        r1= input.nextInt();
                        if(r1==1)
                        {
                            airline.Economy_Class();
                        }
                        else
                        {
                            System.out.println("Next flight leaves in 3 hours.");
                        }
                    }
                    break;
                case 2:
                    if(airline.Economy_Class())
                    {
                        System.out.println("Right");
                    }
                    else
                    {
                        System.out.println("All busy...Do you want choose First Class?");
                        int r;
                        System.out.println("1. Yes");
                        System.out.println("2. No");
                        System.out.print("Enter an option: ");
                        r= input.nextInt();
                        if(r==1)
                        {
                            airline.First_Class();
                        }
                        else
                        {
                            System.out.println("Next flight leaves in 3 hours.");
                        }
                    }
                    break;
            }
        }while(op!=0);

        //EXERCISE 6
        java.util.Random rnd  = new java.util.Random();
        int numFilas      = 8;
        int filaInicial   = rnd.nextInt(numFilas);
        int colInicial    = rnd.nextInt(numFilas);
        EightQueens queens = new EightQueens(8);
        queens.resolution(filaInicial, colInicial,1);
        queens.show();
        System.out.printf("Cantidad de veces que entra al ciclo: %,d %n",  queens.getCont());

        //EXERCISE 7
        int i=1,j=1;
        boolean flag=true;
        IntegerSet set1=new IntegerSet();
        IntegerSet set2=new IntegerSet();
        System.out.println("Set 1: ");
        while(flag)
        {
            System.out.println("Number: ");
            i=input.nextInt();
            if(i!=-1)
            {
                set1.insertElement(i);
            }
            else
            {
                flag=false;
            }
        }
        flag=true;
        System.out.println("Set 2: ");
        while(flag)
        {
            System.out.println("Number: ");
            j=input.nextInt();
            if(j!=-1)
            {
                set2.insertElement(j);
            }
            else
            {
                flag=false;
            }
        }
        for(int k=0;k<=100;k++)
        {
            if(set1.getI(k)==true || set2.getI(k)==true)
                IntegerSet.union(k);
        }
        for(int k=0;k<=100;k++)
        {
            if(set1.getI(k)==false || set2.getI(k)==false)
                IntegerSet.intersection(k);
        }
        flag=true;
        System.out.println("Show Set Static: ");
        IntegerSet.showSet_s();
        System.out.println("Delete element: ");
        System.out.println("Set 1: ");
        while(flag)
        {
            System.out.println("Number: ");
            i=input.nextInt();
            if(i!=-1)
            {
                set1.deleteElement(i);
            }
            else
            {
                flag=false;
            }
        }
        flag=true;
        System.out.println("Set 2: ");
        while(flag)
        {
            System.out.println("Number: ");
            j=input.nextInt();
            if(j!=-1)
                set2.deleteElement(j);
            else
                flag=false;
        }
        System.out.println("To String: ");
        System.out.printf("Set 1: %s \n",set1.toString());
        System.out.printf("Set 2: %s \n",set2.toString());
        System.out.println("Equals: ");
        if(set1.isEqualTo(set2)==true)
        {
            System.out.println("Equal!");
        }
        else
        {
            System.out.println("Different!");
        }

        //EXERCISE 8
        int n1,n2,d1,d2;
        System.out.println("Numerator 1: ");
        n1 = input.nextInt();
        System.out.println("Denominator 1: ");
        d1 = input.nextInt();
        System.out.println("Numerator 2: ");
        n2 = input.nextInt();
        System.out.println("Denominator 2: ");
        d2 = input.nextInt();
        Rational rational1=new Rational(n1,d1);
        Rational rational2=new Rational(n2,d2);
        //a)
        System.out.println("A) Sum:");
        Rational.add(n1,d1,n2,d2);
        Rational.reduce_static();
        //b)
        System.out.println("B) Subtraction:");
        Rational.subtract(n1,d1,n2,d2);
        Rational.reduce_static();
        //c)
        System.out.println("C) Multiplication:");
        Rational.multiply(n1,d1,n2,d2);
        Rational.reduce_static();
        //d)
        System.out.println("D) Division:");
        Rational.divide(n1,d1,n2,d2);
        Rational.reduce_static();
        //e) Devolvera el objeto rational1 como String
        System.out.printf("The number as String: %s\n",rational1.convert());
        //f) Devolvera el objeto rational1 como decimal(float)
        int d;
        System.out.printf("Number of digits of precision: \n");
        d = input.nextInt();
        rational1.decimal(d);
        System.out.printf("The number as String: %s\n",rational1.decimal(d));

        //EXERCISE 9
        HugeInteger number1=new HugeInteger();
        HugeInteger number2=new HugeInteger();
        String n11,n21;
        System.out.println("Number 1: ");
        n11=input.nextLine();
        number1.parse(n11);
        System.out.println("Number 2: ");
        n21=input.nextLine();
        number2.parse(n21);
        System.out.println("Sum: ");
        System.out.printf("%d \n",number1.add(number2));
        System.out.printf("Subtraction: ");
        System.out.printf("%d \n",number1.subtract(number2));
        System.out.println("To String: ");
        System.out.printf("Number 1: %s \n",number1.toString());
        System.out.printf("Number 2: %s \n",number2.toString());
        System.out.printf("Number 1 is equal to Number 2 %b \n", number1.isEqualTo(number2));
        System.out.printf("Number 1 is not equal to Number 2 %b \n", number1.isNotEqualTo(number2));
        System.out.printf("Number 1 is greater than Number 2 %b \n", number1.isGreaterThan(number2));
        System.out.printf("Number 1 is less than Number 2 %b \n", number1.isLessThan(number2));
        System.out.printf("Number 1 is greater than or equal to Number 2 %b \n", number1.isGreaterThanOrEqualTo(number2));
        System.out.printf("Number 1 is less than or equal to Number 2 %b \n", number1.isLessThanOrEqualTo(number2));
        System.out.printf("Number 1 is zero %b \n", number1.isZero());
        System.out.printf("Number 1 is zero %b \n", number1.isZero());

        //EXERCISE 10
        int xr,xl,yr,yl;
        System.out.println("Coordinates for Quadrilaterals: ");
        System.out.printf("X (right): ");
        xr=input.nextInt();
        System.out.printf("X (left): ");
        xl=input.nextInt();
        System.out.printf("Y (right): ");
        yr=input.nextInt();
        System.out.printf("Y (left): ");
        yl=input.nextInt();
        Point point=new Point(xr,xl,yr,yl);
        //Los tamaños se calculan segun las coordenadas (las coordenadas pueden ser ingresadas como las de un plano)
        Quadrilateral quadrilateral1=new Rectangle(point);
        Quadrilateral quadrilateral2=new Trapezoid(point);
        Quadrilateral quadrilateral3=new Parallelogram(point);
        System.out.printf("Area Rectangle %.2f \n",quadrilateral1.area());
        System.out.printf("Area Trapezoid %.2f \n",quadrilateral2.area());
        System.out.printf("Area Parallelogram %.2f \n",quadrilateral3.area());




    }
}
