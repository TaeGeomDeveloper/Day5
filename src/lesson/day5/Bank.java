package lesson.day5;

import java.util.Scanner;

public class Bank {
    // 사용자에게 메뉴를 보여 주고 선택한 메뉴에 맞게 처리를 하는것.
    // 사용자에게 입력 받고 내용을 바탕으로 작업한다. (잔액의 변화, 잔액의 출력)
    boolean isStop = true;

    public static void main(String[] args) {
        Bank b = new Bank();
        b.openBank();
    }
    public void openBank() {
        Account account = new Account();
        Scanner sc = new Scanner(System.in);
        while (isStop) {
            // 메뉴를 보여준다.
            System.out.println("----------------------------------------------");
            System.out.println("1.예금\t|\t2.출금\t|\t3.잔고\t|\t4.종료");
            System.out.println("----------------------------------------------");
            // 선택을 기다린다.
            System.out.print("메뉴 중 하나를 선택하세요 >> ");
            int num = sc.nextInt();
            // 선택에 맞는 작업을 한다.
            switch (num) {
                case 1 -> {
                    System.out.print("입금 금액을 입력해주세요 >> ");
                    account.deposit(sc.nextInt());
                }
                case 2 -> {
                    System.out.print("출금 금액을 입력해주세요 >> ");
                    account.withdraw(sc.nextInt());
                }
                case 3 -> System.out.print("현재 잔고 >> " + account.getBalance() + "\n");
                default -> {
                    System.out.println("프로그램을 종료 합니다. ");
                    isStop = false;
                }
            }
        }
        sc.close();
    }
}
