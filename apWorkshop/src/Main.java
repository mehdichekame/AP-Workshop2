
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Student std1 = new Student("Mehdi", "Chekame", "4023107");
        Lab lb = new Lab("Sepehrian", "Monday", 10);
        lb.enrollStudent(std1);
        lb.printLabInfo();
    }
}