package ex50;
import interfaces.output.Output;
public class Ex50 {
    public static void main(String[] args) {
    char[] letras ={'a','a','c','b','l','a'};
    Output.printArray(letras);
    Output.printArray(sustituir(letras));
    }
    public static char[] sustituir( char [] letras){
        final char lSustuir='a';
        final char lSustituta='1';
        char [] result = new char[letras.length];
        for (int i =0; i < letras.length;i++ ){
            if (letras[i] == lSustuir){
                result[i] = lSustituta;
                continue;
            }
            result[i] = letras[i];
        }
        return result;
    }
}
