public class InternationalStudent extends Student {
    private String country;

    public InternationalStudent(int id, String name, int marks, String country) {
        super(id, name, marks); 
        this.country = country;
    }

    public void display() {
        super.display();
        System.out.print(" | Country: " + country);
    }
}