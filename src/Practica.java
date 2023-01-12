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
    //3
    public int sumDigits(String cadena){
        final int fD='0';
        final int lD='9';
        int sum = 0;
        for (int i = 0; i < cadena.length(); i++){
            if (cadena.charAt(i) < fD || cadena.charAt(i) > lD){
                continue;
            }

            sum += Character.getNumericValue(cadena.charAt(i));
        }
        return sum;
    }
    public int retSumAsciValue(String text){
        int sum=0;
        for (int i = 0;i < text.length();i++){
            sum+=text.charAt(i);
        }
        return sum;
    }
    public void printDigits(int d){
        System.out.println("suma de digitos de text = "+ d);
    }

    private String retTextInvertit(String text){
        String textInv = "";
        for (int i = 0; i < text.length();i++){
            textInv += text.charAt(text.length()-1-i);
        }
        return textInv;
    }
    public void printInvText(String text){
        System.out.println("frase "+ text);
        System.out.println("frase invertida: "+retTextInvertit(text));
    }
    private boolean isPalindroma(String text){
       for (int i=0; i < text.length()/2;i++){
           if (text.charAt(i)!=text.charAt(text.length()-1-i))
               return false;
       }
       return true;
    }
    public void printIsPal(String paraula){
        System.out.println("frase "+ paraula+" palindroma : "+isPalindroma(paraula));

    }
    private boolean isBisiesto(int any){
        final boolean div4=any % 4 == 0;
        final boolean div100=any % 100 == 0;
        final boolean div400=any % 400 == 0;
        if (div4 && !div100)
            return true;
        if (div100)
            if (div400)
                return true;

        return false;
    }
    public void printBisiesto(int year){
        System.out.printf(" %d is bisiesto: %b",year,isBisiesto(year));
    }
}