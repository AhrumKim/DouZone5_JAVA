import java.util.Scanner;

public class Drink_Machine{

    public static void main(String[] args) {
        
        final String[] drinkNames = {"사이다", "콜라", "환타", "커피","알로에","보리차"};
        final int[] drinkCost = {1000, 1100, 1000, 900, 1000, 400};
        final int[] drinkStock = {5, 7, 3, 4, 9, 10};
        int money = 0;
        int selectedDrink = -1;
        int isExit = 0;
        System.out.println("====음료 자판기====");
        do {
        	 System.out.printf("----M E N U E----\n");
            for(int i=0; i<6 ; i++){
                System.out.printf("음료수 %d. %s(%s원) \n", i, drinkNames[i], drinkCost[i]);
            }
            do {
            	System.out.println("------------------");
                Scanner scanner = new Scanner(System.in);              
                System.out.println("돈을 투입해 주세요^^");
                System.out.println("------------------");

                money = money + scanner.nextInt();

                do {
                    System.out.println("------------------");
                    System.out.println("음료를 선택해 주세요^^");
                    System.out.println("------------------");

                    selectedDrink = scanner.nextInt();
                    if(drinkStock[selectedDrink] <=0) {

                        System.out.printf("%s 음료가 남아있지 않습니다. 다른 음료를 선택해 주세요. \n", drinkNames[selectedDrink]);
                        System.out.println("------------------");

                    }
                } while(drinkStock[selectedDrink] <= 0);

                if(drinkCost[selectedDrink] > money){
                	
                    System.out.println("금액이 부족합니다");
                    System.out.println("------------------");

                }

            } while(drinkCost[selectedDrink]>money);

            drinkStock[selectedDrink] = drinkStock[selectedDrink] - 1;
            money = money - drinkCost[selectedDrink];
            System.out.println("------------------");
            System.out.printf("%s 음료를 구매했습니다. \n", drinkNames[selectedDrink]);
            System.out.printf("=> 남은 금액은 %d원 입니다. \n", money);
            System.out.println("------------------");

            System.out.printf("거스름돈을 반환하시겠습니까?\n(yes는 1 / no는 0을 입력하세요)\n");
            Scanner scanner = new Scanner(System.in);
            isExit = scanner.nextInt();
            if(isExit ==0) {
            System.out.printf("감사합니다^^");
            } System.out.printf("거스름돈을 가져가시길 바랍니다^^\n감사합니다^^\n");
        } while(isExit == 0);
    }
}
