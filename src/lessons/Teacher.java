package lessons;

public class Teacher {

    public static void main(String[] args){

//        System.out.println("First name: Maria, " +
//                "Middle name: Ivanovna, " +
//                "Last name: Petrova");

//        System.out.println("First name: Maria");
//        System.out.println("Middle name: Ivanovna");
//        System.out.println("Last name: Petrova");

//        System.out.println("First name: Maria,\n" +
//                "Middle name: Ivanovna,\n" +
//                "Last name: Petrova\n");
//        System.out.println("First name: Maria,\n" +
//                "Middle name: Ivanovna,\n" +
//                "Last name: Petrova\n" +
//                "Age: 35 y.o.\n" +
//                "Subject: Russian Literature"
//        );

        //-------create object------
        System.out.println("***********Teacher # 1 ***************************************");
        int age = 35;

        String firstName = "Maria";
        String middleName = "Ivanovna";
        String lastName = "Petrova";
        String subject = "Russian Literature";

        System.out.println("First name: \t" + firstName + " \n" +
                "Middle name: \t" + middleName + " \n" +
                "Last name: \t\t" + lastName + " \n" +
                "Age: \t\t\t" + age + " y.o.\n" +
                "Subject: \t\t" + subject
        );
        System.out.println("**********Teacher # 2 ****************************************");
          int age1 = 55;

          String firstName1 = "Ivan";
          String middleName1 = "Petrovich";
          String lastName1 = "Serebryakov";
          String subject1 = "Math";

          System.out.println("First name: \t" + firstName1 + "\n" +
                  "Middle name: \t" + middleName1 + "\n" +
                  "Last name: \t\t" + lastName1 + "\n" +
                  "Subject: \t\t" + subject1 + "\n" +
                  "Age: \t\t\t" + age1 + " y.o.");

        System.out.println("**************************************************");


   }
};
