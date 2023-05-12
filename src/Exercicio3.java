import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor para checarmos se ele é múltiplo de 5 e/ou 7: ");
        int valorUsuario = sc.nextInt();
        multiplo5ou7(valorUsuario);
    }
    public static void multiplo5ou7 (int valor){

        if (valor%7==0 && valor%5==0){
            System.out.println("O número "+valor+" é múltiplo de 5 e de 7");

        } else if (valor%7==0) {
            System.out.println("O número "+valor+" é múltiplo de 7");
        }else if (valor%5==0){
            System.out.println("O número "+valor+" é múltiplo de 5");
        }else {
            System.out.println("O número "+valor+" não é múltiplo de 5 nem de 7");
        }
    }
}
