import java.util.Scanner;
import java.util.Random;

public class LoteriaJava {
    public static void main(String[] args) throws Exception {
        System.out.println("Escolha quatro números, de 0 a 10, para preencher o seu bilhete de loteria! - Aperte 'ENTER' para continuar");

        int num1, num2, num3, num4;

        System.out.println("Escolha o primeiro número:");
        Scanner primeiroNum = new Scanner(System.in);
        while (true) {
            if (primeiroNum.hasNextInt()) {
                num1 = primeiroNum.nextInt();
                break; 
            } else {
                System.out.println("Valor inválido. Por favor, informe um número inteiro.");
                primeiroNum.next(); 
            }
        }
        
        System.out.println("Escolha o segundo número:");
        Scanner segundoNum = new Scanner(System.in);
        while (true) {
            if (segundoNum.hasNextInt()) {
                num2 = segundoNum.nextInt();
                break; 
            } else {
                System.out.println("Valor inválido. Por favor, informe um número inteiro.");
                segundoNum.next(); 
            }
        }

        System.out.println("Escolha o terceiro número:");
        Scanner terceiroNum = new Scanner(System.in);
        while (true) {
            if (terceiroNum.hasNextInt()) {
                num3 = terceiroNum.nextInt();
                break; 
            } else {
                System.out.println("Valor inválido. Por favor, informe um número inteiro.");
                terceiroNum.next(); 
            }
        }

        System.out.println("Escolha o quarto número:");
        Scanner quartoNum = new Scanner(System.in);
        while (true) {
            if (quartoNum.hasNextInt()) {
                num4 = quartoNum.nextInt();
                break; 
            } else {
                System.out.println("Valor inválido. Por favor, informe um número inteiro.");
                quartoNum.next(); 
            }
        }

        System.out.println("Sorteando...");

        Random gerador = new Random();
        int rand1 = gerador.nextInt(11);
        int rand2 = gerador.nextInt(11);
        int rand3 = gerador.nextInt(11);
        int rand4 = gerador.nextInt(11);

        if (rand1 == num1 && rand2 == num2 && rand3 == num3 && rand4 == num4) {          
            System.out.println("Parabéns! Os números sorteados foram: " + rand1 + ", " + rand2 + ", " + rand3 + " e " + rand4 + ". Você Ganhou!");
        }
        else{
            System.out.println("Não foi dessa vez! Os números sorteados foram: " + rand1 + ", " + rand2 + ", " + rand3 + " e " + rand4 + ". Você Perdeu!");
        }
        
    }
}

