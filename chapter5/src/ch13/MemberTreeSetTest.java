package ch13;

import java.util.TreeSet;

public class MemberTreeSetTest {

    public static void main(String[] args) {

        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memberLee = new Member(1004, "이순신");
        Member memberKim = new Member(1001, "김유신");
        Member memberKang = new Member(1002, "강감찬");
        Member memberHong = new Member(1003, "홍길동");


        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberKim);
        memberTreeSet.addMember(memberKang);
        memberTreeSet.addMember(memberHong);

        memberTreeSet.showAllMemeber();
    }
}
