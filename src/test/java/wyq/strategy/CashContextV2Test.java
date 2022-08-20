package wyq.strategy;

/**
 * 将Context与工厂进行结合
 * 优点：将创建对象的过程转移
 */
class CashContextV2Test {
    public static void main(String[] args) {
        CashContextV2 cc = new CashContextV2("正常收费");
        double total = 0;
        double totalPrice = cc.getResult(100) + total;
        System.out.println(totalPrice);
    }
}