import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase11QuantityMsmtTest {

    // 1️⃣ Litre → Millilitre
    @Test
    void testConversion_LitreToMillilitre() {

        double result =
                UseCase11QuantityMsmt
                        .VolumeUnit.LITRE
                        .convert(
                                1.0,
                                UseCase11QuantityMsmt
                                        .VolumeUnit.MILLILITRE
                        );

        assertEquals(1000.0, result);
    }

    // 2️⃣ Millilitre → Litre
    @Test
    void testConversion_MillilitreToLitre() {

        double result =
                UseCase11QuantityMsmt
                        .VolumeUnit.MILLILITRE
                        .convert(
                                2000.0,
                                UseCase11QuantityMsmt
                                        .VolumeUnit.LITRE
                        );

        assertEquals(2.0, result);
    }

    // 3️⃣ Gallon → Litre
    @Test
    void testConversion_GallonToLitre() {

        double result =
                UseCase11QuantityMsmt
                        .VolumeUnit.GALLON
                        .convert(
                                1.0,
                                UseCase11QuantityMsmt
                                        .VolumeUnit.LITRE
                        );

        assertEquals(
                3.785,
                result,
                0.01
        );
    }

    // 4️⃣ Equality Test
    @Test
    void testEquality_LitreAndMillilitre() {

        UseCase11QuantityMsmt.Quantity q1 =
                new UseCase11QuantityMsmt.Quantity(
                        1.0,
                        UseCase11QuantityMsmt
                                .VolumeUnit.LITRE
                );

        UseCase11QuantityMsmt.Quantity q2 =
                new UseCase11QuantityMsmt.Quantity(
                        1000.0,
                        UseCase11QuantityMsmt
                                .VolumeUnit.MILLILITRE
                );

        assertTrue(q1.equals(q2));
    }

    // 5️⃣ Addition Test
    @Test
    void testAddition_LitreAndMillilitre() {

        UseCase11QuantityMsmt.Quantity q1 =
                new UseCase11QuantityMsmt.Quantity(
                        1.0,
                        UseCase11QuantityMsmt
                                .VolumeUnit.LITRE
                );

        UseCase11QuantityMsmt.Quantity q2 =
                new UseCase11QuantityMsmt.Quantity(
                        1000.0,
                        UseCase11QuantityMsmt
                                .VolumeUnit.MILLILITRE
                );

        UseCase11QuantityMsmt.Quantity expected =
                new UseCase11QuantityMsmt.Quantity(
                        2.0,
                        UseCase11QuantityMsmt
                                .VolumeUnit.LITRE
                );

        assertTrue(
                q1.add(
                        q2,
                        UseCase11QuantityMsmt
                                .VolumeUnit.LITRE
                ).equals(expected)
        );
    }

    // 6️⃣ Gallon + Litre
    @Test
    void testAddition_GallonAndLitre() {

        UseCase11QuantityMsmt.Quantity q1 =
                new UseCase11QuantityMsmt.Quantity(
                        1.0,
                        UseCase11QuantityMsmt
                                .VolumeUnit.GALLON
                );

        UseCase11QuantityMsmt.Quantity q2 =
                new UseCase11QuantityMsmt.Quantity(
                        3.78541,
                        UseCase11QuantityMsmt
                                .VolumeUnit.LITRE
                );

        UseCase11QuantityMsmt.Quantity expected =
                new UseCase11QuantityMsmt.Quantity(
                        2.0,
                        UseCase11QuantityMsmt
                                .VolumeUnit.GALLON
                );

        assertTrue(
                q1.add(
                        q2,
                        UseCase11QuantityMsmt
                                .VolumeUnit.GALLON
                ).equals(expected)
        );
    }

    // 7️⃣ Same Reference
    @Test
    void testEquality_SameReference() {

        UseCase11QuantityMsmt.Quantity q1 =
                new UseCase11QuantityMsmt.Quantity(
                        1.0,
                        UseCase11QuantityMsmt
                                .VolumeUnit.LITRE
                );

        assertTrue(q1.equals(q1));
    }

    // 8️⃣ Null Comparison
    @Test
    void testEquality_NullComparison() {

        UseCase11QuantityMsmt.Quantity q1 =
                new UseCase11QuantityMsmt.Quantity(
                        1.0,
                        UseCase11QuantityMsmt
                                .VolumeUnit.LITRE
                );

        assertFalse(q1.equals(null));
    }

    // 9️⃣ Different Value
    @Test
    void testEquality_DifferentValue() {

        UseCase11QuantityMsmt.Quantity q1 =
                new UseCase11QuantityMsmt.Quantity(
                        1.0,
                        UseCase11QuantityMsmt
                                .VolumeUnit.LITRE
                );

        UseCase11QuantityMsmt.Quantity q2 =
                new UseCase11QuantityMsmt.Quantity(
                        2.0,
                        UseCase11QuantityMsmt
                                .VolumeUnit.LITRE
                );

        assertFalse(q1.equals(q2));
    }
}
