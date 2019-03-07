package builder;

/**
 * 抽象建造（盖房子）
 *
 * @author lming.41032@gmail.com
 * @date 18-9-23 下午11:42
 */
public interface Builder {
    /**
     * 打地基
     */
    void buildBasic();

    /**
     * 砌墙
     */
    void buildWall();

    /**
     * 装窗户
     */
    void buildWindow();

    /**
     * 造房子
     *
     * @return
     */
    Product buildProduct();

}
