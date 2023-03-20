package interfaces.input;

import java.util.Scanner;

public interface Input {
    Scanner s= new Scanner(System.in);
    static int retInpNumber(){
        int inputN= 0;
        while (true){
            try{
                System.out.println("int input");
                inputN = s.nextInt();
                break;
            }catch (java.util.InputMismatchException inp){
                System.out.println("debe ser un valor numerico");
                s.next();
            }
        }
        return inputN;
    }
    static String retInpString(){
        System.out.println("string input");
        return s.next();
    }
    static int retRandNumber(int minNum,int maxNum){
        return (int) (Math.random() * (maxNum - minNum+1) +minNum);
    }
}
