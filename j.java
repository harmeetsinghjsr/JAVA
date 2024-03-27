public class j {
 //using range in switch case 1-5=good 6-10=bad;
    public static void main(String[] args) {
        int a=5;
        switch(a)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            System.out.println("good");
            break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            System.out.println("bad");
            break;
            default:
            System.out.println("invalid");
 
        }
    }
}
