import fr.lernejo.Sample;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SampleTest {

    @Test
    void op() {
        Assertions.assertEquals(10, new Sample().op(Sample.Operation.ADD, 5, 5));
        assertEquals(25, new Sample().op(Sample.Operation.MULT, 5, 5));
    }

    @Test
    void fact() {
        assertEquals(6, new Sample().fact(3));
        assertThrows(IllegalArgumentException.class,() -> new Sample().fact(-1));

    }

}
