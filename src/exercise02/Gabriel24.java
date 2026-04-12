package exercise02;

import java.util.Scanner;

public class Gabriel24 {
    public static void main(String[] args) {
        // Considere uma equação do segundo grau na forma genérica (ax² + bx + c) e calcule o valor das raízes da
        // mesma. Sabe-se que os coeficientes a, b, e c devem ser fornecidos pelo usuário. Utilize as equações abaixo
        // como teste. Teste também para alguns valores aleatórios de coeficientes (exemplo a = 3, b = 2 e c = 4) e
        // veja que em alguns casos não se retornam as raízes de forma correta. Identifique o porquê desse problema e
        // indique uma possível solução.

        double delta, varA, varB, varC, root, xLine1, xLine2;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Informe o coeficiente a: ");
        varA = keyboard.nextDouble();
        
        System.out.println("Informe o coeficiente b: ");
        varB = keyboard.nextDouble();
        
        System.out.println("Informe o coeficiente c: ");
        varC = keyboard.nextDouble();

        // Verifica se o coeficiente A é zero, o que descaracteriza a equação como sendo do segundo grau
        if (varA == 0) System.out.println("Não é uma equação do segundo grau.");

        // Caso contrário, calcula o delta e as raízes reais (se existirem)
        else {
            delta = Math.pow(varB, 2) - 4 * varA * varC;

            // Se o delta for negativo, não há raízes reais possíveis
            if (delta < 0) System.out.println("A equação não possui raízes reais, pois o delta é negativo (" + delta + ").");

            // Se o delta for igual a zero, a equação possui apenas uma raiz real
            else if (delta == 0) {
                root = -varB / (2 * varA);
                System.out.printf("A equação possui apenas uma raiz real: %.2f", root);
                System.out.println();
            }

            // Se o delta for maior que zero, a equação possui duas raízes reais distintas
            else {
                // X' e X''
                xLine1 = (-varB + Math.sqrt(delta)) / (2 * varA);
                xLine2 = (-varB - Math.sqrt(delta)) / (2 * varA);
                System.out.printf("A equação possui duas raízes reais: %.2f e %.2f", xLine1, xLine2);
            }
        }
    }
}