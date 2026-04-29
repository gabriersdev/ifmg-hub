package exercise04;

import java.util.Scanner;

public class Gabriel01 {
    public static void main(String[] args) {
        // Refaça o exercício referente à equação do segundo grau do roteiro anterior considerando todas as
        // condições possíveis, conforme fluxograma abaixo.
        // ax² + bx + c = 0
        // Fluxograma: https://f.feridinha.com/v9LsG.png

        Scanner keyboard = new Scanner(System.in);
        double a, b, c, delta, root, root1, root2;

        System.out.print("Digite o valor de a: ");
        a = keyboard.nextDouble();
        
        System.out.print("Digite o valor de b: ");
        b = keyboard.nextDouble();
        
        System.out.print("Digite o valor de c: ");
        c = keyboard.nextDouble();

        if (a == 0) {
            System.out.println("Não é uma equação do 2º grau.");
            if (b == 0) {
                System.out.println("Não é uma equação do 1º grau.");
            } else {
                root = -c / b;
                System.out.println("A raiz da equação do 1º grau é: " + root);
            }
        } else {
            delta = (b * b) - (4 * a * c);
            if (delta < 0) {
                System.out.println("Não há raízes reais.");
            } else if (delta == 0) {
                root = -b / (2 * a);
                System.out.println("A equação possui uma raiz real: " + root);
            } else {
                root1 = (-b - Math.sqrt(delta)) / (2 * a);
                root2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("As raízes são reais e diferentes: " + root1 + " e " + root2);
            }
        }

        keyboard.close();
    }
}
