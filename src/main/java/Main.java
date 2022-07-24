public class Main {
    public static void main(String[] args) {
        LandingGear a320LandingGear=new LandingGear(500, 50, "kevlar");
        Chair a320chair=new Chair(true, "Leather");
        Wing a320wing=new Wing(false, false, "Rols Royce");

        Fuselage a320Fuselage = new Fuselage(50, "Big");
        a320Fuselage.landingGears = new LandingGear[] {a320LandingGear};
        a320Fuselage.chairs = new Chair[]{a320chair};

        Aircraft a320 = new Aircraft();
        a320.fuselages = new Fuselage[] {a320Fuselage};
        a320.wings = new Wing[] {a320wing};



    }
}
