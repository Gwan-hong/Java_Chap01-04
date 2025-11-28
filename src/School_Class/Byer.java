package School_Class;

class Byer {
    private int money;

    public Byer(int money) {
        this.money = money;
    }

    public void buy(Item it, int count) {
        System.out.println(it + "을(를)" + count + "개 맛있게 먹었습니다.");
        money = money - it.price * count;
        System.out.println("현재 남은 돈 :" + money);
    }
}
