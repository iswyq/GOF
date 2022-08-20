package wyq.strategy;

/**
 * 现金收费抽象类
 *
 * @author WangYQ
 */
public abstract class CashSuper {
    /**
     * 接受一个待结算的费用值，如果满足某种优惠条件，则返回优惠后的结算价格
     * @param money 待结算的费用
     * @return
     */
    public abstract double acceptCash(double money);

}
