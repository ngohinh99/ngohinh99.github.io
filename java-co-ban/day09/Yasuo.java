public class Yasuo implements CanSurf{
    private String hair;
    private String weapon;
    @Override
    public void surf() {
        // TODO Auto-generated method stub
        System.out.printf("Yasuo surf %s %s\n" , this.hair , this.weapon);
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
