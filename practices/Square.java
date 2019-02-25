package practices;

    public class Square {

            private String color;
            private int side;



        public Square(String color, int side) {
            this.color = color;
            this.side = side;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void paint() {
            String paintColor = this.color.substring(0, 1);
            for (int row = 0; row < this.side; row++) {
                for (int col = 0; col < this.side; col++) {
                    System.out.println(paintColor);
                }
                System.out.println();
            }
        }
    }




