public class UseCase13QuantityMsmt {

    interface Unit {
        double toBase(double value);
        double fromBase(double baseValue);
    }

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
        public double toBase(double value) {
            return value * conversionFactor;
        }

        @Override
        public double fromBase(double baseValue) {
            return baseValue / conversionFactor;
        }
    }

    enum OperationType {
        ADD,
        SUBTRACT
    }

    static class Quantity {

        double value;
        Unit unit;

        Quantity(double value, Unit unit) {
            this.value = value;
            this.unit = unit;
        }

        private Quantity operate(
                Quantity other,
                OperationType operationType
        ) {

            double baseValue1 =
                    unit.toBase(this.value);

            double baseValue2 =
                    other.unit.toBase(other.value);

            double result = 0;

            if (operationType ==
                    OperationType.ADD) {

                result =
                        baseValue1 + baseValue2;

            } else if (operationType ==
                    OperationType.SUBTRACT) {

                result =
                        baseValue1 - baseValue2;
            }

            double finalValue =
                    unit.fromBase(result);

            return new Quantity(
                    finalValue,
                    this.unit
            );
        }

        Quantity add(Quantity other) {
            return operate(
                    other,
                    OperationType.ADD
            );
        }

        Quantity subtract(Quantity other) {
            return operate(
                    other,
                    OperationType.SUBTRACT
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

            double baseValue1 =
                    unit.toBase(this.value);

            double baseValue2 =
                    other.unit.toBase(other.value);

            return Math.abs(
                    baseValue1 - baseValue2
            ) < 0.01;
        }

        @Override
        public String toString() {
            return value + " " + unit;
        }
    }

    public static void main(String[] args) {

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

        System.out.println(
                "Addition Result : "
                        + addition
        );

        System.out.println(
                "Subtraction Result : "
                        + subtraction
        );
    }
}