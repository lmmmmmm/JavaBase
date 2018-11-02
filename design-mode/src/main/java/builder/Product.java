package main.java.builder;

/**
 * 产品类（房子）
 *
 * @author lming.41032@gmail.com
 * @date 18-9-23 下午11:38
 */
public class Product {

    /**
     * 地基
     */
    private String basic;

    /**
     * 墙
     */
    private String wall;

    /**
     * 窗户
     */
    private String window;

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    @Override
    public String toString() {
        return "basic :" + basic + ",wall:" + wall + ",window:" + window;
    }
}
