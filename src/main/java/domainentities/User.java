package domainentities;

import Exceptions.InvalidPasswordException;

public class User {
    private String username;
    private String password;

    public User() {
        this("username", "Password1", false);
//        username = "username";
//        password = "password";
    }

    public User(String username, String password) throws InvalidPasswordException{
        this.username = username;
        setPassword(password);
    }

    private User(String username, String password, boolean b){
        this.username = username;
        try {
            setPassword(password);
        } catch (InvalidPasswordException e) {
            throw new IllegalArgumentException("Default password incorrect ", e);
        }

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

//    public void setPassword(String password) throws InvalidPasswordException {
//        if (password.length() < 6) {
//            throw new InvalidPasswordException("Password must be at least 6 characters of length");
//        } else this.password = password;
//    }

    public void setPassword(String password) throws InvalidPasswordException {
        String mustIncludeDigits = ".*[0-9]+.*";
        String mustIncludeUpperCase = ".*[A-Z]+.*";

        if(!password.matches(mustIncludeDigits)) {
            throw new InvalidPasswordException("Password must include digits");
        }
        if(!password.matches(mustIncludeUpperCase)) {
            throw new InvalidPasswordException("Password must include an upper case letter");
        }
        this.password = password;
    }

}
