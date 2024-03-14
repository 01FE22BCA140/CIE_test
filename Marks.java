class Marks{
    private String Courses[]={"Devops", "C#", "ML", "ST"};
    private int Marks[]={88, 36, 92, 34};
    public void displayMarks(){
    System.out.println("\nCourses registered:");
    for(int i=0; i<=3; i++){
     System.out.println(Courses[i]);
    }
    System.out.println("\nCourses with marks less than 40");
    for(int i=0;i<=3;i++){
        if(Marks[i]<40)
        System.out.println(Courses[i] + "\t\t"+ Marks[i]);
    }
}
}