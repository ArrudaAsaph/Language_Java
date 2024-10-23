import java.util.Scanner;



    class Circulo{
        public double raio = 0;
        public double area()
        {
            return ((raio * raio ) * 3.14);
        }
        public double perimetro()
        {
            double c = raio * (2 * 3.14);
            return c;
        }
    }

    

public class Ex_Circulo {
    public static void main(String[] args)
    {
        Circulo circulo = new Circulo();
        System.out.println("Digite o tamanho do raio do círculo: ");
        Scanner leitor = new Scanner(System.in);
        circulo.raio = leitor.nextDouble();
        double area = circulo.area();
        double perimetro = circulo.perimetro();
        leitor.close();
        System.out.println(String.format("A área do círculo é igual %.2f m2 e o perimetro é igual a %.2f metros.",area,perimetro));

    }
}
