import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {
    private final SILab2 l = new SILab2();
    String username = new String();
    String password = new String();
    String email = new String();
    private final User u = new User(username,password,email);
    private List<String> allUsers(String... elems){
        return new ArrayList<>(Arrays.asList(elems));
    };
    @Test
    public void testEveryPath(){
        //user=null
        assertEquals(false,l.function(null,allUsers()));
        //username=null password=null
        u.username=null;
        u.password=null;
        assertEquals(false,l.function(u,allUsers()));
        //username=Ana password=AnA123
        u.username="Ana";
        u.password="AnA123";
        assertEquals(false,l.function(u,allUsers()));
        //username=anything password=abc12233@
        u.password="abc12233@";
        assertEquals(false,l.function(u,allUsers()));
        //username=anything password=abc12233D
        u.password="abc12233D";
        assertEquals(false,l.function(u,allUsers()));
        //username=anything password=123.@$243
        u.password="123.@$243";
        assertEquals(false,l.function(u,allUsers()));
        //username=anything password=aBC24.!6b
        u.password="aBC24.!6b";
        assertEquals(true,l.function(u,allUsers()));
    }
    @Test
    public void multipleConditions(){
        Exception ex;
        //if (user.getUsername()!=null && user.getPassword()!=null)
            //T&&T -> username !=null password !=null
            u.username="dasda";
            u.password="dsada";
            assertFalse(l.function(u,allUsers()));
            //T&&F -> username=anything password=null
            u.username="fsdfds";
            u.password=null;
            assertFalse(l.function(u,allUsers()));
            //F&&X -> username = null password=anything
            u.username=null;
            u.password="sdasda";
            assertFalse(l.function(u,allUsers()));

        //if (!passwordLower.contains(user.getUsername().toLowerCase()) && password.length()>=8)
            //T&&T -> username is not contained in pass and passwords lenght >=8
            u.username="Ana";
            u.password="A123$.231b";
            assertTrue(l.function(u,allUsers()));
            //T&&F -> username is not contained in pass and passwords length < 8
            u.username="Ana";
            u.password="sda";
            assertFalse(l.function(u,allUsers()));
            //F&&X -> username contained in pass and password=anything
            u.username="Ana";
            u.password="ana";
            assertFalse(l.function(u,allUsers()));

        //if (digit && upper && special)
            //T&&T&&T -> password contains digit,upper case and special sign
            u.username = "Ana";
            u.password = "AbC232.$dsa";
            assertTrue(l.function(u,allUsers()));
            //T&&T&&F -> password contains digit and upper case but not special sign
            u.password = "AbC232dsa";
            assertFalse(l.function(u,allUsers()));
            //T&&F&&T ->password contains digit and special sign but not upper case
            u.password = "b23$/2dsa";
            assertFalse(l.function(u,allUsers()));
            //F&&X&&X -> password does not contain a digit
            u.password = "AbC$$$dsa";
            assertFalse(l.function(u,allUsers()));
    }

}
