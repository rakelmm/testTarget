package br.com.infnet;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        exec1();
        exec2();
        exec3();
    }

    public static void exec1() {
        int indice = 13, soma = 0, k = 0;
        while (k < indice) {
            k = k + 1;
            soma = soma + k;

        }

        System.out.println("Exercício 1: " + soma);
    }

    public static void exec2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = scanner.nextInt();

        if (!verificaNum(numero)) {
            System.out.println(numero + " não pertence a sequência Fibonacci.");
        } else {
            System.out.println(numero + " pertence a sequência Fibonacci.");
        }
    }

    private static boolean verificaNum(int numero) {
        int primeiro = 0;
        int segundo = 1;

        while (primeiro <= numero) {
            if (primeiro == numero) {
                return true;
            }
            int proximoNum = primeiro + segundo;
            primeiro = segundo;
            segundo = proximoNum;
        }

        return false;
    }
//    3. Fiquei na dúvida se a questão 3 era pra fazer código ou só responder a lógica e o proximo elemento:
//    a) 9. (1+2=3; 3+2=5; 5+2=7; 7+2=9)
//    b) 128. (2x2=4; 4x2=8; 8x2=16... 64x2=128)
//    c) 49. (+1, +3, +5, +7, +9, +11, +13)
//    d) 100. (2², 4², 6², 8², 10²)
//    e) 13. 1+1=2, 1+2=3, 2+3=5, 3+5=8, 5+8=13.
//     f) 200. Aqui a sequência numérica é baseada em um elemento não numérico, a letra inicial do número escrito por extenso: dois, dez, doze, dezesseis, dezessete, dezoito, dezenove, duzentos.

//    Resposta da 4.
//    Eu ligaria um dos interruptores e esperaria um pouco.
//    Desligaria e ligaria um segundo interruptor.
//    Depois iria até a sala.
//    A lâmpada desligada e quente corresponde ao primeiro interruptor, a lâmpada acesa ao segundo e a lâmpada apagada e fria ao terceiro.

    public static void exec3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma string: ");
        String input = scanner.nextLine();

        String resultado = inverterString(input);

        System.out.println("String invertida: " + resultado);

    }

    private static String inverterString(String normal) {
        char[] caracteres = normal.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;

        while (inicio < fim) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;
            inicio++;
            fim--;
        }
        return new String(caracteres);

    }
}
