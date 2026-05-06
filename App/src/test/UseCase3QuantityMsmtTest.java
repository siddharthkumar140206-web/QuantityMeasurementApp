package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase3QuantityMsmtTest {

    // -------- FEET TO FEET --------

    @Test
    void testEquality_FeetToFeet_SameValue() {

        UseCase3QuantityMsmt.Length length1 =
                new UseCase3QuantityMsmt.Length(
                        1.0,
                        UseCase3QuantityMsmt.LengthUnit.FEET
                );

        UseCase3QuantityMsmt.Length length2 =
                new UseCase3QuantityMsmt.Length(
                        1.0,
                        UseCase3QuantityMsmt.LengthUnit.FEET
                );

        assertTrue(length1.equals(length2));
    }

    // -------- INCH TO INCH --------

    @Test
    void testEquality_InchToInch_SameValue() {

        UseCase3QuantityMsmt.Length length1 =
                new UseCase3QuantityMsmt.Length(
                        1.0,
                        UseCase3QuantityMsmt.LengthUnit.INCHES
                );

        UseCase3QuantityMsmt.Length length2 =
                new UseCase3QuantityMsmt.Length(
                        1.0,
                        UseCase3QuantityMsmt.LengthUnit.INCHES
                );

        assertTrue(length1.equals(length2));
    }

    // -------- FEET TO INCHES --------

    @Test
    void testEquality_FeetToInch_EquivalentValue() {

        UseCase3QuantityMsmt.Length feet =
                new UseCase3QuantityMsmt.Length(
                        1.0,
                        UseCase3QuantityMsmt.LengthUnit.FEET
                );

        UseCase3QuantityMsmt.Length inches =
                new UseCase3QuantityMsmt.Length(
                        12.0,
                        UseCase3QuantityMsmt.LengthUnit.INCHES
                );

        assertTrue(feet.equals(inches));
    }

    // -------- DIFFERENT FEET VALUES --------

    @Test
    void testEquality_FeetToFeet_DifferentValue() {

        UseCase3QuantityMsmt.Length length1 =
                new UseCase3QuantityMsmt.Length(
                        1.0,
                        UseCase3QuantityMsmt.LengthUnit.FEET
                );

        UseCase3QuantityMsmt.Length length2 =
                new UseCase3QuantityMsmt.Length(
                        2.0,
                        UseCase3QuantityMsmt.LengthUnit.FEET
                );

        assertFalse(length1.equals(length2));
    }

    // -------- DIFFERENT INCH VALUES --------

    @Test
    void testEquality_InchToInch_DifferentValue() {

        UseCase3QuantityMsmt.Length length1 =
                new UseCase3QuantityMsmt.Length(
                        1.0,
                        UseCase3QuantityMsmt.LengthUnit.INCHES
                );

        UseCase3QuantityMsmt.Length length2 =
                new UseCase3QuantityMsmt.Length(
                        2.0,
                        UseCase3QuantityMsmt.LengthUnit.INCHES
                );

        assertFalse(length1.equals(length2));
    }

    // -------- NULL COMPARISON --------

    @Test
    void testEquality_NullComparison() {

        UseCase3QuantityMsmt.Length length =
                new UseCase3QuantityMsmt.Length(
                        1.0,
                        UseCase3QuantityMsmt.LengthUnit.FEET
                );

        assertFalse(length.equals(null));
    }

    // -------- SAME REFERENCE --------

    @Test
    void testEquality_SameReference() {

        UseCase3QuantityMsmt.Length length =
                new UseCase3QuantityMsmt.Length(
                        1.0,
                        UseCase3QuantityMsmt.LengthUnit.FEET
                );

        assertTrue(length.equals(length));
    }
}
