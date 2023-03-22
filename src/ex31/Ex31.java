package ex31;

public class Ex31 {
    public static void main(String[] args) {
        int [] numeros={9,8,2,6,6,1};
        printSumaArray(numeros);
    }
    public static int retSumaArray(int [] numeros){
        int suma=0;
        for (int i = 0 ;i < numeros.length;i++){
            suma+=numeros[i];
        }
        return suma;
    }
    public static void printSumaArray(int [] numeros){
        System.out.println(retSumaArray(numeros));
    }
}

