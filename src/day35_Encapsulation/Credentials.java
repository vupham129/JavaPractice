package day35_Encapsulation;



public class Credentials {
    private String username;
    private String password;

    public Credentials(String username, String password) {
        setUsername(username);
        setPassword(password);

    }

    public boolean isStrongPassword(String password){
        int space =0, letter =0, digits =0, specialChar = 0;
        for (int i = 0; i < password.length(); i++) {
            char eachCh = password.charAt(i);
            if(Character.isSpaceChar(eachCh)){
                space++;
            }
            if(Character.isLetter(eachCh)){
                letter++;
            }
            if(!Character.isLetterOrDigit(eachCh)){
                specialChar++;
            }
            if(Character.isDigit(eachCh)){
                digits++;
            }
        }
        boolean isStrongPassword = (password.length()>=8&&space==0&&letter>=1&&specialChar>=1&&digits>=1)? true : false;
        return isStrongPassword;
    }

    public String getPassword(){
       return password;
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password) {
        if(isStrongPassword(password)){
            System.out.println("Your password is strong");
        }else{
            System.err.println("Your password is weak or contained space");
            return;

        }
        this.password = password;
    }

    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
/*
2. create a class named Credentials
            Variables:
                username, password

            Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is strong password
                            Characteristics of strong passwords are:
                                    1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit

                getPassword(): reads the password
                getUsername(): reads the username
                setUsername(): sets the username
                setPassword(): sets a new password
                                    the new password MUST be a strong password

                toString():

            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)
 */