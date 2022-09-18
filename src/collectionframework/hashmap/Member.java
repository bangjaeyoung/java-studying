package collectionframework.hashmap;

public class Member {

    private int memberId;       // 회원 아이디
    private String memberName;  // 회원 이름

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
}
