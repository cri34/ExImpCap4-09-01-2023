package ex29;

public class Main{
    public static void main(String[] args) {
        int [] a ={1,2,3,4};
    printArray(retArrayDes(a));
    }
    public static int[] retArrayDes(int [] array){
        int [] desplazado = copyArray(array);
        desplazado[array.length-1]=array[0];
        for (int i = 1; i < array.length ; i++){
            desplazado[i-1] = array[i];
        }
        return desplazado;
    }
    private static int [] copyArray(int [] array){
        int [] copy = new int [array.length];
        for (int i =0; i < array.length;i++) {
            copy[i] = array[i];
        }
        return copy;
    }
    private static void printArray(int [] array){
        String out="";
        for (int i =0; i < array.length; i++){
            out+=array[i]+" ";
        }
        System.out.println(out);
    }
}
