public class Main {
    public static void main(String[] args) {
        int a = 6381;
        while (a%387 != 0 && a%6381 != 0) {
            if ((a % 387 == 0) && (a % 6381 == 0)) {
                System.out.println(a);
            }
            else if (((a % 387 != 0) && (a % 6381 != 0))){
                a = a + 1;
                System.out.println(a);
            }
        }
    }
}