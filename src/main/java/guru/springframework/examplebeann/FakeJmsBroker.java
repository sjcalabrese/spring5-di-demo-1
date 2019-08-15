package guru.springframework.examplebeann;

public class FakeJmsBroker {

    private String Username;
    private String Password;
    private String url;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUser(String user) {
    }

    public void setPassWord(String passWord) {
    }
}
