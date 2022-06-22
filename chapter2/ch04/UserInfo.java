package chapter2.ch04;

import javax.print.DocFlavor.STRING;

public class UserInfo {

    String userName;
    String userID;
    String userPassword;
    String userAddress;
    String phoneNumber;

public void setUserName(String name) {
    userName = name;

}

public void setUserID(String id) {
    userID = id;

}

public void showUserInfo() {

    System.out.println("사용자 이름 : " + userName + "\n사용자 ID : " + userID + "\n사용자 Pass : " + userPassword + "\n사용자 주소 : " + userAddress + "\n사용자 전화번호 : " + phoneNumber);

}

}