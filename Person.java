public class Person extends CollegeList{
    private String name;
    private String contactNum;
    public void setName(String name){
        this.name = name;
    }
    public void setContactNum(String contactNum){
        this.contactNum = contactNum;
    }
    public String getName(){
        return name;
    }
    public String getContactNum(){
        return contactNum;
    }
    public void displayInfo(){
        System.out.println("----------------------------------------------------------------");
        System.out.println("Given Name: " + name);
        System.out.println("Contact Number: " + contactNum);
        System.out.println("----------------------------------------------------------------");
    }
}
