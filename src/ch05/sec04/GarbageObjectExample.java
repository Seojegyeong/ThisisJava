package ch05.sec04;

public class GarbageObjectExample {
    public static void main(String[] args) {
        String hobby = "여행";
        hobby = null;
        // "여행"에 해당하는 String 객체를 쓰레기로 만든다.
        // 참조를 모두 잃은 객체는 GC 대상이 됩니다.

        String kind1 = "자동차";
        String kind2 = kind1;   // kind1 변수에 저장되어 있는 번지를 Kind2 변수에 대입한다.
        kind1 = null;          // "자동차"에 해당하는 String 객체는 쓰레기가 아님
        System.out.println("kind2: " + kind2);
    }
}

/*
kind1과 kind2는 둘 다 같은 String 객체(“자동차”)를 가리키는 참조(reference) 였음
kind1 = null을 하면 kind1 ↔ 객체 연결만 끊긴다.
하지만 kind2가 여전히 그 객체를 참조하고 있으므로, 그 객체는 GC(가비지 컬렉션) 대상이 아님
어떤 객체가 GC 대상이 되려면 그 객체를 가리키는 살아있는 참조가 하나도 없어야 한다.
이 예제에서는 kind2가 남아 있으니 대상이 아니죠.
* */