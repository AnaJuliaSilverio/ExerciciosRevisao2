import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        List<Double> altura = new ArrayList<>();
        List<Character> sexo = new ArrayList<>();
        List<String> nomePessoas = new ArrayList<>();

        adicionarElementosLista(altura,sexo,nomePessoas);
        exibirUsuario(altura,sexo,nomePessoas);
        estatisticasGrupo(altura,sexo,nomePessoas);

    }

    public static void adicionarElementosLista(List<Double> altura, List<Character> sexo,List<String> nomePessoas) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome da pessoa de número " + (i + 1));
            nomePessoas.add(sc.next());
            System.out.println("Digite a altura do/da " + nomePessoas.get(i));
            altura.add(sc.nextDouble());
            System.out.println("Digite o sexo do/da " + nomePessoas.get(i));
            System.out.println("digite F-feminino, M-masculino");
            sexo.add(sc.next().charAt(0));
        }
    }
    public static void estatisticasGrupo(List<Double> altura,List<Character> sexo,List<String> nomePessoas){
        //media de altura dos homens
        double media=0;
        int contHomens=0;

        for (int i = 0; i <altura.size() ; i++) {
            if (sexo.get(i)=='M'){
                media+=altura.get(i);
                contHomens++;
            }
        }
        System.out.println("-------------------Estatísticas usuários-------------------");
        System.out.println("A maior altura do grupo é "+maiorValor(altura));
        System.out.println("A menor altura do grupo é "+menorValor(altura));
        System.out.println("A média da altura dos homens é "+media);
        System.out.println("O Número de mulheres é "+(5-contHomens));
        System.out.println("-------------------------------------------------------------");
    }

    public static void exibirUsuario(List<Double> altura,List<Character> sexo,List<String> nomePessoas) {
        System.out.println("-------------------Todos os usuários-------------------");
        for (int i = 0; i < altura.size(); i++) {
            System.out.println("Nome: "+nomePessoas.get(i));
            if (sexo.get(i)=='F'){
                System.out.println("Sexo: Feminino");
            }else {
                System.out.println("Sexo: Masculino");
            }
            System.out.println("Altura: "+altura.get(i));
            System.out.println(" ");
        }
        System.out.println("---------------------------------------------------------");

    }
    public static double menorValor(List<Double> valores) {
        double menor;
        menor = valores.get(0);

        for (int i = 0; i <valores.size() ; i++) {
            if (menor>valores.get(i)){
                menor = valores.get(i);
            }
        }
        return menor;
    }
    public static double maiorValor(List<Double> valores) {
        double maior;
        maior = valores.get(0);

        for (int i = 0; i <valores.size() ; i++) {
            if (maior<valores.get(i)){
                maior = valores.get(i);
            }
        }
        return maior;
    }
}
