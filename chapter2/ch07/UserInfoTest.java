package chapter2.ch07;

public class UserInfoTest {

    public static void main(String[] args) {

        UserInfo userinfo = new UserInfo();

        userinfo.userID = "bang";
        userinfo.userPassword = "123";
        userinfo.userName = "jaeyoung";
        userinfo.phoneNumber = "01032324343";

        userinfo.showUserInfor();
    }
    
} // 기본 생성자로 구현
