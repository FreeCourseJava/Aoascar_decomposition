public class Chair {
    boolean isChairBackReclined; //откидывается ли спинка кресла
    String chairUpholstery;

    public Chair(boolean isChairBackReclined, String chairUpholstery){
        this.isChairBackReclined=isChairBackReclined;
        this.chairUpholstery=chairUpholstery;
    }
    public Chair(String chairUpholstery){
        this.chairUpholstery=chairUpholstery;
    }
    public  Chair(boolean isChairBackReclined){
        this.isChairBackReclined=isChairBackReclined;
    }
}
