import java.util.Scanner;

public class UsoSwitch {

    /*
    * Plano basic --> 100 minutos de ligação
    *
    * Plano medium --> 100 minutos de ligação + Whatsapp ilimitado
    *
    * Plano premium --> 100 minutos de ligação + Whatsapp + 5Gb de internet
    * */

    public static void main(String[] args) {

        System.out.println("Escolha o seu plano\n" +
                "[1] - Basic\n" +
                "[2] - Medium\n" +
                "[3] - Premium\n" +
                "[4] - Sair");

        Scanner sc = new Scanner(System.in);
        String plano = sc.next();

        while(!plano.equals("4")) {

            switch (plano) {
                case "3": {
                    System.out.println("5Gb de internet");
                }
                case "2": {
                    System.out.println("Whatsapp ilimitado");
                }
                case "1": {
                    System.out.println("100 minutos de ligação");
                    break;
                }
                default: {
                    System.out.println("Plano não identificado.\n" +
                            "Digite uma opção válida!");
                }
            }

        plano = sc.next();
        }

        System.out.println("Sistema encerrado!");
    }
}
