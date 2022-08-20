package wyq.strategy;

/**
 * 正常收费的子类
 * @author WangYQ
 */
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        // 正常收费，原价返回
        return money;
    }
}
