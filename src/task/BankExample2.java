package task;

import java.util.Scanner;

public class BankExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int balance = 0;

        while(run) {
            System.out.println("------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 ");
            System.out.println("------------------------------------");

            System.out.print("선택: ");
            String menu = scanner.nextLine();

            if( menu.equals("1")){
                System.out.print("예금액 > ");
                int money = scanner.nextInt();
                balance += money;
                scanner.nextLine();
            }
            else if(menu.equals("2")){
                System.out.print("출금액 > ");
                int money = scanner.nextInt();
                balance -= money;

                if(balance < money){
                    System.out.println("계좌의 잔고가 부족합니다.");
                }
                scanner.nextLine();

            }
            else if(menu.equals("3")){
                System.out.println("잔고> " + balance);
            }
            else if(menu.equals("4")){
                System.out.println("프로그램을 종료합니다.");
                run = false;
            }
            else {
                System.out.println("1~4 중에 선택하세요.");
            }
            System.out.println();
        }
    }
}
