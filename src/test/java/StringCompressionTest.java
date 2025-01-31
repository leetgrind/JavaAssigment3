import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCompressionTest {

    @Test
    public void compressTest() {
        StringCompression stringCompression = new StringCompression();

        String result = stringCompression.compress("any");

        assertEquals("implement", result);

    }

    @Test
    public void compressTest2() {
        StringCompression stringCompression = new StringCompression();

        String result = stringCompression.compress("test");

        assertEquals("implement", result);

    }
}
