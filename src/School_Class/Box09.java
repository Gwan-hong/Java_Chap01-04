package School_Class;

class Box09 {
    private int width;
    private int height;
    private int depth;
    private int vol;

    public Box09(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        volume();
    }

    private void volume() {
        vol = width * height * depth;
    }

    public int getvolume() {
        return vol;
    }
}
