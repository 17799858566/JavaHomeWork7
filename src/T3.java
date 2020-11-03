import java.util.GregorianCalendar;

public class T3 {
    public static void main(String[] args) {
        java.util.GregorianCalendar date=new java.util.GregorianCalendar();
        System.out.println(date.get(GregorianCalendar.YEAR)+"年"+
                (1+date.get(GregorianCalendar.MONTH))+"月"+
                date.get(GregorianCalendar.DAY_OF_MONTH)+"日"
                );
        java.util.GregorianCalendar d = new java.util.GregorianCalendar();
        long a = 1234567898765L;
        d.setTimeInMillis(a);
        System.out.println(d.get(GregorianCalendar.YEAR)+"年"+
                        (1+d.get(GregorianCalendar.MONTH))+"月"+
                        d.get(GregorianCalendar.DAY_OF_MONTH)+"日"
                );

    }
}
