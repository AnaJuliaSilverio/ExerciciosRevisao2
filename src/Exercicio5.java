import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        verificaSomaDigitos();
    }
    public static void verificaSomaDigitos(){
        int unidadade,dezena,soma=0;
        for (int i = 100; i < 150; i++) {
            unidadade = i%10;
            dezena = (i%100)/10;
            soma = unidadade+dezena+1;
            if (soma%2==0){
                System.out.println("A soma de todos os digitos de "+i+" é par");
            }
        }
    }
}
