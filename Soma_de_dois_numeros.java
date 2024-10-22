import java.util.Scanner;
// biblioteca para importar input

public class Soma_de_dois_numeros{
    public static int soma(int a, int b){
        int c = a + b;
        return c;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int a = sc.nextInt();
        System.out.println("Digite putro número: ");
        int b = sc.nextInt();
        int c = soma(a,b);
        System.out.printf("A soma de %d e %d é igual %d",a,b,c);
        sc.close();


    }
}