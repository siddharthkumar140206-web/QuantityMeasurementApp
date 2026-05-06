package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase2QuantityMsmtTest {

    // -------- FEET TEST CASES --------

    @Test
    void testFeetEquality_SameValue() {

        UseCase2QuantityMsmt.Feet f1 =
                new UseCase2QuantityMsmt.Feet(1.0);

        UseCase2QuantityMsmt.Feet f2 =
                new UseCase2QuantityMsmt.Feet(1.0);

        assertTrue(f1.equals(f2));
    }

    @Test
    void testFeetEquality_DifferentValue() {

        UseCase2QuantityMsmt.Feet f1 =
                new UseCase2QuantityMsmt.Feet(1.0);

        UseCase2QuantityMsmt.Feet f2 =
                new UseCase2QuantityMsmt.Feet(2.0);

        assertFalse(f1.equals(f2));
    }

    @Test
    void testFeetEquality_NullComparison() {

        UseCase2QuantityMsmt.Feet f1 =
                new UseCase2QuantityMsmt.Feet(1.0);

        assertFalse(f1.equals(null));
    }

    @Test
    void testFeetEquality_SameReference() {

        UseCase2QuantityMsmt.Feet f1 =
                new UseCase2QuantityMsmt.Feet(1.0);

        assertTrue(f1.equals(f1));
    }

    // -------- INCHES TEST CASES --------

    @Test
    void testInchesEquality_SameValue() {

        UseCase2QuantityMsmt.Inches i1 =
                new UseCase2QuantityMsmt.Inches(1.0);

        UseCase2QuantityMsmt.Inches i2 =
                new UseCase2QuantityMsmt.Inches(1.0);

        assertTrue(i1.equals(i2));
    }

    @Test
    void testInchesEquality_DifferentValue() {

        UseCase2QuantityMsmt.Inches i1 =
                new UseCase2QuantityMsmt.Inches(1.0);

        UseCase2QuantityMsmt.Inches i2 =
                new UseCase2QuantityMsmt.Inches(2.0);

        assertFalse(i1.equals(i2));
    }

    @Test
    void testInchesEquality_NullComparison() {

        UseCase2QuantityMsmt.Inches i1 =
                new UseCase2QuantityMsmt.Inches(1.0);

        assertFalse(i1.equals(null));
    }

    @Test
    void testInchesEquality_SameReference() {

        UseCase2QuantityMsmt.Inches i1 =
                new UseCase2QuantityMsmt.Inches(1.0);

        assertTrue(i1.equals(i1));
    }
}
