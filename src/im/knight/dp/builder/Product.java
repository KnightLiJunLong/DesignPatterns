package im.knight.dp.builder;

/**
 * 这个产品有3个组件，分别是A,B,C
 * @description: 产品模型
 * @author: lijunlong
 * @date: 2021/7/22 14:06
 */
public class Product {

    private String partA;
    private String partB;
    private String partC;

    public void show() {
        System.out.println(partA);
        System.out.println(partB);
        System.out.println(partC);
    }

    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public String getPartC() {
        return partC;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }
}
