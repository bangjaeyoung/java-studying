package chapter2.ch04;

public class UserInfoTest {

    public static void main(String[] args) {

        UserInfo user1 = new UserInfo();
        user1.setUserName("방재영");
        user1.userID = "Bang";
        user1.userPassword = "123";
        user1.userAddress = "인천시";
        user1.phoneNumber = "010-xxxx-xxxx";

        user1.showUserInfo();

        UserInfo user2 = new UserInfo();
        user2.setUserName("홍길동");
        user2.userID = "Hong";
        user2.userPassword = "456";
        user2.userAddress = "서울시";
        user2.phoneNumber = "010-xxxx-xxxx";

        user2.showUserInfo();
        
    }   
}