package main.java.builder;

/**
 * 具体建造
 *
 * @author lming.41032@gmail.com
 * @date 18-9-23 下午11:44
 */
public class ConcreteBuilder implements Builder {

    private Product product;

    public ConcreteBuilder() {
        this.product = new Product();
    }

    @Override
    public void buildBasic() {
        product.setBasic("地基");
    }

    @Override
    public void buildWall() {
        product.setWall("水泥墙");
    }

    @Override
    public void buildWindow() {
        product.setWindow("普通玻璃");
    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
