public class Adress {
    private String country;
    private String state;
    private String city;
    private String street;
    private int houseNr;
    private String additional;
    private int post;

    public Adress(){
        this.country = "Germany";
        this.state = "Bavaria";
        this.city = "Nuernberg";
        this.street = "Jumpstreet";
        this.houseNr = 21;
        this.additional = "b";
        this.post = 90402;
    }

    public String getCountry() {
        return country;
    }
    public String getState() {
        return state;
    }
    public String getCity() {
        return city;
    }
    public String getStreet() {
        return street;
    }
    public int getHouseNr() {
        return houseNr;
    }
    public String getAdditional() {
        return additional;
    }
    public int getPost() {
        return post;
    }
    @Override
    public String toString() {
        return "country:"+ country+" state: "+state+" city: "+ city+" street: "+street+" houseNr: "+ houseNr+" additional: "+additional+" post: "+ post;
    }
}
