public class Main {
    public static void main(String[] args) {
        Practica p = new Practica();
            p.printArray(p.returnAparicions("frase de provaa az zz"));
            //2
        System.out.println(p.extractAparicions("prueba frase elimina ap apariciones de; la fra;se","e"));
       p.printDigits(p.sumDigits("anfkadfh1akldf9kagdfhl10skdflsdf2"));
       p.printDigits(p.retSumAsciValue("abc12"));
       p.printInvText("casa");
       p.printIsPal("anna");
       p.printBisiesto(4000);
       p.trianguloPascal(10);
       p.printTP();
       p.printMagicNum(0,30);
    }
}