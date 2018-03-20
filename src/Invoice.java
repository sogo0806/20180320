public  class Invoice{
    private String title,address,postcode;
    public Invoice() {
        title = "亞洲資工站";
        address = "柳豐路500號 霧峰區,台中市";
        postcode = "41354";
    }
    public Invoice(String name,String add1,String code){
        title =name;
        address=add1;
        postcode=code;
    }
    public void setTitle (String name){
        this.title=name;
    }

    public String getTitle() {
        return title;
    }
    public void setAddress(String add1){
        this.address=add1;
    }

    public String getAddress() {
        return address;
    }
    public void setPostcode(String code){
        this.postcode=code;
    }

    public String getPostcode() {
        return postcode;
    }

  public void showinof(){
      System.out.println("店名:"+getTitle());
      System.out.println("地址:"+getAddress());
      System.out.println("郵區:"+getPostcode());
      System.out.println("========================================");
  }
}