package thirdtest;

/**
 * 老师类
 */
public class Teacher {
    //老师性别
    String sex;
    //年龄
    int age;
    //老师拥有的车牌子
    String type;
    //老师的体重
    double weight;
 /*
  *老师类的一个show方法
  */
    public double show(){
       double height = 1.89;
       System.out.println("老师的身高为"+height);
       return height;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
