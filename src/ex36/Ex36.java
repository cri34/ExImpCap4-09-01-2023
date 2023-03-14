package ex36;
import interfaces.output.Output;
public class Ex36 {
    public static void main(String[] args) {
        int [][]n={{0,1,2,3,4},{5,6,7,8,9},{10,11,12,13,14},{15,16,17,18,19}};
        Output.printArray(n);
        Output.printArray(retFirst5PosPares(n));
    }
    public static int [] retFirst5PosPares(int [][] array){
        final int maxElements=5;
        int minIndex=0;
        int indRes=0;
        int []resultado = retArrayInicializado(maxElements);
            for (int c = array[0].length-1 ; c >= minIndex; c--){
                for (int r = array.length-1;r >= minIndex;r--){
                if(indRes == maxElements)
                    return resultado;
                if (array[r][c] % 2 == 0 ){
                    resultado[indRes++] = array[r][c];
                }
            }
        }
        return resultado;
    }
    private static int [] retArrayInicializado(int lenght){
        int [] a= new int [lenght];
        for (int c = 0; c < lenght;c++){
            a[c]=-1;
        }
        return a;
    }

}
