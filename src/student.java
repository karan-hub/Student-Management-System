public class student {
    private String name;
    private char gender;
    private  int rollNumber;
    private  String phoneNumber;
    private  String division;
    private  String std;

    public char getGender() {
        return gender;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getDivision() {
        return division;
    }

    public String getStanderd() {
        return std;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = (gender.equalsIgnoreCase("male"))?'M':'F';
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public void setStd(String std) {
        this.std = std;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public student(String name , char  gender , int rollNumber , String phoneNumber , String division , String std ){
        this.name = name;
        this.division=division;
        this.gender=gender;
        this.phoneNumber=phoneNumber;
        this.std = std;
        this.rollNumber=rollNumber;
    }
    public student(){
        this.name = "No name";
        this.division="no division";
        this.gender='G';
        this.phoneNumber="not provided";
        this.std = "NO standard";
        this.rollNumber=0;
    }

}
