package 优雅ifelse;

public class DayWork {
    private int hour;

    public void writeProgram() {
        if (hour < 7) {
            System.out.println("当前时间：" + hour + "点 睡觉");
        } else if (hour == 7) {
            System.out.println("当前时间：" + hour + "洗脸刷牙吃早饭");
        } else if (hour < 12) {
            System.out.println("当前时间：" + hour + "点 好好上课");
        } else if (hour == 1) {
            System.out.println("当前时间：" + hour + "点 吃午饭");
        } else if (hour < 18) {
            System.out.println("当前时间：" + hour + "点 好好学习");

        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    
    
    public static void main(String[] args) {
        DayWork work = new DayWork();
        work.setHour(9);
        work.writeProgram();
        work.setHour(10);
        work.writeProgram();
        work.setHour(12);
        work.writeProgram();
        work.setHour(13);
        work.writeProgram();
        work.setHour(14);
        work.writeProgram();
    }
}
