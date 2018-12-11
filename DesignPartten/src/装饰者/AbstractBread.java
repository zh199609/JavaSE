package 装饰者;

/**
 * @Author
 * @Description:装饰者类
 * @Date
 */
public abstract class AbstractBread implements IBread {
    private IBread iBread;

    public AbstractBread(IBread iBread) {
        /*              InputStream(被装饰者抽象主件)
        FilterInputStream（装饰者）  FileInputStream和FileOutputStream    被装饰者具体实现
        BufferedInputStream（装饰者实现）     */
        this.iBread = iBread;
    }

    @Override
    public void prepair() {
        iBread.prepair();
    }

    @Override
    public void kneadFlour() {
        iBread.kneadFlour();
    }
    @Override
    public void steamed() {
        iBread.steamed();
    }

    @Override
    public void process() {
        prepair();
        kneadFlour();
        steamed();
    }
}
