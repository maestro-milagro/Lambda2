public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.divide.apply(a, b);
        calc.println.accept(c);
        // Ошибка возникает из-за того, что в данном случае знаменатель, при делении одного числа на другое, равен нулю.
        // Для предотвращения возникновения ошибки можно реализовать блок кода, в котором мы за счет операторов try и catch
        // будем "ловить" ошибку, но в этом случае нам придется вернуть какое-то интовое значение (например null).
        // Так же можно с помощью тернарного оператора или if задать условия для знаменателя и если
        // он будет равен нулю выдать ArithmeticException.
    }
}
