package Project2;

public class Task14 {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if (isValidEmail(email)) {
            this.email = email;
            System.out.println("Email set successfully " + email);
        } else {
            System.out.println("Invalid email format. Valid email should be yahoo.");
        }
    }

    public void setUserName(String userName) {
        if (isValidUserName(userName)) {
            this.userName = userName;
            System.out.println("UserName set successfully " + userName);
        } else {
            System.out.println("Invalid userName. It cannot be empty and should be of length larger than 6 characters.");
        }
    }

    public void setPassword(String password) {
        if (isValidPassword(password)) {
            this.password = password;
            System.out.println("Password set successfully.");
        } else {
            System.out.println("Invalid password. It cannot be empty, should be of length larger than 6 characters, and cannot contain userName.");
        }
    }


    private boolean isValidEmail(String email) {
        return email.toLowerCase().endsWith("@yahoo.com");
    }

    private boolean isValidUserName(String userName) {
        return !userName.isEmpty() && userName.length() > 6;
    }

    private boolean isValidPassword(String password) {
        return !password.isEmpty() && password.length() > 6 && !password.contains(userName);
    }

    public static void main(String[] args) {
        Task14 registration = new Task14();


        registration.setEmail("arr123312@gmail.com");
        registration.setUserName("Argemeen");
        registration.setPassword("Dr12357Rd");
    }
}