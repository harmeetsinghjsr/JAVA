public class Student {
    private String name;
    private String id;
    private int marks;

    public Student(String name, String id, int marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public static void Grade(String studentDetails) throws InvalidStudentDetails{

        String parts[]=studentDetails.split(":");
        if(parts.length!=3){
            throw new InvalidStudentDetails();
        }
        String name=parts[0];
        String id=parts[1];
        int marks=Integer.parseInt(parts[2]);
        if(!name.matches("[A-Z]{1}")){
            throw new InvalidStudentDetails();
        }
        if(!id.matches("[0-9]{5}")){
            throw new InvalidStudentDetails();
        }
        if(marks<0 || marks>100){
            throw new InvalidStudentDetails();
        }

        if(marks>=90){
            System.out.println("Grade A");
        }
        else if(marks>=80){
            System.out.println("Grade B");
        }
        else if(marks>=70){
            System.out.println("Grade C");
        }
        else if(marks>=60){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Grade F");
        }    
    }
}