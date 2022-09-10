package homework;

public class HW2 {

    public static void main(String[] args){

//        int boxOfCandies = 4;
//        int weightForOneBoxOfCandies = 9;
//        int boxOfCookies = 3;
//        int weightForOneBoxOfCookies = 8;
//
//        int weightForAllBoxes = boxOfCandies * weightForOneBoxOfCandies
//                + boxOfCookies * weightForOneBoxOfCookies;
//
//        System.out.println("Total weight for all boxes of candies and cookies: " + weightForAllBoxes + " kg");

        String line = "___________________________________________________";
        String task = "Task # ";
        int count = 3;

        /*4.Создать целочисленные переменные x, y, z и присвоить им любые значения (на ваше усмотрение)
        Вывести значения переменных в столбик
        Вывести значения переменных в строку
        Вывести значения этих переменных так, чтобы было понятно, какое значение к какой переменной относится.
        */

        System.out.println(line);
        System.out.println(task + (++count));

        float x = 12;
        float y = 45;
        float z = 32;
        String subTask = "a.";
        String subTask1 = "b.";
        String subTask2 = "c.";

        System.out.println(subTask + x );
        System.out.println("  " + y);
        System.out.println("  " + z);

        System.out.println(subTask1 + x + "," + y + "," + z);

        System.out.println( subTask2 + "float x = " + x);
        System.out.println( "  float y = " + y);
        System.out.println( "  float z = " + z);

        System.out.println(line);
        System.out.println(task + (++count));


       /*5. Используя конкатенацию, вывести в строку через запятую значения переменных из задания 4
        Пример вывода:
        5, 10, 15
       */

        System.out.println(line);
        System.out.println(task + (++count));
       /*6. Распечатать следующие выражения, где вместо … будет выведен результат арифметической операции:
        Sum of x and y = …
        x * z = …
        Разность переменных y и z = …
        */

        float sumXY = x + y;
        float mulXZ = x * z;
        float diffYZ = y - z;
        System.out.println(sumXY);
        System.out.println(mulXZ);
        System.out.println(diffYZ);

        System.out.println(line);
        System.out.println(task + (++count));

        /*7.Создать переменные apple и student и присвоить им значения 40 и 6 соотетственно. Распечатать выражение,
        где вместо … - результаты математических вычислений:
        Если … яблок поделить на … учеников, то каждый ученик получит по … яблок(a), и … яблок(а) останется учителю.
        */

        int apple = 40;
        int student = 6;

        System.out.println("Если " + apple + " яблок поделить на " + student + " учеников, то каждый ученик получит по "
                + apple / student + " яблок(а), и " + apple % student + " яблок(а) останется учителю.");


        System.out.println(line);
        System.out.println(task + (++count));

        /*8.Распечатать выражение из задания 7 со значениями 100 и 21 соответственно.*/

        apple = 100;
        student = 21;

        System.out.println("Если " + apple + " яблок поделить на " + student + " учеников, то каждый ученик получит по "
                + apple / student + " яблок(а), и " + apple % student + " яблок(а) останется учителю.");


        System.out.println(line);
        System.out.println(task + (++count));

        /*9.В столовую привезли 6 кг лимонов, яблок на 24 кг больше,чем лимонов,а груш на 12 кг меньше чем яблок.
        Сколько кг фруктов привезли в столовую?
         */
        int lemon = 6;
        int apple2 = lemon + 24;
        int pear = (lemon + 24) - 12;
        int total = lemon + apple2 + pear;

        System.out.println(total + " килограммов фруктов привезли в школьную столовую.");

        System.out.println(line);
        System.out.println(task + (++count));

        /*10.У сороконожки заболели ножки:8 ноют,5 гудят,7 хромают,2 болят.Помоги сороконожке посчитать здоровые ножки.
         Ответ: …
         */

        int centipede = 40;
        int ache = 8;
        int ache2 = 5;
        int ache3 = 7;
        int ache4 = 2;
        int totalAchedLegs = ache + ache2 + ache3 + ache4;
        int totalHealthLegs = centipede - totalAchedLegs;

        System.out.println("Ответ: " + totalHealthLegs);

        System.out.println(line);
        System.out.println(task + (++count));

        /*11.Во сколько раз 35 больше чем 7. Во сколько раз 8 меньше 48.На сколько 54 больше чем 6
         */

        int res = 35 / 7;
        int res2 = 48 / 8;
        int res3 = 54 - 6;

        System.out.println("В " + res + " раз 35 больше, чем 7" );
        System.out.println("В " + res2 + " раз 8 меньше, чем 48" );
        System.out.println("На " + res3 + " раз 54 больше, чем 6" );

        System.out.println(line);
        System.out.println(task + (++count));

        /*12.a. почему число 48 кратно 8
             b. что оба числа - четные.
             c. что числа 47 и 49 - нечетные.
             d. только одно из всех чисел кратно 7
         */
        String subTask3 = "a.";
        String subTask4 = "b.";
        String subTask5 = "c.";
        String subTask6 = "d.";

        System.out.println(subTask3 + " Потому что число 48 делится на 8 без остатка");
        System.out.println(subTask4 + " Потому что оба числа делятся на число 2 без остатка");
        System.out.println(subTask5 + " Потому что оба числа не делятся на число 2 без остатка");
        System.out.println(subTask6 + " Потому что 47 делится на 7 с остатком,а 49 делится на 7 без остатка");


        System.out.println(line);
        System.out.println(task + (++count));

        /*13.выведи таблицу с матем значениями*/

        System.out.printf("---------------------------------------------------%n");
        System.out.println("| +10 | -5 | *100 | /2 | %2 | ^2 | ++ | -- |");
        System.out.println(line);
        System.out.println("| k=5 | 15 | 0 | 500 | 2.5 | 1 | 25 | 6 | 5 |");
        System.out.println(line);
        System.out.println("| l=2 | 12 | -3 | 200 | 1 | 0 | 4 | 3 | 2 |");
        System.out.println(line);
        System.out.println("| m=7 | 17 | 2 | 700 | 3.5 | 1 | 49 | 8 | 7 |");
        System.out.println(line);



        System.out.println(line);
        System.out.println(task + (++count));

        /*14. Вычислить результат: xⁿ((5x + 7y) / (8x + 10y)) / ((3x - y)/(x + y))*/

         x = 7;
         y = 18;

        System.out.println(" If\n x = 7\n y = 18\n n = 3\n then\n xⁿ((5x + 7y) / (8x + 10y)) / ((3x - y)/(x + y)) = "
        +  x * x * x * ((5 * x + 7 * y) / (8 * x + 10 * y)) / ((3 * x - y) / (x + y)));

        System.out.println(line);
        System.out.println(task + (++count));

        /*15.В мастерской за 5 дней сшили 15 костюмов, поровну за каждый день.
        За сколько дней при той же ежедневной выработке сошьют 69 костюмов?
         */

        int result = 5 * 69 / 15;

        System.out.println("Ответ: " + "За " + result + " дня сошьют 69 костюмов");

        System.out.println(line);
        System.out.println(task + (++count));

        /*16.Декларировать и инициализировать переменные a, b, c. Распечатать выражение и результаты вычислений:
        Сумма чисел a, b, c++ и sumABC-- = …, а разность b++ и  sumCBA = …
        */

        int a = 11;
        int b = 7;
        int c = 3;
        int sumABC = a + b + c;

        System.out.println("Сумма чисел a, b, c++ и sumABC-- = " + ((a + b + c++ )+ sumABC--));
        System.out.println("Pазность b++ и sumCBA = " + (++b - sumABC));


        System.out.println(line);
        System.out.println(task + (++count));


        /*17.вычислить выражения: (x+3)^2*/
        System.out.println("Ответ: x = " + (x + 3) * (x + 3));

        System.out.println(line);
        System.out.println(task + (++count));
        /*18. Решить уравнение
         */
        System.out.println((3 + 4 * x) / 5 - (10 * (y - 5 ) * (a + b + c )) / x + 9 * (4 / x + (9 + x) / y));

        System.out.println(line);
        System.out.println(task + (++count));
        /*19.Решить уравнение*/

        int d = 55;
        System.out.println((((5 * x + 7 * y) / (8 * x + 10 * y)) / ((3 * x - y) / (x + y)))
                / (a + b + c / d + (a + b) / (c + d) + a * b));

        System.out.println(line);
        System.out.println(task + (++count));

        /*20.Ввести в программу формулу конвертации температур C° -> F°. Найти на сайте https://openweathermap.org/
        температуру в любом городе, и проверьте, соответствует ли температура в С и F вашим расчетным значениям
        (использовать только int)*/

        int degreeC = 25;
        int degreeF = degreeC * 2 + 30;
        System.out.println( "Если температура С = " + degreeC + "\u2103 " + ", то F = " + degreeF + "\u2109" + "\uD83D\uDE00");

        System.out.println(line);
        System.out.println(task + (++count));

    }
}
