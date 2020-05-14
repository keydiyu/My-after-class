package tk.hellkey;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Students>students = new ArrayList<>();
        String name = "";
        for (int i=0;i<50;i++){
            int ucode = (int) (Math.random()*(0x7800-0x4e00)+0x4e00);
            if (i<10) {
                name = "李"+(char)(ucode);
            }else if(i<20)
            {
                name = "张"+(char)(ucode);
            }else if(i<30)
            {
                name = "王"+(char)(ucode);
            }else if(i<40)
            {
                name = "陈"+(char)(ucode);
            }else if(i<50)
            {
                name = "唐"+(char)(ucode);
            }
            students.add(new Students(name,"2019000"+String.format("%03d",i+1 )));
        }
        Random r = new Random();
        for (Students s:students){
            double score = r.nextDouble()*100;
            s.setChinese(score);
            score = r.nextDouble()*100;
            s.setEnglish(score);
            score = r.nextDouble()*100;
            s.setComputer(score);
            score = r.nextDouble()*100;
            s.setMath(score);
            s.calAllScore();
            s.calAvgScore();
            System.out.println(s.toString());
        }
    }
}
