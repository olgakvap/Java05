package lessons;

public class Student {
        public static void main(String[] args){
            System.out.println("______________Student # 1 ________________________________");
            int age = 10;

            String firstName = "Vova";
            String lastName = "Sidorov";
            String subject = "Student 5th grade";

            System.out.println("First name: " + firstName + "\n" +
                    "Last name: \t" + lastName + "\n" +
                    "Subject: \t" + subject + "\n" +
                    "Age: \t\t" + age + " y.o.");


            System.out.println("_____________Student # 2 _________________________________");

            int age1 = 14;
            String firstName1 = "Masha";
            String lastName1 = "Semenova";
            String subject1 = "Student 9th grade";

            System.out.println("First name: " + firstName1 + "\n" +
                    "Last name: \t" + lastName1 + "\n" +
                    "Subject: \t" + subject1 + "\n" +
                    "Age: \t\t" + age1 + " y.o.");
            System.out.println("______________________________________________");

        }
    };
/*В классе Student cоздать 2 “объекта”:
 *Ученик 5-го класса Вова Сидоров, 10 лет
 *Ученица 9-го класса Маша Семенова, 14 лет
*/

