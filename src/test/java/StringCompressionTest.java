import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCompressionTest {

    @Test
    public void compressTest() {
        StringCompression stringCompression = new StringCompression();

        String result = stringCompression.compress("any");

        assertEquals("implement", result);

    }
}
