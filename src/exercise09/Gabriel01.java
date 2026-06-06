package exercise09;

public class Gabriel01 {
    public static void main(String[] args) {
        int variable1 = 1, variable2 = 0, res;

        // 0 acaba sendo falsy neste contexto, por isso o que é atribuído à variável res é o valor de variable1
        // O operador | é OR bit a bit
        res = variable2 | variable1;

        System.out.println(res);
    }
}
