package agaStupak;

import com.google.common.base.Joiner;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class JoinerTest {

    @Test
    public void shouldJoinNotNullStrings(){
        Joiner joiner = Joiner.on(" <3 ").skipNulls();
        String joined = joiner.join("I", null, "love", "Harry Potter");

        Assert.assertEquals("I <3 love <3 Harry Potter", joined);
    }

    @Test
    public void shouldJoinWithStringUserForNull(){
        Joiner joiner = Joiner.on(" <3 ").useForNull("really");
        String joined = joiner.join("I", null, "love", "Harry Potter");

        Assert.assertEquals("I <3 really <3 love <3 Harry Potter", joined);
    }

    @Test
    public void shouldJoinArray(){
        String joined = Joiner.on(",").join(Arrays.asList(1, 2, 3));

        Assert.assertEquals("1,2,3", joined);
    }
}
