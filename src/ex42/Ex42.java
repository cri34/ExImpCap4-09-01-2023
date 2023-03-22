package ex42;
import interfaces.input.Input;
import interfaces.output.Output;
public class Ex42 {
    public static void main(String[] args) {
        int []n={1,2,3,4,5,6,7,8,9,10};
        Output.printArray(n);
        System.out.println(" suma "+returnSumaNumeros(n));
        sustituirNumeroIndice(n);
        Output.printArray(n);
        System.out.println(" suma "+returnSumaNumeros(n));
    }
    public static void sustituirNumeroIndice(int [] numeros){
       int index = inputIndice();
        System.out.println("indica valor indice");
       numeros[index] = Input.retInpNumber();
    }
    public static int returnSumaNumeros(int [] numeros) {
        int suma=0;
        for (int i =0; i < numeros.length;i++){
            suma += numeros[i];
        }
        return suma;
    }
    private static int inputIndice(){
        System.out.println("selecciona indice del numero a cambiar");
        int index = Input.retInpNumber();
        while (!valitIndex(index)){
            System.out.println("posicion invalida, selecciona indice del numero a cambiar");
            index = Input.retInpNumber();
        }
        return index;
    }
    private static boolean valitIndex(int index){
        final int maxI=9;
        final int minI=0;
        return index >= minI && index <= maxI;
    }
}
