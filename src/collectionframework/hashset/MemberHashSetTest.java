package collectionframework.hashset;

// HashSet은 순서와 상관없음, 동일한 객체는 들어갈 수 없음
// 동일한 객체가 들어갈 수 없게, equals()와 hashcode() 메서드를 재정의해주어야 함
public class MemberHashSetTest {

    public static void main(String[] args) {

        MemberHashSet memberHashSet = new MemberHashSet();

        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");

        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberKim);
        memberHashSet.addMember(memberKang);

        memberHashSet.showAllMember();

        Member memberHong = new Member(1003, "홍길동");    // memberId가 중복이 되지만, 출력해보면 들어가있는 이유는
        memberHashSet.addMember(memberHong);                                     // equals(), hashcode() 메서드를 재정의해주지 않았기 때문
                                                                                 // equals(), hashcode() 메서드를 재정의해주면 중복되는 값은 들어가지 못함
        memberHashSet.showAllMember();

    }
}
