package test;

public class UseCase3QuantityMsmt {

    // -------- ENUM FOR UNITS --------
    enum LengthUnit {

        FEET(12.0),
        INCHES(1.0);

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

        // Compare equality
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

    // -------- FEET EQUALITY --------
    public static void demonstrateFeetEquality() {

        Length feet1 =
                new Length(1.0, LengthUnit.FEET);

        Length feet2 =
                new Length(1.0, LengthUnit.FEET);

        System.out.println("Input: 1.0 ft and 1.0 ft");
        System.out.println("Output: Equal (" + feet1.equals(feet2) + ")");
    }

    // -------- INCHES EQUALITY --------
    public static void demonstrateInchesEquality() {

        Length inch1 =
                new Length(1.0, LengthUnit.INCHES);

        Length inch2 =
                new Length(1.0, LengthUnit.INCHES);

        System.out.println("Input: 1.0 inch and 1.0 inch");
        System.out.println("Output: Equal (" + inch1.equals(inch2) + ")");
    }

    // -------- FEET & INCHES COMPARISON --------
    public static void demonstrateFeetInchesComparison() {

        Length feet =
                new Length(1.0, LengthUnit.FEET);

        Length inches =
                new Length(12.0, LengthUnit.INCHES);

        System.out.println("Input: 1.0 ft and 12.0 inches");
        System.out.println("Output: Equal (" + feet.equals(inches) + ")");
    }

    // -------- MAIN METHOD --------
    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("UC3 - Generic Quantity Measurement");
        System.out.println("=======================================\n");

        demonstrateFeetEquality();

        System.out.println();

        demonstrateInchesEquality();

        System.out.println();

        demonstrateFeetInchesComparison();

        System.out.println("\nUC3 completed successfully...");
    }
}