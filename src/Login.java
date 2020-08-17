import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // CADASTRO DE USUARIO...

        System.out.println("Digite seu nome completo");
        String nome = scanner.nextLine();

        String[] login = nome.split(" ");

        String username = nome.charAt(0) + "_" + login[login.length-1];
        System.out.println("Seu Usuario de Login e: " + username);

        //FIM CADASTRO USUARIO ....


        // INICIO EXIGENCIA DE CARACTER NA SENHA...

        System.out.println("Digite sua senha");
        String senha = scanner.nextLine();

        if (senha.length() < 8){
            System.out.println("Senha deve ter mais de 8 caracteres");
        }


        boolean temCaracterEspecial = false;

        while (temCaracterEspecial == false){
            for (int i = 0; i < senha.length(); i++) {
                String caracter = String.valueOf(senha.charAt(i));

                if (caracter.equals("@") || caracter.equals("#") || caracter.equals("-") || caracter.equals("!")){
                    temCaracterEspecial = true;
                    System.out.println("Senha válida");
                    break;
                }
            }
            if (temCaracterEspecial == false){
                System.out.println("Senha precisar de uma letra Maiuscla e Menusculas e caracter especil @#!-");
                break;
            }

        }


        // FIM EXIGENCIA DE CARACTER NA SENHA...

        // INICIO DA VALIDAÇÃO DO LOGIN E SENHA P/ PODER LOGAR.....


        boolean validaLogin = false;
         while ( validaLogin == false) {
             System.out.println("Insira seu login: ");
             String vlogin = scanner.nextLine();

             System.out.println("Insira sua senha: ");
             String vSenha = scanner.nextLine();

             if( login.equals(login) && senha.equals(senha)) {
                 System.out.println("Login realizado com sucesso!!!");
                 validaLogin = true;

             } else {
                 System.out.println("Login ou Senha Invalidos!");
             }break;
         }

         //// FIM DA VALIDAÇÃO DO LOGIN E SENHA P/ PODER LOGAR.....

    }
}