public class IntLList extends IntList{
  private Node head;
  private Node tail;


  public IntLList(){ //constructor
    this.head = head;
    this.l = 0;
  }

  public void add(int value){
    if(head == null){
      head = new Node(value);
    }else{

      Node pres = head;
       while(pres.next != null){
         pres = pres.next;
       }
       pres.next = new Node(value);
       this.l++;


    }

  }

  public void removeLast(){
    try{
      Node pres = head;
      int c = 0;
      while(pres.next != null){
        pres = pres.next;
        c++;
      }
      remove(c);
      this.l--;
    }catch(NullPointerException e){
      System.out.println("NullPointerException");
    }
  }


  public int get(int index){
    Node pres = head;
    index = index+1;
    for(int i = 0; i <= index-1; i++){
      pres = pres.next;
    }
    return pres.getValue();
  }

  public void set(int index, int val){
    Node pres = head;
    int c = 0;
      //index = index+1;
      if(index == 0){
        head.setValue(val);
      }else{
      while(c != index){
        pres = pres.next;
        c++;
      }
    pres.setValue(val);
  }
}

  public void remove(int index) {
    try{
      Node pres = head;
      Node temp = null;
      //index = index + 1;
      if(index == 0){
        head = head.next;
        this.l--;
      }else{
        //index = index+1;
        for(int c = 0; c < index-1; c++){
          pres = pres.next;
        }
        temp = pres.next;
        pres.next = temp.next;
        //temp = null;
        this.l--;
      }
    }catch(NullPointerException e){
      System.out.println("Null Pointer Exception");
    }
  }

  public String toString(){
    Node pres = head;
    int c = 0;
    String str = "";
    while(pres != null){
      if(c == this.l){
        str = str + String.valueOf(pres.getValue());
        c++;
        pres = null;
      }else{
        //pres = pres.next;
        str = str + String.valueOf(pres.getValue())+", ";
        pres = pres.next;
        c++;
      }

    }

    //pres = pres.next;
    //str = str + String.valueOf(pres.getValue());
    str = "[" + str + "]";
    return str;
  }

  public void clear(){
    head = null;
    this.l = 0;

  }
  public static void main(String[] args){
    IntLList link = new IntLList();
    link.add(0);
    link.add(1);
    link.add(2);
    link.add(3);
    link.add(4);
    link.add(5);
    link.add(6);
    link.add(7);
    link.add(8);
    link.add(9);
    link.add(10);

    link.remove(8);
    //link.remove(9);
    //link.add(27);
    link.set(0,5);
    //link.set(1,1001);
    link.set(2,-1001);
    //System.out.println(link.size());
    System.out.println(link.toString());
    //link.clear();
    //link.add(27);
    //link.remove(0);
    //link.remove(2);
    //link.remove(4);
    //link.add(27);
     //link.remove(2);
    //link.removeLast();
    //System.out.println(link.get(7));
    //System.out.println(link.get(10));
    //System.out.println(link.get(3));
    //link.remove(0);
    //link.add(7);
    System.out.println(link.toString());
    //System.out.println(link.get(0));
    //System.out.println(link.isEmpty());
    //link.clear();
    //System.out.println(link.isEmpty());

  }


}
