
package childrenvaccination;

public class children {
    private int id;
    String name,father_name,Age,phone,city,VaccinNumber,Sex;
    public children(int id){
        super();
        this.id=id;
    }
    public children(int id,String name, String father_name, String Age, String phone, String city, String VaccinNumber,String Sex){
        super();
        this.id=id;
        this.name=name;
        this.father_name=father_name;
        this.Age=Age;
        this.phone=phone;
        this.city=city;
        this.VaccinNumber=VaccinNumber;
        this.Sex = Sex;
    }

    children(int aInt, String string, String string0, String string1, String string2, String string3, String string4, String string5,String string6) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getVaccinNumber() {
        return VaccinNumber;
    }

    public void setVaccinNumber(String VaccinNumber) {
        this.VaccinNumber= VaccinNumber;
    }
    public String getCity() {
        return city;
    }

    public void setRoll(String city) {
        this.city = city;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }
    public String getFather_name() {
        return father_name;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getID(){
        return id;
    }
    public String getSex(){
        return Sex;
    }
    public  void setID(int id){
        this.id=id;
    }

    
    
}
