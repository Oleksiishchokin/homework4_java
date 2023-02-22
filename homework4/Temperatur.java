package homework4;

public class Temperatur {
    public static void main(String[] args) {
        int temperature1 = 110;
        int temperature2 = 90 ;
        boolean workCorrect= (temperature1 > 100 && temperature2 < 100);
        chek(temperature1,temperature2);


        }
        public static void chek(int temperature1,int temperature2){
        if (temperature1 > 100 && temperature2 < 100){
            System.out.println("Прибор работает корректно");
        }else {
            System.out.println("Прибор работет НЕ корректно");
        }


        }

    }


