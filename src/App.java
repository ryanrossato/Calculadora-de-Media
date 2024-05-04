import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);       

        System.out.println("Bem-vindo à calculadora de média!");

        System.out.println("Quantos números deseja calcular a média?");
        int tamanho = entrada.nextInt();

        double[] numeros = new double[tamanho];

        for(int i = 0 ; i < tamanho ; i++){
            System.out.println("Digite o número "+ (i + 1)+": ");
            numeros[i] = entrada.nextDouble();
        }

        double soma = 0;
        for (double numero : numeros){
            soma += numero;
        }

        double media = soma / tamanho;

        System.out.println("A média é: " + media);




        entrada.close();
    }
}
