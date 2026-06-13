package exercise09;

import java.util.Scanner;

public class Gabriel01 {
    public static void main(String[] args) {
        // Questão 1 - Sistema de Cadastro de Usuário
        // Uma empresa está desenvolvendo um sistema de cadastro para novos funcionários.
        // 
        // Solicite ao usuário:
        // - Nome completo;
        // - E-mail;
        // - Senha.
        // 
        // Parte 1 - Nome:
        // - Exiba o nome em letras maiúsculas;
        // - Exiba o nome em letras minúsculas;
        // - Exiba a quantidade total de caracteres.
        // 
        // Parte 2 - E-mail:
        // - Verifique se o e-mail contém o caractere '@'.
        // - Exiba 'E-mail válido' ou 'E-mail inválido'.
        // 
        // Parte 3 - Login:
        // - Considere que o usuário informou apenas nome e sobrenome.
        // - Tal como o gmail faz, gere um login no formato nome.sobrenome em letras minúsculas a partir do nome digitado.
        // 
        // Parte 4 - Senha:
        // - Verifique se a senha possui pelo menos 8 caracteres.
        // - Verifique se possui pelo menos um número. -Verifique se a senha possui pelo menos um caractere especial.
        // - Exiba 'Senha forte', se todas as condições forem satisfeitas; ‘Senha média’, se pelo menos 2 das condições forem satisfeitas; ou 'Senha fraca' caso contrário.

        String name = "", email = "", password = "";
        String[] infos = {"nome", "e-mail", "senha"};
        Boolean[] conditions;
        int numberConditionsMet = 0;
        Scanner input = new Scanner(System.in);

        for (String info : infos) {
            System.out.printf("Informe o seu(a) %s: ", info);
            switch (info) {
                case "nome" -> name = input.nextLine().trim();
                case "e-mail" -> email = input.nextLine().trim();
                case "senha" -> password = input.nextLine().trim();
                default -> System.out.println("Há um erro!");
            }
        }

        if (name.isEmpty() || email.isEmpty() || password.isEmpty())
            System.out.println("Você precisa preencher TODAS as informações solicitadas. Tente novamente.");

            // Verifica as informações e retorna os dados
        else {
            // Informações do nome
            System.out.printf(
                    "%nO seu nome:%nEm letras minúsculas: \"%s\"%nEm letras maiúsculas: \"%s\"%nA quantidade de caracteres que ele possui: %d%n%n",
                    name.toLowerCase(),
                    name.toUpperCase(),
                    name.length()
            );

            // Informações do e-mail
            if (email.contains("@")) System.out.println("O e-mail informado é válido");
            else System.out.println("O e-mail informado é inválido");

            // Login
            System.out.printf(
                    "%nSeu login: \"%s\".%n%n",
                    name.replaceAll("\\s", ".").replaceAll("\\.{2,}", ".").toLowerCase()
            );

            conditions = new Boolean[]{
                    password.length() >= 8,
                    // Procura um dígito em qualquer lugar na string password
                    password.matches(".*\\d.*"),
                    // Dá match apenas em caracteres especiais
                    password.matches(".*\\p{Punct}.*")
            };

            // Verifica quantas condições foram atendidas (ou sejam, são true)
            for (Boolean condition : conditions) if (condition) numberConditionsMet++;

            // Senha
            if (numberConditionsMet == 3) System.out.println("Senha forte.");
            else if (numberConditionsMet == 2) System.out.println("Senha média.");
            else System.out.println("Senha fraca.");
        }
    }
}
