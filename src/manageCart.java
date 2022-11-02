public class manageCart {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addItems("B");
        cart.removeItems("B");
        cart.getNumberOfItems();
        cart.getTotalOfCart();
    }
}
