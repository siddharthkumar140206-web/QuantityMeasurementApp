import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase12QuantityMsmtTest {

    @Test
    void testAddition() {

        UseCase12QuantityMsmt.Quantity q1 =
                new UseCase12QuantityMsmt.Quantity(
                        5.0,
                        UseCase12QuantityMsmt.LengthUnit.FEET
                );

        UseCase12QuantityMsmt.Quantity q2 =
                new UseCase12QuantityMsmt.Quantity(
                        24.0,
                        UseCase12QuantityMsmt.LengthUnit.INCHES
                );

        UseCase12QuantityMsmt.Quantity expected =
                new UseCase12QuantityMsmt.Quantity(
                        7.0,
                        UseCase12QuantityMsmt.LengthUnit.FEET
                );

        assertTrue(q1.add(q2).equals(expected));
    }

    @Test
    void testSubtraction() {

        UseCase12QuantityMsmt.Quantity q1 =
                new UseCase12QuantityMsmt.Quantity(
                        5.0,
                        UseCase12QuantityMsmt.LengthUnit.FEET
                );

        UseCase12QuantityMsmt.Quantity q2 =
                new UseCase12QuantityMsmt.Quantity(
                        12.0,
                        UseCase12QuantityMsmt.LengthUnit.INCHES
                );

        UseCase12QuantityMsmt.Quantity expected =
                new UseCase12QuantityMsmt.Quantity(
                        4.0,
                        UseCase12QuantityMsmt.LengthUnit.FEET
                );

        assertTrue(q1.subtract(q2).equals(expected));
    }

    @Test
    void testMultiplication() {

        UseCase12QuantityMsmt.Quantity q1 =
                new UseCase12QuantityMsmt.Quantity(
                        5.0,
                        UseCase12QuantityMsmt.LengthUnit.FEET
                );

        UseCase12QuantityMsmt.Quantity expected =
                new UseCase12QuantityMsmt.Quantity(
                        10.0,
                        UseCase12QuantityMsmt.LengthUnit.FEET
                );

        assertTrue(q1.multiply(2).equals(expected));
    }

    @Test
    void testDivision() {

        UseCase12QuantityMsmt.Quantity q1 =
                new UseCase12QuantityMsmt.Quantity(
                        10.0,
                        UseCase12QuantityMsmt.LengthUnit.FEET
                );

        UseCase12QuantityMsmt.Quantity expected =
                new UseCase12QuantityMsmt.Quantity(
                        2.0,
                        UseCase12QuantityMsmt.LengthUnit.FEET
                );

        assertTrue(q1.divide(5).equals(expected));
    }
}