class Student {
    private int StudentRoll;
    private String StudentName;

    public void input(int StudentRoll, String StudentName){
        StudentRoll=StudentRoll;
        StudentName=StudentName;
    }

    public void show(){
        System.out.println("Student no is: "+StudentRoll);
        System.out.println("Student name: "+StudentName);
    }
}

public class StudentDemo{
    public static void main(String[] args) {

        Student firstStudent=new Student();
        firstStudent.input(111,"Rohit");
        firstStudent.show();
    }
}
