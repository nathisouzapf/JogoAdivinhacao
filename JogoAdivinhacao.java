import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        Random lerRandom = new Random();

        int numeroAleatorio = lerRandom.nextInt(100) + 1;
        int maximoTentativas = 10;
        int tentativas = 0;
         
        
        System.out.println("Tente adivinhar um número entre 1 e 100, você tem " + maximoTentativas + " tentativas.\n");

        while (tentativas < maximoTentativas) {
            System.out.println("Digite seu palpite: ");
            int palpite = lerTeclado.nextInt();
            tentativas++; 


            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");

            } else if (palpite < numeroAleatorio) {
                System.out.println("O número é maior que " + palpite);
            } else {
                System.out.println("O número é menor que " + palpite);
            }
        }

        if (tentativas == maximoTentativas) {
            System.out.println("Você atingiu o número máximo de tentativas. O número era " + numeroAleatorio);
        }
    }
}
    

