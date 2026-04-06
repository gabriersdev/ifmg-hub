import java.util.Scanner;

public class Gabriel24 {
    public static void main(String[] args) {
        // Considere uma equação do segundo grau na forma genérica (ax² + bx + c) e calcule o valor das raízes da
        // mesma. Sabe-se que os coeficientes a, b, e c devem ser fornecidos pelo usuário. Utilize as equações abaixo
        // como teste. Teste também para alguns valores aleatórios de coeficientes (exemplo a = 3, b = 2 e c = 4) e
        // veja que em alguns casos não se retornam as raízes de forma correta. Identifique o porquê desse problema e
        // indique uma possível solução.
        // Equações para teste:

        // TODO - fazer!

        // #
        Scanner keyboard = new Scanner(System.in);
        Integer qcVarA = keyboard.nextInt();
        Integer qcVarB = keyboard.nextInt();
        Integer qcVarC = keyboard.nextInt();

        // #
        System.out.println(qcVarA);
        System.out.println(qcVarB);
        System.out.println(qcVarC);

        Integer testVarA = 3;
        Integer testVarB = 2;
        Integer testVarC = 3;
        Integer varX = 5;

        Double calcQC = Math.pow(testVarA, 2) + (testVarB * varX) + testVarC;
        Double calcKYQC = Math.pow(qcVarA, 2) + (qcVarB * varX) + qcVarC;

        System.out.println(calcKYQC);

        // ?
        System.out.printf("Resultado do cálculo: %.2f", calcQC);

        // Fórmulas:
        // ?
        // 1x² + 2x + 1 = 0
        // 1x² + 3x + 2 = 0
        // 1x² + 4x + 3 = 0
        // 1x² + 4x + 4 = 0
        // 2x² + 3x - 2 = 0
    }
}
