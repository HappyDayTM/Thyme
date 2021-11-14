public class Profile {
    private static int NextID = 1337000001;
    private final int id;
    private User user;
    private TimeTable timetable;
    private int vacDays;
    private int sickDays;
    private int accessLevel; //1-10 Higher -> more Rights

    public Profile(){
        this.id = NextID;
        this.user = new User();
        this.timetable = new TimeTable();
        this.vacDays = 28;
        this.sickDays = 0;
        this.accessLevel = 10;
    }

    @Override
    public String toString() {
        return "id:"+ id+" user: "+user+" timetable: "+ timetable+" vacDays: "+vacDays+" sickDays: "+ sickDays+" accessLevel: "+accessLevel;
    }
}
