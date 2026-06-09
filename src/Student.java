public class Student {

    private int id;
    private String name;
    private long mobileNumber;
    private int age;


    public Student(int id,String name,long mobileNumber,int age){
        this.age = age;
        this.id = id;
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    public void setMobileNumber(long mobileNumber){
        this.mobileNumber = mobileNumber;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public long getMobileNumber(){
        return mobileNumber;
    }
    public int getId(){

        return id;
    }



}
