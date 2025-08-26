public class ProjetoAluno {
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("Carlos",402 , 7.0, 9.5);
        Aluno aluno2 = new Aluno("Mariana", 256, 3.0, 8.0);

        
        System.out.println("Aqui estão os dados iniciais");
        aluno1.mostrarDados();
        aluno2.mostrarDados();

        
        aluno2.notaAv2 = 8.5;

        
        System.out.println("Esses são os dados atualizados");
        aluno2.mostrarDados();


        System.out.println("Esta é a situção final!");
        aluno1.verificarAprovacao();
        aluno2.verificarAprovacao();
    }
}