
public class ForEach {
    public static void main(String[] args) {
        Student[] arr1 = new Student[3];
        arr1[0] = new Student();
        arr1[1] = new Student();
        arr1[2] = new Student();
        arr1[0].id = "10";
        arr1[1].id = "12";
        arr1[2].id = "13";

        for (Student element : arr1) {
            element.id = "100";
            System.out.println(element.id);
        }
        
        System.out.println("===================");
        
        for (Student element : arr1) {
            System.out.println(element.id);
        }
    }
}

class Student {
    String id;
}

