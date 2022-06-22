package chapter2.ch07;

public class UserInfo {

    // 기본 생성자로 구현

    public String userID;
    public String userPassword;
    public String userName;
    public String phoneNumber;

    public UserInfo(){}

    public void showUserInfor() {
        System.out.println(userID + " " + userPassword + " " + userName + " " + phoneNumber);

    }
    
}
