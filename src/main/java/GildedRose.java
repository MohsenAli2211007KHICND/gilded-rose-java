import org.apache.commons.lang3.StringUtils;

public class GildedRose {

    public String name;
    public int quality;
    public int daysRemaining;

    public GildedRose(String name, int quality, int daysRemaining) {
        this.name = name;
        this.quality = quality;
        this.daysRemaining = daysRemaining;
    }
    

    public void tick() {

        switch (name) {
            case "normal":
                Normal normal = new Normal(name, quality, daysRemaining);
                normal.tick();
                this.quality=normal.quality;
                this.daysRemaining = normal.daysRemaining;
                break;
            case "Aged Brie":
                AgedBrie aged = new AgedBrie(name, quality, daysRemaining);
                aged.tick();
                this.quality=aged.quality;
                this.daysRemaining= aged.daysRemaining;
                break;
            case "Sulfuras, Hand of Ragnaros":
                Sulfuras sulfuras = new Sulfuras(name, quality, daysRemaining);
                sulfuras.tick();
                this.quality=sulfuras.quality;
                this.daysRemaining= sulfuras.daysRemaining;
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                Backstage backstage = new Backstage(name, quality, daysRemaining);
                backstage.tick();
                this.quality=backstage.quality;
                this.daysRemaining= backstage.daysRemaining;
                break;
            case "Conjured Item":
                Conjured conjured = new Conjured(name, quality, daysRemaining);
                conjured.tick();
                this.quality=conjured.quality;
                this.daysRemaining= conjured.daysRemaining;
                break;

        }
    }

    // private void normal_tick() {

    //     daysRemaining -= 1;
    //     if (quality != 0) {
    //         quality -= 1;
    //     }
    //     if (daysRemaining <= 0) {
    //         quality -= 1;
    //     }
    // }

    // private void agedBrie_tick() {
    //     daysRemaining -= 1;
    //     if (!(quality >= 50)) {
    //         quality += 1;
    //         if (daysRemaining <= 0 && quality < 50) {
    //             quality += 1;
    //         }
    //     }

    // }

    // private void sulfuras_tic() {

    // }

    // public void tick() {
    //     daysRemaining -=1;
    //     if ( !(quality>=50)){
           
    //         quality +=1;
    //         if (daysRemaining < 10){
    //             quality +=1;
    //             if( daysRemaining < 5){
    //                 quality +=1;
    //             }
    //         }
    //         if(daysRemaining < 0){
    //             quality =0;
    //         }
    //     }
    // }

    // public void tick(){
    //     daysRemaining -=1;
    //     if(quality != 0){
    //         quality -= 1;
    //         if(quality >= 1){
    //             quality -= 1;
    //             if(quality !=0 && daysRemaining < 0){
    //                  quality -= 2;
    //             }
    //         }
    //     }
    // }


    // if(!StringUtils.equals(name, "Aged Brie") && !StringUtils.equals(name,
    // "Backstage passes to a TAFKAL80ETC concert")) {
    // if(quality > 0) {
    // if(!StringUtils.equals(name, "Sulfuras, Hand of Ragnaros")) {
    // quality -= 1;
    // }
    // }
    // } else {
    // if(quality < 50) {
    // quality += 1;
    // if(StringUtils.equals(name, "Backstage passes to a TAFKAL80ETC concert")) {
    // if(daysRemaining < 11) {
    // if(quality < 50) {
    // quality += 1;
    // }
    // }
    // if(daysRemaining < 6) {
    // if(quality < 50) {
    // quality += 1;
    // }
    // }
    // }
    // }
    // }
    // if(!StringUtils.equals(name, "Sulfuras, Hand of Ragnaros")) {
    // daysRemaining -= 1;
    // }
    // if(daysRemaining < 0) {
    // if(!StringUtils.equals(name, "Aged Brie")) {
    // if(!StringUtils.equals(name, "Backstage passes to a TAFKAL80ETC concert")) {
    // if(quality > 0) {
    // if(!StringUtils.equals(name, "Sulfuras, Hand of Ragnaros")) {
    // quality -=1;
    // }
    // }
    // } else {
    // quality = quality - quality;
    // }
    // } else {
    // if(quality < 50) {
    // quality += 1;
    // }
    // }
    // }
    // }
}
