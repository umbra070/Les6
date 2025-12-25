//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //Ex2 variables
    static int distance = 0;
    static int distanceForFinish = 42195;
    //Ex3 variables
    static int dayForNotPay = 5;
    static int coastPerDay = 100;
    static int balance = 6137;
    static int daysForParking = 1;
    static final int startBalance = 6137;
    //Ex4 Variables
    static int month = 0;
    static float total = 0f;
    static float finalBalance = 12000000.0f;
    static float moneyPerMonth = 15000.0f;
    static float halfYearPercent = 7.0f;
    //Ex5 Variables
    static int startCharge = 20;
    static int charge = startCharge;
    static int minute = 0;
    static int overheads = 0;
    static int maxOverheads = 3;
    static int chargingPerMinute = 2;

    public static void main(String[] args) {
        //Ex1
        System.out.println("\n\rEx1\n\r");
        int firstFriday = 1;
        for(int i = firstFriday; i <= 31; i++){
            if((i - firstFriday)%7 == 0){
                System.out.println(String.format("Сегодня пятница, %d-е число. Необходимо подготовить отчет", i));
            }
        }
        //Ex2v1
        System.out.println("\n\rEx2v1\n\r");
        int i = 0;
        do{
            distance += 500;
            System.out.println(String.format("Держитесь! Осталось %d метров(сообщение %d)", distanceForFinish-distance, i++));
        }while (distance <= distanceForFinish);
        //Ex2v2
        System.out.println("\n\rEx2v2\n\r");
        i = 0;
        distance = 0;
        for(;distance <= distanceForFinish; distance += 500){
            System.out.println(String.format("Держитесь! Осталось %d метров(сообщение %d)", distanceForFinish-distance, i++));
        }
        //Ex3v1
        System.out.println("\n\rEx3v1\n\r");
        while (balance >=0){
            daysForParking++;
            if((daysForParking) % dayForNotPay == 0){
                //System.out.println(String.format("(День %d)(Баланс %d)", daysForParking, balance));
                continue;
            }
            //System.out.println(String.format("(День %d)(Баланс %d)", daysForParking, balance));
            balance -= coastPerDay;
        }
        System.out.println(String.format("За сумму %d вам будет предоставлено %d дней парковки", startBalance, daysForParking));
        //Ex3v2
        System.out.println("\n\rEx3v2\n\r");
        balance = startBalance;
        daysForParking = 0;
        for(; balance >= 0; balance -=0){
            daysForParking++;
            if((daysForParking) % dayForNotPay == 0){
                //System.out.println(String.format("(День %d)(Баланс %d)", daysForParking, balance));
                continue;
            }
            //System.out.println(String.format("(День %d)(Баланс %d)", daysForParking, balance));
            balance -= coastPerDay;
        }
        System.out.println(String.format("За сумму %d вам будет предоставлено %d дней парковки", startBalance, daysForParking));
        //Ex4v1
        System.out.println("\n\rEx4v1\n\r");
        while(true){
            month++;
            total += moneyPerMonth;
            if((month % 6) == 0){
                //System.out.println(String.format("На сумму %.2f начислены %.2f процентов", total, (halfYearPercent/100)*total));
                total += (halfYearPercent/100)*total;
            }
            if(total >= finalBalance){
                break;
            }
        }
        System.out.println(String.format("Для накопления %.2f необходимо %d месяцев, потенциальные накопления %.2f", finalBalance, month, total));
        //Ex5v1
        System.out.println("\n\rEx5v1\n\r");
        while(charge<100){
            minute++;
            //System.out.println(String.format("Текущий заряд составляет %d", charge));
            if(minute % 10 == 0 && charge > startCharge){
                overheads++;
                if(overheads > maxOverheads){
                    break;
                }
            }else if(minute % 10 <= 2 && charge > startCharge){
                continue;
            }
            charge += chargingPerMinute;
        }
        System.out.println(String.format("Время зарядки составило %d минут. Текущий заряд составляет %d", minute, charge));
    }
}