package School_Class;

class Box11 {
    private int ivol;
    private double dvol;
    public Box11(int w, int h, int d) {
        volume(w, h, d);
    }

    public Box11(double w, double h, double d) {
        volume(w,h,d);
    }
    private void volume(int w, int h, int d) {
        ivol = w * h * d;
    }
    private void volume(double w, double h, double d) {
        dvol = w * h * d;
    }

    public int get_ivol() {
        return ivol;
    }
    public double get_dvol() {
        return dvol;
    }
}
