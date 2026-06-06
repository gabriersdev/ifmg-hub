package exercise09;

public class Gabriel01 {
    public static void main(String[] args) {
        int variable1 = 1, variable2 = 0, res;

        // 0 é falsy neste contexto, por isso o que é atribuído à variável res é o valor de variable1
        res = variable2 | variable1;

        System.out.println(res);
    }
}
