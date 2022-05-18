import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        int n;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o limite da Sequencia: ");
        n = teclado.nextInt();
        int f1 = 1;
        int f2 = 0;
        System.out.println(f2);
        System.out.println(f1);

        for (int i = 0;i <= n;i++){
            f1 = f1 + f2;
            f2 = f1 - f2;
            System.out.println(f1);

        }
    }
}
