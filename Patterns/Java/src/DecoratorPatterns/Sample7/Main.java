package DecoratorPatterns.Sample7;

public class Main {

    public static void main(String[] args) {

    Shape c1 = new RedDecorator(new Rectangle());
    c1.Draw();

    }
}
