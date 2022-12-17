import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {


        Function<Product, Double> priceEnd =
         p -> p.getValue() * (1 - p.getDiscount());
        UnaryOperator<Double> duty =
              price -> price >= 2500 ? price * 1.085 : price;
        UnaryOperator<Double> shipping =
                price -> price >= 3000 ? price + 1000 : price + 50;
        UnaryOperator<Double> round =
                price -> Double.parseDouble(String.format("%.2f", price));
        Function<Double, String> formatar =
                price -> ("R$" + price).replace(".",",");


        Product p = new Product("Ipad", 3235.89,0.13);

        String price = priceEnd.andThen(duty)
              //  .andThen(shipping)
              //  .andThen(round)
               // .andThen(formatar)
                .apply(p);

        System.out.println("O preço final é: " + price);

    }
}