package lesson.day5;

import java.util.Random;

public class LessonCode5 {

    //int lottoNum[] = new int[6];

    public void testArray() {
        int[] lastDays = {31,28,31,30,31,30,31,31,30,31,30,31};
        int lastDays2[] = new int[12];  // {31,28,31,30,31,30,31,31,30,31,30,31};
        lastDays2[0] = 31;
    }
    public void checkSameNumber() {
        // 6개의 임의의 수를 출력할 때 중복이 생성되지 않도록 한다.
        // Random 클래스를 이용하여 6개의 숫자(1~45)를 중복 허용하여 출력하는 코드 작성.

        Random r = new Random();
        int number[] = new int[6];
        System.out.println("중복을 허용하여 6개의 랜덤 숫자를 출력합니다.");
        for(int i = 1; i <= 6; i++){
            number[i-1] = r.nextInt(45)+1;
            System.out.printf("%d 번째 숫자 : %d \n",i,number[i-1]);
        }

        // 중복을 허용하지 않고 6개의 숫자를 출력하는 코드 작성
        int number2 [] = new int[6];
        System.out.println("중복을 허용하지 않고 6개의 랜덤 숫자를 출력합니다.");
        for(int i = 0; i < 6;i++){
            number2[i] = r.nextInt(45)+1;
            for(int j = 0; j < i; j++){
                if(number2[i] == number2[j]){
                    i--;
                    break;
                }
            }
        }

        // while
        /*
        boolean isCheck = false;
        boolean numCheck = false;
        int count = 0;
        while (!isCheck){
            int num = r.nextInt(45)+1;
            for(int i=0; i < count; i++){
                // number와 같은수가 있는지 확인
                if(number[i] != num){
                    numCheck = true;
                    break;
                }
            }
            if(!numCheck){
                number[count] = num;
            }
            else{
                count--;
            }
            count++;
        }
        */

        /*
            for(int i = 0; i < 6; i++) {
            int number = r.nextInt(45)+1;
            boolean isCheck = false;
               for(int j=0; j < i; j++){
                    //number와 같은수가 있는지 확인
                    if(balls[j] != number){
                        isCheck = true;
                        break;
                    }
               }
               // flag 정보 이용하여 결정
               if(!isCheck) {
                    balls[i] = number;
               } else {
                    i--;
               }
             }
         */
        for(int i = 1; i <= 6; i++){
            System.out.printf("%d 번째 숫자 : %d \n",i,number[i-1]);
        }
    }
}
