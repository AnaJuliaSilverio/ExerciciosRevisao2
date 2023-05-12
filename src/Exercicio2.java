import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        List<Double> salario = new ArrayList<>();
        List<String> nomeFuncionarios = new ArrayList<>();
        adicionarSalariosFuncionario(salario,nomeFuncionarios);
        exibirFuncionario(salario,nomeFuncionarios);
        System.out.printf("A media salarial é:R$ %.2f",calculaMediaSalarial(salario));
    }
    public static void adicionarSalariosFuncionario(List<Double> salario,List<String> nomeFuncionario) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos funcionarios quer adicionar? ");
        int quantidade = sc.nextInt();
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o nome do "+(i+1)+"º funcionario: ");
            nomeFuncionario.add(sc.next());
            System.out.println("Digite o salario do/da " + nomeFuncionario.get(i));
            salario.add(sc.nextDouble());
        }
    }
    public static double calculaMediaSalarial(List<Double> salario){
        double media =0;
        for (int i = 0; i <salario.size() ; i++) {
                media+=salario.get(i);
        }

        return media/salario.size();
    }
    public static void exibirFuncionario(List<Double> salario,List<String> nomeFuncionario) {
        System.out.println("-------------------Todos os funcionarios-------------------");
        for (int i = 0; i < salario.size(); i++) {
            System.out.println("Nome: "+nomeFuncionario.get(i));
            System.out.printf("Salário:R$ %.2f\n",salario.get(i));
            System.out.println(" ");
        }
        System.out.println("---------------------------------------------------------");

    }
}