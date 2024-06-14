import java.util.Scanner;

import Controller.AntiBot;
import Controller.User;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Por favor digite o usuário: ");
    String username = scan.nextLine();
    System.out.print("Por favor digite a senha: ");
    String password = scan.nextLine();

    String token = new AntiBot().getToken();

    System.out.println("Por favor digite o código: " + token);
    String userToken = scan.nextLine();

    while (!token.equals(userToken)) {
      token = new AntiBot().getToken();
      System.out.println("Por favor digite o código: " + token);
      userToken = scan.nextLine();
    }

    scan.close();

    User user = User.Login(password, username);

    System.out.println("Seja bem vindo, " + user.getUsername());
  }
}