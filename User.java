import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class User {
    private static int NextID = 1337000001;
    private final int id;
    private String name;
    private String middle;
    private String sure;
    private String gender;
    private Date birthday;
    private ArrayList<String> languages;
    private Adress adress;
    private String email;

    public User(){
        Calendar cal = Calendar.getInstance();
        cal.set(199, 0, 1);
        id = NextID;
        NextID++;
        name = "Max";
        middle = "imilian";
        sure = "Mustermann";
        gender = "Male";
        birthday = cal.getTime();
        languages = new ArrayList<String>();
        languages.add("German");
        adress = new Adress();
        email = "Maximilian@Mustermann.de";
    }
    public User(String name, String middle, String sure, String gender, Date birthday, ArrayList<String> languages, Adress adress, String email){
        id = NextID;
        NextID++;
        this.name = name;
        this.middle = middle;
        this.sure = sure;
        this.gender = gender;
        this.birthday = birthday;
        this.languages = languages;
        this.adress = adress;
        this.email = email;
    }
    public User(String name, String middle, String sure, String gender, Date birthday, String language, Adress adress, String email){
        id = NextID;
        NextID++;
        this.name = name;
        this.middle = middle;
        this.sure = sure;
        this.gender = gender;
        this.birthday = birthday;
        this.languages.add(language);
        this.adress = adress;
        this.email = email;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void setMiddle(String middle) {
        this.middle = middle;
    }
    public void setSure(String sure) {
        this.sure = sure;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public void setLanguages(ArrayList<String> languages) {
        this.languages = languages;
    }
    public void setAdress(Adress adress) {
        this.adress = adress;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getMiddle() {
        return middle;
    }
    public String getSure() {
        return sure;
    }
    public String getGender() {
        return gender;
    }
    public Date getBirthday() {
        return birthday;
    }
    public Adress getAdress() {
        return adress;
    }
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "id:"+ id+" name: "+name+" middle: "+ middle+" sure: "+sure+" gender: "+ gender+" birthday: "+birthday+" adress: "+ adress+" email: "+email;
    }
}
