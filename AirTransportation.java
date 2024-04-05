
/**
 * Escreva uma descrição da classe AirTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AirTransportation extends Transport
{
    private String name;
    private int numberOfContainers;

    public AirTransportation(String name, int numberOfContainers){
        this.name = name;
        this.numberOfContainers = numberOfContainers;
    }

    public String getName(){
        return this.name;
    }

    public int getNumberOfContainers(){
        return this.numberOfContainers;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setNumberOfContainers(int numberOfContainers){
        if(numberOfContainers > 0){
            this.numberOfContainers = numberOfContainers;
        } else  {
            this.numberOfContainers = 1;
        }
    }
}
