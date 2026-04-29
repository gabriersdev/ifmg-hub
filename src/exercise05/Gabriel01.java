package exercise05;

import java.util.Scanner;

public class Gabriel01 {
    public static void main(String[] args) {
        // Crie um programa Java que simule um sistema de acesso a um aplicativo.
        // O programa deve pedir ao usuário um nome de usuário (string) e uma senha (numérica).

        int scanPass, strPass;
        boolean loginOK = false, passOK = false;
        String strLogin, scanLogin;
        Scanner keyboard = new Scanner(System.in);

        strLogin = "admin";
        strPass = 12345;

        System.out.println("Informe o seu usuário: ");

        while (!loginOK) {
            scanLogin = keyboard.next();
            if (strLogin.equals(scanLogin)) loginOK = true;
            else System.out.println("Usuário não encontrado. Tente novamente: ");
        }

        System.out.println("Informe a senha (apenas números): ");

        while (!passOK) {
            if (keyboard.hasNextInt()) {
                scanPass = keyboard.nextInt();
                if (strPass == scanPass) passOK = true;
                else System.out.println("Senha incorreta. Tente novamente: ");
            }
            //
            else {
                System.out.println("Informe a senha (apenas números): ");
                // Re-solicita o preenchimento do usuário
                keyboard.next();
            }
        }

        System.out.println("Acesso concedido. Bem-vindo!");
        keyboard.close();
    }
}