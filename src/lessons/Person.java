package lessons;

public class Person {
    public static void main(String[] args){

        int yob = 1990;
        String one = "Если человек родился в ";
        String two = "году, то его возраст - разница между 2022 и ";
        System.out.println(one + yob + two + yob);

        int yob1 = 1980;
        System.out.println("Если человек родился в " + yob1 + "году, то его возраст 2 года назад - разница между 2020 и " + yob1);
    }
}
/*В классе Person создать переменную yob (year of birth), присвоить ей значение (любое, например, 1990) и вывести на печать сообщение:
 *“Если человек родился в 1990 году, то его возраст - разница между 2022 и 1990”.
 *Значение 1990 должно выводиться в виде переменной, вы не должны его печатать цифрами. Остальные слова вы должны распечатать в виде текста.
 *Присвойте новое значение переменной yob и выведите на печать фразу:
 *“Если человек родился в … году, то его возраст 2 года назад - разница между … и …”.
*/