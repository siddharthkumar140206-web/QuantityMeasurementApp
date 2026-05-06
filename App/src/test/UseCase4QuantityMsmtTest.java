package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase4QuantityMsmtTest {

    // -------- YARD TO YARD --------

    @Test
    void testEquality_YardToYard_SameValue() {

        UseCase4QuantityMsmt.Length length1 =
                new UseCase4QuantityMsmt.Length(
                        1.0,
                        UseCase4QuantityMsmt.LengthUnit.YARDS
                );

        UseCase4QuantityMsmt.Length length2 =
                new UseCase4QuantityMsmt.Length(
                        1.0,
                        UseCase4QuantityMsmt.LengthUnit.YARDS
                );

        assertTrue(length1.equals(length2));
    }

    @Test
    void testEquality_YardToYard_DifferentValue() {

        UseCase4QuantityMsmt.Length length1 =
                new UseCase4QuantityMsmt.Length(
                        1.0,
                        UseCase4QuantityMsmt.LengthUnit.YARDS
                );

        UseCase4QuantityMsmt.Length length2 =
                new UseCase4QuantityMsmt.Length(
                        2.0,
                        UseCase4QuantityMsmt.LengthUnit.YARDS
                );

        assertFalse(length1.equals(length2));
    }

    // -------- YARD TO FEET --------

    @Test
    void testEquality_YardToFeet_EquivalentValue() {

        UseCase4QuantityMsmt.Length yard =
                new UseCase4QuantityMsmt.Length(
                        1.0,
                        UseCase4QuantityMsmt.LengthUnit.YARDS
                );

        UseCase4QuantityMsmt.Length feet =
                new UseCase4QuantityMsmt.Length(
                        3.0,
                        UseCase4QuantityMsmt.LengthUnit.FEET
                );

        assertTrue(yard.equals(feet));
    }

    // -------- YARD TO INCHES --------

    @Test
    void testEquality_YardToInches_EquivalentValue() {

        UseCase4QuantityMsmt.Length yard =
                new UseCase4QuantityMsmt.Length(
                        1.0,
                        UseCase4QuantityMsmt.LengthUnit.YARDS
                );

        UseCase4QuantityMsmt.Length inches =
                new UseCase4QuantityMsmt.Length(
                        36.0,
                        UseCase4QuantityMsmt.LengthUnit.INCHES
                );

        assertTrue(yard.equals(inches));
    }

    // -------- CM TO CM --------

    @Test
    void testEquality_CentimeterToCentimeter_SameValue() {

        UseCase4QuantityMsmt.Length cm1 =
                new UseCase4QuantityMsmt.Length(
                        2.0,
                        UseCase4QuantityMsmt.LengthUnit.CENTIMETERS
                );

        UseCase4QuantityMsmt.Length cm2 =
                new UseCase4QuantityMsmt.Length(
                        2.0,
                        UseCase4QuantityMsmt.LengthUnit.CENTIMETERS
                );

        assertTrue(cm1.equals(cm2));
    }

    // -------- CM TO INCHES --------

    @Test
    void testEquality_CentimeterToInches_EquivalentValue() {

        UseCase4QuantityMsmt.Length cm =
                new UseCase4QuantityMsmt.Length(
                        1.0,
                        UseCase4QuantityMsmt.LengthUnit.CENTIMETERS
                );

        UseCase4QuantityMsmt.Length inches =
                new UseCase4QuantityMsmt.Length(
                        0.393701,
                        UseCase4QuantityMsmt.LengthUnit.INCHES
                );

        assertTrue(cm.equals(inches));
    }

    // -------- NULL COMPARISON --------

    @Test
    void testEquality_NullComparison() {

        UseCase4QuantityMsmt.Length length =
                new UseCase4QuantityMsmt.Length(
                        1.0,
                        UseCase4QuantityMsmt.LengthUnit.FEET
                );

        assertFalse(length.equals(null));
    }

    // -------- SAME REFERENCE --------

    @Test
    void testEquality_SameReference() {

        UseCase4QuantityMsmt.Length length =
                new UseCase4QuantityMsmt.Length(
                        1.0,
                        UseCase4QuantityMsmt.LengthUnit.YARDS
                );

        assertTrue(length.equals(length));
    }
}