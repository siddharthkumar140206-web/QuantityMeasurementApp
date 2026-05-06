import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase13QuantityMsmtTest {

    @Test
    void testAddition() {

        UseCase13QuantityMsmt.Quantity q1 =
                new UseCase13QuantityMsmt.Quantity(
                        5.0,
                        UseCase13QuantityMsmt.LengthUnit.FEET
                );

        UseCase13QuantityMsmt.Quantity q2 =
                new UseCase13QuantityMsmt.Quantity(
                        24.0,
                        UseCase13QuantityMsmt.LengthUnit.INCHES
                );

        UseCase13QuantityMsmt.Quantity expected =
                new UseCase13QuantityMsmt.Quantity(
                        7.0,
                        UseCase13QuantityMsmt.LengthUnit.FEET
                );

        assertTrue(
                q1.add(q2).equals(expected)
        );
    }

    @Test
    void testSubtraction() {

        UseCase13QuantityMsmt.Quantity q1 =
                new UseCase13QuantityMsmt.Quantity(
                        5.0,
                        UseCase13QuantityMsmt.LengthUnit.FEET
                );

        UseCase13QuantityMsmt.Quantity q2 =
                new UseCase13QuantityMsmt.Quantity(
                        12.0,
                        UseCase13QuantityMsmt.LengthUnit.INCHES
                );

        UseCase13QuantityMsmt.Quantity expected =
                new UseCase13QuantityMsmt.Quantity(
                        4.0,
                        UseCase13QuantityMsmt.LengthUnit.FEET
                );

        assertTrue(
                q1.subtract(q2).equals(expected)
        );
    }

    @Test
    void testFeetAndInchesEquality() {

        UseCase13QuantityMsmt.Quantity q1 =
                new UseCase13QuantityMsmt.Quantity(
                        1.0,
                        UseCase13QuantityMsmt.LengthUnit.FEET
                );

        UseCase13QuantityMsmt.Quantity q2 =
                new UseCase13QuantityMsmt.Quantity(
                        12.0,
                        UseCase13QuantityMsmt.LengthUnit.INCHES
                );

        assertTrue(q1.equals(q2));
    }

    @Test
    void testYardsAndFeetEquality() {

        UseCase13QuantityMsmt.Quantity q1 =
                new UseCase13QuantityMsmt.Quantity(
                        1.0,
                        UseCase13QuantityMsmt.LengthUnit.YARDS
                );

        UseCase13QuantityMsmt.Quantity q2 =
                new UseCase13QuantityMsmt.Quantity(
                        3.0,
                        UseCase13QuantityMsmt.LengthUnit.FEET
                );

        assertTrue(q1.equals(q2));
    }
}