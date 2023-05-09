package h_objects;

public class Paint extends Rectangle implements IPriceable {
    public Paint(int width, int height) {
        setWidth(width);
        setHeight(height);
    }

    public int getPrice() {
        return getArea() * 400;
    }

    public void setWidth(int width) {
        if (width<=0) {
            throw new IllegalArgumentException("Wysokość nie może być zero lub mniejsze od zera");
        } else {
            this.width = width;
        }
    }

    public void setHeight(int height) {
        if (height<=0) {
            throw new IllegalArgumentException("Szerokość nie może być zero lub mniejsze od zera");
        } else {
            this.height = height;
        }
    }
}
