package Task;

import java.util.Scanner;

public class BankExample1 {
    public static void main(String[] args) {
        int menu;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("------------------------------------");

            System.out.print("선택: ");
            menu = scanner.nextInt();


            switch(menu){
                case 1: {
                    System.out.print("예금액: ");
                    int money = scanner.nextInt();
                    sum += money;
                    break;
                }
                case 2: {
                    System.out.print("출금액: ");
                    int money = scanner.nextInt();
                    sum -= money;
                    break;
                }
                case 3 : {
                    System.out.println("잔고 : " + sum);
                    break;
                }
                case 4: {
                    System.out.println("프로그램 종료");
                    return;
                }
            }
            System.out.println();
        }
    }
}
