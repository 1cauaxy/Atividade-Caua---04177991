public class Aluno {
    String nome;
    int matricula;
    double notaAv1;
    double notaAv2;

    
    public Aluno(String nome, int matricula, double notaAv1, double notaAv2) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaAv1 = notaAv1;
        this.notaAv2 = notaAv2;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota AV1: " + notaAv1);
        System.out.println("Nota AV2: " + notaAv2);
    }

    public double calcularMedia() {
        return (notaAv1 + notaAv2) / 2;
    }

    public void verificarAprovacao() {
        double media = calcularMedia();
        if (media >= 7) {
            System.out.println(nome + " está APROVADO com média: " + media);
        } else {
            System.out.println(nome + " está REPROVADO com média: " + media);
        }
    }
}