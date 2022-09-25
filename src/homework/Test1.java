package homework;

public class Test1 {
    public static void main(String[] args) {
        int a = 14;
        int b = 256;
        double c = 35.5;
        double d = 100.0;
        String s1 = "Привет";
        int sum = a + b;
        double sub = d - c;
        b = 0;
        double product = b * d;
        Byte x;//целочисленная переменная референсного типа макс значение которого 127
        //______________________________
        s1 = String.valueOf(c);//присвоить s1 значение переменной с
        sum = (int) (c + d);
        //что вы увидите в консоли - exit code 0

        System.out.println(sum);
    }
};

