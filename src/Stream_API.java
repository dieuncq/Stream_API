import java.util.ArrayList;
import java.util.List;

public class Stream_API {
    List<Student> l_Student = new ArrayList<Student>();
}

class Stream_API_Exercise {
    public static void Exercise() {
        Stream_API stream_API = new Stream_API();
        stream_API.l_Student.add(new Student(1, "Nguyen Van A","Male",18));
        stream_API.l_Student.add(new Student(2, "Le Thi B","Female",19));
        stream_API.l_Student.add(new Student(3, "Luong Thi C","Female",18));
        stream_API.l_Student.add(new Student(4, "Tran Van D","Male",20));
        stream_API.l_Student.add(new Student(5, "Truong Van E","Male",22));
        stream_API.l_Student.add(new Student(6, "Hoang Van F","Male",20));
        stream_API.l_Student.add(new Student(7, "Tran Thi G","Female",22));
        stream_API.l_Student.add(new Student(8, "Le Van H","Male",23));
        stream_API.l_Student.add(new Student(9, "Hoang Thi L","Female",23));
        stream_API.l_Student.add(new Student(10, "Truong Thi M","Female",20));

        System.out.println("\nThe students after filtered by gender:");
        List<Student> l_Student_FilterByGender = Filter.ByGender(stream_API.l_Student);
        l_Student_FilterByGender
                .stream()
                .forEach(x->{
                    System.out.println(
                            "Student " + x.i_ID + ": " +
                            "Name: " + x.s_Name + ", " +
                            "Gender: " + x.s_Gender + ", " +
                            "Age: " + x.i_Age
                    );
                });

        List<Student> l_Student_FilterByAge = Filter.ByAge(stream_API.l_Student);
        Long long_Students_CountByAge = Filter.CountByAge(stream_API.l_Student);
        System.out.println("\nThe students after filtered by age: (" + long_Students_CountByAge + " student" + (long_Students_CountByAge > 2 ? "s" : "") + ")");
        l_Student_FilterByAge
                .stream()
                .forEach(x->{
                    System.out.println(
                            "Student " + x.i_ID + ": " +
                            "Name: " + x.s_Name + ", " +
                            "Gender: " + x.s_Gender + ", " +
                            "Age: " + x.i_Age
                    );
                });
    }
}
