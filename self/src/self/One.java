package self;
public class One {
    public static void main(String[] args) {
        Two[] students = new Two[3];
        //ここにプログラムを書きます。
        students[0] = new Two("taro", 80, 75, 90);
        students[1] = new Two("hana", 90, 70, 80);
        students[2] = new Two("taro");

        System.out.println("成績表");
        for (int i = 0; i < students.length; i++) {
            students[i].show();
        }
    }
}