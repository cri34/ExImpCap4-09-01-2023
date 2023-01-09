public class Practica {
    public int [][] returnAparicions(String frase){
        final int abcLenght = 26;
        final char fC = 'a';
        final char lC = 'Z';
        String combC;
        String combCF;
        int [][] seqAp= new int [abcLenght][abcLenght];
        for (int i = 0 ; i < abcLenght;i++){
            for (int e = 0; e < abcLenght;e++){
               combC = ""+(char)(fC+i) +""+ (char)(fC+e);
              for (int k = 0; k < frase.length()-1;k++){
                  combCF="" + frase.charAt(k) +""+ frase.charAt(k+1);
                  if (combCF.equals(combC)){
                      seqAp[i][e]++;
                  }
              }
            }
        }
        return seqAp;
    }
    public void printArray(int [][] seqAp){
        final int senseAp=0;
        final char fC = 'a';
        final int botLinea=6;
        int cont = 0;
        for (int i = 0; i < seqAp.length;i++){
            for (int e = 0; e < seqAp[0].length;e++){
                if (seqAp[i][e]!= senseAp){
                    if (cont == botLinea){
                        cont = 0;
                        System.out.println();
                    }
                    System.out.print(" | "+(char)(fC+i) + (char)(fC+e) + " "+seqAp[i][e]);
                    cont++;
                }

            }
        }
        System.out.println();
    }
    //prueba frase elimina ap apariciones de; la fra;se
    public String extractAparicions(String frase, String extract){
        String fraseSenseAp="";
        String fraseActual="";
        for (int i = 0; i < frase.length(); i++){
            for (int e = 0; e < extract.length();e++){
                if (i+e >= frase.length())
                    break;
                fraseActual +="" + frase.charAt(i+e);
            }
            if (fraseActual.equals(extract)){
                i = i + extract.length()-1;
                continue;
            }
            fraseSenseAp += frase.charAt(i);
            fraseActual="";
        }
        return fraseSenseAp;
    }
}