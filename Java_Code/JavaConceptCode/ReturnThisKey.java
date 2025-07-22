class Student {
        int rollNo;
    
        Student setRoll(int rollNo) {
            this.rollNo = rollNo;
            System.out.println("This Value ="+this);
            return this;  // ✅ Returns the current object
        }
    
        void show() {
            System.out.println("Roll No: " + rollNo);
        }
}
    
    public class ReturnThisKey {
        public static void main(String[] args) {
            Student s1 = new Student();
            s1.setRoll(101).show();  // ✅ Method Chaining
        }
    }