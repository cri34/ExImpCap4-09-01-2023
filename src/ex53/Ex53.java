package ex53;

/*La criba de Erat ́ostenes es un algoritmo que permite hallar todos los n ́umeros primos
menores que un n ́umero natural dado N. Para ello, se forma una tabla con todos los
n ́umeros naturales comprendidos entre 2 y N y se van eliminando los n ́umeros que
no son primos de la siguiente manera: cuando se encuentra un n ́umero entero que
no ha sido eliminado ese n ́umero se considera primo y se procede a eliminar todos
sus m ́ultiplos. El proceso termina cuando el cuadrado del mayor n ́umero primo
encontrado es mayor que N. Escribir un programa en Java que lea un entero N y
escriba los n ́umeros primos existentes entre 1 y N. El programa debe implementar
el c ́alculo de los primos en un m ́etodo que aplique la criba de Erat ́ostenes.*/
public class Ex53 {
    public static void main(String[] args) {
        CribaEratostenes ce= new CribaEratostenes();
        ce.printNumPrimos(1000);
    }

}
