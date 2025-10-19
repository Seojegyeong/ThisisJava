package ch05.sec04;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int[] intArray = null;
        // intArray[0] = 10;     //NullPointerException

        String str = null;
        // System.out.println("총 문자수: " + str.length());  //NullPointerException
    }
}


/* NullPointerException이 발생하면 예외가 발생된 곳에서 null인
   상태의 참조 변수가 사용되고 있음을 알아야 한다.
*/