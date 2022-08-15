public class Lucian implements CanShoot, CanSurf{
    private String hair;
    private String weapon;
    @Override
    public void surf() {
        // TODO Auto-generated method stub
        System.out.printf("lucian surf %s %s\n" , this.hair , this.weapon);
    }
    @Override
    public void shoot() {
        // TODO Auto-generated method stub
        System.out.printf("lucian shoot %s %s\n", this.hair , this.weapon);
    }

    /**
     * @return String return the hair
     */
    public String getHair() {
        return hair;
    }

    /**
     * @param hair the hair to set
     */
    public void setHair(String hair) {
        this.hair = hair;
    }

    /**
     * @return String return the weapon
     */
    public String getWeapon() {
        return weapon;
    }

    /**
     * @param weapon the weapon to set
     */
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

}
