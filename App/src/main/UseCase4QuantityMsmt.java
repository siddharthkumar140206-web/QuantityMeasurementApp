package test;

public class UseCase4QuantityMsmt {

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

    // -------- GENERIC LENGTH CLASS --------
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

        // Equality check
        @Override
        public boolean equals(Object obj) {

            if (this == obj)
                return true;

            if (obj == null || getClass() != obj.getClass())
                return false;

            Length other = (Length) obj;

            return Double.compare(
                    this.convertToBaseUnit(),
                    other.convertToBaseUnit()
            ) == 0;
        }
    }

    // -------- DEMO METHOD --------
    public static void demonstrateComparison(
            double value1,
            LengthUnit unit1,
            double value2,
            LengthUnit unit2) {

        Length length1 = new Length(value1, unit1);
        Length length2 = new Length(value2, unit2);

        System.out.println(
                "Input: Quantity(" + value1 + ", " + unit1 +
                        ") and Quantity(" + value2 + ", " + unit2 + ")"
        );

        System.out.println(
                "Output: Equal (" + length1.equals(length2) + ")\n"
        );
    }

    // -------- MAIN METHOD --------
    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC4 - Extended Unit Support");
        System.out.println("======================================\n");

        // Yard to Feet
        demonstrateComparison(
                1.0, LengthUnit.YARDS,
                3.0, LengthUnit.FEET
        );

        // Yard to Inches
        demonstrateComparison(
                1.0, LengthUnit.YARDS,
                36.0, LengthUnit.INCHES
        );

        // Yard to Yard
        demonstrateComparison(
                2.0, LengthUnit.YARDS,
                2.0, LengthUnit.YARDS
        );

        // Centimeter to Centimeter
        demonstrateComparison(
                2.0, LengthUnit.CENTIMETERS,
                2.0, LengthUnit.CENTIMETERS
        );

        // Centimeter to Inches
        demonstrateComparison(
                1.0, LengthUnit.CENTIMETERS,
                0.393701, LengthUnit.INCHES
        );

        System.out.println("UC4 completed successfully...");
    }
}
