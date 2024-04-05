
/**
 * Escreva uma descrição da classe Van aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Van extends GroundTransportation
{
    private int packages;

    public Van(int packages, String licensePlate) {
        super(licensePlate);
        this.packages = packages;
    }

    public int getPackages() {
        return this.packages;
    }

    public String getLicensePlate() {
        return super.getLicensePlate();
    }

    public void setPackages(int packages) {
        this.packages = packages;
    }

    public void setLicensePlate(String licensePlate) {
        super.setLicensePlate(licensePlate);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append(String.format("%15s: %4.2f%%\n", "Encomendas", this.packages));

        return sb.toString();
    }
}
