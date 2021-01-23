public class Item { 

    private String name;
    private int amount;
    private int price;


    public Item(String name, int amount, int price){
        setName(name);
        setAmount(amount);
        setPrice(price);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "produto: " + getName() + "  qtde: " + getAmount() + "   preço: " + getPrice() + "\n";
    }

}
