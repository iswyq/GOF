package wyq.strategy;

/**
 * 返利收费（满减优惠）
 *
 * @author WangYQ
 */
public class CashReturn extends CashSuper {
    // 返利门槛
    private double moneyCondition = 0;
    // 返利值
    private double moneyReturn = 0;

    /**
     * 构造返利收费对象时，必须要指定返利门槛和返利值。
     * 如“满300减100”，对应moneyCondition=300，moneyReturn=100
     *
     * @param moneyCondition
     * @param moneyReturn
     */
    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money > moneyCondition) {
            // 350/300 *100 得到了优惠数
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return result;
    }
}
