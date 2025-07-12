import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StudentManagement {
    ArrayList<student> students = new ArrayList<>();

    public  void  addStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.print("please Enter Name of Student : ");
        String name = sc.nextLine();
        System.out.print("Enter Roll Number : ");
        int rollNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter gender : ");
        String gender =  sc.nextLine();
        System.out.print("Enter Phone Number : ");
        String phoneNumber = sc.nextLine();
        System.out.print("Enter devision : ");
        String division = sc.nextLine();
        System.out.print("Enter Class : ");
        String std = sc.nextLine();
        char Studentgender =  (gender.equalsIgnoreCase("male"))?'M':'F';
        students.add(new student(name , Studentgender , rollNumber ,phoneNumber ,division ,std));
    }
    public  void removeStudent(String identifier){
        Iterator<student> it = students.iterator();
        boolean found = false;
        while (it.hasNext()){
            student currentStudent = it.next();
            try{
                int rollNumber = Integer.parseInt(identifier);
                if (currentStudent.getRollNumber()==rollNumber){
                    it.remove();
                    System.out.println("🗑️ Student roll Number '" + identifier + "' deleted.");
                    found =  true ;
                    break;
                }
            }catch (NumberFormatException e){
                if (currentStudent.getName().equalsIgnoreCase(identifier)){
                     it.remove();
                    System.out.println("🗑️ Student named '" + identifier + "' deleted.");
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("❌ No matching student found.");
        }
    }
    public  void viewAllStudents(){
        System.out.println("All Students");
        for ( student s :  students){
            System.out.println( "Name: " + s.getName() +
                    " | Roll Number: " + s.getRollNumber() +
                    " | Gender: " + s.getGender() +
                    " | Class: " + s.getStanderd() );
        }
    }
    public  void updateStudent(int rollNumber){
        System.out.println("🔧 What do you want to update?");
        System.out.println("1. Name");
        System.out.println("2. Roll Number");
        System.out.println("3. Gender");
        System.out.println("4. Class");
        System.out.println("5. Phone Number");
        System.out.println("6. All details");
        System.out.print("Enter your choice:");
        Scanner sc=  new Scanner(System.in) ;
        int choice  = sc.nextInt();

        for (student s : students) {
            if (s.getRollNumber() == rollNumber) {
                switch (choice) {
                    case 1 -> {
                        System.out.println("Please enter name ");
                        String name =sc.nextLine();
                        updateName(name,s);
                    }
                    case 2 -> {
                        System.out.println("Please enter roll number ");
                        int roll =  sc.nextInt();
                        updateRollNumber(roll ,s );
                    }
                    case 3 -> {
                        System.out.println("Please enter  gender ");
                        String gender = sc.nextLine();
                        updateGender(gender,s);
                    }
                    case 4 -> {
                        System.out.println("Please enter student class ");
                        String StudentClass = sc.nextLine();
                        updateStudentClass(StudentClass,s );
                    }
                    case 5 -> {
                        System.out.println("Please enter phone ");
                        String phone = sc.nextLine();
                        updatePhoneNumber(phone,s);
                    }
                    case 6 -> {
                        sc.nextLine(); // flush
                        System.out.println("Please enter Name:");
                        String name = sc.nextLine();
                        updateName(name, s);

                        System.out.println("Please enter Roll Number:");
                        int roll = sc.nextInt();
                        updateRollNumber(roll, s);

                        sc.nextLine(); // flush
                        System.out.println("Please enter Gender:");
                        String gender = sc.nextLine();
                        updateGender(gender, s);

                        System.out.println("Please enter Student Class:");
                        String studentClass = sc.nextLine();
                        updateStudentClass(studentClass, s);

                        System.out.println("Please enter Phone Number:");
                        String phone = sc.nextLine();
                        updatePhoneNumber(phone, s);

                        System.out.println("✅ All details updated.");
                    }

                    default -> System.out.println("sorry " + choice + " not Available");

                }
            }

        }


    }
    private void updateName(String name , student s){
        s.setName(name);
    }
    private  void  updateRollNumber(int RollNumber,  student s ){
        s.setRollNumber(RollNumber);

    }
    private  void updateGender(String gender,  student s){
        s.setGender(gender);

    }
    private void  updateStudentClass(String StudentClass,  student s){
        s.setStd(StudentClass);
    }
    private  void updatePhoneNumber(String PhoneNumber,  student s){
        s.setPhoneNumber(PhoneNumber);

    }





}