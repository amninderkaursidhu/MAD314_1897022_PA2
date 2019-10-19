import java.util.ArrayList;
import java.util.List;

public class StudentDataSource {
    String password;
    String name;
    String id;
    private static StudentDataSource instance=null;


    private List<StudentDataSource> students=new ArrayList<>();
     private StudentDataSource()
     {
         StudentDataSource s1=new StudentDataSource() ;
     s1.name="amninder";
     s1.id="1897022";
     s1.password="12345";
     this.students.add(s1);
         System.out.println("rich");

     }
     public static StudentDataSource getInstance() {
         if (instance==null){
             instance=new StudentDataSource();

         }
return instance;
     }
     public void addstudents(StudentDataSource s1)
     {
         this.students.add(s1);

     }

    public List<StudentDataSource> getStudents() {
        return students;
    }
}

