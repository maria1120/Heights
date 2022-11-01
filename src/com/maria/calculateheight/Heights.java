package com.maria.calculateheight;

    public class Heights {

        private int feet;
        private int inches;


        public Heights() {
            super();
        }

        public Heights(int feet, int inches) {
            super();
            this.feet = feet;
            this.inches = inches;
        }

        public int getFeet() {
            return feet;
        }

        public void setFeet(int feet) {
            this.feet = feet;
        }

        public int getInches() {
            return inches;
        }

        public void setInches(int inches) {
            this.inches = inches;
        }

        public void sumHeight(Heights person1, Heights person2) {
            this.feet = person1.getFeet() + person2.getFeet();
            this.inches = person1.getInches() + person2.getInches();

            if (inches >= 12) {
                feet = feet + inches / 12;
                inches = inches % 12;
            }
        }
    }






