package ch02.sec07;

public class PromotionExample {
    public static void main(String[] args) {
        //자동 타입 변환 : byte -> int
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue: " + intValue);

        // char -> int
        char charValue = '가';
        intValue = charValue;
        System.out.println("가의 유니코드: "+ intValue);

        // int -> long
        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue: " + longValue);

        // long -> float
        longValue = 100;
        float floatValue = longValue;
        System.out.println("floatValue: "+ floatValue);

        // float -> double
        floatValue = 100.5F;
        double doubleValue = floatValue;
        System.out.println("doubleValue: " + doubleValue);
    }
}

// 자동 형 변환 5p 시험 문제