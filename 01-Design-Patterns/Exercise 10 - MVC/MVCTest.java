package DesignPatterns.Exercise10;
public class MVCTest {
    public static void main(String[] args) {
        Student model = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        System.out.println("Displaying initial student state:");
        controller.updateView();
        System.out.println("Updating student grade and name...");
        controller.setStudentName("Akash Senthil");
        controller.setStudentGrade("A+");
        System.out.println("\nDisplaying updated student state:");
        controller.updateView();
    }
    private static Student retrieveStudentFromDatabase() {
        return new Student("Akash", "CS01", "B");
    }
}
