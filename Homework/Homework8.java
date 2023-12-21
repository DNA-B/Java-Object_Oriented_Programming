package Homework

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> idPass = new HashMap<String, String>();
        String inputId, inputPass;

        idPass.put("myId", "myPass");
        idPass.put("myId2", "myPass2");
        idPass.put("myId3", "myPass3");

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
