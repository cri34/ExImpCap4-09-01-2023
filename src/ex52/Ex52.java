package ex52;
import interfaces.output.Output;
import ex51.Ex51;
import ex41.Ex41;
public class Ex52 {
    public static void main(String[] args) {
        double[][] numeros1= {{1.3,5.5,7.7},{3.6,2.4,6.7}};
        double[][] numeros2= {{2.3,6.4,7.6},{4.3,5.5,6.1}};
        programa(numeros1,numeros2);
    }
    public static void programa(double[][] numeros1,double[][]numeros2){
        double[][] resultado = Ex51.sumarArraysNumeros(numeros1,numeros2);
        Output.printArray(resultado);
        Output.printArray(Ex41.intercambiarFilasPorColumnas(resultado));
    }
}
