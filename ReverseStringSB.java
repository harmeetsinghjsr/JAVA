public class ReverseStringSB {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("HELLO");
        // System.out.println(sb.reverse());
        for(int i=0;i<sb.length()/2;i++)
        {
            char temp=sb.charAt(i);
            sb.setCharAt(i,sb.charAt(sb.length()-1-i));
            sb.setCharAt(sb.length()-1-i,temp);
        }
        System.out.println(sb);
    }
}