import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertTrue;

/**
 * Created by kt on 26.02.2018.
 */
public class WriterTest {

    @Test
    public void test() {
        String[] args = new String[]{"target/sub1/sub2/newTextFile.txt", "My new Text"};

        Writer.main(args);

        File f = new File("target/sub1/sub2/newTextFile.txt");
        assertTrue(f.exists());

    }
}
