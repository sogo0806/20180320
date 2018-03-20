public class hw1 {
    public static void main(String[] args) {
        Invoice inv = new Invoice();
        inv.showinof();
        Prroduct shop[] = new Prroduct[4];
        shop[0] = new Prroduct("乾坤袋", 100.20f, 3);
        shop[1] = new Prroduct("雷神斧", 1112.30f, 2);
        shop[2] = new Prroduct("惡鬼槌", 93.5f, 1);
        shop[3] = new Prroduct("破魔劍", 130.40f, 5);
        System.out.println("說明" + "\t\t" + "數量" + "\t\t" + "單價" + "\t\t" + "小計");
        for (int i = 0; i < 4; i++) {
            shop[i].showinof();
        }
        System.out.println("總金額"+"\t"+"$");
    }
}


