package br.com.cifra.gerador;
//import java.util.Arrays; usado no algoritmo antigo
import java.util.Scanner;
public class AppMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Encripta encripta = new Encripta();
        System.out.println("Cifra de César: Projetado por Derec Ross.");
        System.out.println("------------------------------------------");
        System.out.println("Insira a Mensagem que deseja incriptar.");
        String texto = scanner.nextLine();
        System.out.println("-----------------------------------------");
        System.out.println(encripta.exibeEncripta(texto));
    }
}
