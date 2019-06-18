package com.zl.demo03;

/**
 * @Package: com.zl.demo03
 * @ClassName: testTenuringThreshold2
 * @Author: luzhiwei
 * @Description: TODO
 * @Date: 2019/6/11 16:52
 * @Version: 1.0
 * <p>
 * 动态对象年龄判断
 * 虚拟机并不是永远要求对象的年龄必须达到MaxTenuringThreshold才能晋升老年代，如果Survivor空间中相同年龄的对象
 * 总和大于Survivor空间的一半，年龄大于或者等于改年龄的对象直接进入老年代
 * <p>
 * 虚拟机参数：  -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails
 * -XX:SurvivorRatio=8
 * -XX:MaxTenuringThreshold=15 -XX:+PrintTenuringDistribution
 */
public class testTenuringThreshold2 {
    static int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        byte[] allocation1, allocation2, allocation3, allocation4;

        //allocation1 = new byte[_1MB / 4];
        //allocation1 = new byte[_1MB / 4];
        allocation3 = new byte[_1MB * 6];

        allocation3 = new byte[_1MB * 3];

        allocation4 = new byte[_1MB * 3];

        //BOM未分配    请先总表保存（营业管理权限去掉）
//        -XX:+PrintGCDetils
    }


}
