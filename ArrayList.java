

public class ArrayList{
  private static final int INITIAL_CAPACITY = 20;//constant
  private Object[]data = new Object[INITIAL_CAPACITY];//array
  private int size = 0;
//number of current items now

    //constuctor
    public ArrayList(){
    }

    public ArrayList(Object[] objects){
        data = objects;
        size = objects.length;
    }

    //METHOD
public void add(Object o){
    add(size, o);
}

public void add( int index, Object o){
    for (int i = size - 1; i>= index; i--)
        data[i + 1] = data[1];
    data[index] = o;
    size++;
  }
 public void replace_Entry(char a){
     data[size-1]=a;
        }


   public String toString(){
      StringBuffer str = new StringBuffer("{");

      for(int i = 0; i < size; i++){
          str.append(data[i]);
                   if ( i!= size - 1)

                    str.append(",");
      }

                str.append("]");
       return str.toString();


   }

   public void print(){
        System.out.print("{ ");
      for(int i = 0; i < size; i++){

          System.out.print(data[i]);
                   if ( i!= size - 1)

                    System.out.print(",");
      }
                   System.out.print("}");}


   public void remove(int index){

   }

  }//end class







