import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        QuadraticEquation p = new QuadraticEquation(a,b,c);
        int q=p.getDiscriminant();
        System.out.print("judge:");
        System.out.println(q);
        if(q>0){
            System.out.print("root1:");
            System.out.println(p.getRoot1());
            System.out.print("root2:");
            System.out.println(p.getRoot2());
        }
        else if(q==0){
            System.out.print("root:");
            System.out.println(p.getRoot1());
        }
        else{
            System.out.println("The equation has no roots.");
        }
    }
}
class QuadraticEquation{
    private int a;
    private int b;
    private int c;
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public int getC(){
        return c;
    }
    public QuadraticEquation(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public int getDiscriminant(){
        if(b*b-4*a*c>0)
            return 1;
        else if(b*b-4*a*c==0)
            return 0;
        else
            return -1;
    }
    public double getRoot1(){
        return (-b+Math.sqrt(b*b-4*a*c))/(2*a);
    }
    public double getRoot2(){
        return (-b-Math.sqrt(b*b-4*a*c))/(2*a);
    }
}