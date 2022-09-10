package weather;

public class Weather {
    public static void main(String[] args){

        /*Celsius  " \u2103"
        Fahrenheit  " \u2109"
        Kelvin " \u212A"
        Romer " \u00B0R"
        degree (circle sign) \u00B0
        emoji   "\uD83D\uDE00"*/

        System.out.println("*********** Forecast today ******************************");
 String country = "USA";
 String state = "Texas";
 String day = "Fri";
 String date = "Sep 09";
 String tempDay =  "28\u00b0C" ;
 String tempNight =  "14\u00b0C" ;
 String description = "Overcast clouds. Light breeze";

System.out.println(country + "," + state + "\n" + day  + "," + date + "\t\t"+ tempNight + "/" + tempDay + "\n" + description);
        System.out.println("*********** Forecast tomorrow ******************************");

        String country1 = "USA";
        String state1 = "Texas";
        String day1 = "Sat";
        String date1 = "Sep 10";
        String tempDay1 =  "25\u00b0C" ;
        String tempNight1 =  "10\u00b0C" ;
        String description1 = "Rain whole day";

        System.out.println(country + "," + state1 + "\n" + day1  + "," + date1 + "\t\t"+ tempNight1 + "/" + tempDay1 + "\n" + description1);


    }
}
/*В проекте JavaForBeginners05 создайте пакет weather. Затем создайте необходимый класс, переменные, и выведите на печать
 *текущую погоду
 *погоду на завтра
 * в любом городе.
 *(Желательно использовать сайт https://openweathermap.org/ для поиска данных)
*/
