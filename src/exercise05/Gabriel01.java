package exercise05;

import java.util.Scanner;

public class Gabriel01 {
    public static void main(String[] args) {
        // Crie um programa Java que simule um sistema de acesso a um aplicativo.
        // O programa deve pedir ao usuário um nome de usuário (String) e uma senha (numérica).

        int scanPass, strPass;
        String strLogin, scanLogin;
        boolean loginOK = false, passOK = false;
        Scanner keyboard = new Scanner(System.in);

        strLogin = "admin";
        strPass = 12345;

        System.out.println("Informe o seu usuário: ");

        // Testar e consultar o funcionamento do método hasNext()
        while (!keyboard.hasNext() || !loginOK) {
            scanLogin = keyboard.next();
            if (strLogin.equals(scanLogin)) loginOK = true;
            else System.out.println("Usuário não encontrado. Tente novamente: ");
        }

        System.out.println("Informe a senha (apenas números): ");

        while (!keyboard.hasNextInt() || !passOK) {
            scanPass = keyboard.nextInt();
            // if (type())
            if (strPass == scanPass) passOK = true;
            else System.out.println("Senha incorreta. Tente novamente: ");
        }

        System.out.println("Acesso concedido. Bem-vindo, admin!");
    }
}
