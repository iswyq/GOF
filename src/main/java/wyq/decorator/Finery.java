package wyq.decorator;

/**
 * 服饰抽象类(Decorator)
 *
 * @author WangYQ
 */
public abstract class Finery extends Person {
    protected Person component;

    public Finery() {
    }

    public Finery(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            // 调用person类中的show方法
            super.show();

        }
    }
}
