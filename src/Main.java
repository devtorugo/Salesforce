import Usuario.Cadastro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Cadastro> cadastros = new ArrayList<>();

        boolean rodando = true;

        while(rodando){

            System.out.println("===== MENU INICIAL =====");
            System.out.println("[1] Cadastrar");
            System.out.println("[2] Listar todos os cadastros");
            System.out.println("[3] Atualizar dados do usuário");
            System.out.println("[4] Remover usuário");
            System.out.println("[5] Sair");
            System.out.print("Digite a opção desejada: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1": {
                    System.out.println("===== CADASTRO DE CLIENTE =====");
                    System.out.println("Digite o seu nome: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite seu sobrenome: ");
                    String sobrenome = scanner.nextLine();
                    System.out.println("Telefone:");
                    String telefone = scanner.nextLine();
                    System.out.println("Digite seu email: ");
                    String email = scanner.nextLine();
                    System.out.println("Digite sua senha: ");
                    String senha = scanner.nextLine();


                    Cadastro novocadastro  = new Cadastro();

                    novocadastro.setNome(nome);
                    novocadastro.setSobrenome(sobrenome);
                    novocadastro.setTelefone(telefone);
                    novocadastro.setEmail(email);
                    novocadastro.setSenha(senha);


                    cadastros.add(novocadastro);

                    System.out.println("\nCadastro realizado!");
                    break;
                }

                case "2": {
                    System.out.println("===== LISTAR TODOS OS CADASTRADOS =====");
                    for (Cadastro cadastro: cadastros) {
                        System.out.println("Nome: " + cadastro.getNome());
                        System.out.println("Sobrenome: " + cadastro.getSobrenome());
                        System.out.println("Telefone: " + cadastro.getTelefone());
                        System.out.println("Email: " + cadastro.getEmail());
                        System.out.println("Senha: " + cadastro.getSenha());
                        System.out.println("\nListagem realizada com sucesso!");
                    }
                    break;

                }

                case "3" : {
                    System.out.println("===== ATUALIZAÇÃO DE USUÁRIO =====");
                    for (int i = 0; i < cadastros.size(); i++){

                        Cadastro uTemp = cadastros.get(i);
                        System.out.println("["+ i +"]" + uTemp.getEmail());
                    }
                    System.out.print("Digite o valor de referência: ");
                    int referencia = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Digite o novo email: ");
                    String novoEmail = scanner.nextLine();
                    System.out.print("Digite seu novo telefone: ");
                    String novotelefone = scanner.nextLine();
                    System.out.print("Digite a nova senha: ");
                    String novaSenha = scanner.nextLine();

                    Cadastro c = cadastros.get(referencia);
                    c.setTelefone(novotelefone);
                    c.setEmail(novoEmail);
                    c.setSenha(novaSenha);

                    System.out.print("Atualização realizada!");

                    break;

                }

                case "4": {
                    System.out.println("===== REMOVER USUÁRIO =====");

                    for (int i = 0; i < cadastros.size(); i++) {

                        Cadastro uTemp = cadastros.get(i);

                        System.out.println("[" + i + "]" + uTemp.getEmail());

                    }
                    System.out.print("Digite o valor de referência: ");
                    int referencia = scanner.nextInt();
                    scanner.nextLine();

                    cadastros.remove(referencia);
                    break;
                }

                case "5" : {
                    rodando = false;
                    System.out.println("Programa finalizado!");
                    break;
                }
                

            }



        }


    }

}