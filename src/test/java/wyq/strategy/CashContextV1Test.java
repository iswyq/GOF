package wyq.strategy;

import wyq.strategy.strategyExample.Context;

import java.util.Scanner;

/**
 * CashContextV1测试类
 * 这里优惠策略对象的维护又返回到客户端了，并不好
 */
class CashContextV1Test {
    public static void main(String[] args) {
        CashContextV1 cc = null;
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextLine()) {
            case "正常收费":
                cc = new CashContextV1(new CashNormal());
                break;
            case "打八折":
                cc = new CashContextV1(new CashRebate(0.8));
                break;
            case "满300减100":
                cc = new CashContextV1(new CashReturn(300, 100));
                break;
            default:
                break;
        }
        double total = 0;
        total = cc.getResult(300) + total;
        System.out.println(total);
    }
}