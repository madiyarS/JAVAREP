public class UserDetails {
    private String name;
    private String Email;

    public  UserDetails(){
            name = "";
            Email = "";
    }
    public void setEmail(String email) {
        Email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public String getName() {
        return name;
    }
}
