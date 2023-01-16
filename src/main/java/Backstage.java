
public class Backstage extends GildedRose{

    public Backstage(String name, int quality, int daysRemaining) {
        super(name, quality, daysRemaining);
    }

    public void tick() {
        daysRemaining -=1;
        if ( !(quality>=50)){
           
            quality +=1;
            if (daysRemaining < 10){
                quality +=1;
                if( daysRemaining < 5){
                    quality +=1;
                }
            }
            if(daysRemaining < 0){
                quality =0;
            }
        }
    }

}
