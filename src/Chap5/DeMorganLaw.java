package Chap5;

public class DeMorganLaw {
    public static void main(String[] args){
        int x,y,a,b,g,i,j;
        x = 2; y = 5; a = 3; b = 1; g = 8; i = 1; j = 4;
        System.out.println(!(x < 5) && !(y >= 7));
        System.out.println(!(a == b) || !(g != 5));
        System.out.println(!((x <= 8) && (y > 4)));
        System.out.println(!((i > 4) || (j <= 6)));
        System.out.println("Using De Morgan's Law");
        System.out.println(!(x < 5 || y >= 7));
        System.out.println(!(a == b) && (g != 5));
        System.out.println(!(x <= 8) || !(y > 4));
        System.out.println(!(i > 4) && !(j <= 6));
    }
}
