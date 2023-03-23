package ex49;
import interfaces.output.Output;

public class Ex49 {
    public static void main(String[] args) {
    int [] numeros={1,2,3,4,5,6,7,8};
    Output.printArray(numeros);
    Output.printArray(invertir(numeros));
    }
    public static int[] invertir(int  []numeros){
        int  [] numInv= new int[numeros.length];
        for (int i =0; i < numeros.length;i++){
            numInv[i] = numeros[numeros.length-1 -i];
        }
        return numInv;
    }

}
