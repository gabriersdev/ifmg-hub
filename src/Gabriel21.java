import java.util.Scanner;

public class Gabriel21 {
    public static void main(String[] args) {
        // Faça um programa que receba a medida do ângulo formado por uma escada apoiada e a altura da parede.
        // Calcule e mostre a medida da escada para que a ponta da parede possa ser alcançada.

        // TODO - traduzir!
        double anguloEscada, alturaParede, tamanhoEscada, pi;

        Scanner teclado = new Scanner(System.in);
        pi = 3.1416;

        // TODO - conferir!
        System.out.println("Qual o ângulo que a escada se encontra? ");
        anguloEscada = teclado.nextDouble();
        anguloEscada = Math.sin((anguloEscada * pi) / 180);

        System.out.println("Qual a altura da parede? ");
        alturaParede = teclado.nextDouble();

        tamanhoEscada = alturaParede * anguloEscada;
        System.out.println();
        System.out.printf("O tamanho da escada é de %.4f metros", tamanhoEscada);
    }
}
