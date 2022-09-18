package collectionframework.treeset;

public class Member implements Comparable<Member> {
// public class Member implements Comparator<Member> {

    private int memberId;       // 회원 아이디
    private String memberName;  // 회원 이름

    public Member() {}

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                '}';
    }

    // HashSet을 사용할 때 들어가는 매개 변수 클래스에서 중복 방지를 위한 아래 메서드들을 재정의해준다.
    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Member) {

            Member member = (Member) obj;

            if (this.memberId == member.memberId) {
                return true;
            }
            else return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return memberId;
    }

    @Override
    public int compareTo(Member member) {

//        if (this.memberId > member.memberId) {
//            return 1;
//        }
//        else if (this.memberId < member.memberId) {
//            return -1;
//        }
//        else {
//            return 0;
//        }

        // 오름차순
        return (this.memberId - member.memberId);

        // 내림차순
        // return (this.memberId - member.memberId) * (-1);
    }

    // comparator 인터페이스 구현 시, compare() 메서드 재정의
    // @Override
    // public int compare(Member member1, Member member2) {
    //     return (member1.memberId - member2.memberId);
    // }
}
