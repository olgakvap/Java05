package homework;

public class HW5 {
    static int tcNumber = 1;

    //Вспомогательные методы для печати отчета тестирования
    public static void printTCNumber() {
        System.out.print("TC_" + tcNumber++  + "\t -- \t");
    }

    public static void printTestResult(String value) {
        System.out.print(value);
        System.out.println();
    }
//    Cоздать метод verifyEquals(expectedResult, actualResult) {}
//    так, как мы делали на уроке. Попробуйте написать его самостоятельно, и потом свериться с кодом с урока.

    public static int busketOfFuits(int apple){
        if(apple > 25){
            return apple;
        }else{
            return 0;
        }
    }

    // Написать метод, который принимает на вход число от 1 до 7  и возвращает день недели. Протестировать метод

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

    public static String verifyEquals(int expectedResult, int actualResult) {
        if(expectedResult == actualResult) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static String verifyEquals(String expectedResult, String actualResult) {
        if(expectedResult.equals(actualResult)) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static String verifyEquals(double expectedResult, double actualResult) {
        if(expectedResult == actualResult) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {//tests
        //TC1
        int num =25;
        String expectedResult = "apple";
        String actualResult = String.valueOf(busketOfFuits(num));
        verifyEquals(expectedResult,actualResult);

        printTCNumber();
        printTestResult(verifyEquals(expectedResult,actualResult));

        //TC2
       int num1 = 2;
       String expectedResult1 = "Tuesday";
       String actualResult1 = returnDay(num1);
        verifyEquals(expectedResult1,actualResult1);

        printTCNumber();
        printTestResult(verifyEquals(expectedResult,actualResult));


           }



}
