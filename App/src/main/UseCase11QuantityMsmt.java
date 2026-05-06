public class UseCase11QuantityMsmt {

    // UNIT INTERFACE
    interface Unit {

        double convert(double value,
                       Unit targetUnit);
    }

    // LENGTH UNIT ENUM
    enum LengthUnit implements Unit {

        FEET(12.0),
        INCHES(1.0);

        private final double conversionFactor;

        LengthUnit(double conversionFactor) {
            this.conversionFactor =
                    conversionFactor;
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
        GRAM(1.0);

        private final double conversionFactor;

        WeightUnit(double conversionFactor) {
            this.conversionFactor =
                    conversionFactor;
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

    // VOLUME UNIT ENUM
    enum VolumeUnit implements Unit {

        LITRE(1000.0),
        MILLILITRE(1.0),
        GALLON(3785.41);

        private final double conversionFactor;

        VolumeUnit(double conversionFactor) {
            this.conversionFactor =
                    conversionFactor;
        }

        @Override
        public double convert(double value,
                              Unit targetUnit) {

            VolumeUnit target =
                    (VolumeUnit) targetUnit;

            double millilitres =
                    value * this.conversionFactor;

            return millilitres /
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
        public Quantity convertTo(
                Unit targetUnit) {

            double convertedValue =
                    unit.convert(
                            value,
                            targetUnit
                    );

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

        // BASE UNIT
        private double convertToBaseUnit() {

            if (unit instanceof LengthUnit) {

                return unit.convert(
                        value,
                        LengthUnit.INCHES
                );
            }

            if (unit instanceof WeightUnit) {

                return unit.convert(
                        value,
                        WeightUnit.GRAM
                );
            }

            return unit.convert(
                    value,
                    VolumeUnit.MILLILITRE
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
    public static void demonstrateVolumeAddition() {

        Quantity q1 =
                new Quantity(
                        1.0,
                        VolumeUnit.LITRE
                );

        Quantity q2 =
                new Quantity(
                        1000.0,
                        VolumeUnit.MILLILITRE
                );

        Quantity result =
                q1.add(
                        q2,
                        VolumeUnit.LITRE
                );

        System.out.println("==================================");
        System.out.println("UC11 - Volume Measurement");
        System.out.println("==================================");

        System.out.println("First Quantity : " + q1);
        System.out.println("Second Quantity : " + q2);
        System.out.println("Result : " + result);
    }

    // MAIN METHOD
    public static void main(String[] args) {

        demonstrateVolumeAddition();
    }
}