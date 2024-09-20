import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String args []) throws Exception {

        Scanner sc = new Scanner(System.in);

        String txt = "Digite seu(sua) ";

        System.out.println(txt + "número:");
        int numero = Integer.parseInt(sc.nextLine());

        System.out.println(txt + "agência:");
        String agencia = sc.nextLine();

        System.out.println(txt + "nome:");
        String nomeCliente = sc.nextLine();

        System.out.println(txt + "saldo:");
        BigDecimal saldo = new BigDecimal(sc.nextLine());

        String saida = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque!", nomeCliente, agencia, numero, saldo.setScale(2, RoundingMode.HALF_UP));

        System.out.println(saida);
    }
}
