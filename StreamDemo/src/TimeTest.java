import com.zl.entity.SysUser;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TimeTest {
    public static void main(String[] args) {
        List<SysUser> list = new ArrayList<>();
        for (int i = 1; i < 100; i++) {
            SysUser sysUser = new SysUser();
            sysUser.setId(Long.valueOf(i));
            if (i % 3 == 0) {
                sysUser.setUserName("编号：1");
            } else {
                sysUser.setUserName("编号：2");
            }
            sysUser.setAge(8);
            if (i % 2 == 0) {
                sysUser.setUserPassword("pwd");
            } else {
                sysUser.setUserPassword("密码");
            }
            list.add(sysUser);
        }

        Long l1 = 12L;
        Long l2 = 12L;
        System.out.println(l1 == l2);
        //af

    }
}
