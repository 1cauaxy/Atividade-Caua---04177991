public class ProjetoCarro {
    public static void main(String[] args) {
        
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        Carro carro2 = new Carro("Honda", "Civic", 2018);
        
        System.out.println("Informações iniciais");
        carro1.mostrarInformacoes();
        carro2.mostrarInformacoes();
        
        carro2.marca = "Ford";
        carro2.modelo = "Focus";
        carro2.ano = 2021;
        
        System.out.println("Informações atualizadas do carro2");
        carro2.mostrarInformacoes();

        System.out.println("Ligando os carros vrum vrum!!");
        carro1.ligarCarro();
        carro2.ligarCarro();
    }
}