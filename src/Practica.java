import java.util.Scanner;

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
        System.out.printf(" %d is bisiesto: %b\n",year,isBisiesto(year));
    }
    private int [][] tP;
    private void inicializarTP(int row){
        System.out.printf("Triangulo Pascal: n = %d\n",row);
        row++;
        tP = new int[row][row];
    }
    private void tP(){
        final int maxR=tP.length;
        int valor;
        for (int row=0; row < maxR;row++){
            for (int col=0; col <= row;col++){
                valor =  (int)(factorial(row)/( factorial(col) * factorial(row - col)));
                tP[row][col] = valor;
            }
        }
        }
        private  long factorial(int n){
        long r=1;
        for (int i=0; i < n;i++){
            r *= n-i;
        }
        return r;
        }
        public int [][] trianguloPascal(int row){
            inicializarTP(row);
            tP();
            return tP;
        }
    public void printTP(){
        for (int r=0 ; r < tP.length;r++){
            System.out.print(genSpace(tP.length-1-r));
            for (int c=0; c < tP[0].length;c++){
                if (tP[r][c] == 0)
                    break;
                System.out.print(tP[r][c]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    private String genSpace(int nS){
        String s="";
        for (int i=0; i < nS ;i++)
            s+=" ";
        return s;
    }
    public void printMagicNum (int minN, int maxN){
        for (int i=minN;i < maxN;i++){
            if (i%3==0)
                if (i%5==0)
                    if (i % 10!=0)
                        System.out.print(i+" ");

        }
        System.out.println();
    }
    public int calcPot(int bas, int ex){
        int res=1;
        if (bas % 2!=0 && ex % 2!=0) {
            System.out.println("ambos numeros deben ser multiples de 2");
            return res;
        }
        for (int i=0;i < ex;i++){
            res *= bas;
        }
        return res;
    }
    public void primerosNNumerosPares(int nInicial,int cantNumerosPar){
        int countNPar=0;
        int r=1;
        if (cantNumerosPar < 1){
            System.out.println("cantidad invalida debe ser superior o igual a 1");
            return;
        }
        if (nInicial < 1){
            System.out.println("numinicial invalido debe ser superior a 1");
            return;
        }
        for (int i=nInicial;countNPar!= cantNumerosPar;i++){
            if (i % 2 == 0){
                countNPar++;
               r *= i;
            }
        }
        System.out.println(r);
    }
    public void circulo(){
        boolean continua = true;
        final double pi = Math.PI;
        double perimetro;
        double area;
        while(continua){
            Scanner s= new Scanner(System.in);
            System.out.println("introduce el radio ");
            double r=s.nextInt();
            perimetro= 2 * pi * r;
            area= pi * Math.pow(r,2);
            System.out.printf("perimetro : %f | area %f \n",perimetro,area);
            System.out.println("para continuar escribe s");
            continua = s.next().equals("s");
        }
        System.out.println( "programa finalizado");


    }
    public int retNumSeqN(){
        int n = retInput();
        int num = retLastNumfibonacci(n);
        printN(n,num);
        return num;
    }
    private int retInput (){
        Scanner s = new Scanner(System.in);
        System.out.println("selecciona num iteracion");
        int n = s.nextInt();
        while (n < 1) {
            System.out.println("numero de iteracion incorrecto debe ser positivo");
            n = s.nextInt();
        }
        return n;
    }
    private void printN(int n,int num){
        System.out.printf("num fibonacci equivalente a la iteracion %d es %d\n",n,num);
    }
    private int retLastNumfibonacci(int n){
        int curN=0;
        int nextNum=1;
        int temp;
        for (int i =1; i < n ;i++){
            temp = curN;
            curN = nextNum;
            nextNum= curN+ temp;
        }
        return nextNum;
    }
    public int maxComunDivisorInit(int num1, int num2){
        int r=0;
        if (num1 < 1 || num2 < 1) {
            System.out.println("numeros deben ser superiores a 0");
            return r;
        }
        return maxComunDivisor(num1,num2);
    }
    private int maxComunDivisor(int num1,int num2){
        int maxCDiv = (descomposarMaxDivisors(num1) > descomposarMaxDivisors(num2))?descomposarMaxDivisors(num1):descomposarMaxDivisors(num2);
       while(!(divisible(num1,maxCDiv) && divisible(num2,maxCDiv))){
           maxCDiv--;
       }
        return maxCDiv;
    }
    private int descomposarMaxDivisors(int n){
        int num = n;
        int d=2;
        while(num != 1){
            if (!divisible(num,d)){
                d++;
                continue;
            }
            num /= d;
        }
        return d;
    }
    private boolean divisible(int n,int div){
        if (div == 0)
            return false;
        return n % div == 0;
    }
    public boolean numerosAmigos(int n1,int n2){
        return retSumDivisor(n1)==n2 && retSumDivisor(n2)==n1;
    }
    public void printParejas(int n){

        String numeros="";

        for (int n1 = 1;n1 < n;n1++){
            for (int n2 = n1;n2 < n;n2++) {
                if (numerosAmigos(n1, n2)) {
                    numeros += "par " + n1 + " ," + n2 + "| ";
                }
            }
        }
        System.out.println(numeros);
    }
    public int retSumDivisor(int num){
        int sum = 0;
        for (int d = 1; d <= num/2;d++) {
            if (num % d == 0) {
                sum += d;
            }
        }
        return sum;
    }
    //25
    private int retSumaDiv(int n){
        int num=n;
        int d=2;
        int sum=0;
        while (num!=1){
            if (num % d !=0){
                d++;
                continue;
            }
            num/=d;
            sum+=d;

        }
        return sum;
    }
    public void printSumDivisor(int n){
        System.out.println(retSumaDiv(n));
    }
//26
    char [] l;
    private void initArray(){
        char firstL='a';
        char lastL='j';
        int maxlenght=lastL-firstL;
        l= new char [maxlenght];
        for (int i = 0; i < maxlenght;i++){
            l[i]=(char)(firstL+i);
        }
    }
    private boolean isVocal(int index){
        char[] vocales={'a','e','i','o','u'};
        for (int i =0;i < vocales.length;i++ )
            if(l[index] == vocales[i]){
                return true;
            }
       return false;
    }
    private void printArray(){
        for (int i =0;i< l.length;i++){
            System.out.print(l[i]+" ");
        }
        System.out.println();
    }
    public void sustVocales(){
        initArray();
        printArray();
        for (int i =0; i < l.length;i++){
            if (isVocal(i)){
                l[i]='@';
            }
        }
        printArray();
    }
}