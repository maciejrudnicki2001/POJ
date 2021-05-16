package pjatk.task4;

import java.util.Arrays;

public class MyList <F>{

    private F[] array;
    private int arrayId = 0;

    public MyList(F array){
        this.array = (F[]) new Object[20];
    }

    public boolean add(F element){
        if (this.arrayId + 1 >= 20){
            this.array = Arrays.copyOf(array, array.length*2);
            return false;
        }
        else {
            this.array[this.arrayId] = element;
            this.arrayId++;
            return true;
        }
    }
    public int size(){
        return this.arrayId;
    }
    public boolean contains(F element){
        int i = 0;
        while (i < arrayId){
            if (array[i].equals(element)){
                return true;
            }
            i++;
        }
        return false;
    }
    public int indexOf(final F element){
        int i = 0;
        while (i < this.arrayId){
            final F check = this.array[i];
            i++;
            if (check.equals(element)){
                return i;
            }

        }
        return -1;
    }
    public int lastIndexOf(final F element){
        int i = this.arrayId;
        while(i > 0){
            final F check = this.array[i];
            i--;
            if (check.equals(element)){
                return i;
            }

        }
        return -1;
    }
    public F get(final int id) throws IndexOutOfBoundsException {
        if (id < 0 || id >= this.arrayId){
            throw new IndexOutOfBoundsException();
        }
        return this.array[id];
    }
    public void set(final int id, final F value) throws IndexOutOfBoundsException{
        if (id < 0 || id >= this.arrayId){
            throw new IndexOutOfBoundsException();
        }
        this.array[id] = value;
    }
}
