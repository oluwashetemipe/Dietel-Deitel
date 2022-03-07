package Chap4;

public class DanglingElse2 {
    public static void main(String[] args){
        int y = 8;//or 7
        int x = 5;
        if (y == 8 )
            if (x == 5)
                System.out.println("@@@@@");
            else
                System.out.println("#####");
        System.out.println("$$$$$");
        System.out.println("&&&&&");
    }
}
