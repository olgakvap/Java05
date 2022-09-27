package lessons;
/*13.выведи таблицу с матем значениями*/

public class Lesson3 {
    // public static void methodName(){
    //}
    //
    //public static void methodName(type argsName,type argsName ){
    //}
    static String firstLine = "\t_________________________________________________________________________________\n";
    static String vLine = "\t|\t";
    static String endLine = "\t|";
    static String tab = "\t";

    public static void printLine() {
        System.out.println("\t_________________________________________________________________________________\n");
    }
    public static void print(String l) {
        System.out.println(l);
    }


    public static void main(String[] args) {
        String hi = "Hello!";

        printLine();
        print(firstLine);
        print("Task #");
        print(hi);

        int k = 5;
        int l = 2;
        int m = 7;
        String firstLine = "\t_________________________________________________________________________________\n";
        String vLine = "\t|\t";
        String endLine = "\t|";
        String tab = "\t";

        int oldK = k;

        System.out.println(
                firstLine
                        + vLine + tab
                        + vLine + "+10"
                        + vLine + "-5"
                        + vLine + "*100"
                        + vLine + "/2"
                        + vLine + "%2"
                        + vLine + "^2"
                        + vLine + "++"
                        + vLine + "--"
                        + endLine
        );

        System.out.print(
                firstLine
                        + vLine + "k = " + k
                        + vLine + (k + 10)
                        + vLine + (k - 5)
                        + vLine + (k * 100) + tab
                        + vLine + (k / 2)
                        + vLine + (k % 2)
                        + vLine + (k * k++)//^2
                        + vLine + (k--)
        );


        k--;

        System.out.println(vLine + k + endLine);

        k = l;

        System.out.print(
                firstLine
                        + vLine + "l = " + l
                        + vLine + (k + 10)
                        + vLine + (k - 5)
                        + vLine + (k * 100) + tab
                        + vLine + (k / 2)
                        + vLine + (k % 2)
                        + vLine + (k * k++)//^2
                        + vLine + (k--)

        );
        k--;

        System.out.println(vLine + k + endLine);

        k = m;

        System.out.print(
                firstLine
                        + vLine + "m = " + m
                        + vLine + (k + 10)
                        + vLine + (k - 5)
                        + vLine + (k * 100) + tab
                        + vLine + (k / 2)
                        + vLine + (k % 2)
                        + vLine + (k * k++)//^2
                        + vLine + (k--)

        );
        k--;
        System.out.println(vLine + k + endLine + "\n" + firstLine);



        Object obj = new Object();

        Integer i = new Integer(8);
        Integer i1 = 8;
        // Integer i2 = new Integer("a");
        Integer i3 = new Integer("12");
        Integer i4;
        Object i5 = new Integer(5);

        Object i6 = 6;

        //Не работает! потому что в i2 лежит буква
        //Integer sum = i2 + i1;
        //System.out.println(sum);

        System.out.println(i3);

        Integer sum = i1 + i3;
        System.out.println(sum);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(i3.MIN_VALUE);

        System.out.println(i3.compareTo(i1));

        System.out.println(Integer.bitCount(i3));

        System.out.println(Integer.compare(i3, i1));

        System.out.println(Integer.max(i3, i1));

        System.out.println(Integer.min(i3, i1));

    }
};
