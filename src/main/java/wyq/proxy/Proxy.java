package wyq.proxy;

/**
 * 代理类
 * 对送礼物(接口)进行代理
 *
 * @author WangYQ
 */
public class Proxy implements GiveGift {
    // 追求者（被代理的对象）
    Persuit gg;

    public Proxy(SchoolGirl mm) {
        gg = new Persuit(mm);
    }

    @Override
    public void giveDolls() {

    }

    @Override
    public void giveFlowers() {

    }

    @Override
    public void giveChocolate() {

    }
}
