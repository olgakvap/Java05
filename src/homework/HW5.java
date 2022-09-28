package homework;

public class HW5 {
    static int tcNumber = 1;
    static int k = 3;
    static int l = 13;
    static int m = 30;
    static int n = 300;

    //Вспомогательные методы для печати отчета тестирования
    public static void printTCNumber() {
        System.out.print("TC_" + tcNumber++ + "\t -- \t");
    }

    public static void printTestResult(String value) {
        System.out.print(value);
        System.out.println();
    }

    //Методы, которые сравнивают expectedResult с actualResult
    public static String verifyEquals(int expectedResult, int actualResult) {//int
        if (expectedResult == actualResult) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static String verifyEquals(String expectedResult, String actualResult) {//string
        if (expectedResult.equals(actualResult)) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static String verifyEquals(double expectedResult, double actualResult) {//double
        if (expectedResult == actualResult) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

//    1.Cоздать метод verifyEquals(expectedResult, actualResult) {}
//    так, как мы делали на уроке. Попробуйте написать его самостоятельно, и потом свериться с кодом с урока.

    public static int findMaxOfTwo(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    //2. Написать метод, который принимает на вход число от 1 до 7  и возвращает день недели. Протестировать метод

    public static String returnDay(int weekDay) {//methods
        if (weekDay > 0 && weekDay < 8) {
            if (weekDay == 1) {
                return "Monday";
            } else if (weekDay == 2) {
                return "Tuesday";
            } else if (weekDay == 3) {
                return "Wednesday";
            } else if (weekDay == 4) {
                return "Thursday";
            } else if (weekDay == 5) {
                return "Friday";
            } else if (weekDay == 6) {
                return "Saturday";
            } else if (weekDay == 7) {
                return "Sunday";
            }

        }
        return "Error";
    }

    //3. Написать алгоритм вычисления среднего возраста в семье из 3х человек.Например,
    //age1 = 20,
    //age2 = 40,
    //age3 = 60
    //Average = 40.
    //Протестируйте алгоритм на позитивные и негативные сценарии.
    public static int averageAgeOfThreeInFamily(int dad, int mom, int child) {
        if(dad > 0 && dad <150 && mom > 0 && mom < 150 && child > 0 && child < 150){
            int result = (dad + mom + child) / 3;
            return result;
        }
        return -1;
    }

    //4.Найти минимальное  значение, используя переменные (по одному методу на каждый вариант)
    //k и l
    //k, l, m
    //k, l, m, n
    //	Переменные должны быть типа int
    //	Happy path test data:
    //if k = 3, l = 30, m = 300, n = 3000
    //expected results:
    //a) 3
    //b) 3
    //c) 3
    //Написать тесты на каждый метод.
    public static int findMin(int k, int l) {
        return Math.min(k, l);
    }

    public static int findMinOfThree(int k, int l, int m) {
        int min = findMin(k, l);
        if (min > m) {
            min = m;
            return min;
        }
        return min;
    }

    public static int findMinOfFour(int k, int l, int m, int n) {
        int min = findMinOfThree(k, l, m);
        if (min > n) {
            min = n;
        }
        return min;
    }

//          5.  Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота. Метод принимает и возвращает значения типа double.
//            t1 = 39
//            t2 = 39
//            t3 = 39
//            t4 = 39
//            t5 = 39
//            TempAverage = 39
//
//            Не забудьте, что температура тела ЖИВОГО кота имеет определенные границы. Значения, которые не входят
//            в эти границы считаем невалидными и выдаем ошибку. В случае невалидного значения хотя бы одной из входящих
//            температур, метод возвращает -1.
//
//            Согласно документации клиента https://vetna.info/bolezni/koshki/ponizhennaya-temperatura-u-kota/
//            https://junglevet.ru/stati/povyshenie-temperatury-tela-u-koshki/
//            кот все еще жив при температурах от 28С до 41С.
//            По статистике клиента, некоторые коты могут быть все еще живы при температурах от 25С до 45 С
//            Протестируйте метод на позитивные и негативные сценарии.
    public static double normalTempOfCat(double temp1, double temp2, double temp3, double temp4, double temp5) {
        if (temp1 >= 25.0 && temp1 <= 45.0 && temp2>= 25.0 && temp2 <= 45.0 && temp3 >= 25.0 && temp3 <= 45.0
                && temp4 >= 25.0 && temp4 <= 45.0 && temp5 >= 25.0 && temp5 <= 45.0) {
            double averageTemp = (temp1 + temp2 + temp3 +temp4 + temp5)/5;
            return averageTemp;
        }
        return -1;
    }

    //6.Написать метод, который принимает на вход количество часов (int) работы в день, стоимость одного часа работы
    // в десятичном числе, и возвращает заработную плату в месяц в целых единицах.При невалидных значениях метод возвращает -1.
    //Уточнения:
    //Стоимость одного часа для разных сотрудников может быть разная. Данные о зарплате сотрудников мы не разглашаем.
    // НО наши сотрудники не работают бесплатно и не выплачивают компании долги за право работать. Зарплата сотрудников
    // рассчитывается согласно законодательства штата.
    //Страна = RedRover.school
    //Штат = Java for beginers
    //По законодательству нашего штата минимальная оплата рабочего часа - 12.
    //В организации нет сотрудников у которых  сокращенная рабочая неделя ( несовершеннолетние, инвалиды, вредные
    // условия труда  ) , но сотрудники могут выбирать, сколько часов в день они могут работать. Овертайм оплачивается по обычной ставке.
    //ПО уточненным требованиям:
    //Будем считать, что в нашей организации вот этот документ определяет Среднемесячную норму рабочего времени
    // https://clubtk.ru/srednee-kolichestvo-rabochikh-dney-v-mesyatse
    //Но среднемесячная норма не означает, что нельзя работать больше 8 часов в день.
    // Протестируйте метод на позитивные и негативные сценарии.
    public static int salaryCalculation(int workHours, double salaryRangePerHour){
        if(workHours <=160 && salaryRangePerHour >=12){
            int salary = (int) (workHours * salaryRangePerHour);
            return salary;
        }else{
            return -1;
        }
    }
    //7.Написать метод, который принимает на вход 2 параметра -  цену и количество товара (количество в штуках).
    // Алгоритм возвращает сумму покупки в виде десятичного числа.
    //price for 1 = 25 руб 50 коп (25.5)
    //amount = 5
    //expected total = 127 руб 50 коп (127.5)
    //При невалидных значениях метод возвращает -1
    // ПРоверьте метод на позитивный и негативный сценарий.
    public static double purchaseAmount(double price,int quantity){
        if(price > 0 && quantity > 0){
            double totalPurchase = price * quantity;
            return  totalPurchase;
        }else{
            return -1;
        }
    }

//  8.Написать метод, который принимает на вход необходимые параметры и возвращает строку ведомости выдачи зарплаты сотрудникам.
//“Смирнова Мария Ивановна 		70000 руб 00 коп”
//если имя сотрудника придет в виде пустой строки или в виде null (String -  это референсный тип данных и может
// принимать значение null), то в ведомости должна быть распечатана пустая строка "".
//Если же на вход придет невалидное данное по зарплате, или зарплата будет рассчитана, как 0, то в ведомости тоже
// должна быть распечатана пустая строка ""
//Протестировать метод.
//    public static String getListOfStaff(String name, double salary){???
//        int dollars = (int) salary;
//        int cents =(int) (salary - dollars);
//        String result = name + "";
//        if(salary > 0 && name != ""){
//            return result;
//        }
//        return null;
//    }
//    public static String getListOfStaff(String name, double salary){?????
//        int rub = (int) salary;
//        int kop =(int) (salary - rub);
//        String result = "";
//        if(kop > 9){
//            result = name + rub + "руб " + kop + "коп";
//        }else{
//            result = name + rub + "руб " + " 0" + kop + "коп";
//        }
//        return result;
//    }

    //10.Записать в виде метода и протестировать:
    //дано int x






        public static void main (String[]args){//auto tests

            //TC1
            //A - arrange (declare all variables we have)
            int a = 5;
            int b = 9;
            double expectedResult = 9;
            // A - act (call methods to receive actual result)
            double actualResult = findMaxOfTwo(a, b);//вызвали метод
            // A - assert (compare results expectedResult /actualResult  and report if the test pass or fail
            verifyEquals(expectedResult, actualResult);

            printTCNumber();
            // report pass or fail
            printTestResult(verifyEquals(expectedResult, actualResult));

            //TC2
            int num1 = 2;
            String expectedResult2 = "Tuesday";
            String actualResult2 = returnDay(num1);
            verifyEquals(expectedResult2, actualResult2);

            printTCNumber();
            printTestResult(verifyEquals(expectedResult, actualResult));

            //TC3
            int dad = 60;//0-150 age range
            int mom = 40;
            int child = 20;
            expectedResult = 40;
            actualResult = averageAgeOfThreeInFamily(dad, mom, child);
            verifyEquals(expectedResult, actualResult);

            printTCNumber();
            printTestResult(verifyEquals(expectedResult, actualResult));

            //TC4

            expectedResult = 3;
            actualResult = findMin(k, l);
            verifyEquals(expectedResult, actualResult);//2

            printTCNumber();
            printTestResult(verifyEquals(expectedResult, actualResult));


            expectedResult = 3;
            actualResult = findMinOfThree(k, l, m);//3


            printTestResult(verifyEquals(expectedResult, actualResult));


            expectedResult = 3;
            actualResult = findMinOfFour(k, l, m, n);//4

            printTestResult(verifyEquals(expectedResult, actualResult));

            //TC5
            double t1 = 39;
            double t2 = 39;
            double t3 = 39;
            double t4 = 39;
            double t5 = 39;
            expectedResult = 39;
            actualResult = normalTempOfCat(t1,t2,t3,t4,t5);
            verifyEquals(expectedResult, actualResult);

            printTCNumber();
            printTestResult(verifyEquals(expectedResult, actualResult));

            //TC6
            int workHours = 100;
            double salaryRange = 15;
            expectedResult = 1500;
            actualResult = salaryCalculation(workHours,salaryRange);
            verifyEquals(expectedResult,actualResult);

            printTCNumber();
            printTestResult(verifyEquals(expectedResult, actualResult));

            //TC7
            double price = 25.50;
            int quantity = 5;
            expectedResult = 127.5;
            actualResult = purchaseAmount( price, quantity);
           verifyEquals(expectedResult,actualResult);

            printTCNumber();
            printTestResult(verifyEquals(expectedResult, actualResult));

            //TC8
         String name = "Смирнова Мария Ивановна";
         double dollars = -2;
         double cents = 0;
         expectedResult2 = name + dollars + "руб" + cents +  "коп";
         actualResult2 = getListOfStaff(name,dollars);
         verifyEquals(expectedResult2, actualResult2);

            printTCNumber();
            printTestResult(verifyEquals(expectedResult, actualResult));




        }
    }

