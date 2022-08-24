package wyq.factory;

/**
 * 产品的抽象类
 * 所有的具体产品都是该类的子类
 *
 * @author WangYQ
 */
public class LeiFeng {
    public void sweep() {
        System.out.println("扫地");
    }
    public void wash(){
        System.out.println("洗衣");
    }
    public void buyRice(){
        System.out.println("买米");
    }
}
