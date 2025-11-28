package School_Class;

class Box08 {
    int width;
    int height;
    int depth;

    public Box08(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    int volume() {
        int vol = width * height * depth;
        return vol;
    }
}
