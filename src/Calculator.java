import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    /*
    BinaryOperator<Integer> devide = (x, y) -> x / y;
    * ошибка при делении на 0
    */

    //добавляем проверку при делении на ноль
    BinaryOperator<Integer> devide = (x, y) -> {
        if (y ==0) { // если делитель равен 0
            System.out.println("На ноль делить нельзя"); // выводим сообщение об ошибке
            return 0; // возвращаем ноль
        }
        return x / y; // иначе возвращаем результат
    };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;

}
