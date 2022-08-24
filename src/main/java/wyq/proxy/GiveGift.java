package wyq.proxy;

/**
 * 被代理类的接口
 * 送礼物接口，抽取出来是为了复用。不只有追求者会做送礼物的操作
 * @author WangYQ
 */
public interface GiveGift {
    /**
     * 送玩偶
     */
    void giveDolls();

    /**
     * 送花
     */
    void giveFlowers();

    /**
     * 送巧克力
     */
    void giveChocolate();
}
