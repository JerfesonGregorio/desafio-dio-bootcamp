import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] alunos = {"João", "Maria", "Zé", "Luiz"};

        int media = calcularMedia(alunos, sc);

        System.out.printf("Média da turma é %d", media);

    }

    public static int calcularMedia(String[] alunos, Scanner sc) {

        int soma = 0;
        for(String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            int nota = sc.nextInt();
            soma += nota;
        }

        return soma/ alunos.length;
    }
}
