package wyq.strategy;

/**
 * 策略工厂模式V1
 * 只需要使用一个CashContext去维护一个CashSuper对象
 *
 * @author WangYQ
 */
@Deprecated
public class CashContextV1 {
    private CashSuper cashSuper;

    public CashContextV1(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    /**
     * 返回处理之后所需付的钱
     * @param money 待处理的钱
     * @return
     */
    public double getResult(double money) {
        return cashSuper.acceptCash(money);
    }
}
