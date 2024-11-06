package lv.rvt;

public class Statistics {
    private int count;
    private int sum;
    private int num;

    public Statistics() {
        
    }

    public void addNumber(int number) {
        count++;
        this.num = number;
        sum += this.num;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        double avg = this.sum / (this.count * 1.00);
        return avg;
    }
}