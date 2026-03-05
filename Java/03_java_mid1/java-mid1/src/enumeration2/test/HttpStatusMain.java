package enumeration2.test;

import java.io.*;

public class HttpStatusMain {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("HTTP CODE: ");
        int httpCodeInput = Integer.parseInt(in.readLine());

        HttpStatus status = HttpStatus.findByCode(httpCodeInput);
        if (status == null) {
            System.out.println("NOT FOUND");
        } else {
            System.out.println(status.getCode() + " " + status.getMessage());
            System.out.println("isSuccess: " + status.isSuccess());
        }
    }
}
