package BooleanParsing;

public class Example {
    public static void main(String[] args) {
        String s1 = "true";
        String s2 = "trUe";
        String s3 = "TRUE";
        String s4 = "java";

        System.out.println(Boolean.parseBoolean(s1));
        System.out.println(Boolean.parseBoolean(s2));
        System.out.println(Boolean.parseBoolean(s3));
        System.out.println(Boolean.parseBoolean(s4));
    }
}
