import exceptions.ParametrosInvalidosException;

import java.util.Scanner;


public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = sc.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(e);
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção

        if(parametroDois < parametroUm) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = parametroDois - parametroUm;
            //realizar o for para imprimir os números com base na variável contagem
            System.out.println("Houveram " + contagem + " ocorrências:");

            for(int i = parametroUm+1; i <= parametroDois; i++) {
                System.out.println(i);
            }
        }
    }
}