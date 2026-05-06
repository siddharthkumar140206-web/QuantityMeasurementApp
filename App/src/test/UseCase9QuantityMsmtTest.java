import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase9QuantityMsmtTest {

    // 1️⃣ Kilogram → Gram
    @Test
    void testConversion_KgToGram() {

        double result =
                UseCase9QuantityMsmt.WeightUnit.KILOGRAM
                        .convert(
                                1.0,
                                UseCase9QuantityMsmt
                                        .WeightUnit.GRAM
                        );

        assertEquals(1000.0, result);
    }

    // 2️⃣ Gram → Kilogram
    @Test
    void testConversion_GramToKg() {

        double result =
                UseCase9QuantityMsmt.WeightUnit.GRAM
                        .convert(
                                2000.0,
                                UseCase9QuantityMsmt
                                        .WeightUnit.KILOGRAM
                        );

        assertEquals(2.0, result);
    }

    // 3️⃣ Pound → Gram
    @Test
    void testConversion_PoundToGram() {

        double result =
                UseCase9QuantityMsmt.WeightUnit.POUND
                        .convert(
                                1.0,
                                UseCase9QuantityMsmt
                                        .WeightUnit.GRAM
                        );

        assertEquals(
                453.592,
                result,
                0.01
        );
    }

    // 4️⃣ Equality Test
    @Test
    void testEquality_KgAndGram() {

        UseCase9QuantityMsmt.Weight w1 =
                new UseCase9QuantityMsmt.Weight(
                        1.0,
                        UseCase9QuantityMsmt
                                .WeightUnit.KILOGRAM
                );

        UseCase9QuantityMsmt.Weight w2 =
                new UseCase9QuantityMsmt.Weight(
                        1000.0,
                        UseCase9QuantityMsmt
                                .WeightUnit.GRAM
                );

        assertTrue(w1.equals(w2));
    }

    // 5️⃣ Addition Test
    @Test
    void testAddition_KgAndGram() {

        UseCase9QuantityMsmt.Weight w1 =
                new UseCase9QuantityMsmt.Weight(
                        1.0,
                        UseCase9QuantityMsmt
                                .WeightUnit.KILOGRAM
                );

        UseCase9QuantityMsmt.Weight w2 =
                new UseCase9QuantityMsmt.Weight(
                        1000.0,
                        UseCase9QuantityMsmt
                                .WeightUnit.GRAM
                );

        UseCase9QuantityMsmt.Weight expected =
                new UseCase9QuantityMsmt.Weight(
                        2.0,
                        UseCase9QuantityMsmt
                                .WeightUnit.KILOGRAM
                );

        assertTrue(
                w1.add(
                        w2,
                        UseCase9QuantityMsmt
                                .WeightUnit.KILOGRAM
                ).equals(expected)
        );
    }

    // 6️⃣ Pound + Gram
    @Test
    void testAddition_PoundAndGram() {

        UseCase9QuantityMsmt.Weight w1 =
                new UseCase9QuantityMsmt.Weight(
                        1.0,
                        UseCase9QuantityMsmt
                                .WeightUnit.POUND
                );

        UseCase9QuantityMsmt.Weight w2 =
                new UseCase9QuantityMsmt.Weight(
                        453.592,
                        UseCase9QuantityMsmt
                                .WeightUnit.GRAM
                );

        UseCase9QuantityMsmt.Weight expected =
                new UseCase9QuantityMsmt.Weight(
                        2.0,
                        UseCase9QuantityMsmt
                                .WeightUnit.POUND
                );

        assertTrue(
                w1.add(
                        w2,
                        UseCase9QuantityMsmt
                                .WeightUnit.POUND
                ).equals(expected)
        );
    }

    // 7️⃣ Same Reference
    @Test
    void testEquality_SameReference() {

        UseCase9QuantityMsmt.Weight w1 =
                new UseCase9QuantityMsmt.Weight(
                        1.0,
                        UseCase9QuantityMsmt
                                .WeightUnit.KILOGRAM
                );

        assertTrue(w1.equals(w1));
    }

    // 8️⃣ Null Comparison
    @Test
    void testEquality_NullComparison() {

        UseCase9QuantityMsmt.Weight w1 =
                new UseCase9QuantityMsmt.Weight(
                        1.0,
                        UseCase9QuantityMsmt
                                .WeightUnit.KILOGRAM
                );

        assertFalse(w1.equals(null));
    }

    // 9️⃣ Different Value
    @Test
    void testEquality_DifferentValue() {

        UseCase9QuantityMsmt.Weight w1 =
                new UseCase9QuantityMsmt.Weight(
                        1.0,
                        UseCase9QuantityMsmt
                                .WeightUnit.KILOGRAM
                );

        UseCase9QuantityMsmt.Weight w2 =
                new UseCase9QuantityMsmt.Weight(
                        2.0,
                        UseCase9QuantityMsmt
                                .WeightUnit.KILOGRAM
                );

        assertFalse(w1.equals(w2));
    }
}