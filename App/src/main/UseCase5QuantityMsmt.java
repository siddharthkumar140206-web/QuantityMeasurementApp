package test;

public class UseCase5QuantityMsmt {

    // -------- ENUM FOR UNITS --------
    enum LengthUnit {

        FEET(12.0),
        INCHES(1.0),
        YARDS(36.0),
        CENTIMETERS(0.393701);

        private final double conversionFactor;

        LengthUnit(double conversionFactor) {
            this.conversionFactor = conversionFactor;
        }

        public double getConversionFactor() {
            return conversionFactor;
        }
    }

    // -------- LENGTH CLASS --------
    static class Length {

        private final double value;
        private final LengthUnit unit;

        // Constructor
        public Length(double value, LengthUnit unit) {
            this.value = value;
            this.unit = unit;
        }

        // Convert to base unit (inches)
        private double convertToBaseUnit() {
            return value * unit.getConversionFactor();
        }

        // Convert to another unit
        public Length convertTo(LengthUnit targetUnit) {

            if (targetUnit == null) {
                throw new IllegalArgumentException("Target unit cannot be null");
            }

            double baseValue = convertToBaseUnit();

            double convertedValue =
                    baseValue / targetUnit.getConversionFactor();

            return new Length(convertedValue, targetUnit);
        }

        // Equality check
        @Override
        public boolean equals(Object obj) {

            if (this == obj)
                return true;

            if (obj == null || getClass() != obj.getClass())
                return false;

            Length other = (Length) obj;

            return Math.abs(
                    this.convertToBaseUnit()
                            - other.convertToBaseUnit()
            ) < 0.0001;
        }

        @Override
        public String toString() {
            return value + " " + unit;
        }
    }

    // -------- STATIC CONVERSION METHOD --------
    public static Length demonstrateLengthConversion(
            double value,
            LengthUnit fromUnit,
            LengthUnit toUnit) {

        Length length = new Length(value, fromUnit);

        return length.convertTo(toUnit);
    }

    // -------- MAIN METHOD --------
    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("UC5 - Unit To Unit Conversion");
        System.out.println("=======================================\n");

        Length result1 =
                demonstrateLengthConversion(
                        1.0,
                        LengthUnit.FEET,
                        LengthUnit.INCHES
                );

        System.out.println("1 FOOT = " + result1);

        Length result2 =
                demonstrateLengthConversion(
                        3.0,
                        LengthUnit.YARDS,
                        LengthUnit.FEET
                );

        System.out.println("3 YARDS = " + result2);

        Length result3 =
                demonstrateLengthConversion(
                        36.0,
                        LengthUnit.INCHES,
                        LengthUnit.YARDS
                );

        System.out.println("36 INCHES = " + result3);

        Length result4 =
                demonstrateLengthConversion(
                        1.0,
                        LengthUnit.CENTIMETERS,
                        LengthUnit.INCHES
                );

        System.out.println("1 CM = " + result4);

        System.out.println("\nUC5 completed successfully...");
    }
}