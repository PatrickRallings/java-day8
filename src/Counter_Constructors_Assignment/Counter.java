package Counter_Constructors_Assignment;

public class Counter {
    private double num;
    public Counter(double initialNum){
        this.num = initialNum;
    }
    public Integer value(){
        return (int) this.num;
    }
    public void increase(){
        this.num++;
    }
    public void increase(double increaseBy){
        if (increaseBy > 0) {
            this.num += increaseBy;
        }
    }
    public void decrease(){
        this.num--;
    }
    public void decrease(double decreaseBy){
        if (decreaseBy > 0) {
            this.num -= decreaseBy;
        }
    }
}
