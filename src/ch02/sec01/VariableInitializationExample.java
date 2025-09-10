package ch02.sec01;

public class VariableInitializationExample {
    public static void main(String[] args){
        int value=0;

        int result=value+10;
        //value 선언만 하고 초기화 안 해서 에러난 것입니다.

        System.out.println(result);
    }
}
