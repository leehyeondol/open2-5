import java.util.Scanner;
import java.util.StringTokenizer;

public class Q07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print(">>");
            String s = sc.nextLine();
            if(s.contentEquals("그만")) {
                System.out.println("종료합니다...");
                break;
            }
            StringTokenizer st = new StringTokenizer(s);
            int a = st.countTokens();
            System.out.println("어절 개수는 "+a);
        }

        sc.close();
    }

}