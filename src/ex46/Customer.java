package ex46;

public class Customer {
    private int dineroCliente;
    private final int minDineroCliente = 0;
    private final int costeBillete = 1;
    private final int maxApuestas;
    private final int minApuestas = 1;
    private final CustomerTicket[] apuestas;
    public Customer(int dineroCliente, int maxApuestas)throws IllegalArgumentException{
        if (!checkDineroValido(dineroCliente)) {
            throw  new IllegalArgumentException("dinero tiene que ser positivo, vuelve a ejecutar el programa");
        }
        if (!checkPagoTiquetsValido(dineroCliente,maxApuestas)){
            throw  new IllegalArgumentException("el pago del maximo de billetes no debe superar al dinero actual, vuelve a ejecutar el programa");
        }
        if (!checkValidMaxApuestas(maxApuestas))
            throw new IllegalArgumentException("el numero apuestas debe ser superior o igual a " + minApuestas);
        this.dineroCliente = dineroCliente;
        this.maxApuestas = maxApuestas;
        this.apuestas = new CustomerTicket[maxApuestas];
        seleccionarTiquets();
    }
    private boolean checkValidMaxApuestas(int maxApuestas){
        return maxApuestas >= minApuestas;
    }
    private boolean checkDineroValido(int dineroCliente){
        return dineroCliente >= minDineroCliente;
    }
    private boolean checkPagoTiquetsValido(int dineroCliente,int maxApuestas){
        int maxDineroTickets = costeBillete * maxApuestas ;
        return dineroCliente >= maxDineroTickets;
    }
    private void payTickets(){
        dineroCliente -= costeBillete * maxApuestas;
    }
    private void printTickets(){
        StringBuilder out = new StringBuilder();
        for (int i =0; i < maxApuestas;i++){
            out.append(apuestas[i].getTicket()+" ");
        }
        System.out.println(out);
    }
    private void genTickets(){
        for (int i = 0; i < maxApuestas;i++){
            System.out.printf("tiket %d \n\n",i+1);
            apuestas[i] = new CustomerTicket(costeBillete);
        }
    }
    public int getDineroCliente(){
        return dineroCliente ;
    }
    public void mostrarDineroCliente(){
        System.out.println("el dinero actual es " + dineroCliente);
    }
    private void seleccionarTiquets(){
        mostrarDineroCliente();
        payTickets();
        genTickets();
        printTickets();
        mostrarDineroCliente();
    }
}
