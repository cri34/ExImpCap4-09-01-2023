package ex33;
import interfaces.input.Input;
import interfaces.output.Output;
public class Ex33Test {
    public static void main(String[] args) {
        initProgram();
    }
    private static int [][] numeros;
    private static String [][] palabras;
    public static void initProgram(){
        definirDimArray();
        inicializarArray();
        Output.printArray(numeros);
        Output.printArray(palabras);
        concatenateValue();
        Output.printArray(numeros);
        Output.printArray(palabras);

    }
    private static void definirDimArray(){
        System.out.println("max rows");
        int r = Input.retInpNumber();
        System.out.println("max cols");
        int c = Input.retInpNumber();
        numeros = new int[r][c];
        palabras = new String[r][c];
    }
    private static void inicializarArray(){
        System.out.println("inicializando array");
        String input ;
        int inputN ;
        for (int r = 0;r < numeros.length;r++) {
            for (int c = 0; c < numeros[0].length; c++) {
                input = Input.retInpString();
                inputN = Input.retInpNumber();
                numeros[r][c]= inputN;
                palabras[r][c]= input;

            }
        }
    }
    private static void concatenateValue(){
        System.out.println("valores a concatenar");
        int numeroCon = Input.retInpNumber();
        String sCon = Input.retInpString();
        for (int r =0; r < numeros.length;r++){
            for (int c=0; c < numeros[0].length;c++){
                numeros[r][c]+=numeroCon;
                palabras[r][c]+=sCon;
            }
        }
    }
}
