public class Main {
    public static void main(String[] args) {
        int a = 1;
        boolean found = false;
        while (found==false) {
            if ((a % 387 == 0) && (a % 6381 == 0)) {
                found = true;
                System.out.println(a);
            }
            else {
                a = a + 1;
            }
        }
    }
}