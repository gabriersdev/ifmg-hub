package exercise06;

import java.util.Scanner;

public class Gabriel11 {
    public static void main(String[] args) {
        //    11. Faça um programa que leia a nota e o nome de N alunos na prova de algoritmos e imprima a maior e a
        //    menor nota computada e qual aluno tirou tais notas. Além disso, calcule e imprima também a soma e a
        //    média de todas as notas.

        double minPoint = 0, maxPoint = 0, currentPoint = 0;
        int count = 0, i;
        String personNameMaxPoint = "", personNameMinPoint = "", currentPersonName = "";
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Informe a quantidade de dados de notas que você vai digitar: ");

            if (keyboard.hasNextInt()) {
                count = keyboard.nextInt();

                if (count <= 0) System.out.println("A quantidade de números precisa ser positiva.");

                else {
                    for (i = 0; i < count; i++) {
                        System.out.println("Informe os dados de notas #" + (i + 1) + ": ");
                        System.out.println("Nome do aluno: ");
                        currentPersonName = keyboard.next();

                        System.out.println("Nota do aluno: ");
                        currentPoint = keyboard.nextDouble();

                        if (currentPoint > maxPoint) {
                            maxPoint = currentPoint;
                            personNameMaxPoint = currentPersonName;
                        };

                        if (currentPoint < minPoint) {
                            minPoint = currentPoint;
                            personNameMinPoint = currentPersonName;
                        }
                    }

                    if (!personNameMaxPoint.isEmpty()) System.out.println("O aluno com a MAIOR NOTA foi " + personNameMaxPoint + " e a nota dele foi " + maxPoint);
                    else System.out.println("Não foi identificado aluno com uma nota maior.");

                    if (!personNameMinPoint.isEmpty()) System.out.println("O aluno com a MENOR NOTA foi " + personNameMinPoint + " e a nota dele foi " + minPoint);
                    else System.out.println("Não foi identificado aluno com uma nota menor.");

                    break;
                }
            }
        }
    }
}
