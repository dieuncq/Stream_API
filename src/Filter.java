import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static List<Student> ByGender(List<Student> l_Student) {
        return l_Student
                .stream()
                .filter(x->x.s_Gender=="Male")
                .collect(Collectors.toList());
    }

    public static List<Student> ByAge(List<Student> l_Student) {
        return l_Student
                .stream()
                .filter(x->x.i_Age>20)
                .collect(Collectors.toList());
    }

    public static Long CountByAge(List<Student> l_Student) {
        return l_Student
                .stream()
                .filter(x->x.i_Age>20)
                .count();
    }
}
