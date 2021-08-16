package im.knight.dp.decorator;

/**
 * @description:
 * @author: lijunlong
 * @date: 2021/8/16 13:59
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedFunction();
    }

    public void addedFunction() {
        System.out.println("为具体组件增加额外功能");
    }
}
