package ch05.sec05;

public class EqualsExample {
    public static void main(String[] args) {

        // 문자열 리터럴 지정 - String pool에 들어가 동일 리터럴은 같은 객체를 공유한다.
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";

        if(strVar1 == strVar2){
            System.out.println("strVar1과 strVar2는 참조가 같음");
        } else {
            System.out.println("strVar1과 strVar2는 참조가 다름");
        }

        if(strVar1.equals(strVar2)) {
            System.out.println("strVar1과 strVar2는 문자열이 같음");
        }
        // 참조가 같음
        // 문자열이 같음

        System.out.println();

        // new - 새로운 String 인스턴스가 힙에 생성된다.
        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");


        if(strVar3 == strVar4){
            System.out.println("strVar3과 strVar4는 참조가 같음");
        } else {
            System.out.println("strVar3과 strVar4는 참조가 다름");
        }

        if(strVar3.equals(strVar4)) {
            System.out.println("strVar3과 strVar4는 문자열이 같음");
        }
        // 참조가 다름
        // 문자열이 같음

    }
}

