package mockito.multi;

import org.junit.Test;

import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

public class HamcrestAllTest {

    @Test
    public void matcherTest(){
        List<Integer> list = Arrays.asList(12,13,14,15);

        assertThat(list, hasSize(4));
        assertThat(list, hasItem(14));
    }
}
