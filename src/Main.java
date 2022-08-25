public class Main {

    public static void main(String[] args) {

        Fighter f1=new Fighter("A",10,110,90,10);
        Fighter f2=new Fighter("B",15,140,85,100);

        Match match=new Match(f1,f2,85,90);
           match.run();
    }
}
