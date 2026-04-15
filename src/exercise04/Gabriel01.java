package exercise04;

import java.util.Scanner;

public class Gabriel01 {
    public static void main(String[] args) {
        // Refaça o exercício referente à equação do segundo grau do roteiro anterior considerando todas as
        // condições possíveis, conforme fluxograma abaixo.
        // ax² + bx + c = 0
        // Fluxograma: https://f.feridinha.com/v9LsG.png

        // Exercício anterior: https://f.feridinha.com/4HxTn.png
        // f(x) = 1, se x <= 1
        // f(x) = 2, se 1 < x <= 2
        // f(x) = x², se 2 < x <= 3
        // f(x) = x³, se x > 3

        // TODO - rever e refazer
        double varA = 0, varB = 0, varC = 0, varD = 0, varR = 0, varR1 = 0, varR2 = 0;
        Scanner keyboard = new Scanner(System.in);

        varA = keyboard.nextDouble();
        varB = keyboard.nextDouble();

        if (varA == 0) {
            System.out.println("Não é uma equação do 2º grau.");

            if (varB == 0) System.out.println("Não é uma equação do 1º grau.");

            //
            else {
                varR = -varC / varB;
                System.out.println(varR);
            }
        }

        else {
            varD = varB * varB - (4 * varA * varC);
            if (varD < 0) System.out.println("Não há raízes reais.");

            //
            else {
                varR1 = (-varB - Math.sqrt(varD)) / (2 * varA);
                varR2 = (-varB + Math.sqrt(varD)) / (2 * varA);
            }

            System.out.println(varR1);
            System.out.println(varR2);
        }

        // TODO - verificar qual a saída necessária e sair
        System.out.println();
        keyboard.close();
    }
}
