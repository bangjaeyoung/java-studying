package ch14;

public class Member {

    private int id;
    private String name;

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;
            if (this.id == member.id) {
                return true;
            } else return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public String toString() {
        return name + " 회원님의 아이디는 " + id + "입니다.";
    }
}
