package stack.and.queue;

public class Animal<T> extends Queue {
    private String kind;
    Queue animalQ = new Queue();


    public Animal(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }
    public void enqueue(String animal){
        animal.toLowerCase();
        if(animal =="cat" || animal=="dog"){
            animalQ.enQueue(animal);
            System.out.println(animal);
        }
        else {
            System.out.println("sorry we just receive dogs or cats");
        }
    }
    public String deQueue(String pref){
        pref.toLowerCase();
        if(pref =="cat"){
            animalQ.deQueue();
            return "pref is cat";
        }
        else if (pref == "dog"){
            animalQ.deQueue();
            return "pref is dog";
        }
        return null;
    }
    public void tostring() {
        animalQ.tostring();
    }
}