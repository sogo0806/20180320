public class Prroduct {
    private String name;
    private float price;
    private int quantity;
    public Prroduct(String name1,float price1,int quantity1){
        name = name1;
        price=price1;
        quantity=quantity1;
    }
    public void showinof(){
        System.out.println(this.name+"\t\t"+this.price+"\t\t"+this.quantity+"\t\t"+Math.round(this.price*this.quantity*100)/100f);
    }
}
