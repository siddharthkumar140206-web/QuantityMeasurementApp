package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase5QuantityMsmtTest {

    // -------- FEET TO INCHES --------

    @Test
    void testConversion_FeetToInches() {

        UseCase5QuantityMsmt.Length result =
                UseCase5QuantityMsmt.demonstrateLengthConversion(
                        1.0,
                        UseCase5QuantityMsmt.LengthUnit.FEET,
                        UseCase5QuantityMsmt.LengthUnit.INCHES
                );

        UseCase5QuantityMsmt.Length expected =
                new UseCase5QuantityMsmt.Length(
                        12.0,
                        UseCase5QuantityMsmt.LengthUnit.INCHES
                );

        assertTrue(result.equals(expected));
    }

    // -------- INCHES TO FEET --------

    @Test
    void testConversion_InchesToFeet() {

        UseCase5QuantityMsmt.Length result =
                UseCase5QuantityMsmt.demonstrateLengthConversion(
                        24.0,
                        UseCase5QuantityMsmt.LengthUnit.INCHES,
                        UseCase5QuantityMsmt.LengthUnit.FEET
                );

        UseCase5QuantityMsmt.Length expected =
                new UseCase5QuantityMsmt.Length(
                        2.0,
                        UseCase5QuantityMsmt.LengthUnit.FEET
                );

        assertTrue(result.equals(expected));
    }

    // -------- YARDS TO INCHES --------

    @Test
    void testConversion_YardsToInches() {

        UseCase5QuantityMsmt.Length result =
                UseCase5QuantityMsmt.demonstrateLengthConversion(
                        1.0,
                        UseCase5QuantityMsmt.LengthUnit.YARDS,
                        UseCase5QuantityMsmt.LengthUnit.INCHES
                );

        UseCase5QuantityMsmt.Length expected =
                new UseCase5QuantityMsmt.Length(
                        36.0,
                        UseCase5QuantityMsmt.LengthUnit.INCHES
                );

        assertTrue(result.equals(expected));
    }

    // -------- INCHES TO YARDS --------

    @Test
    void testConversion_InchesToYards() {

        UseCase5QuantityMsmt.Length result =
                UseCase5QuantityMsmt.demonstrateLengthConversion(
                        72.0,
                        UseCase5QuantityMsmt.LengthUnit.INCHES,
                        UseCase5QuantityMsmt.LengthUnit.YARDS
                );

        UseCase5QuantityMsmt.Length expected =
                new UseCase5QuantityMsmt.Length(
                        2.0,
                        UseCase5QuantityMsmt.LengthUnit.YARDS
                );

        assertTrue(result.equals(expected));
    }

    // -------- CM TO INCHES --------

    @Test
    void testConversion_CentimetersToInches() {

        UseCase5QuantityMsmt.Length result =
                UseCase5QuantityMsmt.demonstrateLengthConversion(
                        2.54,
                        UseCase5QuantityMsmt.LengthUnit.CENTIMETERS,
                        UseCase5QuantityMsmt.LengthUnit.INCHES
                );

        UseCase5QuantityMsmt.Length expected =
                new UseCase5QuantityMsmt.Length(
                        1.0,
                        UseCase5QuantityMsmt.LengthUnit.INCHES
                );

        assertTrue(result.equals(expected));
    }

    // -------- FEET TO YARDS --------

    @Test
    void testConversion_FeetToYards() {

        UseCase5QuantityMsmt.Length result =
                UseCase5QuantityMsmt.demonstrateLengthConversion(
                        6.0,
                        UseCase5QuantityMsmt.LengthUnit.FEET,
                        UseCase5QuantityMsmt.LengthUnit.YARDS
                );

        UseCase5QuantityMsmt.Length expected =
                new UseCase5QuantityMsmt.Length(
                        2.0,
                        UseCase5QuantityMsmt.LengthUnit.YARDS
                );

        assertTrue(result.equals(expected));
    }

    // -------- ZERO VALUE --------

    @Test
    void testConversion_ZeroValue() {

        UseCase5QuantityMsmt.Length result =
                UseCase5QuantityMsmt.demonstrateLengthConversion(
                        0.0,
                        UseCase5QuantityMsmt.LengthUnit.FEET,
                        UseCase5QuantityMsmt.LengthUnit.INCHES
                );

        UseCase5QuantityMsmt.Length expected =
                new UseCase5QuantityMsmt.Length(
                        0.0,
                        UseCase5QuantityMsmt.LengthUnit.INCHES
                );

        assertTrue(result.equals(expected));
    }

    // -------- NEGATIVE VALUE --------

    @Test
    void testConversion_NegativeValue() {

        UseCase5QuantityMsmt.Length result =
                UseCase5QuantityMsmt.demonstrateLengthConversion(
                        -1.0,
                        UseCase5QuantityMsmt.LengthUnit.FEET,
                        UseCase5QuantityMsmt.LengthUnit.INCHES
                );

        UseCase5QuantityMsmt.Length expected =
                new UseCase5QuantityMsmt.Length(
                        -12.0,
                        UseCase5QuantityMsmt.LengthUnit.INCHES
                );

        assertTrue(result.equals(expected));
    }

    // -------- NULL UNIT --------

    @Test
    void testConversion_InvalidUnit_Throws() {

        assertThrows(
                IllegalArgumentException.class,
                () -> UseCase5QuantityMsmt.demonstrateLengthConversion(
                        1.0,
                        UseCase5QuantityMsmt.LengthUnit.FEET,
                        null
                )
        );
    }
}
