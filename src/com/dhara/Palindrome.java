package com.dhara;

import java.util.Scanner;

public class Palindrome
{
    private int number;
    Scanner input = new Scanner(System.in);

    public Palindrome()
    {
        number=0;
    }

    public int getNumber() {
        return number;
    }

    public void read()
    {
        System.out.print("Number: ");
        number=input.nextInt();
    }

    public boolean palindromeOrNo()
    {
        boolean resp=false;
        int cont=0;
        int aux1=number;
        int aux2=number;
        while(number>=10)
        {
            number=number/10;
            cont++;
        }
        number=aux1;
        aux1=0;
        if(cont==4)
        {
            while(number>=10)
            {
                aux1=(aux1+number%10)*10;
                number=number/10;
            }
            aux1=aux1+number;
            number=aux2;
            if(aux2==aux1)
            {
                resp=true;
            }
        }
        else
        {
            read();
            palindromeOrNo();
        }
        return resp;

    }
}
