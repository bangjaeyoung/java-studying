package collectionframework.hashmap;

import java.util.HashMap;
import java.util.Iterator;

// key는 중복될 수 없고, Set의 개념
// value는 중복될 수 있고, Collection의 개념
public class MemberHashMap {

    private HashMap<Integer, Member> hashMap;

    public MemberHashMap() {
        hashMap = new HashMap<>();
    }

    public void addMember(Member member) {
        hashMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId) {

        if (hashMap.containsKey(memberId)) {
            hashMap.remove(memberId);
        }
        System.out.println("해당 key가 없습니다.");
        return false;
    }

    public void showAllMember() {

        Iterator<Integer> iterator = hashMap.keySet().iterator();

        while (iterator.hasNext()) {

            int key = iterator.next();
            Member member = hashMap.get(key);
            System.out.println(member);
        }
    }
}
