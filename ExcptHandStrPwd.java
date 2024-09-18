import java.util.Scanner;

class DigitException extends Exception{
    public DigitException(String message ){
        super(message);
    }
}

class SpecialException extends Exception{
    public SpecialException(String message ){
        super(message);
    }
}

class CaptialException extends Exception{
    public CaptialException(String message ){
        super(message);
    }
}

class SmallException extends Exception{
    public SmallException(String message ){
        super(message);
    }
}

class LengthException extends Exception{
    public LengthException(String message ){
        super(message);
    }
}

public class Main{
public static void strgpwd(String password) throws DigitException, SpecialException, CaptialException, SmallException, LengthException{
    //length
    if(password.length() < 12){ 
        throw new LengthException("Password must be 12 or more chars.");
    }
    //specail char
    if(!password.matches(".*[!@#$%^&*()-+=].*")){
        throw new SpecialException("password must contain Special character");
    } 
    //Capital check
    if(!password.matches(".*[A-Z]*.")){
        throw new CaptialException("password must contain Capital letter.");
    }
    //small check
    if(!password.matches(".*[a-z]*.")){
        throw new SmallException("password must contain Small letters");
    }
    //digit check 
    if(!password.matches(".*\\d.*")){
        throw new DigitException("password must contain a digit");
    }
}

public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Password : ");
    String password = scan.nextLine();
    try{
        strgpwd(password);
        System.out.println("Your Passwoed is Strong");
    }
    catch(DigitException | SpecialException | CaptialException | SmallException | LengthException e){
        System.out.println("Password is not Strong Enough." + e.getMessage());
    }
}
    
}
