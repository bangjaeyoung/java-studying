package collectionframework.arraylist.iterator;

import java.util.ArrayList;
import java.util.Iterator;

// removeMember 메서드 안에서 iterator 메서드를 활용하여 순회
public class MemberArrayList {

    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        arrayList = new ArrayList<>();
    }

    public MemberArrayList(int size) {
        arrayList = new ArrayList<>(size);
    }

    public void addMember(Member member) {
        arrayList.add(member);
    }

    public boolean removeMember(int memberId) {

        Iterator<Member> iterator = arrayList.iterator();

        while (iterator.hasNext()) {

            Member member = iterator.next();

            int tempId = member.getMemberId();
            if (tempId == memberId) {
                arrayList.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {

        for (Member member : arrayList) {
            System.out.println(member);
        }
        System.out.println();
    }
}