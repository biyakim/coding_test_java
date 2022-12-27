import java.util.Arrays;

class Student implements Comparable {

    private String name;
    private double gpa;
    public Student(String n, double g){
        name = n;
        gpa = g;
    }
    public Student(String n){
        name = n;
    }
    public String getName(){return name;}
    public double getGPA() {return gpa;}
    public int compareTo(Object obj){
        Student other = (Student)obj;


        if(gpa < other.gpa)
            return -1;
        else if(gpa > other.gpa)
            return 1;
        else
            return 0;


        // return (this.name.compareTo(other.name));
    }
}
public class Student2{
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("홍길동",3.38);
        students[1] = new Student("임꺽정",4.38);
        students[2] = new Student("황진이",2.38);

        Arrays.sort(students);
        System.out.println("GPA 오름차순 출력");
        for(Student s : students)
            System.out.println("이름 = "+ s.getName() + "평점 = " +s.getGPA());

    }
}

