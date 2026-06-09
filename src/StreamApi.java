import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student souvik = new Student(34,"Souvik",8617584965L,26);
        Student sayantan = new Student(29,"Sayantan",8765984758L,23);
        Student susovon = new Student(1,"Susovon",8148498932L,28);
        Student suryadeep = new Student(1,"Suryadeep",9847583893L,22);
        Student alex = new Student(1,"Alex",6848869958L,21);
        Student sreya = new Student(1,"Sreya",9495859699L,23);
        Student sayani = new Student(1,"Sayani",43534646464L,27);
        Student arkendu = new Student(1,"arkendu",34643643643L,28);

        students.add(souvik);
        students.add(sreya);
        students.add(sayantan);
        students.add(susovon);
        students.add(suryadeep);
        students.add(arkendu);
        students.add(sayani);
        students.add(alex);

      List<String> data =  students.stream().filter(item-> item.getAge() > 25  ).limit(2).map(Student::getName).toList();

        System.out.println("Data "  + data);


    }
}
