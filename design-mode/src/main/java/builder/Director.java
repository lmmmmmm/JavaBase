package main.java.builder;

/**
 * 建造者
 *
 * @author lming.41032@gmail.com
 * @date 18-9-23 下午11:47
 */
public class Director {

    public Product constructProduct(ConcreteBuilder concreteBuilder) {
        concreteBuilder.buildBasic();
        concreteBuilder.buildWall();
        concreteBuilder.buildWindow();
        return concreteBuilder.buildProduct();
    }

    public static void main(String[] args) {
        Director test = new Director();
        Product product = test.constructProduct(new ConcreteBuilder());
        System.out.println(product.toString());
    }
}
