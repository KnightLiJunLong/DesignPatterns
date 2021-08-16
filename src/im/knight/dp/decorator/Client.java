package im.knight.dp.decorator;

/**
 * 装饰模式：
 *    它主要就是在我们的装饰，
 * 可以这样来理解，就比如要吃一碗米线，
 * 最开始店家只有牛肉米线，
 * 后来又增加了羊肉，三鲜，卤肉等等。
 * 当我们米线已经做好了，这时候我们说我们要三鲜不要牛肉了，
 * 老板只需要换掉我们的牛肉，而不是重新做一碗。
 * 这个羊肉，三鲜，卤肉，牛肉就是我们的装饰品，也就是具体装饰
 * 装饰模式会让我们的组合变得有趣，灵活，扩展很强，
 * 但是没多一个装饰，就会多一个子类
 * @description:
 * @author: lijunlong
 * @date: 2021/8/16 14:02
 */
public class Client {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.operation();
        Component decorator = new ConcreteDecorator(component);
        decorator.operation();
    }

}
