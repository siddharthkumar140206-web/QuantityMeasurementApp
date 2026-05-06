package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase1QuantityMsmtTest {

    @Test
    void testEquality_SameValue() {

        UseCase1QuantityMsmt.Feet f1 =
                new UseCase1QuantityMsmt.Feet(1.0);

        UseCase1QuantityMsmt.Feet f2 =
                new UseCase1QuantityMsmt.Feet(1.0);

        assertTrue(f1.equals(f2));
    }
}
