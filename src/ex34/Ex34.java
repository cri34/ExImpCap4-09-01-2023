package ex34;
import interfaces.input.Input;
import interfaces.output.Output;

public class Ex34 {
    public static void main(String[] args) {
        initPrograma();
    }
    private static int [][] array;
    public static void initPrograma(){
        definirDimArray();
        inicializarArray();
        printArray();
    }
    final static int minDim=1;
    private static void definirDimArray(){
        inputDim();
        int dim=Input.retInpNumber();
        while (dim < minDim){
            inputDimInvalido();
            dim=Input.retInpNumber();
        }
        array = new int [dim][dim];

    }
    private static void inicializarArray(){
        for (int r =0; r< array.length;r++){
            for (int c=0; c< array[0].length;c++){
                array[r][c]=r+c;
            }
        }
    }
    private static void printArray(){
        System.out.println("contenido cuadrado");
        Output.printArray(array);
    }
    private static void inputDim(){
        System.out.println("inserta tamaño");
    }
    private static void inputDimInvalido(){
        System.out.println("inserta tamaño mayor o igual a "+minDim);
    }
}
