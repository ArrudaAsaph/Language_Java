import java.util.Scanner;


class Triangulo{
    public double altura = 0, base = 0;
    public double calc_area(){
        return base * altura / 2;
    }
}

public class Classe_Triangulo {
    public static void main (String[] args){
       
        Triangulo dimensoes = new Triangulo();
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a base do seu Triangulo: ");
        dimensoes.base = leitor.nextDouble();
        System.out.println("Digite a altura do seu Triangulo: ");
        dimensoes.altura = leitor.nextDouble();
        System.out.println(String.format("A area do seu Triangulo é igual a %.2f",dimensoes.calc_area()));
        leitor.close();


    }

}
