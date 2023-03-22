package ex46;

import interfaces.input.Input;

public class CustomerTicket extends Ticket{
    private final int costeTicket;
    private final int minCosteTicket = 0;

    public CustomerTicket(int costeTicket){
        generateCustomerTicket();
        if (!checkCosteTicket(costeTicket)){
            this.costeTicket = minCosteTicket;
            return;
        }
        this.costeTicket = costeTicket;
    }
    private boolean checkCosteTicket(int costeTicket){
        return costeTicket >= minCosteTicket;
    }
    private void generateCustomerTicket(){
        final int maxQtNumbers = 6;
        StringBuilder numerosElegits = new StringBuilder();
        for (int i = 0;i < maxQtNumbers;i++){
            numerosElegits.append(inputNumberLoteriaCustomer()+"");
        }
        setTicket(numerosElegits.toString());
    }
    private boolean checkCorrectNumber(int numero){
        final int minNumber = 1;
        final int maxNumber = 49;
        return numero >= minNumber && numero <= maxNumber;
    }
    private int inputNumberLoteriaCustomer(){
        System.out.println("inserta un numero >= 1 y <= 49");
        int numero = Input.retInpNumber();
        while (!checkCorrectNumber(numero)){
            System.out.println("numeroIncorrecto, inserta un numero >= 1 y <= 49");
            numero = Input.retInpNumber();
        }
        return numero;
    }
    @Override
    public String getTicket() {
       return super.getTicket();
    }
    @Override
    public void setTicket(String ticket) {
        super.setTicket(ticket);
    }
}
