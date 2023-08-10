package DesignPattern.Strategy;

public class TextFormatter {
  private ColorStrategy colorStrategy;

  public TextFormatter(ColorStrategy colorStrategy) {
    this.colorStrategy = colorStrategy;
  }

  public void setColorStrategy(ColorStrategy colorStrategy) {
    this.colorStrategy = colorStrategy;
  }

  public ColorStrategy getColorStrategy() {
    return colorStrategy;
  }

  public void format(String text) {
    System.out.println(colorStrategy.format(text));
  }
}
