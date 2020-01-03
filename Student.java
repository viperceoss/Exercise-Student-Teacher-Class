package thirdtest;

/**
 * 学生类
 * @auther lava
 */
public class Student {
    // 身高
    double height;
    //年龄
    int age;
    //学生班级
    String classNum;
    /*
    学生类的一个发送信息的方法
     */
    public void message(){
        System.out.println("我是一个学生");
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public String getClassNum() {
        return classNum;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }
}
