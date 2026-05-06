import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase8QuantityMsmtTest {

    // 1️⃣ Feet → Inches
    @Test
    void testConversion_FeetToInches() {

        double result =
                UseCase8QuantityMsmt.LengthUnit.FEET
                        .convert(
                                1.0,
                                UseCase8QuantityMsmt
                                        .LengthUnit.INCHES
                        );

        assertEquals(12.0, result);
    }

    // 2️⃣ Inches → Feet
    @Test
    void testConversion_InchesToFeet() {

        double result =
                UseCase8QuantityMsmt.LengthUnit.INCHES
                        .convert(
                                24.0,
                                UseCase8QuantityMsmt
                                        .LengthUnit.FEET
                        );

        assertEquals(2.0, result);
    }

    // 3️⃣ Yards → Feet
    @Test
    void testConversion_YardsToFeet() {

        double result =
                UseCase8QuantityMsmt.LengthUnit.YARDS
                        .convert(
                                1.0,
                                UseCase8QuantityMsmt
                                        .LengthUnit.FEET
                        );

        assertEquals(3.0, result);
    }

    // 4️⃣ Centimeters → Inches
    @Test
    void testConversion_CentimetersToInches() {

        double result =
                UseCase8QuantityMsmt
                        .LengthUnit.CENTIMETERS
                        .convert(
                                2.54,
                                UseCase8QuantityMsmt
                                        .LengthUnit.INCHES
                        );

        assertEquals(
                1.0,
                result,
                0.01
        );
    }

    // 5️⃣ Equality Test
    @Test
    void testEquality_FeetAndInches() {

        UseCase8QuantityMsmt.Length l1 =
                new UseCase8QuantityMsmt.Length(
                        1.0,
                        UseCase8QuantityMsmt
                                .LengthUnit.FEET
                );

        UseCase8QuantityMsmt.Length l2 =
                new UseCase8QuantityMsmt.Length(
                        12.0,
                        UseCase8QuantityMsmt
                                .LengthUnit.INCHES
                );

        assertTrue(l1.equals(l2));
    }

    // 6️⃣ Addition Test
    @Test
    void testAddition_FeetAndInches() {

        UseCase8QuantityMsmt.Length l1 =
                new UseCase8QuantityMsmt.Length(
                        1.0,
                        UseCase8QuantityMsmt
                                .LengthUnit.FEET
                );

        UseCase8QuantityMsmt.Length l2 =
                new UseCase8QuantityMsmt.Length(
                        12.0,
                        UseCase8QuantityMsmt
                                .LengthUnit.INCHES
                );

        UseCase8QuantityMsmt.Length expected =
                new UseCase8QuantityMsmt.Length(
                        2.0,
                        UseCase8QuantityMsmt
                                .LengthUnit.FEET
                );

        assertTrue(
                l1.add(
                        l2,
                        UseCase8QuantityMsmt
                                .LengthUnit.FEET
                ).equals(expected)
        );
    }

    // 7️⃣ Same Reference
    @Test
    void testEquality_SameReference() {

        UseCase8QuantityMsmt.Length l1 =
                new UseCase8QuantityMsmt.Length(
                        1.0,
                        UseCase8QuantityMsmt
                                .LengthUnit.FEET
                );

        assertTrue(l1.equals(l1));
    }

    // 8️⃣ Null Comparison
    @Test
    void testEquality_NullComparison() {

        UseCase8QuantityMsmt.Length l1 =
                new UseCase8QuantityMsmt.Length(
                        1.0,
                        UseCase8QuantityMsmt
                                .LengthUnit.FEET
                );

        assertFalse(l1.equals(null));
    }

    // 9️⃣ Different Value
    @Test
    void testEquality_DifferentValue() {

        UseCase8QuantityMsmt.Length l1 =
                new UseCase8QuantityMsmt.Length(
                        1.0,
                        UseCase8QuantityMsmt
                                .LengthUnit.FEET
                );

        UseCase8QuantityMsmt.Length l2 =
                new UseCase8QuantityMsmt.Length(
                        2.0,
                        UseCase8QuantityMsmt
                                .LengthUnit.FEET
                );

        assertFalse(l1.equals(l2));
    }
}
