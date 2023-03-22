package ex37;
import interfaces.output.Output;
public class Ex37 {
    public static void main(String[] args) {
        int []n={1,9,38,8,-5,9};
        return_Max_Avg(n);
    }
    private static int avg(int []n){
        int r=0;
        for (int i = 0 ; i < n.length;i++){
            r+=n[i];
        }
        return r/n.length;
    }
    private static int max(int []n){
        int max=0;
        for (int i = 0 ; i < n.length;i++){
            if (n[i] > max)
                max= n[i];
        }
        return max;
    }
    public static void return_Max_Avg(int []n){
        System.out.printf("max number = %d | avg = %d\n",max(n),avg(n));
    }
}

