import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class UseCase6QuantityMsmtTest {

    // 1️⃣ Feet + Inches
    @Test
    void testAddition_FeetAndInches() {

        UseCase6QuantityMsmt.Length l1 =
                new UseCase6QuantityMsmt.Length(
                        1.0,
                        UseCase6QuantityMsmt.LengthUnit.FEET);

        UseCase6QuantityMsmt.Length l2 =
                new UseCase6QuantityMsmt.Length(
                        12.0,
                        UseCase6QuantityMsmt.LengthUnit.INCHES);

        UseCase6QuantityMsmt.Length expected =
                new UseCase6QuantityMsmt.Length(
                        2.0,
                        UseCase6QuantityMsmt.LengthUnit.FEET);

        assertTrue(l1.add(l2).equals(expected));
    }

    // 2️⃣ Inches + Inches
    @Test
    void testAddition_InchesAndInches() {

        UseCase6QuantityMsmt.Length l1 =
                new UseCase6QuantityMsmt.Length(
                        24.0,
                        UseCase6QuantityMsmt.LengthUnit.INCHES);

        UseCase6QuantityMsmt.Length l2 =
                new UseCase6QuantityMsmt.Length(
                        12.0,
                        UseCase6QuantityMsmt.LengthUnit.INCHES);

        UseCase6QuantityMsmt.Length expected =
                new UseCase6QuantityMsmt.Length(
                        36.0,
                        UseCase6QuantityMsmt.LengthUnit.INCHES);

        assertTrue(l1.add(l2).equals(expected));
    }

    // 3️⃣ Yard + Feet
    @Test
    void testAddition_YardAndFeet() {

        UseCase6QuantityMsmt.Length l1 =
                new UseCase6QuantityMsmt.Length(
                        1.0,
                        UseCase6QuantityMsmt.LengthUnit.YARDS);

        UseCase6QuantityMsmt.Length l2 =
                new UseCase6QuantityMsmt.Length(
                        3.0,
                        UseCase6QuantityMsmt.LengthUnit.FEET);

        UseCase6QuantityMsmt.Length expected =
                new UseCase6QuantityMsmt.Length(
                        2.0,
                        UseCase6QuantityMsmt.LengthUnit.YARDS);

        assertTrue(l1.add(l2).equals(expected));
    }

    // 4️⃣ Centimeter + Inches
    @Test
    void testAddition_CentimeterAndInches() {

        UseCase6QuantityMsmt.Length l1 =
                new UseCase6QuantityMsmt.Length(
                        2.54,
                        UseCase6QuantityMsmt.LengthUnit.CENTIMETERS);

        UseCase6QuantityMsmt.Length l2 =
                new UseCase6QuantityMsmt.Length(
                        1.0,
                        UseCase6QuantityMsmt.LengthUnit.INCHES);

        UseCase6QuantityMsmt.Length expected =
                new UseCase6QuantityMsmt.Length(
                        2.0,
                        UseCase6QuantityMsmt.LengthUnit.INCHES);

        assertTrue(
                l1.add(
                        l2.convertTo(
                                UseCase6QuantityMsmt.LengthUnit.CENTIMETERS
                        )
                ).equals(
                        expected.convertTo(
                                UseCase6QuantityMsmt.LengthUnit.CENTIMETERS
                        )
                )
        );
    }

    // 5️⃣ Same Reference
    @Test
    void testEquality_SameReference() {

        UseCase6QuantityMsmt.Length l1 =
                new UseCase6QuantityMsmt.Length(
                        1.0,
                        UseCase6QuantityMsmt.LengthUnit.FEET);

        assertTrue(l1.equals(l1));
    }

    // 6️⃣ Null Comparison
    @Test
    void testEquality_NullComparison() {

        UseCase6QuantityMsmt.Length l1 =
                new UseCase6QuantityMsmt.Length(
                        1.0,
                        UseCase6QuantityMsmt.LengthUnit.FEET);

        assertFalse(l1.equals(null));
    }

    // 7️⃣ Different Value
    @Test
    void testEquality_DifferentValue() {

        UseCase6QuantityMsmt.Length l1 =
                new UseCase6QuantityMsmt.Length(
                        1.0,
                        UseCase6QuantityMsmt.LengthUnit.FEET);

        UseCase6QuantityMsmt.Length l2 =
                new UseCase6QuantityMsmt.Length(
                        2.0,
                        UseCase6QuantityMsmt.LengthUnit.FEET);

        assertFalse(l1.equals(l2));
    }

    // 8️⃣ Zero Value Addition
    @Test
    void testAddition_ZeroValue() {

        UseCase6QuantityMsmt.Length l1 =
                new UseCase6QuantityMsmt.Length(
                        0.0,
                        UseCase6QuantityMsmt.LengthUnit.FEET);

        UseCase6QuantityMsmt.Length l2 =
                new UseCase6QuantityMsmt.Length(
                        0.0,
                        UseCase6QuantityMsmt.LengthUnit.INCHES);

        UseCase6QuantityMsmt.Length expected =
                new UseCase6QuantityMsmt.Length(
                        0.0,
                        UseCase6QuantityMsmt.LengthUnit.FEET);

        assertTrue(l1.add(l2).equals(expected));
    }

    // 9️⃣ Negative Value Addition
    @Test
    void testAddition_NegativeValue() {

        UseCase6QuantityMsmt.Length l1 =
                new UseCase6QuantityMsmt.Length(
                        -1.0,
                        UseCase6QuantityMsmt.LengthUnit.FEET);

        UseCase6QuantityMsmt.Length l2 =
                new UseCase6QuantityMsmt.Length(
                        12.0,
                        UseCase6QuantityMsmt.LengthUnit.INCHES);

        UseCase6QuantityMsmt.Length expected =
                new UseCase6QuantityMsmt.Length(
                        0.0,
                        UseCase6QuantityMsmt.LengthUnit.FEET);

        assertTrue(l1.add(l2).equals(expected));
    }
}

