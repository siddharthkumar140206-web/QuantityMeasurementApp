class UseCase6QuantityMsmt {

    // ENUM FOR UNITS
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

    // LENGTH CLASS
    static class Length {

        private final double value;
        private final LengthUnit unit;

        public Length(double value, LengthUnit unit) {
            this.value = value;
            this.unit = unit;
        }

        // Convert to inches
        private double convertToBaseUnit() {
            return value * unit.getConversionFactor();
        }

        // Convert to another unit
        public Length convertTo(LengthUnit targetUnit) {

            double inches = convertToBaseUnit();

            double convertedValue =
                    inches / targetUnit.getConversionFactor();

            return new Length(convertedValue, targetUnit);
        }

        // ADDITION METHOD
        public Length add(Length other) {

            double totalInches =
                    this.convertToBaseUnit()
                            + other.convertToBaseUnit();

            double result =
                    totalInches / this.unit.getConversionFactor();

            return new Length(result, this.unit);
        }

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

    // DEMO METHOD
    public static void demonstrateAddition(
            double value1,
            LengthUnit unit1,
            double value2,
            LengthUnit unit2) {

        Length length1 = new Length(value1, unit1);

        Length length2 = new Length(value2, unit2);

        Length result = length1.add(length2);

        System.out.println("==================================");
        System.out.println("UC6 - Addition of Length Units");
        System.out.println("==================================");

        System.out.println("First Length : " + length1);
        System.out.println("Second Length : " + length2);
        System.out.println("Result : " + result);
    }

    // MAIN METHOD
    public static void main(String[] args) {

        demonstrateAddition(
                1.0,
                LengthUnit.FEET,
                12.0,
                LengthUnit.INCHES
        );
    }
}
