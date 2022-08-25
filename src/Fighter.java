public class Fighter {
    //Parametreler
    String name;
    int damace;
    int healthy;
    int weight;
    int dodge;



    //Constructor
    Fighter(String name,int damace,int healthy,int weight,int dodge){
        this.name=name;
        this.damace=damace;
        this.healthy=healthy;
        this.weight=weight;
        if (dodge>=0&&dodge<=100){
            this.dodge=dodge;
        }else{
            this.dodge=0;
        }

    }
    int hit(Fighter foe){
        System.out.println(this.name+"-->"+foe.name+" "+"hasar vurdu");
        if (isDodge()){
            System.out.println(foe.name+" gelen hasari bloklandi.");
            return foe.healthy;
        }
          if (foe.healthy-this.damace<0){
              return 0;
          }
        return foe.healthy-this.damace;
    }

    boolean isDodge(){
        double randomNumber=Math.random()*100;
        return randomNumber<=this.dodge;
    }


}
