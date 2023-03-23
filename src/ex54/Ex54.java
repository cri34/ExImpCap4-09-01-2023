package ex54;

public class Ex54 {
    public static void main(String[] args) {
        int [] a ={0,1};
        int [] b ={2,2};
        System.out.println(calculateDistanciaEuclidea(a,b));
    }
    private static int[] calcDif(int [] a,int[]b)throws IllegalArgumentException{
        if (a.length != b.length)
            throw  new IllegalArgumentException("dimensiones invalidas");
        int [] r= new int[a.length];
        for (int i = 0; i < a.length;i++){
            r[i]= a[i] - b[i];
        }
        return r;
    }
    public static double calculateDistanciaEuclidea(int [] a,int[]b)throws IllegalArgumentException{
        final int exponente = 2;
        int [] suma = calcDif(a,b);
        if (a.length != b.length)
            throw  new IllegalArgumentException("dimensiones invalidas");
        double distanciaEuclidea = 0;
        for (int i = 0;i < a.length;i++){
            distanciaEuclidea += Math.pow(suma[i],exponente);
        }
        distanciaEuclidea = Math.sqrt(distanciaEuclidea);
        return distanciaEuclidea;
    }

}
