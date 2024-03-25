class Student {
    int rollNo;
    String name;
    int java_marks; 
    int CL_II_marks;
    int MPI_marks;
    int COA_marks;
    
    Student(int rollNo, String name, int java_marks, int COA_marks, int MPI_marks, int CL_II_marks){

        this.rollNo = rollNo;
        this.name = name;
        this.java_marks = java_marks;
        this.MPI_marks = MPI_marks;
        this.COA_marks = COA_marks;
        this.CL_II_marks = CL_II_marks;
    }

    private int totalMarks(){

        return this.CL_II_marks + this.COA_marks + this.MPI_marks + this.java_marks;
    }

    private String showGrade(int marks){

         
        if(marks<40){
            return "F";
        }else if(40<marks && marks<=50){
            return "C";
        }else if(50<marks && marks<=60){
            return "C";
        }else if(60<marks && marks<=70){
            return "B";
        }else if(70<marks && marks<=80){
            return "B+";
        }else if(80<marks && marks<=90){
            return "A";
        }else if(90<marks){
            return "A+";
        }
        return "NULL";
    }

    private void printData(){
        System.out.println("\nName of student: " + this.name);
        System.out.println("\nRoll.no.: " + this.rollNo);
        System.out.println("\nJava marks/Grade: " + this.java_marks + " " + this.showGrade(this.java_marks));
        System.out.println("\nCOA marks/Grade: " + this.COA_marks+ " " + this.showGrade(this.COA_marks));
        System.out.println("\nMPI marks/Grade: " + this.MPI_marks+ " " + this.showGrade(this.MPI_marks));
        System.out.println("\nCL-II marks/Grade: " + this.CL_II_marks+ " " + this.showGrade(this.CL_II_marks));
        System.out.println("\nTotal marks: "+this.totalMarks());
    }

    public static void main(String[] args) {
        Student student1 = new Student(52, "Vikramaditya Khupse", 80, 90, 90, 95);
        student1.printData();
        
    }
}
