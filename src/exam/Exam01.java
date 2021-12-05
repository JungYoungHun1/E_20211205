package exam;

public class Exam01 {
    public static void main(String[] args) {
        addNum(1, 10);
    }
    static void gugudan(){
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i+"x"+j+"="+i*j);
            }
        }
    }
    static void addNum(int x, int y){
        for (int i = x+1; i <= y; i++) {
            x += i;
        }
        System.out.println(x);

    }
}
