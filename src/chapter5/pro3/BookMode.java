package chapter5.pro3;

public class BookMode implements DiscountMode{


    @Override
    public int calcPrice(int price, int n) {
        return (int) (price * n * 0.95);
    }
}
