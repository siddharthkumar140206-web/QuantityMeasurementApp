public class UseCase12QuantityMsmt {

    interface Unit {
        double convert(double value, Unit targetUnit);
    }

    enum LengthUnit implements Unit {

        FEET(12.0),
        INCHES(1.0),
        YARDS(36.0),
        CENTIMETERS(0.393701);

        double conversionFactor;

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

    static class Quantity {

        double value;
        Unit unit;

        Quantity(double value,
                 Unit unit) {

            this.value = value;
            this.unit = unit;
        }

        Quantity add(Quantity other) {

            double converted =
                    other.unit.convert(
                            other.value,
                            this.unit
                    );

            return new Quantity(
                    this.value + converted,
                    this.unit
            );
        }

        Quantity subtract(Quantity other) {

            double converted =
                    other.unit.convert(
                            other.value,
                            this.unit
                    );

            return new Quantity(
                    this.value - converted,
                    this.unit
            );
        }

        Quantity multiply(double factor) {

            return new Quantity(
                    this.value * factor,
                    this.unit
            );
        }

        Quantity divide(double divisor) {

            return new Quantity(
                    this.value / divisor,
                    this.unit
            );
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj)
                return true;

            if (!(obj instanceof Quantity))
                return false;

            Quantity other =
                    (Quantity) obj;

            double converted =
                    other.unit.convert(
                            other.value,
                            this.unit
                    );

            return Math.abs(
                    this.value - converted
            ) < 0.01;
        }

        @Override
        public String toString() {
            return value + " " + unit;
        }
    }

    public static void demonstrateOperations() {

        Quantity q1 =
                new Quantity(
                        5.0,
                        LengthUnit.FEET
                );

        Quantity q2 =
                new Quantity(
                        24.0,
                        LengthUnit.INCHES
                );

        Quantity addition =
                q1.add(q2);

        Quantity subtraction =
                q1.subtract(q2);

        Quantity multiplication =
                q1.multiply(2);

        Quantity division =
                q1.divide(5);

        System.out.println(
                "Addition Result : "
                        + addition
        );

        System.out.println(
                "Subtraction Result : "
                        + subtraction
        );

        System.out.println(
                "Multiplication Result : "
                        + multiplication
        );

        System.out.println(
                "Division Result : "
                        + division
        );
    }

    public static void main(String[] args) {

        demonstrateOperations();
    }
}