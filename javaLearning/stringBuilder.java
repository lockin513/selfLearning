public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("A");
        sb.append("BBB");
        sb.append("CCC");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.length());
        sb.toString();
    }
}
