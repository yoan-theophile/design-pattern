package DesignPattern.Strategy;

public class RedColorStrategy implements ColorStrategy {
  @Override
  public String format(String text) {
    return "\u001B[31m" + text + "\u001B[0m";
  }
}
