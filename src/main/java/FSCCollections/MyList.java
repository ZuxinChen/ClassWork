
package FSCCollections;
public class MyList {
    private static final int DEFAULT_CAPACITY=8;
    private int size=0;
    private int elements[];
    
    public MyList(){
        elements= new int[DEFAULT_CAPACITY];
    }
    
    public void append(int e){
        if(size == elements.length){
            checkCapa();
        }
       elements[size]=e;
       size++;
    }
    public void prepend(int e){
        int[] newArr = new int[size++];
        newArr[0]= e;
        for(int i = 1; i<size; i++){
            newArr[i]=elements[i-1];
        }
         elements = newArr;
    }
    public void intsert(int index, int e){
        int[] newArr = new int[size++];
        int j=0;
        for(int i = 0; i<size;i++){
            if(i==index){  
                newArr[i]= e;
                j++;
            } 
            newArr[i]=elements[j];
            j++;
        }
        elements = newArr;
    }
    private void checkCapa(){
        int newSize= elements.length*2;
        int[] newArr= new int[newSize];
        for(int i=0; i<elements.length; i++){
            newArr[i]= elements[i];
        }
        elements = newArr;
    }
    
    
    public int get(int i){
      return elements[i];
    }
    
    public void remove(int e){
       if(findElement(e)!=-1){
           
           for(int i = findElement(e); i< size; i++){
               elements[i]=elements[i+1];
           }
           size--;
       }
     
    }
    
    private int findElement(int e){
        for(int i=0; i<elements.length; i++)
            if(e==elements[i])
                return i;
            return -1;// to indicate that we don't have it  
    }

    @Override
    public String toString() {
        String str="";
        for(int i=0; i<size(); i++)
            str+= " "+ elements[i];
        return str;
    }
    
    public int size() {
        return size;
    }
}
