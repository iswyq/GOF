package wyq.strategy;

/**
 * 打折收费的子类
 *
 * @author WangYQ
 */
public class CashRebate extends CashSuper {
    // 折扣系数
    private double cashRebate = 1;

    // 在进行初始化时，需要指定折扣系数
    public CashRebate(double cashRebate) {
        this.cashRebate = cashRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * cashRebate;
    }
}
