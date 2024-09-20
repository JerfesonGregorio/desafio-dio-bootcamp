import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua nota!");
        int nota = Integer.parseInt(sc.nextLine());

        String situacao = (nota >= 7) ? "Aprovado"
                : (nota >= 4) ? "Recuperação"
                : "Reprovado";

        System.out.println(situacao);
    }

}
