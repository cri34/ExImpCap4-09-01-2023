package ex48;
import interfaces.output.Output;
public class Ex48 {
    public static void main(String[] args) {
        double [][] matrizA= {{1.6,2.6,3.6},{4.6,5.6,6.6},{7.6,8.6,9.6}};
        Output.printArray(matrizA);
        Output.printArray(programa(matrizA));
    }
    public static double [][] programa(double [][] matrizA) throws  IllegalArgumentException{
        if (matrizA.length != matrizA[0].length)
            throw new IllegalArgumentException("filas y columnas no comparten la misma dimension");
        double [][] matrizB = new double [matrizA.length][matrizA[0].length];
        for (int r = 0;r < matrizA.length;r++){
            for (int c = 0;c < matrizA[0].length;c++){
                if (r % 2 == 0){
                    matrizB[r][c] = (int)(matrizA[r][c]);
                    continue;
                }
                matrizB[r][c] = matrizA[r][c]+5;
            }
        }
        return matrizB;
    }
}
