package com.KrzysztofBaka;

public class CalcFibo {
    public static void calc(int liczba){
        long fiboArray [][] = {  {1,1},
                                {1,0}};

        if(liczba!=0){
            for(int i=0;i<liczba-1;i++){
                mnozenie(fiboArray);
            }
            System.out.println("Wynik dla liczby " + liczba + ", to: " + fiboArray[0][1]);

        }else{
            System.out.println("Wynik: 0");
        }

    }

    public static void mnozenie(long fiboArray [][]){
        int potegaArray [][] = {{1,1},
                                {1,0}};


        long a = fiboArray[0][0]*potegaArray[0][0] + fiboArray[0][1]*potegaArray[1][0];
        long b = fiboArray[0][0]*potegaArray[0][1] + fiboArray[0][1]*potegaArray[1][1];
        long c = fiboArray[1][0]*potegaArray[0][0] + fiboArray[1][1]*potegaArray[1][0];
        long d = fiboArray[1][0]*potegaArray[0][1] + fiboArray[1][1]*potegaArray[1][1];

        fiboArray[0][0]=a;
        fiboArray[0][1]=b;
        fiboArray[1][0]=c;
        fiboArray[1][1]=d;

        /*

        (1,1  ^n      =    (Fn+1  Fn
         0,1)         =     Fn    Fn-1)
         */



    }

}
