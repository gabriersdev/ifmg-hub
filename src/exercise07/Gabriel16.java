package exercise07;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Gabriel16 {
    public static void main(String[] args) {
        /*
         * 16. Elabore um algoritmo que faça a conversão de um número binário de N bits digitados pelo usuário para o
         * número na base octal, base decimal e base hexadecimal. Valide se o valor informado na entrada só
         * possui 0's ou 1's, ou seja, se é mesmo um número binário. Não utilize funções pré-definidas no
         * JAVA.
         */

        String numberBIN, numberHEX, s, intermediateSTR;
        Scanner keyboard = new Scanner(System.in);
        boolean invalid = false;
        int sInInteger, intermediateINT = 0, numberDEC = 0, numberOCT = 0;

        while (true) {
            System.out.println("Informe um número binário: ");

//            if (keyboard.hasNext()) {
            if (true) {
//                numberBIN = keyboard.next().trim();
                numberBIN = "010101";

                // Faz as validações para identificar se o número é binário
                if (numberBIN.isEmpty()) invalid = true;

                // Verifica se TODOS os números são 0 ou 1
                for (int i = 0; i < numberBIN.length(); i++) {
                    s = numberBIN.split("")[i];

                    if (!s.equals("0") && !s.equals("1")) {
                        System.out.println("Para um número ser binário ele precisa ser formado apenas de ZERO e UM");
                        invalid = true;
                        break;
                    }
                }

                // Verifica se o que o usuário fez está OK, se não tiver, para a execução
                if (invalid) continue;

                // Inicia as conversões

                // Conversão para decimal
                for (int i = numberBIN.length() - 1, j = 0; i >= 0; i--, j++) {
                    s = numberBIN.split("")[i];

                    sInInteger = Integer.parseInt(s);
                    numberDEC += sInInteger * (int) Math.pow(2, j);
                }

                // System.out.println("sInInteger: POS " + i + " VAL " + sInInteger);

                // Conversão do que foi descoberto como DECIMAL para OCTAL
                // Tem que dividir e obter o resto
                for (; ; ) {
                    intermediateINT = numberDEC;

                    String strConvert = "";

                    int divisionPer8 = intermediateINT / 8;
                    int divisionRestPer8 = intermediateINT % 8;

                    intermediateINT = divisionPer8;


                    break;
                }

                System.out.println("numberBIN: " + numberBIN);
                System.out.println("numberDEC: " + numberDEC);
                System.out.println("numberOCT: " + numberOCT);
                break;
            }
        }
    }
}
