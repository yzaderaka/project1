package registerTask;

public class Registeration {

    private String email;
    private String userName;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        if (!email.contains("@yahoo")) {
            System.out.println("Alowed domain only @yahoo.com, please provide proper email");
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        if (userName.isEmpty()) {
            System.out.println("Username cannot be emply, please provide username");
        } else if (userName.length() <= 6) {
            System.out.println("Username should be lagger than 6 letters");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        if (password.contains(userName)) {
            System.out.println("Password cannot contain username");
        } else if (password.isEmpty()) {
            System.out.println("Password cannot be empty");
        } else if (password.length() <= 6) {
            System.out.println("Password should be more than 6 characters ");
        }
    }
}
