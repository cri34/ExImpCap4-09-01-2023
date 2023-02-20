package ex35;

import interfaces.input.Input;
import interfaces.output.Output;

public class Ex35 {
    public static void main(String[] args) {
        initPrograma();
    }

    static int [][] arrayBi;
    public static void initPrograma(){
        inicializarArray();
        printArrayBi();
        printArray();
    }
    private static  void inicializarArray(){
        definirDimArrayBi();
        for (int r = 0; r< arrayBi.length; r++){
            for (int c = 0; c< arrayBi[0].length; c++){
                arrayBi[r][c]=r+c;
            }
        }

    }
    private static int[] retArray(int [][] arrayBi){
        int indM=0;
        int maxIndM=5;
        int [] array= new int [maxIndM];
        for (int i=0;i<array.length;i++){
            array[i]=-1;
        }
        for (int r=0; r < arrayBi.length;r++){
            for (int c=0; c < arrayBi[0].length;c++){
                if (indM == maxIndM){
                    return array;
                }
                if (arrayBi[r][c] % 2==0){
                    array[indM++]=arrayBi[r][c];
                }

            }
        }
     return array;
    }
    private static void printArrayBi(){
        System.out.println("contenido array bidimensional\n");
        Output.printArray(arrayBi);
    }
    private static void printArray(){
        System.out.println("contenido array\n");
        Output.printArray(retArray(arrayBi));
    }
    private static void definirDimArrayBi(){
        System.out.println("max rows");
        int r = Input.retInpNumber();
        System.out.println("max cols");
        int c = Input.retInpNumber();
        arrayBi = new int[r][c];
    }
}
