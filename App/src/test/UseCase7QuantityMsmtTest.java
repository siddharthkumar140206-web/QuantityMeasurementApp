
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase7QuantityMsmtTest {

    // 1️⃣ Feet + Inches → Feet
    @Test
    void testAddition_FeetAndInches_ToFeet() {

        UseCase7QuantityMsmt.Length l1 =
                new UseCase7QuantityMsmt.Length(
                        1.0,
                        UseCase7QuantityMsmt.LengthUnit.FEET);

        UseCase7QuantityMsmt.Length l2 =
                new UseCase7QuantityMsmt.Length(
                        12.0,
                        UseCase7QuantityMsmt.LengthUnit.INCHES);

        UseCase7QuantityMsmt.Length expected =
                new UseCase7QuantityMsmt.Length(
                        2.0,
                        UseCase7QuantityMsmt.LengthUnit.FEET);

        assertTrue(
                l1.add(
                        l2,
                        UseCase7QuantityMsmt.LengthUnit.FEET
                ).equals(expected)
        );
    }

    // 2️⃣ Feet + Inches → Inches
    @Test
    void testAddition_FeetAndInches_ToInches() {

        UseCase7QuantityMsmt.Length l1 =
                new UseCase7QuantityMsmt.Length(
                        1.0,
                        UseCase7QuantityMsmt.LengthUnit.FEET);

        UseCase7QuantityMsmt.Length l2 =
                new UseCase7QuantityMsmt.Length(
                        12.0,
                        UseCase7QuantityMsmt.LengthUnit.INCHES);

        UseCase7QuantityMsmt.Length expected =
                new UseCase7QuantityMsmt.Length(
                        24.0,
                        UseCase7QuantityMsmt.LengthUnit.INCHES);

        assertTrue(
                l1.add(
                        l2,
                        UseCase7QuantityMsmt.LengthUnit.INCHES
                ).equals(expected)
        );
    }

    // 3️⃣ Yard + Feet → Yards
    @Test
    void testAddition_YardAndFeet_ToYards() {

        UseCase7QuantityMsmt.Length l1 =
                new UseCase7QuantityMsmt.Length(
                        1.0,
                        UseCase7QuantityMsmt.LengthUnit.YARDS);

        UseCase7QuantityMsmt.Length l2 =
                new UseCase7QuantityMsmt.Length(
                        3.0,
                        UseCase7QuantityMsmt.LengthUnit.FEET);

        UseCase7QuantityMsmt.Length expected =
                new UseCase7QuantityMsmt.Length(
                        2.0,
                        UseCase7QuantityMsmt.LengthUnit.YARDS);

        assertTrue(
                l1.add(
                        l2,
                        UseCase7QuantityMsmt.LengthUnit.YARDS
                ).equals(expected)
        );
    }

    // 4️⃣ Centimeter + Inches → Inches
    @Test
    void testAddition_CentimeterAndInches_ToInches() {

        UseCase7QuantityMsmt.Length l1 =
                new UseCase7QuantityMsmt.Length(
                        2.54,
                        UseCase7QuantityMsmt.LengthUnit.CENTIMETERS);

        UseCase7QuantityMsmt.Length l2 =
                new UseCase7QuantityMsmt.Length(
                        1.0,
                        UseCase7QuantityMsmt.LengthUnit.INCHES);

        UseCase7QuantityMsmt.Length expected =
                new UseCase7QuantityMsmt.Length(
                        2.0,
                        UseCase7QuantityMsmt.LengthUnit.INCHES);

        assertTrue(
                l1.add(
                        l2,
                        UseCase7QuantityMsmt.LengthUnit.INCHES
                ).equals(expected)
        );
    }

    // 5️⃣ Same Reference
    @Test
    void testEquality_SameReference() {

        UseCase7QuantityMsmt.Length l1 =
                new UseCase7QuantityMsmt.Length(
                        1.0,
                        UseCase7QuantityMsmt.LengthUnit.FEET);

        assertTrue(l1.equals(l1));
    }

    // 6️⃣ Null Comparison
    @Test
    void testEquality_NullComparison() {

        UseCase7QuantityMsmt.Length l1 =
                new UseCase7QuantityMsmt.Length(
                        1.0,
                        UseCase7QuantityMsmt.LengthUnit.FEET);

        assertFalse(l1.equals(null));
    }

    // 7️⃣ Different Value
    @Test
    void testEquality_DifferentValue() {

        UseCase7QuantityMsmt.Length l1 =
                new UseCase7QuantityMsmt.Length(
                        1.0,
                        UseCase7QuantityMsmt.LengthUnit.FEET);

        UseCase7QuantityMsmt.Length l2 =
                new UseCase7QuantityMsmt.Length(
                        2.0,
                        UseCase7QuantityMsmt.LengthUnit.FEET);

        assertFalse(l1.equals(l2));
    }

    // 8️⃣ Zero Addition
    @Test
    void testAddition_ZeroValue() {

        UseCase7QuantityMsmt.Length l1 =
                new UseCase7QuantityMsmt.Length(
                        0.0,
                        UseCase7QuantityMsmt.LengthUnit.FEET);

        UseCase7QuantityMsmt.Length l2 =
                new UseCase7QuantityMsmt.Length(
                        0.0,
                        UseCase7QuantityMsmt.LengthUnit.INCHES);

        UseCase7QuantityMsmt.Length expected =
                new UseCase7QuantityMsmt.Length(
                        0.0,
                        UseCase7QuantityMsmt.LengthUnit.FEET);

        assertTrue(
                l1.add(
                        l2,
                        UseCase7QuantityMsmt.LengthUnit.FEET
                ).equals(expected)
        );
    }

    // 9️⃣ Negative Value
    @Test
    void testAddition_NegativeValue() {

        UseCase7QuantityMsmt.Length l1 =
                new UseCase7QuantityMsmt.Length(
                        -1.0,
                        UseCase7QuantityMsmt.LengthUnit.FEET);

        UseCase7QuantityMsmt.Length l2 =
                new UseCase7QuantityMsmt.Length(
                        12.0,
                        UseCase7QuantityMsmt.LengthUnit.INCHES);

        UseCase7QuantityMsmt.Length expected =
                new UseCase7QuantityMsmt.Length(
                        0.0,
                        UseCase7QuantityMsmt.LengthUnit.FEET);

        assertTrue(
                l1.add(
                        l2,
                        UseCase7QuantityMsmt.LengthUnit.FEET
                ).equals(expected)
        );
    }
}