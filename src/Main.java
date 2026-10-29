import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Jogador j1 = new Jogador();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        j1.nome = sc.nextLine();
        System.out.println("Digite seu nickName");
        j1.nickName = sc.nextLine();
        System.out.println("Digite sua idade");
        j1.idade = sc.nextInt();
        System.out.println("Digite seu jogo favorito");
        j1.jogoFavorito = sc.nextLine();
        System.out.println("Digite seu nível");
        j1.nivel = sc.nextInt();

        System.out.println("Nome do jogador: " + j1.nome
                + " Nick do Jogador: " + j1.nickName
                + " Idade do jogador:" + j1.idade
                + " Jogo Favorito: "   + j1.jogoFavorito
                + " Nível alcançado: " + j1.nivel);


        }
    }