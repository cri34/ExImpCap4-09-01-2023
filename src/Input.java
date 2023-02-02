import java.util.Scanner;

public interface Input {
    Scanner s= new Scanner(System.in);
    static int retInpNumber(){
        return s.nextInt();
    }
}
