/** Třída reprezentuje  zdravic, který slouží ke zdravení uživatelů */
public class Zdravic {
    /** Text pozdavu v třídě main */
    public String text;

    /**
     * Pozdraví uživatele textem pozdravu a jeho jménem
     * @param jmeno Jméno uživatele
     * @return      Text s pozdravem
     */
    public String pozdrav(String jmeno){
        return String.format("Ahoj % s %s\n" , text, jmeno);
    }

}
