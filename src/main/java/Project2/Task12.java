package Project2;


    abstract class Marks {
        abstract double getPercentage();
    }

    class A extends Marks {
        private double subject1;
        private double subject2;
        private double subject3;

        public A(double subject1, double subject2, double subject3) {
            this.subject1 = subject1;
            this.subject2 = subject2;
            this.subject3 = subject3;
        }

        @Override
        double getPercentage() {
            return (subject1 + subject2 + subject3) / 3;
        }
    }

    class B extends Marks {
        private double subject1;
        private double subject2;
        private double subject3;
        private double subject4;

        public B(double subject1, double subject2, double subject3, double subject4) {
            this.subject1 = subject1;
            this.subject2 = subject2;
            this.subject3 = subject3;
            this.subject4 = subject4;
        }

        @Override
        double getPercentage() {
            return (subject1 + subject2 + subject3 + subject4) / 4;
        }
    }


