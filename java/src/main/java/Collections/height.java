package Collections;

public class height {
  public int feet;
   public int inches;

    public height(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    @Override
    public String toString() {
        return "height{" +
                "feet=" + feet +
                ", inches=" + inches +
                '}';
    }
}
