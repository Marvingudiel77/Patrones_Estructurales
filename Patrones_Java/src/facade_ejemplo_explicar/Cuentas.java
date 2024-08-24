package facade_ejemplo_explicar;

public class Cuentas {

    private int numCuenta;
    private double balance;

    //Metodo constuctor
    //donde se inicializa el atributo número de cuenta
    public Cuentas (int num){
        numCuenta = num;
    }
    //Método para hacer depositos
    public double Depositar(double monto) {
        balance += monto;
        return balance;
    }
    //Método Retiros
    public double Retirar(double monto){
        balance -= monto;
        return balance;
    }
}
