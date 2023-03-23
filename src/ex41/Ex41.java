package ex41;
import interfaces.output.Output;
public class Ex41 {
    public static void main(String[]args){
double [][]a={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
Output.printArray(a);
Output.printArray(intercambiarFilasPorColumnas(a));

}
public static double [][] intercambiarFilasPorColumnas(double [][] a){
        final int aRow=a.length;
        final int aCol=a[0].length;
        double [][]r= new double[aCol][aRow];
      for (int i = 0; i < aRow;i++) {
          for (int e = 0; e < aCol; e++) {
              r[e][i] = a[i][e];
          }
      }
        return r;
}
}
