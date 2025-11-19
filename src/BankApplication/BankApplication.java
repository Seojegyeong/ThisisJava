package BankApplication;
import java.util.Scanner;

public class BankApplication {

    private static Account[] accounts = new Account[100];

    private static Account findAccount(String accountNumber){
        for (Account acc: accounts){
            if(acc != null && acc.getAccountNumber().equals(accountNumber)){
                return acc;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int menu;

        while(run){
            System.out.println("------------------------------------");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료 ");
            System.out.println("------------------------------------");

            System.out.print("선택: ");
            menu = scanner.nextInt();

            scanner.nextLine();

            switch(menu){
                case 1: {
                    System.out.println("----------");
                    System.out.println("계좌 생성");
                    System.out.println("----------");

                    System.out.print("계좌번호: ");
                    String accountNumber = scanner.nextLine();

                    System.out.print("계좌주: ");
                    String owner = scanner.nextLine();

                    System.out.print("초기입금액: ");
                    int balance = scanner.nextInt();
                    scanner.nextLine();


                    Account newAccount = new Account(accountNumber, owner, balance);

                    for (int i = 0; i < accounts.length; i++) {
                        if(accounts[i] == null ){
                            accounts[i] = newAccount;
                            break;
                        }
                    }
                    System.out.println("결과: 계좌가 생성되었습니다.");
                    break;
                }
                case 2: {
                    System.out.println("----------");
                    System.out.println("계좌 목록");
                    System.out.println("----------");

                    for (Account acc : accounts) {
                        if (acc != null) {
                            System.out.println(
                                    acc.getAccountNumber() + "\t" + acc.getOwner() + "\t" + acc.getBalance()
                            );
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("----------");
                    System.out.println("예금");
                    System.out.println("----------");

                    System.out.print("계좌번호: ");
                    String  accountNumber = scanner.nextLine();

                    System.out.print("예금액: ");
                    int money = scanner.nextInt();
                    scanner.nextLine();

                    Account acc = findAccount(accountNumber);

                    if (acc == null) {
                        System.out.println("계좌가 없습니다.");
                    } else {
                        int newBalance = acc.getBalance() + money;
                        acc.setBalance(newBalance);
                    }
                    break;
                }
                case 4: {
                    System.out.println("----------");
                    System.out.println("출금");
                    System.out.println("----------");


                    System.out.print("계좌번호: ");
                    String  accountNumber = scanner.nextLine();

                    System.out.print("출금액: ");
                    int money = scanner.nextInt();
                    scanner.nextLine();

                    Account acc = findAccount(accountNumber);

                    if (acc == null) {
                        System.out.println("계좌가 없습니다.");
                    } else {
                        int newBalance = acc.getBalance() - money;
                        acc.setBalance(newBalance);
                    }
                    break;
                }
                case 5: {
                    System.out.println("프로그램 종료");
                    run = false;
                }
            }
            System.out.println();
        }
    }
}