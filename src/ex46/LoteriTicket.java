package ex46;

import interfaces.input.Input;

public class LoteriTicket extends Ticket{
    private int numeroReintegro;
    private final int minNReintegro = 0;
    private final int maxNReintegro = 9;
    private final int minNumberLoteria = 1;
    private final int maxNumberLoteria = 49;
    private final int maxQtNumbers = 6;
    private boolean [] numerosReintegroVistos = new boolean[maxNReintegro+1];
    private boolean [] numerosLoteriaVistos = new boolean[maxNumberLoteria];
    public LoteriTicket(boolean[] numerosLoteriaVistos,boolean[]numerosReintegroVistos){
        this.numerosLoteriaVistos = numerosLoteriaVistos;
        this.numerosReintegroVistos = numerosReintegroVistos;
        genNumeroReintegro();
        generateTicketLoteria();
    }
    private void genNumeroReintegro(){
        int numero = Input.retRandNumber(minNReintegro, maxNReintegro);
        while(numerosReintegroVistos[numero]){
            numero = Input.retRandNumber(minNReintegro, maxNReintegro);
        }
        numerosReintegroVistos[numero ] = true;
        numeroReintegro = numero;
    }
    private void generateTicketLoteria(){
        int numeroAct = Input.retRandNumber(minNumberLoteria, maxNumberLoteria);
        StringBuilder numerosElegits = new StringBuilder();
        for (int i = 0;i < maxQtNumbers;i++){
            while (numerosLoteriaVistos[numeroAct-1]){
                numeroAct = Input.retRandNumber(minNumberLoteria, maxNumberLoteria);
            }
            numerosLoteriaVistos[numeroAct-1] = true;
            numerosElegits.append(numeroAct);
        }
        setTicket(numerosElegits.toString());
    }
    @Override
    public String getTicket() {
        return super.getTicket();
    }
    @Override
    public void setTicket(String ticket) {
        super.setTicket(ticket);
    }
    public int getNumeroReintegro() {
        return numeroReintegro;
    }
}

