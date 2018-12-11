package 装饰者;

/**
 * @Author
 * @Description
 * @Date
 */
public class CornDecorator extends AbstractBread {


    public CornDecorator(IBread iBread) {
        super(iBread);
    }
    public void paint(){
        System.out.println("添加柠檬黄的着色剂");
    }
    @Override
    public void kneadFlour() {
        //添加着色剂后和面
        this.paint();
        super.kneadFlour();
    }
}
