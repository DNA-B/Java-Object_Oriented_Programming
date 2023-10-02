import java.util.Scanner;

class Student {
    int studentNum;
    String name;
    String major;
    int phoneNum;

    void setStudentNum(int newStudentNum) {
        studentNum = newStudentNum;
    }

    void getStudentNum() {
        System.out.printf("%s ", studentNum);
    }

    void setName(String newName) {
        name = newName;
    }

    void getName() {
        System.out.printf("%s ", name);
    }

    void setMajor(String newMajor) {
        major = newMajor;
    }

    void getMajor() {
        System.out.printf("%s ", major);
    }

    void setPhoneNum(int newPhoneNum) {
        phoneNum = newPhoneNum;
    }

    void getPhoneNum() {
        String tmp = "0" + Integer.toString(phoneNum);
        tmp = tmp.substring(0, 3) + "-" + tmp.substring(3, 7) + "-" + tmp.substring(7);
        System.out.printf("%s ", tmp);
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] s = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.printf("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");

            s[i] = new Student();
            s[i].setStudentNum(sc.nextInt());
            s[i].setName(sc.next());
            s[i].setMajor(sc.next());
            s[i].setPhoneNum(sc.nextInt());
        }

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");
        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    System.out.printf("첫번째 학생: ");
                    break;
                case 1:
                    System.out.printf("두번째 학생: ");
                    break;
                case 2:
                    System.out.printf("세번째 학생: ");
                    break;
            }

            s[i].getStudentNum();
            s[i].getName();
            s[i].getMajor();
            s[i].getPhoneNum();
            System.out.println();
        }
    }
}

/*
202100001 유재석 무용학과 01053559999
202100002 강호동 사회체육학과 01027440001
202100003 이경규 신문방송학과 01029853344
 */
