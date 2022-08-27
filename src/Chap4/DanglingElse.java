package Chap4;

public class DanglingElse {
    public static void main(String[] args){
        int x = 11;//x can be 9
        int y = 9;//y cn be 11
        if (x < 10) {
            if (y > 10)
                System.out.println("*****");
        }
        else{
            System.out.println("#####");
            System.out.println("$$$$$");
        }
        //System.out.println("$$$$$");
    }
}
