package wyq.proxy;

/**
 * 代理模式的测试
 */
class ProxyTest {
    public static void main(String[] args) {
        SchoolGirl schoolGirl = new SchoolGirl("小李");
        // 代理类中传入一个属性，注意甄别代理的是追求者
        Proxy proxy = new Proxy(schoolGirl);
        // 执行代理类的方法
        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }
}