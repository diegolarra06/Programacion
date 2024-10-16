public class Student {
    private String name;
    private String surname;
    private int subjectNumber;
    //constructor
    public Student(String name, String surname, int subjectNumber) {
        this.name = name;
        this.surname = surname;
        this.subjectNumber = subjectNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getSubjectNumber() {
        return subjectNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", subjectNumber=" + subjectNumber +
                '}';
    }

    
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("Diego", "Larrazabal", 3);
        students[1] = new Student("Pedro", "Sanchez", 5);
        students[2] = new Student("Carlos", "Trujillano", 4);
        students[3] = new Student("Angel", "Moreira", 2); 
        students[4] = new Student("Samuel", "Maria", 1);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}