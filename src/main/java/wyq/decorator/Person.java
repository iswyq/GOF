package wyq.decorator;

/**
 * 被装饰的具体类，可以理解为ConcreteComponent
 *
 * @author WangYQ
 */
public class Person implements Component {

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.printf("装饰的%s", name);
    }

    @Override
    public void operation() {
        System.out.println("执行具体的对象操作");
    }

}
