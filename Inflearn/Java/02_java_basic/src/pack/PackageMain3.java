package pack;

import pack.a.*;

public class PackageMain3 {

    public static void main(String[] args) {
        Data data = new Data();
        User user = new User();
        User2 user2 = new User2();
        //패키지 내부의 클래스 명이 중첩될 때 하나는 패키지 명 전체로 작성해야
        pack.b.User userB = new pack.b.User();
    }
}
