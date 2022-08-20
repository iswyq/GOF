package wyq.strategy;

/**
 * 现金收费工厂类，根据传入的优惠方案，返回执行不同优惠方案的算法。
 *
 * @author WangYQ
 */
@Deprecated
public class CashFactory {
    public static CashSuper createCashAccept(String type) {
        CashSuper cs = null;
        switch (type) {
            case "正常收费":
                cs = new CashNormal();
                break;
            case "满300减100":
                cs = new CashReturn(300, 100);
                break;
            case "打八折":
                cs = new CashRebate(0.8);
                break;
            default:
                break;
        }
        return cs;
    }
}
