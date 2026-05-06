
public class UseCase10QuantityMsmt {

    // UNIT INTERFACE
    interface Unit {

        double convert(double value, Unit targetUnit);
    }

    // LENGTH UNIT ENUM
    enum LengthUnit implements Unit {

        FEET(12.0),
        INCHES(1.0),
        YARDS(36.0),
        CENTIMETERS(0.393701);

        private final double conversionFactor;

        LengthUnit(double conversionFactor) {
            this.conversionFactor = conversionFactor;
        }

        @Override
        public double convert(double value,
                              Unit targetUnit) {

            LengthUnit target =
                    (LengthUnit) targetUnit;

            double inches =
                    value * this.conversionFactor;

            return inches /
                    target.conversionFactor;
        }
    }

    // WEIGHT UNIT ENUM
    enum WeightUnit implements Unit {

        KILOGRAM(1000.0),
        GRAM(1.0),
        POUND(453.592);

        private final double conversionFactor;

        WeightUnit(double conversionFactor) {
            this.conversionFactor = conversionFactor;
        }

        @Override
        public double convert(double value,
                              Unit targetUnit) {

            WeightUnit target =
                    (WeightUnit) targetUnit;

            double grams =
                    value * this.conversionFactor;

            return grams /
                    target.conversionFactor;
        }
    }

    // GENERIC QUANTITY CLASS
    static class Quantity {

        private final double value;
        private final Unit unit;

        public Quantity(double value,
                        Unit unit) {

            this.value = value;
            this.unit = unit;
        }

        // CONVERT METHOD
        public Quantity convertTo(Unit targetUnit) {

            double convertedValue =
                    unit.convert(value,
                            targetUnit);

            return new Quantity(
                    convertedValue,
                    targetUnit
            );
        }

        // ADD METHOD
        public Quantity add(
                Quantity other,
                Unit targetUnit) {

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

            return new Quantity(
                    value1 + value2,
                    targetUnit
            );
        }

        // BASE VALUE
        private double convertToBaseUnit() {

            if (unit instanceof LengthUnit) {

                return unit.convert(
                        value,
                        LengthUnit.INCHES
                );
            }

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

            Quantity other =
                    (Quantity) obj;

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
    public static void demonstrateQuantityAddition() {

        Quantity length1 =
                new Quantity(
                        1.0,
                        LengthUnit.FEET
                );

        Quantity length2 =
                new Quantity(
                        12.0,
                        LengthUnit.INCHES
                );

        Quantity lengthResult =
                length1.add(
                        length2,
                        LengthUnit.FEET
                );

        System.out.println("Length Result : "
                + lengthResult);

        Quantity weight1 =
                new Quantity(
                        1.0,
                        WeightUnit.KILOGRAM
                );

        Quantity weight2 =
                new Quantity(
                        1000.0,
                        WeightUnit.GRAM
                );

        Quantity weightResult =
                weight1.add(
                        weight2,
                        WeightUnit.KILOGRAM
                );

        System.out.println("Weight Result : "
                + weightResult);
    }

    // MAIN METHOD
    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println("UC10 - Generic Quantity Class");
        System.out.println("==================================");

        demonstrateQuantityAddition();
    }
}