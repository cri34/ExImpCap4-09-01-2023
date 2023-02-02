package ex27;

public class Ex27 {
    private int [][] a={{1,2,4,5,4},{1,4,52,7,8},{1,4,2,7,8}};
    private int [][] b = {{5,5,1,2},{1,4,4,5}};
    private int [][] sum (){
        int [][]r= new int[a.length][a[0].length];
        for (int row =0; row < a.length;row++){
            for (int col=0;col<a[0].length;col++){
                if (row >= b.length || col>= b[0].length){
                    r[row][col] = a[row][col];
                    continue;
                }
                r[row][col] = a[row][col] + b[row][col];
            }
        }
        return r;
    }
    private void printArrayBid(int [][] array){
        for (int row =0; row < array.length;row++){
            for (int col=0;col<array[0].length;col++){
                System.out.print(array[row][col]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void initSum(){
        System.out.println("A :");
        printArrayBid(a);
        System.out.println("B :");
        printArrayBid(b);
        System.out.println("Resultado");
        printArrayBid(sum());
    }
}
