import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("db.txt");
        BufferedReader br = new BufferedReader(fr);
        Scanner sc = new Scanner(System.in);
        Map<String, String> idPass = new HashMap<String, String>();
        String inputId, inputPass, idpw;
        int cnt = 0;

        while ((idpw = br.readLine()) != null) {
            idPass.put(idpw.split(" ")[0], idpw.split(" ")[1]);
        }

        while (true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            inputId = sc.next().trim();

            if (!idPass.containsKey(inputId)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }

            System.out.print("password : ");
            inputPass = sc.next().trim();

            if (!idPass.get(inputId).equals(inputPass)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }
            else {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            }
        }
    }
}
