package zl.com;

/**
 * @ClassName: PersonInfo
 * @Description: TODO
 * @Author: zl
 * @Date: 2019/8/12 21:21
 * @Version: 1.0
 **/
interface Info {

}

class Contact implements Info {
    private String address;
    private String telephone;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}

class Introduction implements Info {
    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}


public class PersonInfo<T extends Info> {

    private T info;

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }


    public static void main(String[] args) {
        Introduction introduction = new Introduction();
        introduction.setName("introduction");
        PersonInfo<Introduction> infoPersonInfo = new PersonInfo<>();
        infoPersonInfo.setInfo(introduction);
        System.out.println(infoPersonInfo.getInfo().getName());
    }

}
