package wyq.strategy;

/**
 * 将Context与简单工厂结合
 *
 * @author WangYQ
 */
public class CashContextV2 {
    CashSuper cashSuper = null;

    public CashContextV2(String type) {
        switch (type)
        {
            case "正常收费":
                cashSuper=new CashNormal();
                break;
            case "打八折":
                cashSuper=new CashRebate(0.8);
                break;
            case "满300减100":
                cashSuper=new CashReturn(300,100);
                break;
            default:
                break;
        }
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
