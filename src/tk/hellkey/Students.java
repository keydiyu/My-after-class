package tk.hellkey;

public class Students {
    String name;
    String stuNo;
    double chinese;
    double math;
    double english;
    double computer;
    double allScore;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo){
        this.stuNo = stuNo;
    }

    public double getChinese() {
        return chinese;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public double getComputer() {
        return computer;
    }

    public void setComputer(double computer) {
        this.computer = computer;
    }

    public double getAllScore() {
        return allScore;
    }

    public void setAllScore(double allScore) {
        this.allScore = allScore;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    double averageScore;
    public Students() {

    }
    public Students(String name,String stuNo) {
        this.name = name;
        this.stuNo = stuNo;
    }
    public void calAllScore(){
        allScore = chinese+english+math+computer;
    }
    public void calAvgScore(){
        averageScore = allScore/4.0;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", stuNo='" + stuNo + '\'' +
                ", chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                ", computer=" + computer +
                ", allScore=" + allScore +
                ", averageScore=" + averageScore +
                '}';
    }
}
