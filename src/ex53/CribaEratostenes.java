package ex53;
import interfaces.output.Output;
public class CribaEratostenes {
    private boolean [] numerosPrimosLastN(int lastN){
        final int maxN = (int)Math.sqrt(lastN);
        final int firstN = 2;
        int multiplo = 2;
        boolean [] numeroPrimo = inicializarNumeroPrimo(lastN);
        for (int i = firstN;i <= maxN ;i++){
            if (!numeroPrimo[i-1])
                continue;
            multiplo = i;
           for (int e = i; e * multiplo  <= lastN; e++){
               numeroPrimo[(e*multiplo)-1] = false;
           }
        }
        return numeroPrimo;
    }
    private boolean [] inicializarNumeroPrimo(int length){
        boolean[] r = new boolean[length];
        for (int i = 0;i < length;i++){
            r[i]  = true;
        }
        return r;
    }
    private int [] retNumerosPrimos(boolean[] esPrimo){
        final int cantNumPrimos = countNumPrimos(esPrimo);
        int [] numerosPrimos = new int[cantNumPrimos];
        int indNumPrimos=0;
        for (int i = 0; i < esPrimo.length;i++){
            if (esPrimo[i]){
                numerosPrimos[indNumPrimos++] = i+1;
            }
        }
        return numerosPrimos;
    }
    private int countNumPrimos(boolean[] esPrimo){
        int cont=0;
        for (int i=0;i < esPrimo.length;i++){
            if (esPrimo[i])
                cont++;
        }
        return cont;
    }
    public void printNumPrimos(int maxNum){
        Output.printArray(retNumerosPrimos(numerosPrimosLastN(maxNum)));
    }

}
