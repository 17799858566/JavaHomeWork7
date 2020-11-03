import java.util.Date;

public class T1 {
    public static void main(String[] args) {
        long l=10000;
        for(int i=0;i<8;i++) {
            Date d = new Date();
            d.setTime(l);
            System.out.println(d);
            l*=10;
        }
    }
}
