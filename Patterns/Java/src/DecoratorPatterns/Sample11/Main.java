package DecoratorPatterns.Sample11;

public class Main {

    public static void main(String[] args) {
        Shape r1 = new RedDecorator(new Rectangle());
        r1.Draw();


    }
}
