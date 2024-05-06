import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
/*Conversão de Graus Celsius para Fahrenheit:
    Peça ao usuário para inserir uma temperatura em graus Celsius e converta
    para Fahrenheit usando a fórmula: F = C * 9/5 + 32. */
    System.out.println("Coloque a temperatura em Graus Celcius: ");
    double celsius = sc.nextDouble();
    double fahrenheit = (celsius * 9/5) + 32;
    System.out.println("A temperatura em Fahrenheit é : " +fahrenheit); 
    }
}
