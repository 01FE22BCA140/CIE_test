class Student extends Marks{
    String Stud_name="Srushti";
    String program="BCA";
    int semester=4;
    public void displayDetails(){
        System.out.println("Name="+Stud_name);
        System.out.println("\nProgram="+program);
        System.out.println("\nSemester="+semester);
    }
    public static void main(String[] args){
        Student s=new Student();
        s.displayDetails();
        s.displayMarks();
    }
}