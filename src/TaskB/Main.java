package TaskB;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setDateOfBirth("08.02.2003");
        student1.setSurname("Ramankulov");
        student1.setName("Aziret");
        student1.setGender("Male");
        student1.setAge(19);

        Student student2 = new Student();
        student2.setDateOfBirth("25.05.2000");
        student2.setSurname("Pupkin");
        student2.setName("Vasya");
        student2.setGender("Male");
        student2.setAge(22);

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        Group group = new Group();
        group.setStudents(students);
        group.printStudents(group.getStudents());

    }
}
