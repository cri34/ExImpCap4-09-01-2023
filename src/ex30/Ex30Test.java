package ex30;

public class Ex30Test {
    public static void main(String[] args) {
        int [] a = {1,2,3};
        int [] b = {6,7,8};
        printArray(multiplicacioInversa(a,b));

    }
    public static int [] multiplicacioInversa( int [] a, int []b){
        if (a.length!= b.length){
            System.out.println("tamaño diferente");
            return null;
        }
        int [] mI= new int[a.length];
        for (int i = 0; i < mI.length;i++){
            mI[i] = a[i] * b[b.length-1-i];
        }
        return mI;
    }
    public static void printArray(int [] array){
        String out="";
        for (int i = 0; i < array.length;i++){
          out+=array[i]+" ";
        }
        System.out.println(out);
    }
}