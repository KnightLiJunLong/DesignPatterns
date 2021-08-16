package im.knight.dp.decorator;

/**
 * @description: 抽象装饰
 * @author: lijunlong
 * @date: 2021/8/16 13:58
 */
public abstract class Decorator implements Component {

    private final Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
