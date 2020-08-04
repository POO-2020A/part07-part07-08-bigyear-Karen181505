
public class Birds {
    private String name;
    private String nameLatin;
    private int obs;
    
    public Birds(String name, String nameLatin){
        this.obs=0;
        this.name=name;
        this.nameLatin = nameLatin;
    }
    public void observation(String name){
        if(this.name.equals(name)){
            this.obs++;
        } 
    }

    
    @Override
    public String toString(){
        return this.name + " (" + this.nameLatin + "): " + this.obs + " observations";
    }

    public String getBirdName() {
        return this.name;
    }
}
