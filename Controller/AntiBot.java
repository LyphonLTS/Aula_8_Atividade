package Controller;

import java.util.ArrayList;
import java.util.Random;

public class AntiBot {
  private ArrayList<String> token;

  public AntiBot() {
    this.token = new ArrayList<>();

    this.token.add("Ax7l01");
    this.token.add("5s6TRn");
    this.token.add("98Mk1k");
    this.token.add("1oqW09");
    this.token.add("x23f9T");
  }

  public String getToken() {
    int val = new Random().nextInt(4 - 0 + 1) + 0;

    return this.token.get(val);
  }
}
