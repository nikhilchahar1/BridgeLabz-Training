import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength{
    int value();
}

class User{

    @MaxLength(10)
    private String username;

    public User(String username){
        try{
            Field field = this.getClass().getDeclaredField("username");
            MaxLength maxlen = field.getAnnotation(MaxLength.class);

            if(maxlen != null && username.length() > maxlen.value()){
                throw new IllegalArgumentException("Lengthy username.");
            }

            this.username = username;
        }
        catch(Exception e){
            throw new RuntimeException();
        }
    }

    public String getUsername(){
        return username;
    }
}


public class ValidateUsername {
    public static void main(String[] args){
        User user = new User("Nikhil");
        User user2 = new User("verylengthyusername");

        System.out.println(user.getUsername());
        System.out.println(user2.getUsername());
    }
}
