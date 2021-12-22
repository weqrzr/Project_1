public class Calc {
    public static String calculate(String[] operands, String operator, boolean ArabNum) throws IllegalAccessException {
        int a=0,b=0;
        String result=null;
        int resultRom=0;
        if(ArabNum) {
            a = Integer.parseInt(operands[0]);
            b = Integer.parseInt(operands[1]);

            if (a > 10 | b > 10) {
                throw new IllegalAccessException("Вводимые значения не должны быть больше 10!");
            }
            if (a < 1 | b < 1) {
                throw new IllegalAccessException("Вводимые значения не должны быть меньше 1!");
            }
            switch (operator){
                case "+":result=String.valueOf(a+b);
                    break;
                case "-":result=String.valueOf(a-b);
                    break;
                case "/":result=String.valueOf(a/b);
                    break;
                case "*":result=String.valueOf(a*b);
                    break;

                default:
                    throw new IllegalStateException("Неизвестное значение: " + operator);
            }
        }
        if(!ArabNum){
            a=Converter.romanToArabic(operands[0]);
            b=Converter.romanToArabic(operands[1]);
            if (a > 10 | b > 10) {
                throw new IllegalAccessException("Вводимые значения не должны быть больше X!");
            }
            if (a < 1 | b < 1) {
                throw new IllegalAccessException("Вводимые значения не должны быть меньше I!");
            }
            switch (operator){
                case "+":resultRom=(a+b);
                    break;
                case "-":resultRom=(a-b);
                    break;
                case "/":resultRom=(a/b);
                    break;
                case "*":resultRom=(a*b);
                    break;

                default:
                    throw new IllegalStateException("Неизвестное значение: " + operator);
            }
            result=Converter.arabicToRoman(resultRom);
        }
        return result;
    }
}
