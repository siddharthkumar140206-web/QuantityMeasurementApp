import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase10QuantityMsmtTest {

    // 1️⃣ Feet → Inches
    @Test
    void testLengthConversion() {

        double result =
                UseCase10QuantityMsmt
                        .LengthUnit.FEET
                        .convert(
                                1.0,
                                UseCase10QuantityMsmt
                                        .LengthUnit.INCHES
                        );

        assertEquals(12.0, result);
    }

    // 2️⃣ Kilogram → Gram
    @Test
    void testWeightConversion() {

        double result =
                UseCase10QuantityMsmt
                        .WeightUnit.KILOGRAM
                        .convert(
                                1.0,
                                UseCase10QuantityMsmt
                                        .WeightUnit.GRAM
                        );

        assertEquals(1000.0, result);
    }

    // 3️⃣ Length Equality
    @Test
    void testLengthEquality() {

        UseCase10QuantityMsmt.Quantity q1 =
                new UseCase10QuantityMsmt.Quantity(
                        1.0,
                        UseCase10QuantityMsmt
                                .LengthUnit.FEET
                );

        UseCase10QuantityMsmt.Quantity q2 =
                new UseCase10QuantityMsmt.Quantity(
                        12.0,
                        UseCase10QuantityMsmt
                                .LengthUnit.INCHES
                );

        assertTrue(q1.equals(q2));
    }

    // 4️⃣ Weight Equality
    @Test
    void testWeightEquality() {

        UseCase10QuantityMsmt.Quantity q1 =
                new UseCase10QuantityMsmt.Quantity(
                        1.0,
                        UseCase10QuantityMsmt
                                .WeightUnit.KILOGRAM
                );

        UseCase10QuantityMsmt.Quantity q2 =
                new UseCase10QuantityMsmt.Quantity(
                        1000.0,
                        UseCase10QuantityMsmt
                                .WeightUnit.GRAM
                );

        assertTrue(q1.equals(q2));
    }

    // 5️⃣ Length Addition
    @Test
    void testLengthAddition() {

        UseCase10QuantityMsmt.Quantity q1 =
                new UseCase10QuantityMsmt.Quantity(
                        1.0,
                        UseCase10QuantityMsmt
                                .LengthUnit.FEET
                );

        UseCase10QuantityMsmt.Quantity q2 =
                new UseCase10QuantityMsmt.Quantity(
                        12.0,
                        UseCase10QuantityMsmt
                                .LengthUnit.INCHES
                );

        UseCase10QuantityMsmt.Quantity expected =
                new UseCase10QuantityMsmt.Quantity(
                        2.0,
                        UseCase10QuantityMsmt
                                .LengthUnit.FEET
                );

        assertTrue(
                q1.add(
                        q2,
                        UseCase10QuantityMsmt
                                .LengthUnit.FEET
                ).equals(expected)
        );
    }

    // 6️⃣ Weight Addition
    @Test
    void testWeightAddition() {

        UseCase10QuantityMsmt.Quantity q1 =
                new UseCase10QuantityMsmt.Quantity(
                        1.0,
                        UseCase10QuantityMsmt
                                .WeightUnit.KILOGRAM
                );

        UseCase10QuantityMsmt.Quantity q2 =
                new UseCase10QuantityMsmt.Quantity(
                        1000.0,
                        UseCase10QuantityMsmt
                                .WeightUnit.GRAM
                );

        UseCase10QuantityMsmt.Quantity expected =
                new UseCase10QuantityMsmt.Quantity(
                        2.0,
                        UseCase10QuantityMsmt
                                .WeightUnit.KILOGRAM
                );

        assertTrue(
                q1.add(
                        q2,
                        UseCase10QuantityMsmt
                                .WeightUnit.KILOGRAM
                ).equals(expected)
        );
    }

    // 7️⃣ Same Reference
    @Test
    void testEquality_SameReference() {

        UseCase10QuantityMsmt.Quantity q1 =
                new UseCase10QuantityMsmt.Quantity(
                        1.0,
                        UseCase10QuantityMsmt
                                .LengthUnit.FEET
                );

        assertTrue(q1.equals(q1));
    }

    // 8️⃣ Null Comparison
    @Test
    void testEquality_NullComparison() {

        UseCase10QuantityMsmt.Quantity q1 =
                new UseCase10QuantityMsmt.Quantity(
                        1.0,
                        UseCase10QuantityMsmt
                                .LengthUnit.FEET
                );

        assertFalse(q1.equals(null));
    }

    // 9️⃣ Different Value
    @Test
    void testEquality_DifferentValue() {

        UseCase10QuantityMsmt.Quantity q1 =
                new UseCase10QuantityMsmt.Quantity(
                        1.0,
                        UseCase10QuantityMsmt
                                .LengthUnit.FEET
                );

        UseCase10QuantityMsmt.Quantity q2 =
                new UseCase10QuantityMsmt.Quantity(
                        2.0,
                        UseCase10QuantityMsmt
                                .LengthUnit.FEET
                );

        assertFalse(q1.equals(q2));
    }
}

