//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Ex1
        System.out.println("\n\rEx1\n\r");
        int firstFriday = 1;
        for(int i = firstFriday; i <= 31; i++){
            if((i - firstFriday)%7 == 0){
                System.out.println(String.format("Сегодня пятница, %d-е число. Необходимо подготовить отчет", i));
            }
        }
        //Ex1
        System.out.println("\n\rEx1\n\r");
    }
}