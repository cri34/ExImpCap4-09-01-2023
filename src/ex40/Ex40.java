package ex40;
import interfaces.output.Output;
public class Ex40 {
    public static void main(String[] args) {
       int n[][]={{1,2},{3,4}};
       Output.printArray(n);
       intercambiarValors(n);
       Output.printArray(n);
    }
    private static int [][] intercambiarValors(int [][] m){
        int [][] r=m;
        final int firstI=0;
        final int maxI=m.length;
        int temp = r[firstI][firstI];
        r[firstI][firstI] = r[maxI-1][maxI-1];
        r[maxI-1][maxI-1] = temp;
        return r;
    }
}
