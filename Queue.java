public class Queue {
    private final int MAX_PERSON = 5;
    private Person list[] = new Person[MAX_PERSON];
    private int push = 0;
    private int pop = 0;
    
    public Queue(){}

    public boolean pushPerson(Person p){
        if(push > list.length){
            if(pop == 0){
                return false;
            }else{
                shift();
                list[push] = p;
                push++;
                return true;
            }
        }else{
            list[push] = p;
            push++;
            return true;
        }
    }

    public void shift(){
        for(int i = pop; i < list.length; i++){
            for(int j = 0; j < list.length - pop; j++){
                list[i] = list[j];
            }
        }
        push = pop;
    }

    public Person popPerson(){
        int k = pop;
        pop++;
        if(pop > list.length) pop=0;
        return list[k];
    }

    public void read(){
        int k = pop;
        while(k != push){
            System.out.println(list[k]);
            k++;
            if(k > list.length) k = 0;
        }
    }
}
