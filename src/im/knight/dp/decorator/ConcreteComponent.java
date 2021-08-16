package im.knight.dp.decorator;

/**
 * @description: 具体组件
 * @author: lijunlong
 * @date: 2021/8/16 13:57
 */
public class ConcreteComponent implements Component {

    @Override
    public void operation() {
        System.out.println("具体组件");
    }
}
