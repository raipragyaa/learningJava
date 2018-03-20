import com.thoughtworks.Basics;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class BasicsTest {

    private Basics basics;

    @Before
    public void setUp(){
        basics = new Basics();
    }

    @Test
    public void isEven(){
        assertTrue(basics.isEven(4));
    }

    @Test
    public  void isOdd(){
        assertTrue(basics.isOdd(5));
    }

    @Test
    public void checkSquare(){
        assertThat(basics.square(4),is(16));
    }

    @Test
    public void checkCube(){
        assertThat(basics.cube(3),is(27));
    }

    @Test
    public void checkGcd(){
        assertThat(basics.gcd(3,2),is(1));
    }

    @Test
    public void checkLcm(){
        assertThat(basics.lcm(2,3),is(6));
    }

    @Test
    public void checkFactorial(){
        assertThat(basics.factorial(5),is(120));
        assertThat(basics.factorial(6),is(720));
    }

    @Test
    public void sumOfNNumber(){
        assertThat(basics.sumOfNNumbers(2,5),is(14));
    }
}

