package DesignPattern.Strategy;

public class GreenColorStrategy implements ColorStrategy {
  @Override
  public String format(String text) {
    return "\u001B[32m" + text + "\u001B[0m";
  }
}
