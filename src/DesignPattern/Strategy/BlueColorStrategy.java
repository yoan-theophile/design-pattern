package DesignPattern.Strategy;

public class BlueColorStrategy implements ColorStrategy {
  @Override
  public String format(String text) {
    return "\u001B[34m" + text + "\u001B[0m";
  }
}
