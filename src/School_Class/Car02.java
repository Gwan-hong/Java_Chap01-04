package School_Class;

class Car02 {
    String color;
    Engine e;

    public Car02(String c, int cc, int fuel) {
        color = c;
        e = new Engine(cc, fuel);
    }
    public String getPrice() {
        return "당신이 요청한" + e.capacity + "의" + e.fuel + "차량 (컬러 :" + color + ")의 가격은 : " + e.getPrice();
    }
}
