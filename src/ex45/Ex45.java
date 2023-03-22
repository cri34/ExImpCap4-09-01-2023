package ex45;
import interfaces.input.Input;
import interfaces.output.Output;
public class Ex45 {
    public static void main(String[] args) {
        mostrarMinMax(4);
    }
    public static void mostrarMinMax(int lenght){
        int [] array = returnMatriz(lenght);
        int minN=retMinNumber(array);
        int maxN= retMaxNumber(array);
        Output.printArray(array);
        System.out.printf(" minNumber = %d | maxNumber | %d \n",minN,maxN);
    }
    public static int [] returnMatriz(int lenght){
        int [] r= new int[lenght];
        for (int i = 0; i < lenght;i++){
            System.out.println("insertaNumero");
            r[i]=Input.retInpNumber();
        }
        return r;
    }
    public static int retMinNumber(int [] array){
        int min = array[0];
        for (int i =0; i < array.length;i++){
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }
    public static int retMaxNumber(int [] array){
        int max = array[0];
        for (int i = 0; i < array.length;i++){
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }
}
