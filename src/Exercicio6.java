import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        int matriz[][] = new int[5][4];
        adicionarValoresMatriz(matriz);
        mostrarValoresMatriz(matriz);
        somaValoresMatriz(matriz);
    }
    public static void adicionarValoresMatriz(int matriz[][]){

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Digite um valor para posicao ["+i+"]["+j+"] :");
                matriz[i][j] = sc.nextInt();
            }
            System.out.println(" ");
        }
    }
    public static void mostrarValoresMatriz(int matriz[][]){

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(" ["+i+"]["+j+"] = "+matriz[i][j]);

            }
            System.out.println(" ");
        }
    }

    public static void somaValoresMatriz(int matriz[][]){
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                soma+=matriz[i][j];
            }
        }
        System.out.println("A soma dos valores da matriz é "+soma);
    }

}
