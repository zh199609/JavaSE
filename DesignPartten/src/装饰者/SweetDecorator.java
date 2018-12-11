package 装饰者;

/**
 * @Author
 * @Description
 * @Date
 */
public class SweetDecorator extends AbstractBread {
    public SweetDecorator(IBread iBread) {
        super(iBread);
    }
    public void paint(){

        System.out.println("添加甜蜜素...");
    }

    @Override
    public void kneadFlour() {
        //添加甜蜜素后和面
        this.paint();
        super.kneadFlour();
    }
}
