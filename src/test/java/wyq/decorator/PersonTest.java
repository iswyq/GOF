package wyq.decorator;

/**
 * 主体装饰模式测试类
 */
class PersonTest {
    public static void main(String[] args) {
        Person ps = new Person("小菜");
        System.out.println("第一种装扮");
        Sneakers sneakers = new Sneakers();
    }
}