package oop.labor11;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {








    public static int safeDivide(int a, int b){
        if (b == 0) throw new RuntimeException("DIVISION_BY_ZERO");
        return a/b;

    }

    public static void demonstrateFinally(){
        try {
            System.out.println("try ban vagzunk");
            throw new RuntimeException("stop)");
        }catch(Exception e){
            System.out.println("catch ben vagyunk");
            throw e;
        }
        finally{
            System.out.println("Finally ben vagyunk");
        }
    }

    public static void main (String[]args){

        demonstrateFinally();
        System.out.println("a/b = " + safeDivide(1,0));
    }
}
