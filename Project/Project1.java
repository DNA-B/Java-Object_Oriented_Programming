// jshell implementation Project
package Project;

import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String historyArr[] = new String[10];
        int bufferCnt = 0;

        while (true) {
            System.out.printf("jshell> ");
            String order = sc.nextLine();
            System.out.println();

            if (order.equals("/exit")) {
                System.out.println("Goodbye.");
                break;
            }
            else if (order.equals("/help")) {
                System.out.println("Type a Java language expression, statement, or declaration.");
                System.out.println("Or type one of the following commands:");
                System.out.println("/list: list the source you have typed.");
                System.out.println("/exit: exit the jshell tool.");
                System.out.println("/history: history of what you have typed.");
                System.out.println("/!: rerun last snippet.");
            }
            else if (order.equals("/history")) {
                for (int i = 0; i < bufferCnt; i++)
                    System.out.println(historyArr[i]);
            }
            else if (order.equals("/list")) {
                int cnt = 1;

                for (int i = 0; i < bufferCnt; i++) {
                    if (historyArr[i].charAt(0) != '/') {
                        System.out.println(cnt + " : " + historyArr[i]);
                        cnt++;
                    }
                }
            }
            else if (order.equals("/!")) {
                for (int i = bufferCnt - 1; i >= 0; i--) {
                    if (historyArr[i].charAt(0) != '/') {
                        System.out.println("Re-running '" + historyArr[i] + "'.");
                        break;
                    }
                }
            }
            else if (order.charAt(0) == '/') { // 없는 명령어
                System.out.println("Invalid command: " + order);
                System.out.println("Type /help for help.");
            }
            else // 기타 표현식
                System.out.println("Running '" + order + "'.");

            historyArr[bufferCnt++] = order;

            if (bufferCnt >= 10) {
                System.out.println("The history buffer is cleared.");
                bufferCnt = 0;
            }

            System.out.println();
        }
    }
}

/* input

/help
/hello
/history
/list
int x=0;
float y=0;
System.out.println("hello")
/!
/list
/list
/history
/list
/exit

 */
