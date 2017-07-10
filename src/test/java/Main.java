import org.junit.Test;

import static org.hamcrest.CoreMatchers.either;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class Main {

    @Test
    public void mainTest(){
        assertThat(30, is(30));
        assertThat(100.0, either(is(100.0)).or(is(90.0)));
    }

}
