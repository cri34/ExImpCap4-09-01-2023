package ex47;
import interfaces.output.Output;
/*Escribir un metodo que reciba como parametro una matriz bidimensional de ca-
denas. El metodo debe devolver una matriz de caracteres, donde en las columnas
pares se colocara el primer caracter de la cadena correspondiente y en las columnas
impares el ultimo caracter de la palabra correspondiente. Construir un programa de
prueba.
Nota: Se considerara como orden de las columnas el propio de Java para numerar
las filas. Se considera 0 como par.*/
public class Ex47 {
    public static void main(String[] args) {
        String [][] palabras ={{"anto","nto","pnte"},{"llaat","iia","utn"}};
        Output.printArray(programa(palabras));
    }
    public static char[] programa(String[][]palabras){
        char [] letras = new char[palabras[0].length * palabras.length];
        int indexL = 0;
        for (int r = 0;r < palabras.length;r++){
            for (int c = 0 ; c < palabras[0].length;c++){
                if (indexL % 2 == 0){
                    letras[indexL++] = palabras[r][c].charAt(0);
                    continue;
                }
                letras[indexL++] = palabras[r][c].charAt(palabras[r][c].length()-1);
            }
        }
        return letras;
    }
}
