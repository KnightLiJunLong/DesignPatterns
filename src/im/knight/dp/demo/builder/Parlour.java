package im.knight.dp.demo.builder;

/**
 * @description:
 * @author: lijunlong
 * @date: 2021/7/22 14:50
 */
public class Parlour {

    private String wall;
    private String tv;
    private String sofa;

    public void show() {
        System.out.println(wall);
        System.out.println(tv);
        System.out.println(sofa);
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public void setSofa(String sofa) {
        this.sofa = sofa;
    }
}
