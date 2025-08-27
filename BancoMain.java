public class BancoMain {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("001", "Cauã", 700.0);
        ContaBancaria conta2 = new ContaBancaria("002", "Ingrid", 1000.0);

        
        System.out.println("Operações da conta1");
        conta1.consultarSaldo();
        conta1.depositar(350);
        conta1.sacar(1400);
        conta1.consultarSaldo();

        
        System.out.println("Operações da conta2");
        conta2.consultarSaldo();
        conta2.sacar(450);
        conta2.depositar(175);
        conta2.consultarSaldo();
    }
}