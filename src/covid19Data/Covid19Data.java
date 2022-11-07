package covid19Data;

import java.time.LocalDate;

public class Covid19Data {
   private String region;
   private String aldersgruppe;
   private int bekræftedeIAlt;
   private int døde;
   private int indlagtPåIntensiv;
   private int indlagte;
   private String dato;

    public Covid19Data(String region, String aldersgruppe, int bekræftedeIAlt, int døde, int indlagtPåIntensiv, int indlagte, String dato) {
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.bekræftedeIAlt = bekræftedeIAlt;
        this.døde = døde;
        this.indlagtPåIntensiv = indlagtPåIntensiv;
        this.indlagte = indlagte;
        this.dato = dato;
    }

   public Covid19Data(){
   }

    public String getRegion() {
        return region;
    }

    public String getAldersgruppe() {
        return aldersgruppe;
    }

    public int getBekræftedeIAlt() {
        return bekræftedeIAlt;
    }

    public int getDøde() {
        return døde;
    }

    public int getIndlagtPåIntensiv() {
        return indlagtPåIntensiv;
    }

    public int getIndlagte() {
        return indlagte;
    }

    public String getDato() {
        return dato;
    }

    public void setAldersgruppe(String aldersgruppe) {
        this.aldersgruppe = aldersgruppe;
    }

    public void setBekræftedeIAlt(int bekræftedeIAlt) {
        this.bekræftedeIAlt = bekræftedeIAlt;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public void setDøde(int døde) {
        this.døde = døde;
    }

    public void setIndlagte(int indlagte) {
        this.indlagte = indlagte;
    }

    public void setIndlagtPåIntensiv(int indlagtPåIntensiv) {
        this.indlagtPåIntensiv = indlagtPåIntensiv;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
