package access.b;

import access.a.AccessData;

public class AccessOuterMain {

    public static void main(String[] args) {
        AccessData data = new AccessData();
        //public
        data.publicField = 1;
        data.publicMethod();

        //default -> 다른 패키지라서 접근 불가
//        data.defaultField = 2;
//        data.defaultMethod();

        //
        data.innerAccess();
    }
}
