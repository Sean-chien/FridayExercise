package Week1.classes;


    public class Rectangle {
        private String color;
        private int length;
        private int width;

        public Rectangle(String colour,int length,int width) {
            this.color = color;
            this.length = length;
            this.width = width;
        }

        public String getColour() {
            return color;
        }

        public int getLength() {
            return length;
        }

        public int getWidth() {
            return width;
        }

        public void setColour(String colour) {
            this.color = color;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public void setWidth(int width) {
            this.width = width;
        }


    public String getwidth() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void paint() {
        String paintColor = this.color.substring(0, 1);
        for (int row = 0; row < this.length; row++) {
            for (int col = 0; col < this.length; col++) {
                System.out.println(paintColor);
            }
            System.out.println();

        }
        for (int Row = 0; Row < this.width; Row++) {
            for (int col = 0; col < this.width; col++) {
                System.out.println(paintColor);
            }
            System.out.println();
        }
    }
}