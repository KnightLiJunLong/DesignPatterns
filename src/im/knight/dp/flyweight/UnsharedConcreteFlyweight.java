package im.knight.dp.flyweight;

/**
 * @description: 非享元角色
 * @author: lijunlong
 * @date: 2021/8/17 8:56
 */
public class UnsharedConcreteFlyweight {
    private String info;

    public UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
