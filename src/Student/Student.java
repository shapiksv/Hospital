package Student;

import java.util.Date;

public class Student {
//    1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.
    private int id;
    private String lastName;
    private String firstName;
    private Date birthday;
    private String adress;
    private int phoneNumber;
    private String faculty;
    private int course;
    private String Group;

    public Student(int id, String lastName, String firstName, Date birthday, String adress, int phoneNumber, String faculty, int course, String group) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthday = birthday;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        Group = group;
    }

//    public Student(String faculty, int course) {
//        this.faculty = faculty;
//        this.course = course;
//    }
//
//    public Student(String lastName, String faculty, int course, String group) {
//        this.lastName = lastName;
//        this.faculty = faculty;
//        this.course = course;
//        Group = group;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", birthday=" + birthday +
                ", adress='" + adress + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", Group='" + Group + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return Group;
    }

    public void setGroup(String group) {
        Group = group;
    }
    //

}
