package ex51;
import interfaces.output.Output;
public class Ex51 {
    public static void main(String[] args) {
    double[][] numeros1= {{1.3,5.5,7.7},{3.6,2.4,6.7}};
    double[][] numeros2= {{2.3,6.4,7.6},{4.3,5.5,6.1}};
    Output.printArray(numeros1);
        Output.printArray(numeros2);
        Output.printArray(sumarArraysNumeros(numeros1,numeros2));
    }
     public static double[][] sumarArraysNumeros(double[][] numeros1,double[][] numeros2) throws  IllegalArgumentException{
         if (numeros1.length != numeros2.length || numeros1[0].length != numeros2[0].length){
             throw  new IllegalArgumentException("valores de matrizes invalidas, deben tener la misma dimension");
         }
        double[][] resultat = new  double[numeros1.length][numeros1[0].length];
         for (int r=0; r < numeros1.length;r++){
             for (int c=0;c < numeros1[0].length;c++){
                 resultat[r][c]=numeros1[r][c] + numeros2[r][c];
             }
         }
         return resultat;
     }

}
