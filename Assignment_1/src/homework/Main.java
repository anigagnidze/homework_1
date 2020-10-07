package homework;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        C clsC  = new C();
        clsC.method_1();
        clsC.method_2();
        clsC.method_3();
        clsC.method_4();
        clsC.method_5();
        clsC.method_6();


        A clsA = new  A();
        clsA.method_1();
        clsA.method_2();
        clsA.method_3();

        B clsB = new B();
        clsB.method1();
        clsB.method2();

//     Davaleba 3

        int ricxvi_1, ricxvi_2;
        int[] Array = new  int[40];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ricxvi_1: ");
        ricxvi_1 = scanner.nextInt();
        System.out.println("Enter ricxvi_2: ");
        ricxvi_2 = scanner.nextInt();


        if(ricxvi_1>ricxvi_2){
            for(int i=0; i<40; i++){
                Array[i] = (int) ((Math.random() * (ricxvi_1 - ricxvi_2 +1)) + ricxvi_2);
            }
        }
        else {
            for (int i=0; i<40; i++){
                Array[i] = (int) ((Math.random() * (ricxvi_2 - ricxvi_1 +1 ) + ricxvi_1));
            }
        }

        int kenti=0, luwi=0, jami_kenti =0, jami_luwi =0;
        
        for(int i=0; i<Array.length; i++){
            if(Array[i] % 2 == 0){
                luwi++;
                jami_luwi += Array[i];

            }
            else {
                kenti++;
                jami_kenti += Array[i];

            }
        }

        System.out.println(kenti);
        System.out.println(luwi);
        System.out.println(jami_kenti);
        System.out.println(jami_luwi);






    }
}


class C {
    int a,b,c;

    void method_1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        this.a = scanner.nextInt();
        System.out.println("Enter second number:");
        this.b = scanner.nextInt();
        System.out.println("Enter third number:");
        this.c = scanner.nextInt();

    }

    int method_2(){
        int BoloCifri = a % 10;
        return BoloCifri;

    }

    int method_3(){
        String numberString = "" + b;
        char PirveliCifri = numberString.charAt(0);
        return  PirveliCifri;
    }

    int method_4(){
        int jami = 0, i= c;
        while (i>0){
            jami = jami + i % 10;
            i = i / 10;

        };
        return jami;
    }

    int method_5(){
        int m_2 = method_2();
        int m_3 = method_3();
        int shedegi = m_2 * m_3;
        System.out.println(shedegi);
        return shedegi;

    }

    void method_6(){
        int m_3 = method_3();
        int m_5 = method_5();
        System.out.println(m_3+m_5);

    }

}

class A{
    public  int x;
    public A(){

        System.out.println("Hello");
    }

    void method_1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number x: ");
        x = scanner.nextInt();
    }

    void  method_2(){
        System.out.println(x + 12);
    }

    void method_3(){
        if(x % 2 == 0){
            System.out.println("Es ricxvi Luwia");
        }
        else{
            System.out.println("Es ricxvi kentia");

        }

    }
}

class B extends A{
    int Y;

    public void method1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number Y: ");
        Y = scanner.nextInt();
    }

    public int method2(){
        super.method_1();
        System.out.println(x+Y);
        return x+Y;

    }
}

