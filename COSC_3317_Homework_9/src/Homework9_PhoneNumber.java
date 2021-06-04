public class Homework9_PhoneNumber {

    public static void main(String[] args) {
        String p1 = "(555)555-5555";
        String p2 = "(713)417-1763";
        String p3 = "(123)456-7890";

        Homework9_PhoneNumber hw = new Homework9_PhoneNumber();
        hw.tokenize(p1);
        System.out.println("************************");
        hw.tokenize(p2);
        System.out.println("************************");
        hw.tokenize(p3);
    }

    public void tokenize(String phoneNumber) {
        String[] tokens = phoneNumber.substring(1).split("\\)");
        String areaCodeStr = tokens[0];
        String phoneNum = tokens[1];
        String[] tokens2 = phoneNum.split("-");
        String fullPhoneNum = tokens2[0] + tokens2[1];
        System.out.println("Area Code: " + areaCodeStr);
        System.out.println("Phone Number: " + fullPhoneNum);
    }
}