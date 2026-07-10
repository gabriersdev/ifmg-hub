# Projeto de Prática de Java

Este projeto contém exercícios práticos, desafios, códigos de teste e aprendizado em Java. Cada subdiretório contém uma
série de arquivos Java que demonstram diferentes conceitos e habilidades.

## Estrutura do Projeto

- `src/exerciseXX`: Exercícios práticos de Java.
- `src/challenges`: Desafios mais avançados.
- `src/learning`: Códigos de aprendizado para entender conceitos básicos.
- `src/testing`: Testes de código para verificar a funcionalidade.

## Exercícios Práticos

### Exemplo de Exercício 02: `exercise02/Gabriel01.java`

```java
package exercise02;

import java.util.Scanner;

public class Gabriel01 {
    public static void main(String[] args) {
        // Crie um algoritmo que calcule a soma e a média de 3 números informados pelo usuário.
        int number1, number2, number3;
        double sum, avg;
        Scanner keyboard = new Scanner(System.in);

        System.out.println(":: Cálculo de soma e média ::");
        System.out.println("Informe o 1º número: ");
        number1 = keyboard.nextInt();

        System.out.println("Informe o 2º número: ");
        number2 = keyboard.nextInt();

        System.out.println("Informe o 3º número: ");
        number3 = keyboard.nextInt();

        sum = number1 + number2 + number3;
        avg = sum / 3;

        System.out.printf("A soma dos 3 números informados é: %f.", sum);
        System.out.println();
        System.out.printf("A média dos 3 números informados é: %f.", avg);
        keyboard.close();
    }
}
