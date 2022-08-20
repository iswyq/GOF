package wyq.strategy;

/**
 * 使用工厂创建不同优惠的收费对象
 */
class CashFactoryTest {
    public static void main(String[] args) {
        double total = 0;
        // 折扣优惠策略测试
        // Cash cs = CashFactory.createCashAccept("打八折");
        // 满减优惠
        CashSuper cs = CashFactory.createCashAccept("满300减100");
        double totalPrice = cs.acceptCash(350);
        total = totalPrice + total;
        System.out.println(total);
    }
}