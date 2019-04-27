package agaStupak;

import com.google.common.base.Splitter;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SplitterTest {
    @Test
    public void shouldSplitStrings(){
        String value = "cup,tea,coffee";
        String[] expected = {"cup", "tea","coffee"};

        List<String> list = Splitter.on(',').splitToList(value);
        Assert.assertArrayEquals(list.toArray(),expected);
    }

    @Test
    public void shouldSplitTrimmedStrings(){
        String value = "rock   ,stone, bird,    fish";
        String[] expected = {"rock", "stone", "bird", "fish"};

        List<String> result = Splitter.on(',').trimResults().splitToList(value);
        Assert.assertArrayEquals(result.toArray(),expected);
    }

    @Test
    public void shouldSplitOmitEmptyStrings(){
        String values = "cat,,dog,,,fish";
        String[] expected = {"cat", "dog", "fish"};

        List<String> result = Splitter.on(',').omitEmptyStrings()
                .splitToList(values);
        Assert.assertArrayEquals(result.toArray(),expected);
    }
}
