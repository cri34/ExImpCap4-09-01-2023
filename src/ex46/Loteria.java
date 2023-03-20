package ex46;

public class Loteria {
    private final int numeroApuestas;
    private final int minNReintegro = 0;
    private final int maxNReintegro = 9;
    private final int minNumberLoteria = 1;
    private final int maxNumberLoteria = 49;
    private final int maxQtNumbers = 6;
    private final int maxTiquetsPosibles = maxNumberLoteria / maxQtNumbers;
    private  boolean [] numerosReintegroVistos = new boolean[maxNReintegro+1];
    private  boolean [] numerosLoteriaVistos = new boolean[maxNumberLoteria];
    private final LoteriTicket [] ticketsLoteria;
    public Loteria(int numeroApuestas)throws IllegalArgumentException{
        final int minApuesta = 1;
        if(numeroApuestas < minApuesta || numeroApuestas > maxTiquetsPosibles){
            throw new IllegalArgumentException("numero de apuestas de loteria a generar invalido");
        }
        this.numeroApuestas = numeroApuestas;
        this.ticketsLoteria = new LoteriTicket[numeroApuestas];
        generarApuestasLoteria();
        loteria();
    }
    private void loteria(){
        System.out.println("tiquets Loteria");
        printTiquetsLoteria();
        System.out.println("numeros reintegro");
        printNumeroReintegros();

    }
    private void generarApuestasLoteria(){
            for (int i = 0; i < numeroApuestas; i++) {
                ticketsLoteria[i] = new LoteriTicket(numerosLoteriaVistos,numerosReintegroVistos);
            }
    }

    private void printNumeroReintegros(){
        StringBuilder out = new StringBuilder();
        for (int i =0 ; i <ticketsLoteria.length;i++){
            out.append(ticketsLoteria[i].getNumeroReintegro()+" ");
        }
        System.out.println(out);
    }
    private void printTiquetsLoteria(){
        StringBuilder out =new StringBuilder();
        for (int i =0 ; i <ticketsLoteria.length;i++){
            out.append(ticketsLoteria[i].getTicket()+" ");
        }
        System.out.println(out);
    }
}
