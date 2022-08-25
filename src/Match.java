public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeith;




    Match(Fighter f1,Fighter f2,int minWeight,int maxWeith){
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeith=maxWeith;



    }

    void run(){
        if (isCheck()){
            while (this.f1.healthy>0&&this.f2.healthy>0){
                System.out.println("-----YENi ROUND-----");

               int coin=Math.round((float)Math.random());
                System.out.println("Coin: "+coin);
                if (coin==0){
                    this.f2.healthy=this.f1.hit(this.f2);
                    if (isWin()){
                        break;
                    }

                }
                if (coin==1){
                    this.f1.healthy=this.f2.hit(this.f1);
                    if (isWin()){
                        break;
                    }
                }

                System.out.println(this.f1.name+" saglik: "+this.f1.healthy);
                System.out.println(this.f2.name+" saglik: "+this.f2.healthy);
            }

        }else{
            System.out.println("Sporcularin Sikletleri Uymuyor.");
        }
    }

    boolean isCheck(){
        return (this.f1.weight>=minWeight&&this.f1.weight<=maxWeith)&&(this.f2.weight>=minWeight&&this.f2.weight<=maxWeith);
    }

    boolean isWin(){
        if (this.f1.healthy==0){
            System.out.println(this.f2.name+" kazandi.");
            return true;
        }
        if (this.f2.healthy==0){
            System.out.println(this.f1.name+" kazandi.");
        }
        return false;

    }

}
