package Controller;

public class User {
  private String password;
  private static User uniqueUser;
  private String username;

  private User(String password, String username) {
    this.password = password;
    this.username = username;
  }

  public static User Login(String password, String username) {
    if (uniqueUser == null) {
      uniqueUser = new User(password, username);
    }

    return uniqueUser;
  }

  public String getPassword() {
    return this.password;
  }

  public String getUsername() {
    return this.username;
  }
}
