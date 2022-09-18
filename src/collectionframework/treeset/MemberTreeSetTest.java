package collectionframework.treeset;

import java.util.Comparator;
import java.util.TreeSet;

// TreeSet을 사용하기 위해서는 정렬을 위해
// Comparable과 Comparator 인터페이스를 구현해야함
// 기본 정렬값은 오름차순
// Comparable 인터페이스는 java.lang 패키지 안에 있음
// Comparator 인터페이스는 java.util 패키지 안에 있음
// Integer, String 타입을 사용한다면, 이미 구현되어 있기 때문에
// 임의의 객체에 대해서만 위 두 개의 인터페이스 중 하나는 구현해 써야한다.
public class MemberTreeSetTest {

    public static void main(String[] args) {

        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memberHong = new Member(1004, "홍길동");
        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");

        memberTreeSet.addMember(memberHong);
        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberKim);
        memberTreeSet.addMember(memberKang);

        memberTreeSet.showAllMember();


        // 대부분 Comparable 인터페이스를 구현하지만,
        // 이미 구현된 경우, Comparator로 비교하는 방식을 다시 구현할 수 있음
        TreeSet set = new TreeSet<String>(new MyCompare());
        set.add("Park");
        set.add("Kim");
        set.add("Lee");

        System.out.println(set);
    }
}

class MyCompare implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {

        return s1.compareTo(s2) * (-1);
    }
}