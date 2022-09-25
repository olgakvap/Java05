package homework;

import java.sql.SQLOutput;

public class HW3 {
    public static void main(String[] args){
      // LESSON 3
//        Object obj = new Object();// automatically NaN
//        Integer i = new Integer(8);//deprecated
//        Integer i1 = 8;
//        Integer i2 = new Integer("12");// create object
//        Integer sum = i2 + i1;
//        System.out.println(sum);
//
//        Object i5 = new Integer(5);
//
//        System.out.println(i1.MAX_VALUE);// if not static => from variable
//        System.out.println(i1.MIN_VALUE);
//        System.out.println(i2.compareTo(i1));
//
//        System.out.println(Integer.bitCount(i2));// if static=> from Class
//        System.out.println(Integer.compare(i1,i2));
//        System.out.println(Integer.max(i1,i2));
//        System.out.println(Integer.min(i1,i2));


        String line = "___________________________________________________";
        String task = "Task # ";
        int count = 1;

        System.out.println(line);
        System.out.println(task + (++count));
        //2.Создать переменные a и b типа byte, присвоить им значения из допустимого диапазона.


        byte a = -10;
        byte b = 120;

        System.out.println(a);
        System.out.println(b);

        System.out.println(line);
        System.out.println(task + (++count));

        //3.Создать переменные s и t типа short, присвоить им значения с разницей 60000.

        short s = -27768;
        short t = 32232;
        int diff = s - t;

//        short s = Short.MAX_VALUE;
//        short t = Short.MAX_VALUE - 60000;

        System.out.println(s);
        System.out.println(t);
        //System.out.println(diff);


        System.out.println(line);
        System.out.println(task + (++count));
        //4.Создать переменную i типа int и присвоить ей минимально возможное значение этого типа.
        // Затем присвоить максимально возможное значение этого типа. Распечатать оба значения в виде таблицы:

        String line5 = "___________________________________\n";

        System.out.println(line5);
        String vLine = "\t|\t";

         int i = -2147483648;
        System.out.println( " | " + "\tint min" + vLine + i + vLine +  "\n");

        i = 2147483647;
        System.out.println(" | " + "\tint max" + vLine + i + vLine + "\n");
        System.out.println(line5);


        System.out.println(line);
        System.out.println(task + (++count));
        //5.Создать переменную phoneNumber и присвоить ей значение номера телефона с кодом страны
        // и города (можно ненастоящий номер телефона, например, 18009998877)

        long phoneNumber = 19827024714L;
        System.out.println("Phone number is: " + phoneNumber);


        System.out.println(line);
        System.out.println(task + (++count));

        //6.Создать переменную f типа float и присвоить ей значение 100.101101. Создать переменную d типа double
        // и присвоить ей значение 100.101101. Распечатать результат в виде таблицы:

        String line6 = "_______________________________________________\n";

        System.out.println(line6);
        String vLine2 = "\t|\t";
        float  f = 100.101101F;
        double d = 100.101101;
        System.out.println(
                " | " + "\tfloat f = 100.101101" + vLine2 + f + vLine2 +  "\n");
        System.out.println(line6);
        System.out.println(" | " + "\tdouble d = 100.101101" + vLine2 + d + vLine2 +  "\n");


        System.out.println(line);
        System.out.println(task + (++count) + "\n" + "a)");//7a
        //7.a) Создать переменную типа Double с именем dd  и инициализировать её результатом
        // суммы чисел 10.09999 и 20.099999.

        Double d1 = 10.09999;
        Double d2 = 20.09999;
        Double dd = d1 + d2;
        System.out.println("Sum of numbers is : " + dd);
        //Double dd = new Double(10.09999 + 20.099999); other option

        //7.b)Создать переменную типа Float с именем ff и инициализировать её результатом суммы чисел 10.09999 и 20.099999.
        System.out.println("\n" + "b)");//7b
        Float ff1 = new Float(10.09999);
        Float ff2 = new Float(20.09999);
        Float ff5 = ff1 + ff2;
        //Float ff = new Float(10.09999F + 20.099999F); other option
        System.out.println("Sum of numbers is : " + ff5);

        System.out.println(line);
        System.out.println(task + (++count));
        //8.Создать переменную float ff и присвоить ей значение выражения 10 / 3.
        //Создать переменную double dd и присвоить ей значение выражения 10 / 3.
       // Добиться максимальной точности начений вычислений и распечатать результаты.


        float ff = (float) (10 / 3);
        double dd1 = (double) (10 / 3);
        System.out.println(ff);
        System.out.println(dd1);

        System.out.println(line);
        System.out.println(task + (++count));

        //9. Создать переменные типа Float:
        //floatSum
        //floatSub (substraction)
        //floatProduct
        //floatQuotient
        //floatRemainder
       // и  присвоить им значения, вычисленные с помощью переменных f и ff.

        float f4 = 42;
        float ff4 = 6;
        float floatSum = f4 + ff4;
        float floatSub = f4 - ff4;
        float floatProduct = f4 * ff4;
        float floatQuotient = f4 / ff4;
        float floatRemainder = f4 % ff4;
        System.out.println(floatSum);
        System.out.println(floatSub);
        System.out.println(floatProduct);
        System.out.println(floatQuotient);
        System.out.println(floatRemainder);

        System.out.println(line);
        System.out.println(task + (++count));
        //10.Создать переменные типа double:
        //doubleSum
        //doubleSub
        //doubleProduct
        //doubleQuotient
        //doubleRemainder
        // и  присвоить им значения, вычисленные с помощью переменных d и dd.
        double d4 = 42;
        double dd4 = 6;
        double doubleSum1 = d4 + dd4;
        double doubleSub1 = d4 - dd4;
        double doubleProduct1 = d4 * dd4;
        double doubleQuotient1 =d4 / dd4;
        double doubleRemainder1 =d4 % dd4;
        System.out.println(doubleSum1);
        System.out.println(doubleSub1);
        System.out.println(doubleProduct1);
        System.out.println(doubleQuotient1);
        System.out.println(doubleRemainder1);


        //11.Распечатать результаты вычислений заданий 8 - 10 в виде таблицы:
        System.out.println(line);
        System.out.println(task + (++count));

        String line10 = "_____________________________________________________________________\n";

        System.out.println(line10);
        String vLine10 = "\t|\t";

        System.out.println( " | " + "\tf = ..." + vLine10 + "\tff = ..." + vLine10 + "\td = ..."
                + vLine10 + "\tdd = ..." + vLine10 + "\n");

        System.out.println(line10);
        System.out.println(" |" + "\tfloatSum = " + floatSum + "\t\t\t\t" + " | " + "doubleSum = " + doubleSum1 + "\t\t\t" + " \t\t| " + "\n"
        + " |" + "\tfloatSub = " + floatSub + "\t\t\t\t" + " | " + "doubleSub = " + doubleSub1+ "\t\t\t" + " \t\t| " + "\n"
        + " |" + "\tfloatProduct = " + floatProduct + "\t\t" + " | " + "doubleProduct = " + doubleProduct1 + "\t\t" + " \t| " + "\n"
        + " |" + "\tfloatQuotient = " + floatQuotient + "\t\t\t" + " | " + "doubleQuotient = " + doubleQuotient1+ "\t\t\t" + " \t| " + "\n"
        + " |" + "\tfloatReminder = " +  floatRemainder + "\t\t\t" + " | " + "doubleRemainder = " + doubleRemainder1 + "\t\t" + " \t| " + "\n");
        System.out.println(line10);

        System.out.println(line);
        System.out.println(task + (++count));

        //12.Распечатать слова HELLO JAVA точками (чтобы получился рисунок точками)

        System.out.println("\t*-----*--******--*------*-------******---------*------*-------*--------*------*----\n"
                         + "\t*-----*--*-------*------*-------*----*---------*-----*--*------*------*------*--*---\n"
                        + "\t*******--*****---*------*-------*----*---------*----******------*----*------******--\n"
                         + "\t*-----*--*-------*------*-------*----*-----*---*---*------*------*--*------*------*-\n"
                        + "\t*-----*--******--*****--*****---******------****--*--------*-------*------*--------*\n");// option 1
//        String dot ="$";
//        String dots = dot + dot + dot + dot + dot + dot + dot;
//        System.out.println("\tdot-----dot--dots--dot------dot-------dots---------dot------dot-------dot--------dot------dot----\n"
//                + "\tdot-----dot--dot-------dot------dot-------dot----dot---------dot-----dot--dot------dot------dot------dot--dot---\n"
//                + "\tdots--dots---dot------dot-------dot----dot---------dot----dots------dot----dot------dots--\n"
//                + "\tdot-----dot--dot-------dot------dot-------dot----dot-----dot---dot---dot------dot------dot--dot------dot------dot-\n"
//                + "\tdot-----dot--dots--dots--dots---dots------****--dot--------dot-------dot------dot--------dot\n");

        System.out.println(line);
        System.out.println(task + (++count));
        //13.Создать переменные подходящего ссылочного типа данных(выбирать минимально достаточный диапазон значений):

        Byte t1 = 0;
        Short t2 = 150;
        Byte t3 = -120;
        Float t4 = -505.505F;
        Integer t5 = 100100;
        Long t6 = 100010001000L;
        Double t7 = 2.66666666666666;
        Float t8 = -1000000.001F;
        Short t9 = 1010;

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
        System.out.println(t6);
        System.out.println(t7);
        System.out.println(t8);
        System.out.println(t9);

        System.out.println(line + "______________________________________________________");
        System.out.println(task + (++count));
        //14.С помощью полей классов ссылочного типа распечатать таблицу:

        String line3 = "--------------------------------------------------------------------------------------------------------";
        System.out.println("| Type\t\t| Size in bits\t| min\t\t| max\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
        System.out.println(line3);
        System.out.println("| byte\t\t| 8\t\t\t\t| -128\t\t\t\t\t| 127\t\t\t\t\t\t\t\t\t\t\t\t|\n");
        System.out.println(line3);
        System.out.println("| short\t\t| 16\t\t\t| -32768\t\t\t\t| 32767\t\t\t\t\t\t\t\t\t\t\t\t|\n");
        System.out.println(line3);
        System.out.println("| int\t\t| 32\t\t\t| -2147483648\t\t\t| 2147483647\t\t\t\t\t\t\t\t\t\t|\n");
        System.out.println(line3);
        System.out.println("| long\t\t| 64\t\t\t| -9223372036854775808\t| 9223372036854775807\t\t\t\t\t\t\t\t|\n");
        System.out.println(line3);
        System.out.println("| float\t\t| 32\t\t\t| +/-1.4E-45\t\t\t| +/-3.4028235E+38,+/- infinity,+/-0,NAN\t\t\t|\n");
        System.out.println(line3);
        System.out.println("| double\t|64\t\t\t\t| +/-4.9E-324\t\t\t| +/-1.7976931348623157E+308, +/-infinity, +/-0,NaN |\n");

        System.out.println(line +  "______________________________________________________");
        System.out.println(task + (++count));
        //15.Создать 2 переменные референсного типа Integer - num1 и num2, присвоить им одинаковые значения,
        // сравнить 2 переменные друг с другом с помощью метода .equals(). Вывести результат сравнения на печать в виде
        // выражения: “Если num1 равно  num2, то результат сравнения методом .equals() = …”
        //Присвоить переменным разные значения, сравнить,  и вывести результат на печать:
        //“Если num1 не равно num2, то результат сравнения методом .equals() = …

        Integer num1 = 15;
        Integer num2 = 15;
        System.out.println("Если num1 равно num2, то результат сравнения методом equals() = " + num1.equals(num2));//true

        num2 = 20;
        System.out.println("Если num1 не равно num2, то результат сравнения методом equals() = " + num1.equals(num2));

        System.out.println(line);
        System.out.println(task + (++count));
        //16.Создать 2 переменные примитивного типа int - number1 and number2. Инициализаровать их
        //а) одинаковыми значениями
        //b) number1 < number2
        //c) number1 > number2
        //сравнить их подходящим методом класса Integer (посмотрите, какой метод подойдет - не equals() !),
        // и вывести результаты сравнения на печать в виде выражений:
        //“Если number1 = number2, то результат сравнения методом … = …”
        //“Если number1 < number2, то результат сравнения методом … = …”
        //“Если number1 > number2, то результат сравнения методом … = …”




        System.out.println(line);
        System.out.println(task + (++count));





    }
}
