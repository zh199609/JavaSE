package 工厂.简单工厂;

/**
 * @Author
 * @Description
 * @Date
 */
public class EasyFactory {

    public static Operation createOperation(String name){
        Operation operation = null;
        switch (name) {
            case "+":
                operation = new Add();
                break;
            case  "-" :
                operation = new Sub();
                break;
             default:
                 break;
        }
        return operation;
    }
}
