package ch02.sec11;

public class VariableScopeExample {
    public static void main(String[] args) {
        int v1 = 15;
        if( v1 > 10 ) {
            int v2 = v1 - 10;
            int v3 = v1 + v2 + 5;

            System.out.println("v2: " + v2);
            System.out.println("v3: " + v3);
        }

        System.out.println("v1: " + v1);}
}

// v2 변수의 선언을 {} 중괄호 안에서 선언했기 때문에 밖에서 사용할 수 없음