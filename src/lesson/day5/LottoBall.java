package lesson.day5;

public class LottoBall {
    //ball의 정보를 갖고 있는것.
    private int number;
    private boolean isSelectTed;

    // 생성자
    public LottoBall(int number){
        this.number = number;
    }

    // getter,setter
    public int getNumber() {
        return this.number;
    }
    /*
    public void setNumber(int number) {
        this.number = number;
    }
    */
    public boolean isSelectTed() {
        return this.isSelectTed;
    }

    public void setSelectTed(boolean selectTed) {
        this.isSelectTed = selectTed;
    }

    @Override   // 재정의
    public String toString() {
        return this.number+"";
    }

}
