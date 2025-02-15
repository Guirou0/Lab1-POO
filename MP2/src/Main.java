class ContaBancaria {
    private double saldo;
    private String titular;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo do titular "+ titular + ": R$ " + saldo);
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if(valor <= saldo){
            saldo -= valor;
            return true;
        }
        else{
            System.out.println("Saldo insuficiente");
            return false;
        } 
    }

    public void emprestar(ContaBancaria user, double valor) {
        if(this.sacar(valor)){
            user.depositar(valor);
        }
        else
            System.out.println("Operação não realizada");
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        ContaBancaria conta1 = new ContaBancaria("João");
        conta1.depositar(1000);
        conta1.mostrarSaldo();
        conta1.sacar(500);
        conta1.mostrarSaldo();
        conta1.sacar(600);

        ContaBancaria conta2 = new ContaBancaria("Maria");
        conta1.emprestar(conta2, 200);
        conta1.mostrarSaldo();
        conta2.mostrarSaldo();
        conta1.emprestar(conta2, 500);
    }
}
