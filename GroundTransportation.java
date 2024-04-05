
/**
 * Escreva uma descrição da classe GroundTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class GroundTransportation extends Transport
{
    private String licensePlate;

    private GroundTransportation(String licencePlate) {
        this.licensePlate = licencePlate;
    }

    public String getLicensePlate() {
        return this.licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        if(licensePlate != null) {
            this.licensePlate = licensePlate;
        }
    }
}
