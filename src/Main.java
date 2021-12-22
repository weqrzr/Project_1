import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, IllegalAccessException {
        System.out.println("Введите выражение. Используйте операторы +-*/ и числа в пределах 1-10 или I-X:");
        Input input=new Input();
        input.setInpStr(Input.input());
        Input.checkIn(input.getInpStr());
        if(input.checkNumSys(input.getInpStr())) {
            System.out.println(Calc.calculate(input.getOperands(input.getInpStr()), input.getOperators(input.getInpStr()),input.checkNumSys(input.getInpStr())));
        }
        else {
            System.out.println(Calc.calculate(input.getOperands(input.getInpStr()), input.getOperators(input.getInpStr()),input.checkNumSys(input.getInpStr())));
        }
    }}
