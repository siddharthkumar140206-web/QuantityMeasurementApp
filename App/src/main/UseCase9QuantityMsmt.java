public class UseCase9QuantityMsmt {

    // ENUM FOR WEIGHT UNITS
    enum WeightUnit {

        KILOGRAM(1000.0),
        GRAM(1.0),
        POUND(453.592);

        private final double conversionFactor;

        WeightUnit(double conversionFactor) {
            this.conversionFactor = conversionFactor;
        }

        public double getConversionFactor() {
            return conversionFactor;
        }

        // CONVERSION METHOD
        public double convert(double value,
                              WeightUnit targetUnit) {

            double grams =
                    value * this.conversionFactor;

            return grams /
                    targetUnit.conversionFactor;
        }
    }

    // WEIGHT CLASS
    static class Weight {

        private final double value;
        private final WeightUnit unit;

        public Weight(double value,
                      WeightUnit unit) {

            this.value = value;
            this.unit = unit;
        }

        // CONVERT METHOD
        public Weight convertTo(
                WeightUnit targetUnit) {

            double convertedValue =
                    unit.convert(
                            value,
                            targetUnit
                    );

            return new Weight(
                    convertedValue,
                    targetUnit
            );
        }

        // ADD METHOD
        public Weight add(
                Weight other,
                WeightUnit targetUnit) {

            double value1 =
                    unit.convert(
                            value,
                            targetUnit
                    );

            double value2 =
                    other.unit.convert(
                            other.value,
                            targetUnit
                    );

            return new Weight(
                    value1 + value2,
                    targetUnit
            );
        }

        // BASE UNIT
        private double convertToBaseUnit() {

            return unit.convert(
                    value,
                    WeightUnit.GRAM
            );
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj)
                return true;

            if (obj == null ||
                    getClass() != obj.getClass())
                return false;

            Weight other = (Weight) obj;

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

    // DEMONSTRATION METHOD
    public static void demonstrateWeightAddition(
            double value1,
            WeightUnit unit1,
            double value2,
            WeightUnit unit2,
            WeightUnit targetUnit) {

        Weight w1 =
                new Weight(value1, unit1);

        Weight w2 =
                new Weight(value2, unit2);

        Weight result =
                w1.add(w2, targetUnit);

        System.out.println("==================================");
        System.out.println("UC9 - Weight Measurement");
        System.out.println("==================================");

        System.out.println("First Weight : " + w1);
        System.out.println("Second Weight : " + w2);
        System.out.println("Result : " + result);
    }

    // MAIN METHOD
    public static void main(String[] args) {

        demonstrateWeightAddition(
                1.0,
                WeightUnit.KILOGRAM,
                1000.0,
                WeightUnit.GRAM,
                WeightUnit.KILOGRAM
        );
    }
}