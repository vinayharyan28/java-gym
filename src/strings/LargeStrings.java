package strings;

public class LargeStrings {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("vinayharyan28");
        sb.append("28");
        System.out.println(sb);
        String string = sb.toString();
        System.out.println(string);

        // constructor1
        StringBuffer sb1 = new StringBuffer();

        // constructor2
        StringBuffer sb2 = new StringBuffer("vinayharyan");

        // constructor3
        StringBuffer sb3 = new StringBuffer(30);

        System.out.println("sb1: " + sb1);
        System.out.println("sb2: " + sb2);
        System.out.println("sb3: " + sb3);

    }
}
