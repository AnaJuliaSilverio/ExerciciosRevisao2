import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valorUsuario = sc.nextInt();
        System.out.println("Valor real: "+valorUsuario);
        System.out.println("Valor invertido: "+inverteNumero(valorUsuario));
    }

    public static int inverteNumero(int valor) {
        String valorEmString = String.valueOf(valor);
        String valorInvertido="";

        for (int i = valorEmString.length(); i>0 ; i--) {
            valorInvertido += valorEmString.charAt(i-1) ;
        }
       valor = Integer.parseInt(valorInvertido);
        return valor;
    }
}
