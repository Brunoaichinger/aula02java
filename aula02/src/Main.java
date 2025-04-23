import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Digite o seu nome:");
        Scanner txt = new Scanner(System.in);
        String nome = txt.nextLine();
        System.out.println("Digite a sua idade:");
        int idade = txt.nextInt();
        System.out.println("Digite a sua altura:");
        double altura = txt.nextDouble();
        System.out.printf("Nome: %s\nAltura:%.2f\nIdade:%d", nome, altura, idade);

    }
}