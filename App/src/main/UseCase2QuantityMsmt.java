package test;

public class UseCase2QuantityMsmt {

    // -------- FEET CLASS --------
    static class Feet {

        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj)
                return true;

            if (obj == null || getClass() != obj.getClass())
                return false;

            Feet other = (Feet) obj;

            return Double.compare(this.value, other.value) == 0;
        }
    }

    // -------- INCHES CLASS --------
    static class Inches {

        private final double value;

        public Inches(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj)
                return true;

            if (obj == null || getClass() != obj.getClass())
                return false;

            Inches other = (Inches) obj;

            return Double.compare(this.value, other.value) == 0;
        }
    }

    // -------- FEET EQUALITY --------
    public static void demonstrateFeetEquality() {

        Feet f1 = new Feet(1.0);
        Feet f2 = new Feet(1.0);

        System.out.println("Input: 1.0 ft and 1.0 ft");
        System.out.println("Output: Equal (" + f1.equals(f2) + ")");
    }

    // -------- INCHES EQUALITY --------
    public static void demonstrateInchesEquality() {

        Inches i1 = new Inches(1.0);
        Inches i2 = new Inches(1.0);

        System.out.println("Input: 1.0 inch and 1.0 inch");
        System.out.println("Output: Equal (" + i1.equals(i2) + ")");
    }

    // -------- MAIN METHOD --------
    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC2 - Feet and Inches Equality");
        System.out.println("=====================================\n");

        demonstrateFeetEquality();

        System.out.println();

        demonstrateInchesEquality();

        System.out.println("\nUC2 completed successfully...");
    }
}