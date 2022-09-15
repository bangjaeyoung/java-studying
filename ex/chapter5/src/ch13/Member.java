package ch13;

import java.util.Comparator;

public class Member implements Comparator<Member> {

    private int id;
    private String name;

    public Member() {}

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
    public int compare(Member member1, Member member2) {
        return (member1.id - member2.id);
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

//    @Override
//    public int compareTo(Member member) {
//
//        if(this.id > member.id) {
//            return 1;
//        }
//        else if(this.id < member.id) {
//            return -1;
//        }
//        else
//            return 0;
//
//        return (this.id - member.id);
//
//        return (this.id - member.id) * (-1);
//    }
}
