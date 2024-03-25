package thread_demo;

public class SelfTest {

    public static void main(String[] args) {
        for (int i = 1; i< 1001; i++) {
            System.out.println(String.format("%s: %s, %s", i, (i & -i), i ^( i-1)));
        }
    }
    
}
