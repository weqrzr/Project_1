import java.io.IOException;
import java.util.Scanner;

public class Input {
    private String inpStr;
    public static String input(){
        Scanner sc = new Scanner(System.in);
        return  sc.nextLine().toUpperCase().replaceAll("\s","");
    }
    public static void checkIn(String x) throws IOException {
        if(!(x.matches("(([0-9]{1,2})|((IV)|(IX)|V?X?I{0,3}))[+*/-](([0-9]{1,2})|((IV)|(IX)|V?X?I{0,3}))"))){
            throw new IOException("Неверное выражение. Используйте операторы +-*/ и числа в пределах 1-10 или I-X:");
        }
        if((x.matches("[0-9]{1,2}[+*/-][I-X]{1,4}")|(x.matches("[I-X]{1,4}[+*/-][0-9]{1,2}")))){
            throw new IOException("Не используйте разные системы счисления!");
        }

    }
    public boolean checkNumSys(String x){

        return x.matches("[0-9]{1,2}[+*/-][0-9]{1,2}");
    }
    public  String[] getOperands(String x){
        return x.split("[+/*-]");
    }
    public  String getOperators(String x){
        return x.replaceAll("[A-Z0-9]+","");
    }

    public String getInpStr() {
        return inpStr;
    }

    public void setInpStr(String inpStr) {
        this.inpStr = inpStr;
    }
}
