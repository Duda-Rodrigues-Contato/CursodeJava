public class AlunoTeste {

    public static void main(String[] args) {
    
        // Instanciando o objeto:
        Aluno aluno1 = new Aluno();

        // declarando valores aos atributos:
        aluno1.nome = "Duda Rodrigues";
        aluno1.idade = 19;
        aluno1.curso = "Sistemas de Informação";

        // chamando os métodos:
        aluno1.assistirAula();
        aluno1.fazerProva();
        aluno1.calcularNota();
        
    }

}
