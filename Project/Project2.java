package Project;// 계란찜 - 200초 & 700W, 라면끓이기 - 300초 & 1000W, 감자삶기 - 600초 & 700W
// 1. 계란찜, 2. 라면끓이기, 3. 감자삶기, 4. 시간(초) 설정, 5. 소비 전력(W) 설정, 6. 조리 시작, 기타. 종료

import java.util.Scanner;

enum Menu {
    EGG(200, 700), LAMYUN(300, 1000), POTATO(600, 700);

    int recipeCookTime;
    int recipeW;

    Menu(int recipeCookTime, int recipeW) {
        this.recipeCookTime = recipeCookTime;
        this.recipeW = recipeW;
    }
}

class Microwave {
    private int cookTime, w;
    private String isCooking;

    public Microwave() {
        this.w = 700;
        this.cookTime = 0;
        this.isCooking = "아니오";
    }

    public void setCookTime(int cookTime) {
        this.cookTime = cookTime;

        if (this.isCooking == "아니오")
            printStatus();
    }

    public void setW(int w) {
        this.w = w;

        if (this.isCooking == "아니오")
            printStatus();
    }

    public void setProgram(Menu menu) {
        this.w = menu.recipeW;
        this.cookTime = menu.recipeCookTime;
        printStatus();
    }

    public boolean cookingStart() {
        if (this.cookTime == 0) {
            System.out.println("요리 시간이 설정되지 않았습니다.");
            return false;
        }
        else {
            System.out.println("동작을 시작합니다.");
            this.isCooking = "예";
            printStatus();

            return true;
        }
    }

    public void cookingEnd() {
        System.out.println("동작이 중지되었습니다.");

        setW(700);
        setCookTime(0);
        this.isCooking = "아니오";
        printStatus();
    }

    public void systemOn() {
        System.out.println("안녕하세요~ 저는 전자레인지입니다.");
        printStatus();
    }

    public void systemOff() {
        System.out.println("안녕히 계세요~ 전자레인지였습니다.");
    }

    private void printStatus() {
        System.out.println("소비 전력: " + this.w + "W, 요리 시간: " + this.cookTime + "초, 동작 중: " + this.isCooking);
    }
}

public class Project2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Microwave mc = new Microwave();
        int order, inputCookTime, inputW;

        mc.systemOn(); // 전자레인지 On
        System.out.println();

        while (true) {
            System.out.println("1. 계란찜, 2. 라면끓이기, 3. 감자삶기, 4. 시간(초) 설정, 5. 소비 전력(W) 설정, 6. 조리 시작, 기타. 종료");
            System.out.print("메뉴 선택 > ");
            order = sc.nextInt();

            if (order == 1) // 1번 - 계란찜
                mc.setProgram(Menu.EGG);
            else if (order == 2) // 2번 - 라면끓이기
                mc.setProgram(Menu.LAMYUN);
            else if (order == 3) // 3번 - 감자삶기
                mc.setProgram(Menu.POTATO);
            else if (order == 4) { // 4번 - 시간 설정
                System.out.print("입력값 (1~900)> ");
                inputCookTime = sc.nextInt();

                if (inputCookTime < 1 || inputCookTime > 900)
                    System.out.println("유효한 요리 시간(초)이 설정되어야 합니다.");
                else
                    mc.setCookTime(inputCookTime);
            }
            else if (order == 5) { // 5번 - 소비 전력 설정
                System.out.print("입력값 (200, 500, 700, 1000 중 하나)> ");
                inputW = sc.nextInt();

                if (inputW == 200 || inputW == 500 || inputW == 700 || inputW == 1000)
                    mc.setW(inputW);
                else
                    System.out.println("소비 전력(W)은 200, 500, 700, 1000만 지원합니다.");
            }
            else if (order == 6) { // 6번 - 조리 시작
                if (mc.cookingStart() == true) {
                    try {
                        Thread.sleep(1000);
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    mc.cookingEnd();
                }
            }
            else { // 기타 - 종료
                mc.systemOff();
                break;
            }

            System.out.println();
        }
    }
}

/* Input data
6
4
0
4
100
5
100
5
1000
1
6
7
 */