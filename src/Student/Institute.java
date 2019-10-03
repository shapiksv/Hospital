package Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Institute {
    //    Создать массив объектов. Вывести:
    static Student[] students = new Student[10];
    public static void main(String[] args) throws ParseException {
        Student student;
        for (int i = 0; i < 5; i++) {
            Date date = new SimpleDateFormat( "dd.MM.yyyy" ).parse("11.8.1986" + i);
            students[i]=student = new Student(i, "Sergey" + i,"Shapowal" + i,date, "Mitinskay" + i, 3785793 + i,"Kv" + i,1 + i,"grup");

        }
        for (int i = 5; i <10; i++) {
            Date date = new SimpleDateFormat( "dd.MM.yyyy" ).parse("11.8.1986" + i);
            students[i]=student = new Student(i, "Sergey" + i,"Shapowal" + i,date, "Mitinskay" + i, 3785793 + i,"Kv" + i,1 + i,"grup2");

        }
//    a) список студентов заданного факультета;
        String nidFacult = "Kv2";
        for(Student st : students){
            if(st.getFaculty().equals(nidFacult)){
                System.out.println(st.toString());
            }
        }

//
//    b) списки студентов для каждого факультета и курса;
        int nidCourse = 2;
        for(Student st : students){
            if(st.getFaculty().equals(nidFacult) && st.getCourse() == nidCourse){
                System.out.println(st.toString());
            }
        }
//
//    c) список студентов, родившихся после заданного года;
        Date nidDate = new SimpleDateFormat( "dd.MM.yyyy" ).parse("11.8.1991");
        for(Student st : students){
            if(nidDate.after(st.getBirthday())){
                System.out.println(st.toString());
            }
        }

//
//    d) список учебной группы.
        String nidGroup = "grup";
        for(Student st : students){
            if(st.getGroup().equals(nidGroup)){
                System.out.println(st.toString());
            }
        }

    }


}
